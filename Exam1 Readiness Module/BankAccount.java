//CompareTo method sample 

public class BankAccount {
    private String name; 
    private int id; 
    private double balance; 
    public BankAccount(String name, int id, double balance){
        this.name = name; 
        this.id = id; 
        this.balance= balance; 
    }
    

public int compareTo(Object o) {
    BankAccount other = (BankAccount)o;
   if (balance > other.getBalance()) {

       return 1;

   } else if (balance < other.getBalance()) {

       return -1;

   } else if (id > other.getID()) {

       return 1;

   } else if (id < other.getID()) {

       return -1;

   } else {

       return 0;

   }

}

}
