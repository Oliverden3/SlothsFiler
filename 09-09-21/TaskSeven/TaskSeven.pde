/*int input = 40;
 int halfInput = input/2;
 for (input = 0; input <=40; input++) {
 if (input == 6) {
 println("six");
 } else if (input == halfInput) {
 println("HALF");
 } else {
 println(input);
 }
 }
 */

int input = 60;
int halfInput = input/2;

while ( input >=0) {
  input--;

  if (input == 6) {
    println("Six");
  } else if (input == halfInput) {
    println("HALF");
  } else {
    println(input);
  }
}
