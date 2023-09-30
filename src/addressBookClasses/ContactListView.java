package addressBookClasses;


import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

public class ContactListView {
    private AddressBook addressBook;

    public ContactListView(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public Parent getView() {
        VBox layout = new VBox();
        ListView<String> contactList = new ListView<>();
        updateContactList(contactList);
        layout.getChildren().addAll(contactList);
        return layout;
    }

    private void updateContactList(ListView<String> contactList) {
        contactList.getItems().clear();
        for (Contact contact : addressBook.getAllContacts()) {
            contactList.getItems().add(contact.getName());
        }
    }
}