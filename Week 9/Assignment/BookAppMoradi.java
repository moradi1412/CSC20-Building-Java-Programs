import java.util.*;
// Mohammad Javid Moradi 
// Date : 10/31/2022 

public class ScannerDemo {
    // no code here
}

class Author implements Comparable {
    private String first;
    private String last;

    public Author(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast() {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    /*
     * This method compares the two objects of Author for equality based on the last
     * name
     */
    public boolean equals(Object o) {
        Author n = (Author) o;
        return this.last.equals(n.last);
    }

    public String toString() {
        return "Author: " + first + " " + last;
    }

    /*
     * This method compares the two objects of type Author based on their last name
     * compareTo method from the String class should be called.
     * This method accepts an Object as its parameter therfore must use instanceof
     * and type casting in this method
     */
    public int compareTo(Object other) {
        Author p = (Author) other;
        return (this.last).compareTo(p.last);
    }
}

class Book implements Comparable {
    private String title;
    private Author author;
    private String ISBN;
    private double price;
    private int pages;

    /*
     * this constructor accepts the values for all the instance varibales
     * and intializes them all. In this constructor you need to instantiate the
     * author object:
     * author = new Author(first, last)
     */
    public Book(String title, String first, String last, String ISBN, double price, int pages) {
        author = new Author(first, last);
        this.title = title;
        this.ISBN = ISBN;
        this.price = price;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    /*
     * this method returns the first and last name of the author
     * Since the Book has an Author object as its instance variables,
     * then the methods getFirt() and getLast must be called from the Author class
     */
    public String getAuthor() {
        return author.getFirst() + author.getLast();
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setPrice(double p) {
        price = p;
    }

    public void setIsbn(String sb) {
        ISBN = sb;
    }

    /*
     * this method creates a string representing all the attributes of the Bokk
     * object
     * Make sure to call the toString method from the Author class to include the
     * first and last.
     * refer to the output for the format of displaying each object
     */
    public String toString() {
        return author.toString() +
                "\nTitle : " + title +
                "\nPrice : " + price +
                "\n Pages : " + pages +
                "\nISBN : " + ISBN +"\n \n";
    }

    /* compare two books for equlaity based on the isbn number */
    public boolean equals(Book other) {
        return this.ISBN.equals(other.ISBN);
    }

    /*
     * this method incrases the number of the pages by adding p to the instance
     * variable pages
     * 
     */
    public void append(int p) {
        pages = pages + p;
    }

    /*
     * compares the book objects based on the title of the book
     * This compareTo method is called in the selection sort
     */
    // #1
    public int compareTo(Object o) {
        Book s = (Book) o;
        return this.title.compareTo(s.title);

    }

    /*
     * compares objects of type book based on their author
     * This comapreTo method is called in the insertion sort
     * the paramter for this method is of type Book and the author of the book b
     * needed to be compared with the author of the Book object called this
     */
    // #2
    public int compares(Book b) {
        return this.author.compareTo(b.author);
    }

    /*
     * compares the Book object based on the author, if the author is the same then
     * compares the
     * Book objects based on the price
     * this compareTo method is used in the bubbleSort method
     * conditional statemnet needs to be used in this method
     * if the authors of the book b is the same as the author of the Book object
     * this
     * return this.price - b.price
     * else
     * return return author.compareTo(b.author)
     */
    // #3
    public double compare3(Book b) {
            if (this.author.compareTo(b.author) > 0 ) {
            return this.price - b.price; 
        } else 
        return author.compareTo(b.author); 
   }
}

class BookStore {
    private ArrayList<Book> books;

    /*
     * this is the constructor that instantiates the ArrayList books
     */
    BookStore() {
        books = new ArrayList<Book>();

    }

    /*
     * This method adds a book object to the list
     * you need to create a book object first, once you have it then you can add it
     * to the list.
     * if the created book object is called z then we need tosay: books.add(z);
     */
    public void add(String title, String first, String last, double price, String isbn, int pages) {
        Book n = new Book(title, first, last, isbn, price, pages);
        books.add(n);
    }
    /*
     * This method creates a toString from all the objects in the arraylist,
     * make sure to call the tostring method from the book class on each item stored
     * in the list:
     * to call the tostring method from the book class:books.get(i).toString()
     */

    public String toString() {
        String s = "";
        for (int i = 0; i < books.size(); i++) {
            s = s + books.get(i).toString();
        }
        return s;
    }

    /*
     * This method searches the arraylist to find the book with the given isbn.
     * this method does a sequential serach, therfore a for loop is needed.
     */
    public boolean delete(String isbn) {
        return false;
    }

    /*
     * sorts the books based on the title of the book
     * call the compareTo #1 in this method
     * remember the name of the ArrayList is books and it is not list
     */
    public void selectionSort() {
        for (int i = 0; i < books.size() - 1; i++) {
            int index = -1;
            boolean swap = false;
            Book min = books.get(i);
            for (int j = i + 1; j < books.size(); j++) {
                int a = books.get(j).compareTo(min);
                if (a < 0) {
                    index = j;
                    min = books.get(j);
                    swap = true;

                }
            }
            // swap
            if (swap) {
                Book temp = books.get(i);
                books.set(i, min);
                books.set(index, temp);
            }
        }
    }

    /*
     * sorts the book objects based on the author of the book
     * remember the name of the ArrayList is books and it is not list
     * call compareTo #2 in this method
     */
    public void insertionSort() {
        for (int i = 0; i < books.size() - 1; i++) {
            int j = i + 1;
            Book n = books.get(j);
            while (j > 0 && n.compares(books.get(j - 1)) < 0) {
                books.set(j, books.get(j - 1));
                j--;
            }
            books.set(j, n);

        }
    }

    /*
     * sorts the book objcts based on the author,
     * if the author is the same then sorts it based on the price
     * call comapre #3 method in this method
     */
   public void bubbleSort(){
    for(int i = 0; i <books.size() ; i++){
        for(int j = 0 ; j <books.size() -1 - i; j++){
            if(books.get(j+1).compare3(books.get(j)) < 0){
                Book temp = books.get(j);
                books.set(j, books.get(j+1));
                books.set(j+1, temp) ;
            }
        }
    }
}

    /*
     * the following search method searches the book based on the title of the book
     * therfore the first line of code should be a call to the selection sort to
     * sort the books
     * based on the title of the books
     */
    public Book binarySearch(String title) {
        selectionSort(); 
        int first = 0;
        int last = books.size() - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (books.get(mid).getTitle().equalsIgnoreCase(title)) // found the element
                return books.get(mid);
            if (title.compareTo(books.get(mid).getTitle()) > 0) // the element is on the right side
                first = mid + 1;
            else // the element is on the left side
                last = mid - 1;
            mid = (first + last) / 2;
        }
        return null;
    }

    /*
     * This method will search the list of the books sequentially to find the book
     * with the given isbn.
     * once the book is found, need a for loop to go through the arraylist to find
     * the book with the gien isbn.
     * once the book is found then call the append method on the object:
     * for example if the book at the index i has the isbn of the book that we are
     * looking for then
     * books.get(i).append(pages). this method should return the Book object that
     * has been modified.
     * if the Book with the give isbn is not found return null
     * .
     */
   public Book append(String isbn, int pages) {
         for(int i = 0; i < books.size(); i++)
         {
           if(books.get(i).getISBN() == isbn)
             System.out.println(books.get(i).getISBN()); 
              books.get(i).append(pages);

         return books.get(i); 
        }
        return null; 
        }


//
  //   * implement a method of your choicce that does something to the list of books.
    // * 
    // */
    public void creativeMethod() {
    }

}

/*
 * Do not delete this driver.
 */
class Driver
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      BookStore myStore = new BookStore();
      myStore.add("Java","Zoie","Zanjani", 23.56,"12345678",1234);
      myStore.add("Python","Elina","Busta",23.56,"2", 900);
    
      myStore.add("Advance Java","Stewart","Watts",98,"767676576",800);
      myStore.add("Build Java","Liang", "Lu",45,"56786565y76",700);
      myStore.add("Zip lining", "Stewart","Watts", 12,"1234566576",1200);
      myStore.add("C++","Elina", "Jackson",23.56,"2645556",1234);
      myStore.add("Programming Java","Stewart","Watts", 124,"75465666",3456);
      myStore.add("Humanity","Smith","Brown", 100.56,"234545657",1234);
      boolean b = true;
      while(b)
      {
         System.out.println("Enter 1 to sort based on the title");
         System.out.println("Enter 2 to sort based on the author");
         System.out.println("Enter 3 to sort based on the author, and the price");
         System.out.print("Enter your choice: ");
         int option = kb.nextInt();
         System.out.println("\n*************");
         if(option == 1)
         {
            System.out.println("Sorted based on the title\n");
            myStore.selectionSort();
         }
         else if (option == 2)
         {
            System.out.println("Sorted based on the author\n");
            myStore.insertionSort();
         } 
         
         else  
         {
            System.out.println("Sorted based on the author and price\n");
            myStore.bubbleSort();
         }   
         System.out.println(myStore);
         System.out.println("\n     **************     ");
         System.out.print("Enter the title of the book to search for it: ");
         kb.nextLine();
         String t = kb.nextLine();
         
         Book book = myStore.binarySearch(t);
         if(book != null)
            System.out.println(book);
         else
            System.out.println("Book not found");   
         System.out.println("\n");
         System.out.print("Enter the isbn of the book to append pages to it: ");
         String isbn = kb.next();
         System.out.print("Enter the number of the pages to append: ");
         int pages = kb.nextInt();
         Book z  = myStore.append(isbn, pages);
         System.out.println("The " + pages + " has been added to the following book");
         System.out.println(z);
         System.out.println("Enter the information of the book you want to add to the list:");
         
         kb.nextLine();
         System.out.print("Title --> ");
         String tit = kb.nextLine();
         System.out.print("first name --> ");
         String f = kb.next();
         System.out.print("last name --> ");
         String l = kb.next();
         System.out.print("price --> ");
         double price = kb.nextDouble();
         System.out.print("ISBN --> ");
         isbn = kb.next();
         System.out.print("pages --> ");
         pages = kb.nextInt();
         myStore.add(tit,f,l,price,isbn,pages);
         myStore.selectionSort();
         System.out.println("Here is the updated list:");
         System.out.println(myStore);
         
         
         
         
            
      }  
   
   }
}
  
/*
 * in this driver create your own code:
 * create a BookStore object
 * create 5 book objects and add them to the book store
 * create a while loop and implement the similar code to the given driver.
 * Do not copy paste the provided driver here, make your own code
 * add some creative codes to call the methods in the BookStore class.
 * 
 * make sure to call the method that you created yourself
 */
class yourDriver {
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
      BookStore myStore = new BookStore();
      myStore.add("Title5","First5","Last5", 5.5,"5",5);
      myStore.add("Title1","First1","Last1", 1.1,"1",1);
      myStore.add("Title2","First2","Last2", 2.2,"2",2);
      myStore.add("Title4","First4","Last4", 4.4,"4",4);
      myStore.add("Title3","First3","Last3", 3.3,"3",3);
      
      System.out.println(" Enter the sort choice 1 base on title, 2 for author, 3 for the price : ");
      int option = kb.nextInt();
      switch (option){
        case 1: myStore.selectionSort();System.out.println(myStore);break; 
        case 2: myStore.insertionSort();System.out.println(myStore);break;
        case 3: myStore.bubbleSort();System.out.println(myStore);break;
      } 
    }
}