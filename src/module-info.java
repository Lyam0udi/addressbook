module addressbook {
	
    requires javafx.controls;
    requires javafx.fxml;
    opens addressBookClasses to javafx.fxml;
    exports addressBookClasses;
    
    
    
}
