import java.util.*;

public class SelectionSort {
    public static void main(String[] args)
   {
      ArrayList<String> list = new ArrayList<String>();
      list.add("Mary");
      list.add("Alex");
      list.add("Nik");
      list.add("Tammy");
      list.add("Sarah");
      list.add("Jose");
      selection(list);
      System.out.println(list);
                 
   }
   public static void selection(ArrayList<String> list)
   {
      for(int i = 0; i <list.size(); i++)
      {
         int index = 0;
         boolean swap = false;
         String min =list.get(i);
         for(int j = i+1; j < list.size(); j++)
         {
            if(list.get(j).compareTo(min) < 0)
            {
               index = j;
               min = list.get(j);
               swap = true;
               
            
            }
         }
      //swap
      if(swap)
      {
         String temp = list.get(i);
         list.set(i,list.get(index));
         list.set(index ,temp);
      }   
      }
   }

  
}   