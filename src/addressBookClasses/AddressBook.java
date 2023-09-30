package addressBookClasses;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void editContact(int index, Contact newContact) {
        contacts.set(index, newContact);
    }

    public void deleteContact(int index) {
        contacts.remove(index);
    }

    public ArrayList<Contact> getAllContacts() {
        return contacts;
    }
}
