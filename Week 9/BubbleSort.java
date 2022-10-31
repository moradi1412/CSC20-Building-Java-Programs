import java.util.*;


public class BubbleSort {
    public static void main(String[] args)
    {
       int[] list= {34,67,12,0,33,66,89,98,13,-1};
       bubbleSort(list);
       System.out.println(Arrays.toString(list));
    }
    public static void bubbleSort(int[] list)
    {
       for(int i = 0; i <list.length ; i++)
       {
          for(int j = 0 ; j <list.length -1 - i; j++)
          {
             if(list[j+1] < list[j])
             {
                 int temp = list[j];
                 list[j] = list[j+1];
                 list[j+1] = temp;
             }
          }
       }
    }
}

