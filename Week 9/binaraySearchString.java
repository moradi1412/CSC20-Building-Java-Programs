import java.util.*;

public class binaraySearchString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mary");
        list.add("Alex");
        list.add("Nik");
        list.add("Tammy");
        list.add("Sarah");
        list.add("Jose");
        Collections.sort(list);
        System.out.println(list);
        int index = binarySearch(list, "Jose");
        System.out.println(index);
    }

    public static int binarySearch(ArrayList<String> list, String target) {
        int first = 0;
        int last = list.size() - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (list.get(mid).equalsIgnoreCase(target)) // found the element
                return mid;
            if (target.compareTo(list.get(mid)) > 0) // the element is on the right side
                first = mid + 1;
            else // the element is on the left side
                last = mid - 1;
            mid = (first + last) / 2;
        }
        return -1;
    }
}