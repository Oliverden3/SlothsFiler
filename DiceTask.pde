Dice myDice;
DiceCup myCup;
int diceAmount = 6;

void setup() {
  size(500, 425);
  myCup = new DiceCup();
  myDice = new Dice (0, 255);  
  for(int i = 0; i < diceAmount;i++ ){
    myCup.addDie(new Dice(0, 255));
  }
}


void draw() {
  background(160);
  myCup.drawDiceByLine(75, 100, 50);
  
}

void keyPressed() {
  myCup.shake();
}
