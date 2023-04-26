package com.example.demo.PracticeActivities;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CoffeeCafe2 extends Application {
    private BorderPane pane;
    private ListView<String> listView;
    private VBox vBox;
    private ImageView imageView;
    private TextArea textArea;
    private ComboBox<String> cbo;
    private HBox hBox;
    private Stage primaryStage;
    private Button button, place_order;
    private String[] arr = {"Sugar", "Extra Milk", "Straw", "Napkins"};
    private int choice;
    private ImageView[] imageViews = {
            new ImageView("C:\\Users\\Админ\\IdeaProjects\\JAVAFX\\demo1\\src\\main\\java\\com\\example\\demo\\images\\Sugar.png"),
            new ImageView("C:\\Users\\Админ\\IdeaProjects\\JAVAFX\\demo1\\src\\main\\java\\com\\example\\demo\\images\\ExtraMilk.png"),
            new ImageView("C:\\Users\\Админ\\IdeaProjects\\JAVAFX\\demo1\\src\\main\\java\\com\\example\\demo\\images\\Straw.png"),
            new ImageView("C:\\Users\\Админ\\IdeaProjects\\JAVAFX\\demo1\\src\\main\\java\\com\\example\\demo\\images\\Napkins.png")
    };
    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        cbo = new ComboBox<>();
        cbo.getItems().addAll("Latte", "Americano", "Cappuccino", "Black tea", "Green tea");
        cbo.setValue("Choose your drink");
        cbo.setScaleX(1.6);
        cbo.setScaleY(1.6);

        vBox = new VBox(cbo);
        vBox.setSpacing(0);
        vBox.setAlignment(Pos.CENTER);
        vBox.setStyle("-fx-background-color: aqua");

        cbo.setOnAction(ee -> {
                if (String.valueOf(cbo.getValue()).equals("Latte")) {
                    choice = 700;
                    pusk();
                    imageView.setImage(null);
                    System.gc();
                    textArea.clear();
                    textArea.setText("A latte or caffe latte is a\nmilk coffee that is a made\nup of one or two shots of\nespresso, steamed milk\nand a final, thin layer of\nfrothed milk on top.");
                    imageView.setImage(new Image("C:\\Users\\Админ\\IdeaProjects\\JAVAFX\\demo1\\src\\main\\java\\com\\example\\demo\\images\\Latte.png"));
                    buttonPressed();
                } else if (String.valueOf(cbo.getValue()).equals("Americano")) {
                    choice = 500;
                    pusk();
                    imageView.setImage(null);
                    System.gc();
                    textArea.clear();
                    textArea.setText("An americano is just water\nand espresso. It’ll either be\nserved 1/2 and 1/2 or 1/3\nespresso to 2/3 water,\ndepending on the coffee\nshop in question or how\nyou’ve chosen to brew it.");
                    imageView.setImage(new Image("C:\\Users\\Админ\\IdeaProjects\\JAVAFX\\demo1\\src\\main\\java\\com\\example\\demo\\images\\Americano.png"));
                    buttonPressed();
                } else if (String.valueOf(cbo.getValue()).equals("Cappuccino")) {
                    choice = 700;
                    pusk();
                    imageView.setImage(null);
                    System.gc();
                    textArea.clear();
                    textArea.setText("A cappuccino is the perfect\nbalance of espresso, steamed\nmilk and foam. This coffee\nis all about the structure and\nthe even splitting of all\nelements into equal thirds.");
                    imageView.setImage(new Image("C:\\Users\\Админ\\IdeaProjects\\JAVAFX\\demo1\\src\\main\\java\\com\\example\\demo\\images\\Cappuccino.png"));
                    buttonPressed();
                } else if (String.valueOf(cbo.getValue()).equals("Black tea")) {
                    choice = 300;
                    pusk();
                    imageView.setImage(null);
                    System.gc();
                    textArea.clear();
                    textArea.setText("Black tea is a type of tea\nproduced from the camellia\nsinensis plant that is highly\noxidized, resulting in a dark\nreddish-gold hue, a hearty,\nslightly astringent flavor, and\na moderate amount of\ncaffeine.");
                    imageView.setImage(new Image("C:\\Users\\Админ\\IdeaProjects\\JAVAFX\\demo1\\src\\main\\java\\com\\example\\demo\\images\\BlackTea.png"));
                    buttonPressed();
                } else if (String.valueOf(cbo.getValue()).equals("Green tea")) {
                    choice = 350;
                    pusk();
                    imageView.setImage(null);
                    System.gc();
                    textArea.clear();
                    textArea.setText("A brewed green tea is\ntypically green, yellow or light\nbrown in color, and its flavor\nprofile can range from\ngrass-like and toasted to\nvegetal, sweet and\nseaweed-like.");
                    textArea.setFont(Font.font(18));
                    imageView.setImage(new Image("C:\\Users\\Админ\\IdeaProjects\\JAVAFX\\demo1\\src\\main\\java\\com\\example\\demo\\images\\GreenTea.png"));
                    buttonPressed();
                }
        });

        Scene scene = new Scene(vBox,700, 550);
        vBox.setStyle("-fx-background-color: DARKKHAKI");
        primaryStage.setTitle("CoffeeCafe2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void pusk(){
        imageView = new ImageView(new Image("C:\\Users\\Админ\\IdeaProjects\\JAVAFX\\demo1\\src\\main\\java\\com\\example\\demo\\images\\Latte.png"));
        imageView.setFitWidth(310);
        imageView.setFitHeight(300);
        Label lb = new Label("", imageView);
        lb.setContentDisplay(ContentDisplay.BOTTOM);
        lb.setStyle("-fx-border-color: black; -fx-border-width: 0.2; -fx-background-color: white");

        textArea = new TextArea("A latte or caffe latte is a\nmilk coffee that is a made\nup of one or two shots of\nespresso, steamed milk\nand a final, thin layer of\nfrothed milk on top.");
        textArea.setFont(Font.font("Verdana", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 19));
        textArea.setMaxSize(310, 320);
        textArea.setEditable(false);
        textArea.setMouseTransparent(true);

        button = new Button("Next");
        button.setTranslateY(375);
        button.setScaleX(1.6);
        button.setScaleY(1.6);

        hBox = new HBox(lb, textArea);
        hBox.setPadding(new Insets(0, 0, -350, 0));
        hBox.setSpacing(50);
        hBox.setAlignment(Pos.BOTTOM_CENTER);

        vBox = new VBox(cbo, hBox, button);
        vBox.setPadding(new Insets(-300, 0, 0, 0));
        vBox.setSpacing(0);
        vBox.setAlignment(Pos.CENTER);
        vBox.setStyle("-fx-background-color: aqua");

        Scene scene = new Scene(vBox,700, 550);
        vBox.setStyle("-fx-background-color: DARKKHAKI");
        primaryStage.setTitle("CoffeeCafe2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void buttonPressed(){
        button.setOnAction(e -> {
            listView = new ListView<>(FXCollections.observableArrayList(arr));
            listView.setPrefSize(200, 95);
            listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            listView.setTranslateX(0);
            listView.setTranslateY(200);

            place_order = new Button("Place Order");
            place_order.setTranslateX(410);
            place_order.setTranslateY(-20);

            imageViews[0].setFitWidth(245);
            imageViews[0].setFitHeight(245);
            imageViews[1].setFitWidth(245);
            imageViews[1].setFitHeight(245);
            imageViews[2].setFitWidth(245);
            imageViews[2].setFitHeight(245);
            imageViews[3].setFitWidth(245);
            imageViews[3].setFitHeight(245);

            FlowPane imagePane = new FlowPane(5, 5);
            pane = new BorderPane();
            pane.setLeft(new ScrollPane(listView));
            pane.setCenter(imagePane);
            pane.setBottom(place_order);
            order();
            listView.getSelectionModel().selectedItemProperty().addListener(
                    ov -> {
                        imagePane.getChildren().clear();
                        for (Integer i : listView.getSelectionModel().getSelectedIndices()) {
                            imagePane.getChildren().add(imageViews[i]);
                        }
                    });
            Scene scene = new Scene(pane,700, 550);
            pane.setStyle("-fx-background-color: DARKKHAKI");
            primaryStage.setTitle("CoffeeCafe2");
            primaryStage.setScene(scene);
            primaryStage.show();
        });
    }
    public void order(){
        place_order.setOnAction(e -> {
            Text text = new Text(String.valueOf("Amount due: KZT "+choice));
            Text text1 = new Text("Thank you for your order!");
            text.setFill(Color.WHITE);
            text1.setFill(Color.WHITE);
            text1.setFont(Font.font("Serif", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 50));
            text.setFont(Font.font("Verdana", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 40));
            VBox vBox1 = new VBox(text1, text);
            vBox1.setSpacing(30);
            vBox1.setAlignment(Pos.CENTER);

            Scene scene = new Scene(vBox1,700, 550);
            vBox1.setStyle("-fx-background-color: DARKKHAKI");
            primaryStage.setTitle("CoffeeCafe2");
            primaryStage.setScene(scene);
            primaryStage.show();
        });
    }
}