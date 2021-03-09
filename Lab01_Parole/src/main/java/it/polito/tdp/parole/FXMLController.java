package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;
    
    @FXML
    private TextArea txtTime;
    
    private Parole parole= new Parole();
    
    @FXML
    void doInsert(ActionEvent event) {
    	String parola=this.txtParola.getText();
    	parole.addParola(parola);
    	txtResult.setText(parole.getElenco().toString());
    	txtTime.setText(String.valueOf(System.nanoTime()));
    }

    @FXML
    void doReset(ActionEvent event) {
    	parole.reset();
    	txtResult.setText(""); 
    	txtTime.setText(String.valueOf(System.nanoTime()));
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	String cancella=txtResult.getSelectedText();
    	parole.remove(cancella);
    	txtResult.setText(parole.getElenco().toString());
    	txtTime.setText(String.valueOf(System.nanoTime()));
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'Scene.fxml'.";
        elenco = new Parole() ;
    }
}
