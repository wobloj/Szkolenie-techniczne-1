package pl.edu.wsiz.lab1_0;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SecondaryController {

    @FXML private Label character_count;
    @FXML private Label word_count;
    @FXML private TextArea text_area;
    
    @FXML
    private void countText(){
        String text = text_area.getText();
        
        
        //Sprawdza czy jest pusty
        if(text.isEmpty()){
            return;
        }
        
        //Liczy słowa
        String [] words = text.split("\\s+");
        word_count.setText(Integer.toString(words.length));

        
        
        //Liczy znaki
        long characters = text.chars().filter(ch -> ch != ' ').count();
        character_count.setText(Long.toString(characters));

    }
    
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}