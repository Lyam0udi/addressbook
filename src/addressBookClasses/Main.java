package addressBookClasses;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class Main extends Application {
    private AddressBook addressBook;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        addressBook = new AddressBook();
        AddressBookUI addressBookUI = new AddressBookUI(addressBook);

        BorderPane root = new BorderPane();
        root.setCenter(addressBookUI.getView());

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Address Book");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}