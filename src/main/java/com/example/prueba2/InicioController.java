package com.example.prueba2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioController {

private Stage stage;
@FXML
private TextField txtCorreo;

@FXML
void Regis(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Registro.fxml"));
    Parent root = loader.load();
    RegistroController controller = loader.getController();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setScene(scene);
    controller.init(txtCorreo.getText(), stage, this);
    stage.show();
    this.stage.close();
}

    public void setStage (Stage primaryStage){
        stage = primaryStage;
    }

    public void show () {
        stage.show();
    }
}
