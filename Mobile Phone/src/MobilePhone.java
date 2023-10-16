import java.util.ArrayList;
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position >= 0) {
            myContacts.set(position, newContact);
            return true;
        }
        return false;
    }
    public boolean removeContact(Contact contact) {
        if (findContact(contact) >= 0) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }
    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }
    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName))
                return i;
        }
        return -1;
    }
    public Contact queryContact(String contact){
        int position = findContact(contact);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }
    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " +
                    myContacts.get(i).getName() +
                    " -> " +
                    myContacts.get(i).getPhoneNumber());
        }
    }
}
