package pl.edu.wsiz.lab1_0;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML private TextField a;
    @FXML private TextField b;
    @FXML private Label res_add;
    @FXML private Label res_sub;
    @FXML private Label res_mul;
    @FXML private Label res_div;
    
    
    @FXML
    private void calculate(){
        try{
            int l_a = Integer.parseInt(a.getText());
            int l_b = Integer.parseInt(b.getText());

            int add = l_a + l_b;
            int sub = l_a - l_b;
            int mul = l_a * l_b;
            double div = l_a / l_b;

            res_add.setText(l_a + " + " + l_b + " = " + Integer.valueOf(add).toString());
            res_sub.setText(l_a + " - " + l_b + " = " + Integer.valueOf(sub).toString());
            res_mul.setText(l_a + " * " + l_b + " = " + Integer.valueOf(mul).toString());
            res_div.setText(l_a + " / " + l_b + " = " + Double.valueOf(div).toString());
        }catch(Exception e){
            res_add.setText("Wprowadź liczbe");
            res_sub.setText("Wprowadź liczbe");
            res_mul.setText("Wprowadź liczbe");
            res_div.setText("Wprowadź liczbe");
        }
    }
    
    @FXML
    private void switchToSecondary() throws IOException {
           App.setRoot("secondary");
    }
}

