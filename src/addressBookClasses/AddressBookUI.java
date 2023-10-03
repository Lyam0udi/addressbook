package addressBookClasses;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;



public class AddressBookUI {
    private AddressBook addressBook;
    private ContactListView contactListView;

    public AddressBookUI(AddressBook addressBook) {
        this.addressBook = addressBook;
        contactListView = new ContactListView(addressBook);
    }

    public Parent getView() {
        VBox layout = new VBox();
        layout.getChildren().addAll(contactListView.getView());
        return layout;
    }

    public void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}