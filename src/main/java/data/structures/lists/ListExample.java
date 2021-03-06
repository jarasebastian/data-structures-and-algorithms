package data.structures.lists;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 *
 * Main class for testing the linkedlist structure
 */
public class ListExample {

    public static void main(String[] args) {

        LinkedList<Book> list = new LinkedList<>();
        Book book1 = new Book("The Secret Garden", "IELTS", 50);
        Book book2 = new Book("Somos polvo de estrellas", "José Maza", 100);

        try {
            list.add(book1);
            System.out.println(list.get(0).getName());
        }catch(NullPointerException e) {
            System.out.println("Parameter returns null");
        }
    }
}
