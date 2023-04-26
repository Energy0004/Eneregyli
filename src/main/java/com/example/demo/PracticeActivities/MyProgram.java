package com.example.demo.PracticeActivities;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MyProgram extends Application {

    @Override
    public void start(Stage primaryStage){
        TextArea textArea = new TextArea();

        Circle circle = new Circle();
        circle.setCenterX(150);
        circle.setCenterY(150);
        circle.setRadius(50);
        circle.setFill(Color.CORAL);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.TAN);

        Ellipse ellipse = new Ellipse();
        ellipse.setRadiusX(80);
        ellipse.setRadiusY(45);
        ellipse.setFill(Color.BLUEVIOLET);

        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(2000));
        fadeTransition.setNode(ellipse);
        fadeTransition.setFromValue(0.1);
        fadeTransition.setToValue(1.0);
        fadeTransition.setAutoReverse(true);


        TextField textField = new TextField();
        textField.setLayoutX(50);
        textField.setLayoutY(100);

        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setNode(rectangle);
        rotateTransition.setAxis(Rotate.Y_AXIS);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(50);
        rotateTransition.setAutoReverse(false);

        HBox hBox = new HBox(circle, rectangle, textField, ellipse);
        hBox.setSpacing(20);
        hBox.setPadding(new Insets(20));

        VBox vBox = new VBox(hBox, textArea);
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20));
        vBox.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
        EventHandler<MouseEvent> mouseHandler = MouseEvent ->{
            fadeTransition.play();
            textArea.appendText("Mouse event handler has been called for ellipse. Location=("+MouseEvent.getX()+", "+MouseEvent.getY()+")\n");
        };

        EventHandler<KeyEvent> keyTyped = keyEvent ->  {
            rotateTransition.play();
            textArea.appendText("Key event handler has been called\n");
        };
        textField.setOnKeyTyped(keyTyped);

        Scene scene = new Scene(vBox, 650, 400);
        primaryStage.setTitle("Coral Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
        ellipse.setOnMousePressed(mouseHandler);
        circle.setOnMousePressed(Click -> textArea.appendText("Mouse event handler has been called for circle. Location=("+Click.getX() + ", " + Click.getY()+")\n"));
    }
}