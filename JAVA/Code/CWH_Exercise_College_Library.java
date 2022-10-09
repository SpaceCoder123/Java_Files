
import java.util.ArrayList;
import java.util.List;

class Library {
    // Methods: addBook, issueBook, returnBook, showAvailableBooks
    public List<Book> BookList = new ArrayList<Book>();
    public List<Book> IssuedBooks = new ArrayList<Book>(); // create an array for issued books

    public void addBook(Book obj) {
        BookList.add(obj);
        System.out.println("Book " + obj.getTitle() + " , successfully added to inventory");
    }

    public void printList() {
        System.out.println("No.\t\tBook number \tTitle of the book \t\t\t\tAuthor of the book\t\t\tISBN\t\t\t\tPrice");
        for (int i = 0; i < BookList.size(); i++) {
            System.out.println((i + 1) + "\t\t" + BookList.get(i).getBooknumber() + "\t\t\t" + BookList.get(i).getTitle() + "\t\t\t" + BookList.get(i).getAuthor() + "\t\t\t" + (BookList.get(i).getISBN()) + "\t\t\t" + (BookList.get(i).getPrice())+"\t\t\t" + (BookList.get(i).getQuantity()));
        }
    }

    public void issueBook(int val,int quantity) {
        int num = val - 1;
        if (BookList == null || num > BookList.size() || num<0) {
            System.out.println("The item is not available in the library");
        } else {
            Book item = BookList.get(num);
            int cond = item.changeQuantity(quantity);
            if (cond == 0){
                System.out.println("Demanded quantity is more than available");
            } else if (cond == 1) {
                System.out.println("The required item  **** "+ item.getTitle() +" **** is out of stock");
            }
            else{
                IssuedBooks.add(item);
                System.out.println("Book number " + val + " with "+ quantity +" copies, has been issued");
            }

        }
    }

    public void availableBooks(){
        System.out.println(" Showing available books ");
        System.out.println("--------------------------------------------");
        System.out.println("No.\t\tBook number \tTitle of the book \t\t\t\tAuthor of the book\t\t\tISBN\t\t\t\tPrice\t\t\tQuantity");

        for (int i  = 0; i<BookList.size(); i++ ){
            if(BookList.get(i).getQuantity() > 0){
                System.out.println((i + 1) + "\t\t" + BookList.get(i).getBooknumber() + "\t\t\t" + BookList.get(i).getTitle() + "\t\t\t" + BookList.get(i).getAuthor() + "\t\t\t" + (BookList.get(i).getISBN()) + "\t\t\t" + (BookList.get(i).getPrice())+"\t\t\t" + (BookList.get(i).getQuantity()));
            }
            else {
                continue;
            }
        }
    }
}

class Book{
    private int booknumber;

    public int getBooknumber() {
        return booknumber;
    }
    private String Title;

    public String getTitle() {
        return Title;
    }
    private String Author;
    public String getAuthor() {
        return Author;
    }
    private String ISBN;

    public String getISBN() {
        return ISBN;
    }
    private int Price;
    public int getPrice() {
        return Price;
    }

    private int Quantity;

    public int getQuantity() {
        return Quantity;
    }
    public int changeQuantity(int val){
        if (val > Quantity && Quantity != 0){
            return 0; // this says the there is some quantity but the demanded quantity is more than available
        } else if (Quantity == 0) {
            return 1; // out of stock
        }
        else{
            Quantity -= val;
            return 2;
        }
    }
    public Book(int book_number, String title, String author, String isbn, int price,int quantity){
        this.booknumber = book_number;
        this.Title = title;
        this.Author = author;
        this.ISBN = isbn;
        this.Price = price;
        this.Quantity = quantity;
    }
}




public class CWH_Exercise_College_Library {

    // this program contains the implementation of college library using object oriented programming
    public static void main(String[] args) {
         Book got = new Book(1234,"Song of Ice and Fire","George R.R Martin","12465651",3124,0);
         Book got2 = new Book(1334,"Song of Ice and Fire 2","George R.R Martin","12465651",3124,15);
         Library Lib = new Library();
         Lib.addBook(got);
         Lib.addBook(got2);
         Lib.issueBook(1,10);
         // Lib.availableBooks();
         Lib.printList();
    }
}

