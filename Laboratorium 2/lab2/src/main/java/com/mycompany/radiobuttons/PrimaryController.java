package com.mycompany.radiobuttons;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class PrimaryController {

    @FXML private Label text;    
    @FXML private RadioButton textTo1;    
    @FXML private RadioButton textTo2;
    @FXML private RadioButton textTo3;
    @FXML private ImageView img;

    //Set Color
    
    @FXML
    private void switchToRed(){
        text.setTextFill(Color.RED);
    }
    @FXML
    private void switchToBlue(){
        text.setTextFill(Color.BLUE);
    }
    @FXML
    private void switchToGreen(){
        text.setTextFill(Color.GREEN);
    }
    
    //Set Text
    
    @FXML
    private void textSet(){
        if(textTo1.isSelected()){
            text.setText("= 1");
        }
        if(textTo2.isSelected()){
            text.setText("= 2");
        }
        if(textTo3.isSelected()){
            text.setText("= 3");
        }
    }
    
    //Set Image
    
    @FXML
    private void setFirstImage(){
        img.setImage(new Image(getClass().getResourceAsStream("calendar.png")));
    }
    @FXML
    private void setSecondImage(){
        img.setImage(new Image(getClass().getResourceAsStream("clock.png")));
    }
    @FXML
    private void setThirdImage(){
        img.setImage(new Image(getClass().getResourceAsStream("tree.png")));
    }
    
    
    
    @FXML
    private void exitApp(){
        Platform.exit();
    }
}
