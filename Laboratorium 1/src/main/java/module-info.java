module pl.edu.wsiz.lab1_0 {
    requires javafx.controls;
    requires javafx.fxml;

    opens pl.edu.wsiz.lab1_0 to javafx.fxml;
    exports pl.edu.wsiz.lab1_0;
}
