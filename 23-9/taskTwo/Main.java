class Main{
  public static boolean happy = false;

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }
   System.out.println(calculate(10,20));
   System.out.println(stort("hej"));
   System.out.println(check("hej"));
}

public static boolean iAmHappy()
{
  if (happy == true) {
  // fill out what is missing here: 
  return true;
} else {
  return false;
    }
  }
public static int calculate(int a, int b){

  int sum = a+b;
  return sum;
}


public static String stort(String c){

return c.toUpperCase();

}

public static boolean check(String d){

  if (Character.isUpperCase (d.charAt(0))){

    return true;
    }
    
    else {
      return false;
      }
    }
  }

