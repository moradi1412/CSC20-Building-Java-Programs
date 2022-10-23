import java.util.*;



public class maxLengthIndex {
    public static void main(String[] args) {
        ArrayList<String> w = new ArrayList<>(); 
        w.add("Busy"); 
        w.add("life"); 
        w.add("death");
        int man = getMaxLength(w); 
        System.out.println(man);

        
    }


    public static int getMaxLength (ArrayList<String> words) {
        int length = 0; 
        int maxLength = 0;

        for (int i = 0; i < words.size(); i++) {
            String s = words.get(i); 
            length = s.length(); 

            if (maxLength < length){
                maxLength = length; 
            }
        }

        return maxLength; 
    }
    
}
