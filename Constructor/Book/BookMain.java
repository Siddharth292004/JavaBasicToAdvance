import java.util.Scanner;

class Book{
    String author ;

    Book(String author){
        this.author = author;
    }
    void display(){
        System.out.print("author: "+author);
    }
}

public class BookMain {
    
    public static void main(String [] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the name of the author: ");
            String authorName = sc.nextLine();

            Book b1 = new Book(authorName);
            b1.display();



        }catch(Exception e){
            System.out.println("invalid input ! please enter valid input.");
        }

    }
}
