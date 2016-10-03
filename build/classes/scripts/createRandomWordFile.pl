#!/usr/bin/perl -l
# To use this file, do the following: perl createRandomWordFile.pl > FILENAME.txt
# You can change the number of numwords to create smaller or larger files 
use strict;
use warnings;
use List::Util qw/shuffle/;

my $wordlist = '/usr/share/dict/words';

my $length = 10;
my $numwords = 100;

my @words;

open WORDS, '<', $wordlist or die "Cannot open $wordlist:$!";

while (my $word = <WORDS>) {
    chomp($word);
    push @words, $word if (length($word) == $length);
}

close WORDS;

my @shuffled_words = shuffle(@words);

print for @shuffled_words[0 .. $numwords - 1];
