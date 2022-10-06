package Inheritance;

public class DriverClasss
{
  public static void main(String[] args)
  {
    //String first, String last, String ssn, int age, String speciality, String school
     Doctor d1 = new Doctor("Mary","Busta", "1234",34, "cardiologost","UC davis"); 
    System.out.println(d1.getFirst());
    System.out.println(d1.getLast());
    System.out.println(d1.getSchool());
    System.out.println(d1.toString());
     Doctor d2 = new Doctor("Jose", "Faroughi","4567",55, "Internal medicine", "UC LA");
     boolean b = d1.equals(d2);
     System.out.println(b);
  }
}  
