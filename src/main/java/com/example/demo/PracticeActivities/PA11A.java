package com.example.demo.PracticeActivities;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.util.*;

public class PA11A extends Application {
    public void start(Stage primaryStage) {
        Text text1 = new Text("Keyword Count");
        text1.setFont(Font.font("TIMES NEW ROMAN", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text1.setLayoutX(197);
        text1.setLayoutY(114);

        Text text2 = new Text("Enter a keyword:");
        text2.setFont(Font.font("TIMES NEW ROMAN", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text2.setLayoutX(193);
        text2.setLayoutY(164);

        Text text3 = new Text("");
        text3.setFont(Font.font("TIMES NEW ROMAN", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text3.setLayoutX(241);
        text3.setLayoutY(266);

        Text text4 = new Text("");
        text4.setFont(Font.font("TIMES NEW ROMAN", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text4.setLayoutX(104);
        text4.setLayoutY(320);

        Text text5 = new Text("");
        text5.setFont(Font.font("TIMES NEW ROMAN", FontWeight.BOLD, FontPosture.REGULAR, 15));
        text5.setLayoutX(134);
        text5.setLayoutY(346);

        TextField textField = new TextField();
        textField.setPrefWidth(430);
        textField.setPrefHeight(26);
        textField.setLayoutX(32);
        textField.setLayoutY(200);

        FileChooser fch = new FileChooser();

        Button button = new Button("Search a key word from file:");
        button.setFont(Font.font("TIMES NEW ROMAN", FontWeight.LIGHT, FontPosture.REGULAR, 15));
        button.setLayoutX(32);
        button.setLayoutY(246);

        button.setOnAction(e -> {
            File file = fch.showOpenDialog(primaryStage);
            try {
                text3.setText(file.getName()+" file chosen");
                text4.setText("Number of keywords in file: "+file.getName()+" is: "+countKeywords(file));
                text5.setText("Number of the keyword: "+textField.getText()+" is: "+countKeywordsExact(file, textField.getText()));
            } catch (Exception ex) {System.err.println("Oops");}
        });

        AnchorPane anchorPane = new AnchorPane(text1, text2, text3, text4, text5, textField, button);
        anchorPane.prefWidth(495);
        anchorPane.prefHeight(400);

        Scene scene = new Scene(anchorPane,495, 400);
        primaryStage.setTitle("KeyWordCount");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static int countKeywords(File file) throws Exception {
        String[] keywordString = {"abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum",
                "extends", "for", "final", "finally", "float", "goto",
                "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null"};
        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String word = input.next();
            if (keywordSet.contains(word))
                count++;
        }
        return count;
    }
    public static int countKeywordsExact(File file, String s) throws Exception {
        int count = 0;
        Scanner input = new Scanner(file);
        while (input.hasNext()){
            if(input.next().equals(s))
                count++;
        }
        return count;
    }
}