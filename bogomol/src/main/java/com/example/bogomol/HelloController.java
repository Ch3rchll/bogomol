package com.example.bogomol;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    void B1(ActionEvent event) {
l1.setText("это первый текст");
    }

    @FXML
    void B2(ActionEvent event) {
        l2.setText("это второй текст");
    }

    @FXML
    void initialize() {
        assert b1 != null : "fx:id=\"b1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert b2 != null : "fx:id=\"b2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert l1 != null : "fx:id=\"l1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert l2 != null : "fx:id=\"l2\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
