package com.example.demo.PracticeActivities;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
    @Override
    public void start(Stage primaryStage){
//        Rectangle rec = new Rectangle();
//        rec.setX(200);
//        rec.setY(60);
//        rec.setHeight(200);
//        rec.setWidth(200);
//        rec.setFill(Color.LAWNGREEN);

        Ellipse el = new Ellipse();
        el.setCenterX(300);
        el.setCenterY(150);
        el.setRadiusX(250);
        el.setRadiusY(130);
        el.setStroke(Color.YELLOW);
        el.setStrokeWidth(3);
        el.setFill(Color.RED);

        Line l = new Line();
        l.setStartX(100);
        l.setEndX(493);
        l.setStartY(335);
        l.setEndY(335);
        l.setStrokeWidth(2);
        l.setStroke(Color.GREEN);

        Text text = new Text();
        text.setText("This is my ellipse");
        text.setX(105);
        text.setY(325);
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC, 40));
        text.setFill(Color.DARKBLUE);

        Group root = new Group(el, text, l);
        Scene scene = new Scene(root ,600, 350, Color.AQUA);
        primaryStage.setTitle("Draw an Ellipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}