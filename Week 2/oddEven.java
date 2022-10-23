public class oddEven
{
   public static void main(String[] args)
   { 
    int size = (38 - (-6))/2;
    int[] odd = new int[size];
    int index = 0;
    for(int i = -6; i <= 38; i++)
    {
       if(i % 2 != 0)
       {
          odd[index] = i;
          index++;
       }   
          
    }
   
   
      
   }
}