import java.util.*;


public class BubbleSortString {
   public static void main(String[] args)
   {
      ArrayList<String> list = new ArrayList<String>();
      list.add("Mary");
      list.add("Alex");
      list.add("Nik");
      list.add("Tammy");
      list.add("Sarah");
      list.add("Jose");
      bubbleSort(list);
      System.out.println(list);
   
   }
   public static void bubbleSort(ArrayList<String > list)
   {
      for(int i = 0; i <list.size() ; i++)
      {
         for(int j = 0 ; j <list.size() -1 - i; j++)
         {
            //swap
            if(list.get(j+1).compareTo(list.get(j)) < 0)// < list[j])
            {
               String temp = list.get(j) ;
               list.set(j,  list.get(j+1));
               list.set(j+1, temp);
            }
         }
      }

   }
}
    
}
