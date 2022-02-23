package com.ntv.c2englishapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    private void add(){
        int a= 100;
        int b =200;
        int c =a+b;
    }
}