package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;

public class EnviarMensagem {

    @FXML
    private Button btnSalvar;
    
    @FXML
    void Alert(ActionEvent event) {
    	 Alert alert = new Alert(Alert.AlertType.ERROR);
    	alert.setTitle("ERRO");
    	alert.show();
    }

  




}