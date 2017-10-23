This is a tweaked version of the ATTop output to turn the ATCalc file
into an equivalent DFTCalc file.

Changes:
- Success probabilities removed.
- Sequential AND turned into cold spare.
- Dormancy factors of everything but the non-primaries of the SAND
  turned to 1 (to fix a temporary DFTCalc issue where BEs not affected
  by a space always remain dormant).
