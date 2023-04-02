module com.mycompany.radiobuttons {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.radiobuttons to javafx.fxml;
    exports com.mycompany.radiobuttons;
}
