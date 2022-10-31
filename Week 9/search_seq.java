public class search_seq
{

    public static void main(String[] args) {
        int [] list = {45, 23, 56, 22, 88, 54,32,45,99, 453 }; 
        int index = search(list, 453);  
        System.out.println(index);
    }

    public static int search(int[] list, int num ) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == num )
            return i; 
        }
        return -1; 
    }
}