
public class Main {
    public static void main(String[] args) {
        Person hazem = new Person("haezm", "ahmed");
        buizz_contact buizzContact2 = new buizz_contact("haezm", "ahmed","1000");


        Collection myCollec = new Collection();

        myCollec.addContacts(hazem);
        myCollec.addContacts(buizzContact2);

        myCollec.displayContacts();




    }}
