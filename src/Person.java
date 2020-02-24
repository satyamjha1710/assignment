import java.util.ArrayList;

public class Person {
    private ArrayList<String> contactnumber = new ArrayList<>();
    private String firstname;
    private String lastname;
    private String email;

    public ArrayList<String> getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber.add(contactnumber);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}