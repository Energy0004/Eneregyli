package com.example.demo.PracticeActivities;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.ListIterator;


public class PA10A extends Application {
    public void start(Stage primaryStage){
        Circle circle = new Circle();
        circle.setRadius(100);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(1);
        circle.setFill(Color.BLUEVIOLET);

        Label label = new Label("BLUEVIOLET");
        label.setFont(Font.font("Serif", FontWeight.BOLD, FontPosture.REGULAR, 12));

        Button button1 = new Button("next");
        button1.setPrefWidth(39.2);
        button1.setPrefHeight(25.6);

        Button button2 = new Button("prev");
        button2.setPrefWidth(40);
        button2.setPrefHeight(25.6);

        HBox hBox = new HBox(label, button1, button2);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(15);

        VBox vBox = new VBox(circle, hBox);
        vBox.setPadding(new Insets(33));
        vBox.setSpacing(20);
        vBox.setAlignment(Pos.CENTER);

        ArrayList<Color> arr = new ArrayList<>();
        ArrayList<String> ar = new ArrayList<>();
        arr.add(Color.BLUEVIOLET);arr.add(Color.RED);arr.add(Color.GREEN);arr.add(Color.AQUA);arr.add(Color.GOLD);
        arr.add(Color.AZURE);arr.add(Color.SILVER);arr.add(Color.BLUE);arr.add(Color.DARKKHAKI);arr.add(Color.MAGENTA);
        ar.add("BLUEVIOLET");ar.add("RED");ar.add("GREEN");ar.add("AQUA");ar.add("GOLD");
        ar.add("AZURE");ar.add("SILVER");ar.add("BLUE");ar.add("DARKKHAKI");ar.add("MAGENTA");

        ListIterator<Color> colIt = arr.listIterator();
        ListIterator<String> nameIt = ar.listIterator();
        circle.setFill(arr.get(0));
        label.setText(ar.get(0));

        button1.setOnAction(e -> {
            if(colIt.hasNext() && nameIt.hasNext()){
                circle.setFill(colIt.next());
                label.setText(nameIt.next());
            }
        });
        button2.setOnAction(e -> {
            if(colIt.hasPrevious() && nameIt.hasPrevious()){
                circle.setFill(colIt.previous());
                label.setText(nameIt.previous());
            }
        });

        Scene scene = new Scene(vBox, 315, 321);
        primaryStage.setTitle("CicrleColors");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}