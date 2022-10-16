import java.util.*;


public class DeletingArrayindex {
    public static void main(String[] args)
   {  
     
     String[] words ={"a","b","c","d","e"};
     remove(words,"c");   
     
  }
   public static void remove(String[] words, String s)
   {
      int i;
      //find the element in the array
      for(i = 0; i < words.length; i++)
      {
         if(words[i].equalsIgnoreCase(s))
         {
              words[i] = null;
              break;
         }     
      }
      System.out.println(Arrays.toString(words));
      //shift all the elements to the right
      for(int index = i; index < words.length -1 ; index++)
      {
        words[index] = words[index+1];
      }
      words[words.length - 1] = null;
      System.out.println(Arrays.toString(words));
      
      
   }

    
}
