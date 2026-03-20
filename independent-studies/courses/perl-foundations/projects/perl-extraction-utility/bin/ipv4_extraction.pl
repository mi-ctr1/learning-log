#!/usr/bin/env perl
use strict;
use warnings;

my $file = 'sample_logs/app.log';
open my $fh, '<', $file or die $!;

while (my $line = <$fh>) {
  while ($line =~ /\b(\d{1,3}(?:\.\d{1,3}){3})\b/g) {
    print "$1\n";
  }
}
close $fh;

