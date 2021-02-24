package com.andre.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DemoMainController {
    /**
     * @author Andre Rivaldo Prasetyo
     */

    @FXML
    private TextField txtInput;
    @FXML
    private Label lblOutput;

    @FXML
    private void SendQueryAction(ActionEvent actionEvent) {
        if (!txtInput.getText().trim().isEmpty()){
            lblOutput.setText(txtInput.getText().trim());
        } else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please Fill Input");
            alert.showAndWait();
        }
    }
}
