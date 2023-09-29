package addressBookClasses;

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
	                // Logic to add a new contact
	                break;
	            case 2:
	                // Logic to edit an existing contact
	                break;
	            case 3:
	                // Logic to delete a contact
	                break;
	            case 4:
	                // Logic to display all contacts
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

