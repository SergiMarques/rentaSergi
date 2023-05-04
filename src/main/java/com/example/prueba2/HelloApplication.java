package com.example.prueba2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Inicio.fxml"));
        //Parent root = loader.load();
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Inicio de Sesión");
        stage.setScene(scene);
        //Cargar_Pantalla controller = loader.getController();
        //controller.setStage(stage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}