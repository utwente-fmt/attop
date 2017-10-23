#!/bin/sh

extract () {
	echo 0 0
	for i in output/*.storm.out; do
		TIME=$( grep jani "$i" | grep -o '[[:digit:]][0123456789.]*' );
		VALUE=$( grep Result "$i" | grep -o '[[:digit:]][0123456789e.-]*' );
		echo "$TIME" "$VALUE";
	done
}

dftcalc -i 0.1 50 .1 "$1"
extract | sort -n > output/plotdata.txt
echo "set terminal pdf" > output/plot.gnuplot
echo "unset key" >> output/plot.gnuplot
echo "set ylabel 'Probability of successful attack'" >> output/plot.gnuplot
echo "set xlabel 'Time (hours)'" >> output/plot.gnuplot
echo "plot 'output/plotdata.txt' using 1:2 with lines" >> output/plot.gnuplot
gnuplot <output/plot.gnuplot >plot.pdf
