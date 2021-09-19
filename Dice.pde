class  Dice {


  int value;
  float valueColor;
  float diceColor;


  //constructor
  Dice (float tempvalueColor, float tempdiceColor) {
    valueColor = tempvalueColor;
    diceColor = tempdiceColor;
  }

  void roll() {
    value = (int)random(6)+1;
    println(value);
  }
  void draw(int x, int y, int size) {
    rectMode(CENTER);
    ellipseMode(CENTER);
    fill(diceColor);
    rect(x, y, size, size);
    fill(valueColor);  

    // middle eye
    if (value %2 == 1) {
      circle(x, y, size/8);
    }
    // lower left and uppper right eye
    if ( value == 2 || value == 3) {
      circle(x+10, y-10, size/8);
      circle(x-10, y+10, size/8);
    }
    // lower right and upper left eye
    if (value == 4 || value == 5 || value == 6) {
      circle(x-10, y-10, size/8);
      circle(x+10, y-10, size/8);
      circle(x-10, y+10, size/8);
      circle(x+10, y+10, size/8);
    }
    // middle left and right eye
    if (value == 6) {
      circle(x-10, y, size/8);
      circle(x+10, y, size/8);
    }
  }
}
