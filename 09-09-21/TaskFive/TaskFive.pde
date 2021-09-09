void setup() {
  MethodOne();
  MethodTwo();
}

/*
  The following method has an error in it. Fix the error and run it.
 */

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line.

  int max = 10;

  if (i > max)
  {
    String output = "I is greater than "+max+".";
    println(output);
    // println needs to be in the same local group as String output
  }
}

/*
 Finish the following method so that we can change the number assigned
 to the weekday and it prints the correct output.
 */
void MethodTwo()
{
  int weekDay = 6; // 0 = Monday, 6 = Sunday.
  boolean weekend = false;

  if (weekDay < 5)
  {
    weekend = false;
  } else
  {
    weekend = true;
  }

  // Print the name of the weekday here:
  if ( weekDay == 0) {
    println("It's monday");
  } else if (weekDay == 1) {
    println( "It's Tuesday");
  } else if (weekDay == 2) {
    println( "It's Wednesday");
  } else if (weekDay == 3) {
    println( "It's Thursday");
  } else if (weekDay == 4) {
    println( "It's Friday");
  } else if (weekDay == 5) {
    println( "It's Saturday");
  } else if (weekDay == 6) {
    println( "It's Sunday");
  }
  if ( weekend == true) {
    println( "It's the weekend");
  }

  // Print if it is weekend here:
}
