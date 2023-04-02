module com.mycompany.classes {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.classes to javafx.fxml;
    exports com.mycompany.classes;
}
