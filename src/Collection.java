import java.util.ArrayList;
import java.util.List;

public class Collection {
    private List<Person> contactsList;

    public Collection(){
        contactsList = new ArrayList<>();
    }
    public void addContacts (Person contact){
        contactsList.add(contact);
    }
    public void displayContacts(){
        for (Person contact : contactsList) {
            contact.display();
        }
    }
}