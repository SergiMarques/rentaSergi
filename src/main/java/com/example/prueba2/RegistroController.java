package com.example.prueba2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RegistroController {
private InicioController controllerinicio;
private Stage stage;
@FXML
private Label txtCorreo;

@FXML
void Volver(ActionEvent event) {
controllerinicio.show();
stage.close();
}


    public void init(String text, Stage stage, InicioController inicioController) {
        txtCorreo.setText(text);
        this.controllerinicio = inicioController;
        this.stage = stage;
    }
}
