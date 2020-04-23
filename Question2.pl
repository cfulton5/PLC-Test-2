

$y = 99;

sub dynamic {
  local $y = 0;
  return ySub();
}
sub ySub { return $y; }




$x = 99;

sub static {
  my $x = 0;
  return xSub();
}
sub xSub { return $x; }




print dynamic(); 
print static(); 
