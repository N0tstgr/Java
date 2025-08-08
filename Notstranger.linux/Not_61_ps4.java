package Notstranger.linux;
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBooks(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ "has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available BOoks are : ");
        for (String book: this.books){
            if(book == null){
                break;
            }
            System.out.println("* "+ book);
        }
    }
void issuebook(String book){
    System.out.println("Books that can be issued ");
        for (String b: this.books){
            if(b == book){
                System.out.println("The book has been issued ");
            }
            System.out.println("* "+ b);
        }
}
}
public class Not_61_ps4 {
    public static void main(String[] args) {
        Library central = new Library();
        central.addBooks("Tao Te Ching");
        central.addBooks("Algorithm");
        central.addBooks("Linux Terminal");
        central.addBooks("how to start a startup");
        central.issuebook("Linux Terminal");
        central.showAvailableBooks();
    }
}
