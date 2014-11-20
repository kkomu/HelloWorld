/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
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
        //VBox.setMargin(root, new Insets(10,10,10,10));
        // Add layouts to the root node layout
        
        // Layout for all labels, textfields and textarea
        HBox fields = new HBox();
        
        // Userinfo contains textArea
        UserInfo user = new UserInfo();
        
        TextFieldsPartial textFields = new TextFieldsPartial();
        
        fields.getChildren().add(textFields);
        fields.getChildren().add(user);
        
        root.getChildren().add(fields);
        root.getChildren().add(new ButtonPartial(user,textFields));
                
        Scene scene = new Scene(root, 400, 400);
        
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
