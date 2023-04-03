package com.mycompany.laboratorium3;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TableColumn col_firstname; 
    @FXML private TableColumn col_lastname; 
    @FXML private TableView table;
    @FXML private TextField setImie;
    @FXML private TextField setNazwisko;
    
    @FXML 
    public void initialize(){
    col_firstname.setCellValueFactory(
            new PropertyValueFactory<>("imie"));
    col_lastname.setCellValueFactory(
            new PropertyValueFactory<>("nazwisko"));
    
    TableViewSelectionModel<Osoba> selectionModel = table.getSelectionModel();
    selectionModel.setSelectionMode(SelectionMode.SINGLE);
    ObservableList<Osoba> selectedItems = selectionModel.getSelectedItems();
    
    selectedItems.addListener(
            new ListChangeListener<Osoba>(){
                @Override
                public void onChanged(Change<? extends Osoba> change){
                    Osoba os = change.getList().get(0);
                    os.getImie();
                    os.getNazwisko();
                }
            });
    }

    
    
    @FXML
    public void addNewPerson(){
        Osoba osoba = new Osoba(setImie.getText(),setNazwisko.getText());
        table.getItems().add(osoba);
    }
       
    
    
}
