#!/usr/bin/python

import sys
import re
import collections

time = re.compile(r'global=([+-]?\d+(\.\d+)?([eE][+-]?\d+)?)') # Read the current time from the clock named "global" (note that values can also be 1234.567e+23 so we look also for that kind of numbers)
state = re.compile(r'^\( (.*) \)') # The current state definition (it is in the line that starts with "( " and goes on until " )")
pName = re.compile(r'(P_\w*).(\w*)') # The name of a processor, and its state. Before the "." we have the name (which goes in group(1)) and after the "." we have the current state (in group(2))
schedulingTransition = re.compile(r'(P_\w*).\w*->P_\w*.\w* { 1, fire\[p_id\]\[(\w*)\]') # Schedule a new task on a processor: it changes state and we read from the synchronization label which task it was asked to perform. So group(1) will tell us the processor name and group(2) the task name
endTaskTransition = re.compile(r'(P_\w*).\w*->P_\w*.\w* { \w* == \d*, end\[p_id\]\[(\w*)\]') # A processor has finished its task. Also here, group(1) is the processor name and group(2) is the task name
delay = re.compile(r'Delay: \d*') # A delay transition

currentState = ""
currentTime = ""
firstLine = True
taskNames = []
tasks = collections.OrderedDict()
tasks['fw_dist_db'] = ''
tasks['im_read'] = ''
tasks['fw_dupl_mat_1'] = ''
tasks['fw_integral'] = ''
tasks['fw_haar_casc_detector'] = ''
tasks['fw_haar_casc_detect_scale'] = ''
tasks['fw_collect_objs'] = ''
tasks['fw_group_rect'] = ''
tasks['face_resize'] = ''
tasks['fw_imprepare'] = ''
tasks['fw_mat_pow'] = ''
tasks['fw_conv2d_0'] = ''
tasks['fw_conv2d_1'] = ''
tasks['fw_equalize_contrast'] = ''
tasks['fw_normalize_intesity'] = ''
tasks['fw_lbp_op'] = ''
tasks['fw_split_mat'] = ''
tasks['fw_hist_1d'] = ''
tasks['fw_join_mat'] = ''
tasks['fw_dupl_mat_2'] = ''
tasks['fw_compare_hist0'] = ''
tasks['fw_best_score'] = ''
tasks['pr_result'] = ''


for line in sys.stdin:
	l = line.strip()
	if (state.match(l)): # Each state on a trace shows first the automata locations ("State: ...") and then the variable and clock values, so we will output something only after we have read the time
		s = state.search(l)
		currentState = s.group(1)
	if (schedulingTransition.match(l)):
		t = schedulingTransition.search(l)
		procName = t.group(1)
		taskName = t.group(2)
		tasks[taskName] = procName
		#sys.stderr.write(taskName + " started on " + procName + "\n")
	if (endTaskTransition.match(l)):
		e = endTaskTransition.search(l)
		procName = e.group(1)
		taskName = e.group(2)
		tasks[taskName] = ''
		#sys.stderr.write(taskName + " finished on " + procName + "\n")
	if (time.match(l)):
		t = time.search(l)
		currentTime = t.group(1)
		if (not firstLine):
			continue
		else: # First line of the output file: write simply the column headers (so "Time" and the processor names)
			firstLine = False
			sys.stdout.write("Time")
			for n in pName.finditer(currentState):
				sys.stdout.write("," + n.group(1))
			for taskName, scheduledProcessor in tasks.items(): # In this case, scheduledProcessor should always yield '', as we are looking at this for the first time
				sys.stdout.write("," + taskName)
			sys.stdout.write("\n")
	if (delay.match(l)): # We are at a delay transition, so output the latest state at the current time
		sys.stdout.write(currentTime)
		for n in pName.finditer(currentState):
			procState = n.group(2)
			if (procState == "Idle"):
				procState = "-"
			elif (procState.startswith("InUse_")):
				procState = procState[len("InUse_"):]
				if (procState not in taskNames):
					taskNames.append(procState)
			sys.stdout.write("," + procState)
		for taskName, scheduledProcessor in tasks.items(): # In this case, scheduledProcessor should contain the processor on which the task was scheduled (or '' if the task was completed in the meantime)
			sys.stdout.write("," + scheduledProcessor)
		sys.stdout.write("\n")
# At the end, we write the last state we found
sys.stdout.write(currentTime)
for n in pName.finditer(currentState):
	sys.stdout.write("," + n.group(2))
sys.stdout.write("\n")
sys.stderr.write("\ntasks = collections.OrderedDict()\n")
for t in taskNames:
	sys.stderr.write("tasks['" + t + "'] = ''\n")
sys.stderr.write("\n")
sys.stderr.write("If this was the first time you called this script on this input data, please copy the above declaration of the 'tasks' ordered dictionary in the .py script (replacing the existing one) and re-run the script.\n")
