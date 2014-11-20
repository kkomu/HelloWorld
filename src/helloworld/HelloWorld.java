/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ohjelmistokehitys
 */
public class HelloWorld extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        /*
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        */
        // The root is the main layout
        VBox root = new VBox();
        
        Button closeButton = new Button("Close");
        
        Button saveButton = new Button("Save");
        saveButton.setStyle("-fx-color:green");
        
        // Layout for button components
        HBox buttonLayout = new HBox();
        buttonLayout.setStyle("-fx-padding:10;-fx-spacing:10");
        buttonLayout.getChildren().add(closeButton);
        buttonLayout.getChildren().add(saveButton);
        
        // Add layouts to the root node layout
        root.getChildren().add(new TextFieldsPartial());
        root.getChildren().add(buttonLayout);
                
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Idea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
