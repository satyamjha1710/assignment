import java.util.ArrayList;
import java.util.Scanner;

public class Implementation {
    public void viewContact(ArrayList<Person> ob) {
        if (ob.size() != 0) {
            for (Person oj : ob) {
                viewDetails(oj);
            }
        } else {
            System.out.println("NO Contacts");
        }
    }

    public void viewDetails(Person profile) {
        System.out.println("---Here are all your contacts---");
        System.out.println();
        System.out.println("--------*--------*--------*--------");
        System.out.println("First Name:" + profile.getFirstname());
        System.out.println("Last Name: " + profile.getLastname());
        String s = "" + profile.getContactnumber();
        System.out.println("Contact Number(s): " + s.substring(1, s.length() - 1));
        System.out.println("Email address:" + profile.getEmail());
        System.out.println("--------*--------*--------*--------");
    }

    public void deletecontact(ArrayList<Person> profile) {
        if (profile.size() != 0) {
            System.out.println("enter no. which you want to delete");
            Scanner sc = new Scanner(System.in);
            for (int i = 0, j = 1; i < profile.size(); i++, j++) {
                System.out.println(j + " " + profile.get(i).getFirstname() + " " + profile.get(i).getLastname());
            }
            int n = sc.nextInt();
            for (int i = 0, j = 1; i < profile.size(); i++, j++) {
                if (j == n) {
                    System.out.println(profile.get(i).getFirstname() + " " + profile.get(i).getLastname() + "is successfully removed");
                    profile.remove(profile.get(i));
                }
            }
        } else {
            System.out.println("No Contacts");
        }
    }


    public void search(String sea, ArrayList<Person> profile) {
        int count = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        int i = 0;
        for (Person oj : profile) {
            if (oj.getFirstname().equals(sea)) {
                ar.add(i);
                count++;
            }
            i++;
        }
        if (count == 0)
            System.out.println("No match found!");
        else
            System.out.println(count + " match found!");
        for (Integer index : ar) {
            Implementation object = new Implementation();
            object.viewDetails(profile.get(index));

        }
    }
}