/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonPartial extends HBox implements EventHandler<ActionEvent> {
        private TextFieldsPartial textFields;
        private UserInfo user;
        
        private final Button closeButton = new Button("Close");
        private final Button saveButton = new Button("Save");
        private final Button printButton = new Button("Print");
        private final HBox buttonLayout = new HBox();
        
        public ButtonPartial(UserInfo user, TextFieldsPartial textFields) {
            saveButton.setStyle("-fx-color:green");
            printButton.setStyle("-fx-color:blue");
            this.setStyle("-fx-padding:10;-fx-spacing:10");
            this.getChildren().add(closeButton);
            this.getChildren().add(saveButton);
            this.getChildren().add(printButton);
            this.user = user;
            this.textFields = textFields;
            
            // When implementing interface in this class
            closeButton.setOnAction(this);
            saveButton.setOnAction(this);
            printButton.setOnAction(this);
            
            //Inline implementation for event handler interface
            /*
            closeButton.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    Platform.exit();
                }
            });*/
            
        }
    
    // When implementing interface in this class
    @Override
    public void handle(ActionEvent t) {
        if(t.getSource().equals(closeButton)) {
            Platform.exit();
        }
        else if (t.getSource().equals(saveButton)) {
            user.addToArray(textFields.getName());
            user.addToArray(textFields.getAddress());
            user.addToArray(textFields.getPhone());
        }
        else {
            user.printInfo();
        }
            
    }
}
