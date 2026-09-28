package com.mayawatt_spotifymini;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SpotifyMiniApp extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Label titulo = new Label("Spotifi Mini");

        Label lblArtista = new Label("Nombre del artista: ");

        TextField txtNombreArtista = new TextField();
        txtNombreArtista.setPromptText("Ingrese el nombre del Artista");

        Button btnAceptar = new Button();
        btnAceptar.setText("Ingresar Artista");

        GridPane formularia = new GridPane();
        formularia.setHgap(10);
        formularia.setVgap(10);

        formularia.add(lblArtista, 1, 0);
        formularia.add(txtNombreArtista, 2, 0);
        formularia.add(btnAceptar, 0, 0);

        VBox vbox1 = new VBox(10);
        vbox1.getChildren().addAll(new Label("Column 1"), new Button("Button A"));

        VBox vbox2 = new VBox(
            5, // Padding
            titulo, // Texto
            lblArtista, // Texto
            txtNombreArtista, // Caja de texto
            btnAceptar // Boton
        );

        VBox root = new VBox(5);
        root.getChildren().addAll(vbox1, vbox2);

        VBox.setVgrow(vbox1, Priority.ALWAYS);
        VBox.setVgrow(vbox2, Priority.ALWAYS);

        Scene scene = new Scene(root, 720,480);

        stage.setTitle("Spotify Mini");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
