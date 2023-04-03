module com.mycompany.laboratorium3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.laboratorium3 to javafx.fxml;
    exports com.mycompany.laboratorium3;
}
