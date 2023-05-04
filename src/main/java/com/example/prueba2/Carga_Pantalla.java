package com.example.prueba2;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Carga_Pantalla implements Initializable {

@FXML
private TextField txtCorreo;
@FXML
private TextField txtContraseña;
//https://www.youtube.com/watch?v=I04VACXbYbA

@FXML
    private void Regis(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Registro.fxml"));

        // Cargo la ventana
        Parent root = loader.load();

        // Cojo el controlador
        Carga_Pantalla controlador = loader.getController();

        // Creo el Scene
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    } catch (IOException ex) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(ex.getMessage());
        alert.showAndWait();
    }
}
@FXML
    private void Menu (ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));

            // Cargo la ventana
            Parent root = loader.load();

            // Cojo el controlador
            Carga_Pantalla controller = loader.getController();

            // Creo el Scene
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        }catch (IOException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }
}
    @FXML
    private void Salir (ActionEvent event){
        System.out.println("Gracias por pasarse por nuestra aplicación");
        System.exit(0);
    }

    @FXML
    private void Volver (ActionEvent event){

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Inicio.fxml"));

            // Cargo la ventana
            Parent root = loader.load();

            // Cojo el controlador
            Carga_Pantalla controlador = loader.getController();

            // Creo el Scene
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        } catch (IOException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }
    }
@FXML
private void Rentar(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Compra.fxml"));

        // Cargo la ventana
        Parent root = loader.load();

        // Cojo el controlador
        Carga_Pantalla controller = loader.getController();

        // Creo el Scene
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }catch (IOException ex) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(ex.getMessage());
        alert.showAndWait();
    }

}

@FXML
private void Pagar(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Felicidades.fxml"));

        // Cargo la ventana
        Parent root = loader.load();

        // Cojo el controlador
        Carga_Pantalla controller = loader.getController();

        // Creo el Scene
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }catch (IOException ex) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(ex.getMessage());
        alert.showAndWait();

}
}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}


