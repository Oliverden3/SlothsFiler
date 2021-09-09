/*
int a = 5;
 int b = 5;
 
 if( a == 10 || b == 10 || a+b == 10){
 println("success!");
 }
 else{println("Failure");}
 */

int x=10;
int y=9;
int z=11;

if (x+y+z == 30 && !(x%10==0 || y%10==0 ||z%10==0 )) {
  println("Success!");
}
else{println("Failure!");}
