#!/bin/sh
#
# This generates a word file that is between 5000 and 10000 words in length
# To run this do the following: ./createRandomWordFile.sh >> textFile.txt
#
WORDFILE="/usr/share/dict/words"
NUMWORDS=$(shuf -i 5000-10000 -n 1)

#Number of lines in $WORDFILE
tL=`awk 'NF!=0 {++c} END {print c}' $WORDFILE`

for i in `seq $NUMWORDS`
do
rnum=$((RANDOM%$tL+1))
sed -n "$rnum p" $WORDFILE
done
