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

}
public class Not_61_ps4 {
    public static void main(String[] args) {
        Library central = new Library();
        central.addBooks("Tao Te Ching");
    }
}
