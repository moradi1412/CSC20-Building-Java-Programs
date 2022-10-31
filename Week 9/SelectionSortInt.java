import java.util.*;


public class SelectionSortInt {
    public static void main(String[] args)
   {
      int[] num = new int[30];
      Random rand = new Random();
      //filling in the array with random number
      for(int i = 0;i < num.length; i++)
      {
         num[i] = rand.nextInt(1000);
      }
       System.out.println(Arrays.toString(num));
      selectionSort(num);
      System.out.println(Arrays.toString(num));
      //without the variable swap the call with the following array goes to an exception 
      int[] values={0,23,45,67,89,12,1,3,4,5};
   }
   public static void selectionSort(int[] num)
   {
      for(int i = 0; i<num.length -1; i++)
      {
        int index = -1;
        int min = num[i];
        boolean swap = false;
        for(int j = i+1; j < num.length; j++)
        { 
            //find the smallest value in the list
            if(num[j] < min)
            {
              index = j; //index of the next smallest element in the list
              min = num[j];
              swap = true;  //to check if there is any min value found
            }   
           
        }
        //swapping the vlues
        if(swap)
        {
           int temp = num[i];
           num[i] = num[index];
           num[index] = temp;
        }   
      }
   }
    
}
