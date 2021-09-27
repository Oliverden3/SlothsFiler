class Datamatik{

public static void main(String[] args) {
  
  Teacher teacher = new Teacher("Dorthe", 31, true);
  Student student1 = new Student("Oliver", 22, false,"TeamA");
  Student student2 = new Student("Nicolai", 19, false, "TeamA");
  System.out.println(teacher.name);
  System.out.println(student2.name + " " + student2.datamatikerTeam);
  System.out.println(student1.name + " " + student1.datamatikerTeam);
 
}


}