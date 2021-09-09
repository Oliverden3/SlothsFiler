int gray = #C9C9C9;
int red = #FA0000;
int green = #00FA2B;
int yellow = #F9FA00;
int count = 0;


void setup() {
  frameRate(1);
  size(500, 500);
  background(255);
}

void draw() {
  fill(gray);
  rectMode(CENTER);
  ellipseMode(CENTER);

  rect(width/2, height/2, 100, 300);

  fill(red);
  ellipse(width/2, height/3-15, 100, 100);

  fill(yellow);
  ellipse(width/2, height/2, 100, 100);

  fill(green);
  ellipse(width/2, height/2+100, 100, 100);

  for (int i = 0; i < 100 ; i++) {
    if (i <=33) {
      yellow = gray;
      green = gray;
    } else if (i <=66) {
      red = gray;
      green = gray;
    }
    else if (i >= 66 ){
    red = gray;
    yellow = gray;
    }
  }
  if (count == 0) {

    yellow = gray;
    green = gray;
  }
}
