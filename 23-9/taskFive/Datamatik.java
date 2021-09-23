class Datamatik{

public static void main(String[] args) {

Student[] students = new Student[10];
  

students[0] = new Student("Oliver", 22, false, "HoldA");
students[1] = new Student("Tobias", 21, false, "HoldA");
students[2] = new Student("Ulrikke", 18, true, "HoldB");
students[3] = new Student("Søren", 21, false, "HoldB");
students[4] = new Student("Troels", 29, false, "HoldA");
students[5] = new Student("Mulligan", 22, false, "HoldA");
students[6] = new Student("Tyrant", 22, false, "HoldA");
students[7] = new Student("Tyrone", 30, false, "HoldA");
students[8] = new Student("Shaniqua", 9, true, "HoldA");
students[9] = new Student("Mombana", 15, false, "HoldA");
  
  System.out.println(nameOfStudents(students, 3));
  System.out.println(indexOfStudent(students, "Mombana"));
  }

  public static String nameOfStudents(Student[] list, int index){

   String name = list[index].name;
    return name;
  }

public static int indexOfStudent(Student[] list, String name)
    {
        int studentNum = 0;

        for (int i = 0; i < list.length; i++)
        {
            if(list[i].name.equals(name))
            {
                studentNum = i;
            }
        }

        return studentNum;
    }
}