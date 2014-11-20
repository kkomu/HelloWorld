/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.TextArea;

/**
 *
 * @author Ohjelmistokehitys
 */
public class UserInfo extends TextArea {
    private List<String> list = new ArrayList<>();
    
    public UserInfo() {
        this.setMaxSize(200, 200);
    }
    
    public void addToArray(String data) {
        list.add(data);
    }
    
    public void printInfo() {
        this.clear();
        for(String s: list) {
            this.appendText(s+"\n");
        }
    }
}
