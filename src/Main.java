import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> person = new ArrayList<>();
        System.out.println("Welcome to Satyam's Contact List");
        System.out.println("Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program");
        int n = sc.nextInt();
        while (n != 5) {
            switch (n) {
                case 1:
                    System.out.println("you have chosen to add contact");
                    AddContact add1 = new AddContact();
                    person.add(add1.addContact());
                    System.out.println("CONTACT ADDED");
                    break;
                case 2:
                    Implementation obj = new Implementation();
                    obj.viewContact(person);
                    break;
                case 3:
                    System.out.println("You could search for a contact from their first names: ");
                    Implementation obj1 = new Implementation();
                    obj1.search(sc.next(), person);
                    break;
                case 4:
                    Implementation obj2 = new Implementation();
                    obj2.deletecontact(person);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("you entered wrong");
                    break;
            }
            System.out.println("Welcome to Satyam's contact List");
            System.out.println("Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program");
            n = sc.nextInt();
        }
        System.out.println("THANKS :-)");
    }
}
