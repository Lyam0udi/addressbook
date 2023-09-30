package addressBookClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber, email);
                    addressBook.addContact(newContact);
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    // Logic to edit an existing contact
                    break;
                case 3:
                    // Logic to delete a contact
                    break;
                case 4:
                    // Logic to display all contacts
                    ArrayList<Contact> contacts = addressBook.getAllContacts();
                    for (int i = 0; i < contacts.size(); i++) {
                        Contact contact = contacts.get(i);
                        System.out.println("Contact " + (i + 1) + ":");
                        System.out.println("Name: " + contact.getName());
                        System.out.println("Phone: " + contact.getPhoneNumber());
                        System.out.println("Email: " + contact.getEmail());
                        System.out.println("-------------------------");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the Address Book. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}
