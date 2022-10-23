import java.util.*;
//a program to create a list of distinct animals. The user will enter one name at a time.
// The use might repeat the names entered but your program must filter the repeated names and only keep one copy of each name


public class AnimalList {
    public static void main(String[] args) {
        // method calling
        run();
    }

    public static void run() {
        String[] list = new String[10];
        Scanner kb = new Scanner(System.in);
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter the name of the animal: ");
            String name = kb.next();
            boolean b = search(list, name);
            if (b == false) {
                list[index] = name;
                index++;
            }

        }
        display(list);
    }

    public static void display(String[] list) {
        System.out.println("Here is the list of the animals you entered");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null)
                System.out.print(list[i] + "  ");
        }
    }

    public static boolean search(String[] list, String name) {
        for (int i = 0; i < list.length; i++) {
            if (name.equalsIgnoreCase(list[i]))
                return true;
        }
        return false;
    }

}