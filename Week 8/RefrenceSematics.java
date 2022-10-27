import java.sql.Array;
import java.util.Arrays;

public class RefrenceSematics {

}
// class passByReference {
//     public static void main(String[] args) {
//         int a = 6 ; 
//         int b = a ; 
//         b = b + 1 ; 
//         System.out.println( a + " " + b );
//     }
// }


class PassbyRefrenceSematics
{
   public static void main(String[] args)
   {
    int[] a = {1,2,3,4};
    int[] b = a;
    b[2] = 55221; 

    System.out.println("Array a is at the address: "+a);
    System.out.println("Array b is at the address: "+ b);

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));



  }
}

 
// output: 
// Array a is at the address: [I@1c20c684
// Array b is at the address: [I@1c20c684