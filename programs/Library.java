import java.util.*;

class Library {

    // Declare inventory
    private Hashtable<String, String> inventory;

    // Instantiate the inventory property to be key(string)/value(string)
    private void setup_inventory(){
      inventory = new Hashtable<String, String>();
    }

    // Add book to inventory property in Library object
    public void add_book(String isbn, String title) {
      inventory.put(isbn, title);
    }

    // Retrieve book title from provided ISBN number
    public String get_book_title(String isbn) {
      return inventory.get(isbn);
    }

    // Get a full list of all of the ISBN in the inventory property
    public Set<String> get_isbn_list() {
      return inventory.keySet();
    }

    // Main function, runs by default
    public static void main(String[] args) {

      Library myLibrary = new Library();
      myLibrary.setup_inventory();

      // Add books to library dictionary
      myLibrary.add_book("00000", "Percy Jackson: Sea of Monsters");
      myLibrary.add_book("11111", "The Flight Attendant");

      // Get the book title from library
      System.out.println(myLibrary.get_book_title("11111"));

      // Get raw inventory key+value data
      System.out.println(myLibrary.inventory);

      // Return only a list of isbn numbers
      System.out.println(myLibrary.get_isbn_list());

      // Creates a reader instance which takes input from standard input - keyboard
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter an ISBN number: ");

      // nextInt() reads the next integer from the keyboard
      //int number = reader.nextInt();
      String user_input = reader.nextLine();

      System.out.println("You entered: " + user_input);
      String user_result = myLibrary.get_book_title(user_input);
      
      if (user_result != null) {
        System.out.println("Matching book title: " + user_result);
      }
      else {
        System.out.println("No matching entries found in our inventory");

      }

    }
}
