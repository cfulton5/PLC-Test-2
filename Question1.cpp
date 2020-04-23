#include <iostream>

enum days{
  Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
};

enum colors{
  red, orange, yellow, green, blue, indigo, violet
};

int main(){
days today;
today = Thursday;
std::cout << "Today is day number " << today << std::endl;
std::cout << "Tomorrow will be day number " << today + 1 << std::endl;
std::cout << "Yesterday was day number " << today - 1 << std::endl;
std::cout << "Number of hours in the week so far: " << (today+1) * 24  << std::endl;


colors favoriteColor;
favoriteColor = green;
std::cout << "Favorite color: " << favoriteColor << std::endl;
std::cout << "Favorite color times 71: " << favoriteColor * 71 << std::endl;
std::cout << "Favorite color modulous 2: " << favoriteColor % 2 << std::endl;
std::cout << "Favorite color divided by 1.7: " << favoriteColor / 1.7 << std::endl;



//PART 2: USING INTEGER VARIABLES INSTEAD OF ENUMERATION


  int Monday = 0;
  int Tuesday = 1;
  int Wednesday = 2;
  int Thursday = 3;
  int Friday = 4;
  int Saturday = 5;
  int Sunday = 6;

  int red = 0;
  int orange = 1;
  int yellow = 2;
  int green = 3;
  int blue = 4;
  int indigo = 5;
  int violet = 6;

  int today_Integer_Variable = Thursday;

  std::cout << "Today is day number " << today_Integer_Variable << std::endl;
  std::cout << "Tomorrow will be day number " << today_Integer_Variable + 1 << std::endl;
  std::cout << "Yesterday was day number " << today_Integer_Variable - 1 << std::endl;
  std::cout << "Number of hours in the week so far: " << (today_Integer_Variable+1) * 24  << std::endl;

  int favoriteColor_Integer_Variable = green;

  std::cout << "Favorite color: " << favoriteColor_Integer_Variable << std::endl;
  std::cout << "Favorite color times 71: " << favoriteColor_Integer_Variable * 71 << std::endl;
  std::cout << "Favorite color modulous 2: " << favoriteColor_Integer_Variable % 2 << std::endl;
  std::cout << "Favorite color divided by 1.7: " << favoriteColor_Integer_Variable / 1.7 << std::endl;


return 0;
}
