package Inheritance;

public class Person {
    private String first; 
    private String last; 
    private String ssn; 
    private int age; 

    //constractor 
    public Person (String first, String last, String ssn, int age){
        this.first = first;
        this.last = last;
        this.ssn = ssn;
        this.age = age;
    }

    //getter method 
    public String getFirst() {
        return first; 
    }
    public String getLast() {
        return last; 
    }
    public String getSSN() {
        return ssn; 
    }
    public int getAge() {
        return age; 
    }

    //To string method 
    public String toString()
    {
       String s ="";
       s = "first: " + first;
       s = s + "\nlast " + last;
       s = s + "\nage " + age;
       s = s + "\nssn " + ssn;
       return s;
    }


}
