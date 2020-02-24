import java.util.Scanner;

public class AddContact {
    Person obj = new Person();
    Regex ob1 = new Regex();

    public void addFirstName(String name) {
        obj.setFirstname(name);
    }

    public void addLastName(String ln) {
        obj.setLastname(ln);
    }

    public boolean addNumber(String number) {
        if (ob1.number(number)) {
            obj.setContactnumber(number);
            return true;
        }
        return false;
    }

    public boolean addEmail(String mail) {
        if (ob1.emailreg(mail)) {
            obj.setEmail(mail);
            return true;
        }
        return false;
    }

    public Person addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the Person");
        System.out.println("First Name: ");
        addFirstName(sc.nextLine());
        System.out.println("Last Name: ");
        addLastName(sc.nextLine());
        boolean a = true;
        while (a) {
            System.out.println("Contact Number: ");
            String no = sc.nextLine();
            a = addNumber(no);
            if (!a) {
                System.out.println("invalid no please re-enter");
                a = true;
                continue;
            }
            System.out.println("Would you like to add another contact number? (y/n): ");
            char c = (sc.nextLine()).charAt(0);
            if (c == 'y')
                a = true;
            else
                a = false;
        }
        System.out.println("Would you like to add email address? (y/n): y");
        char c = (sc.nextLine()).charAt(0);
        if (c == 'y') {
            System.out.println("Email Address: ");
            String mai = sc.nextLine();
            boolean a1 = addEmail(mai);
            while (!a1) {
                System.out.println("invalid email please re-enter");
                System.out.println("Email Address: ");
                a1 = addEmail(sc.nextLine());
                continue;
            }
        }
        return obj;


    }
}
