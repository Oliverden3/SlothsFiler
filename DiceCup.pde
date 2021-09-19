class DiceCup {

  Dice[] diesList;

  DiceCup() {
    diesList = new Dice[6];
  }

  void addDie(Dice dice) {
    for (int i = 0; i < diesList.length; i++) {
      if ( diesList[i] == null) {
        diesList[i] = dice;
        break;
      }
    }
  }

  void shake() {
    for (int i = 0; i < diesList.length; i++) {
      if (diesList[i] == null) {
        break;
      }
      diesList[i].roll();
    }
  }

  /*  void draw( int x, int y, int dieSize){
   int padding = dieSize + dieSize/2;
   for (int i = 0; i < diesList.length; i++) {
   if (diesList[i] != null) {
   diesList[i].draw(x + padding*i, y, dieSize);
   }
   }
   } 
   */
  void drawDiceByLine(int x, int y, int dieSize) {
    int padding = dieSize + dieSize/2;
    for (int i = 0; i < diesList.length; i++) {
      if (diesList[i] != null) {
        int value = diesList[i].value;

        if (diesList[i].value == 1) {
          y = 25;
        }
        if ( value == 2) {
          y = 100;
        }
        if (value == 3) {
          y = 175;
        }
        if (value == 4) {
          y = 250;
        }
        if ( value == 5) {
          y = 325 ;
        }
        if ( value == 6) {
          y = 400;
        }
         diesList[i].draw(x + padding*i, y, dieSize);
      }
    }
  }
}
