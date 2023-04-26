package com.example.demo.PracticeActivities;

import javafx.application.Application;
//import javafx.geometry.Insets;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
//import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class CoffeeCafe extends Application{
    public void start(Stage primaryStage){
        Text text = new Text("My Coffee Shop");
        text.setFont(Font.font("Serif", FontWeight.EXTRA_LIGHT, FontPosture.ITALIC, 30));

        Text text1 = new Text("Drink:");
        text1.setFont(Font.font("Verdana", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 20));

        Text text2 = new Text(" Milk option:");
        text2.setFont(Font.font("Verdana", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 20));

        Text text3 = new Text(" Add:");
        text3.setFont(Font.font("Verdana", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 20));

        ComboBox<String> cbo = new ComboBox<>();
        cbo.getItems().addAll("Latte", "Americano", "Cappuccino", "Black tea", "Green tea");
        cbo.setValue("Latte");
        cbo.setStyle("-fx-color: SILVER");
        cbo.setScaleX(1.6);
        cbo.setScaleY(1.6);

        Button place_order = new Button("Place Order");
        place_order.setScaleX(1.6);
        place_order.setScaleY(1.6);
        place_order.setStyle("-fx-background-color: SILVER");
        place_order.setTextFill(Color.DARKMAGENTA);

        RadioButton whole_milk = new RadioButton("Whole\n  milk");
        whole_milk.setScaleX(2);
        whole_milk.setScaleY(2);
        whole_milk.setFont(Font.font("Verdana", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 8));
        RadioButton almond_milk = new RadioButton("Almond\n  milk");
        almond_milk.setScaleX(2);
        almond_milk.setScaleY(2);
        almond_milk.setFont(Font.font("Verdana", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 8));
        RadioButton no_milk = new RadioButton("No milk");
        no_milk.setScaleX(2);
        no_milk.setScaleY(2);
        no_milk.setFont(Font.font("Verdana", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 8));

        ToggleGroup milk = new ToggleGroup();
        whole_milk.setToggleGroup(milk);
        almond_milk.setToggleGroup(milk);
        no_milk.setToggleGroup(milk);

        CheckBox sugar = new CheckBox("Sugar     ");
        sugar.setContentDisplay(ContentDisplay.LEFT);
        sugar.setScaleX(1.2);
        sugar.setScaleY(1.2);
        CheckBox extra_hot = new CheckBox("Extra Hot");
        extra_hot.setContentDisplay(ContentDisplay.LEFT);
        extra_hot.setScaleX(1.2);
        extra_hot.setScaleY(1.2);
        CheckBox extra_milk = new CheckBox("Extra Milk");
        extra_milk.setContentDisplay(ContentDisplay.LEFT);
        extra_milk.setScaleX(1.2);
        extra_milk.setScaleY(1.2);

        TextField textField = new TextField();
        TextField textField1 = new TextField();
        TextArea textField2 = new TextArea();
        textField2.setPrefWidth(150);
        textField2.setMinHeight(0);
        textField2.setMaxHeight(26);

        HBox hBox2 = new HBox(textField, textField1, textField2);
        hBox2.setPadding(new Insets(10, 0, 0, 0));
        hBox2.setSpacing(20);
        hBox2.setAlignment(Pos.CENTER_LEFT);

        place_order.setOnMousePressed(e -> {
            if (whole_milk.isSelected() && sugar.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("Whole Milk");
                textField2.setText("Sugar");
            }else if (whole_milk.isSelected() && extra_hot.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("Whole Milk");
                textField2.setText("Extra Hot");
            }else if (whole_milk.isSelected() && extra_milk.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("Whole Milk");
                textField2.setText("Extra Milk");
            }
            if (whole_milk.isSelected() && sugar.isSelected() && extra_hot.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("Whole Milk");
                textField2.setText("Sugar, Extra hot");
            }
            if (whole_milk.isSelected() && sugar.isSelected() && extra_milk.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("Whole Milk");
                textField2.setText("Sugar, Extra Milk");
            }
            if (whole_milk.isSelected() && extra_hot.isSelected() && extra_milk.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("Whole Milk");
                textField2.setText("Extra Hot, Extra Milk");
            }
            if (whole_milk.isSelected() && sugar.isSelected() && extra_hot.isSelected() && extra_milk.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(35);
                textField1.setText("Whole Milk");
                textField2.setText("Sugar, Extra Hot, Extra Milk");
            }
            if (whole_milk.isSelected() && !sugar.isSelected() && !extra_hot.isSelected() && !extra_milk.isSelected()) {
                textField1.setText("Whole Milk");
                textField2.setText("Nothing");
            }

            if (almond_milk.isSelected() && sugar.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("Almond Milk");
                textField2.setText("Sugar");
            }else if (almond_milk.isSelected() && extra_hot.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("Almond Milk");
                textField2.setText("Extra Hot");
            }else if (almond_milk.isSelected() && extra_milk.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("Almond Milk");
                textField2.setText("Extra Milk");
            }
            if (almond_milk.isSelected() && sugar.isSelected() && extra_hot.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("Almond Milk");
                textField2.setText("Sugar, Extra hot");
            }
            if (almond_milk.isSelected() && sugar.isSelected() && extra_milk.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("Almond Milk");
                textField2.setText("Sugar, Extra Milk");
            }
            if (almond_milk.isSelected() && extra_hot.isSelected() && extra_milk.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("Almond Milk");
                textField2.setText("Extra Hot, Extra Milk");
            }
            if (almond_milk.isSelected() && sugar.isSelected() && extra_hot.isSelected() && extra_milk.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(35);
                textField1.setText("Almond Milk");
                textField2.setText("Sugar, Extra Hot, Extra Milk");
            }
            if (almond_milk.isSelected() && !sugar.isSelected() && !extra_hot.isSelected() && !extra_milk.isSelected()) {
                textField1.setText("Almond Milk");
                textField2.setText("Nothing");
            }

            if (no_milk.isSelected() && sugar.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("No Milk");
                textField2.setText("Sugar");
            }else if (no_milk.isSelected() && extra_hot.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("No Milk");
                textField2.setText("Extra Hot");
            }
            if (no_milk.isSelected() && sugar.isSelected() && extra_hot.isSelected()) {
                textField2.setMinHeight(0);
                textField2.setMaxHeight(26);
                textField1.setText("No Milk");
                textField2.setText("Sugar, Extra hot");
            }
            if (no_milk.isSelected() && !sugar.isSelected() && !extra_hot.isSelected() && !extra_milk.isSelected()) {
                textField1.setText("No Milk");
                textField2.setText("Nothing");
            }
        });

        place_order.setOnAction(e -> {
            textField.setText(String.valueOf(cbo.getValue()));
        });

        VBox vBox5 = new VBox(place_order);
        vBox5.setPadding(new Insets(-30, 0, 0, 0));
        vBox5.setAlignment(Pos.CENTER);

        VBox vBox4 = new VBox(sugar, extra_hot, extra_milk);
        vBox4.setPadding(new Insets(-20, 10, 0, 220));
        vBox4.setSpacing(33);
        vBox4.setAlignment(Pos.CENTER_RIGHT);

        VBox vBox3 = new VBox(text3);
        vBox3.setPadding(new Insets(0, 10, 0, 220));
        vBox3.setSpacing(1);
        vBox3.setAlignment(Pos.CENTER_RIGHT);

        HBox hBox = new HBox(text2, vBox3);
        hBox.setPadding(new Insets(20, 2, 0, -10));
        hBox.setSpacing(1);
        hBox.setAlignment(Pos.CENTER_LEFT);

        VBox vBox1 = new VBox(whole_milk, almond_milk, no_milk);
        vBox1.setPadding(new Insets(10, 40, 20, 0));
        vBox1.setSpacing(35);
        vBox1.setAlignment(Pos.CENTER_LEFT);

        HBox hBox1 = new HBox(vBox1, vBox4);
        hBox1.setPadding(new Insets(10, 20, 20, 0));
        hBox1.setSpacing(1);
        hBox1.setAlignment(Pos.CENTER_RIGHT);

        VBox vBox = new VBox(text, text1, cbo, hBox, hBox1, vBox5, hBox2);
        vBox.setPadding(new Insets(30));
        vBox.setSpacing(20);
        vBox.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(vBox, 500, 550, Color.RED);
        vBox.setStyle("-fx-background-color: DARKCYAN");
        primaryStage.setTitle("Coffee Shop");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}