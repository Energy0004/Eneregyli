package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class MusicPlayer extends Application {
    private MenuBar menuBar;
    private Stage primaryStage;
    private HBox hBox;
    private VBox vBox1, vBox;
    private Label label = new Label("0:00/0:00");
    private Timer timer;
    private TimerTask task;
    private MediaPlayer mediaPlayer;
    private Media media;
    private ProgressBar songProgressBar = new ProgressBar(0);
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        FileChooser fch = new FileChooser();
        menuBar = new MenuBar();
        Menu menu = new Menu("File");
        MenuItem menuItem = new MenuItem("Open");

        menuItem.setOnAction(e -> {
            File file = fch.showOpenDialog(primaryStage);
            if (file != null){
                media = new Media(file.toURI().toString());
                if (mediaPlayer != null){
                    mediaPlayer.stop();
                }
                mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
                begin();
            }
        });
        menu.getItems().addAll(menuItem);
        menuBar.getMenus().addAll(menu);

        Button pButton = new Button("Pause");
        pButton.setScaleX(1.5);
        pButton.setScaleY(1.5);
        pButton.setOnAction(e -> {
            if (pButton.getText().equals("Play")) {
                begin();
                mediaPlayer.play();
                pButton.setText("Pause");
            } else {
                cancell();
                mediaPlayer.pause();
                pButton.setText("Play");
            }
        });

        Button stopButton = new Button("Stop");
        stopButton.setScaleX(1.5);
        stopButton.setScaleY(1.5);
        stopButton.setOnAction(e -> {
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                cancell();
            }
        });

        hBox = new HBox(pButton, stopButton);
        hBox.setSpacing(80);
        hBox.setAlignment(Pos.CENTER);

        songProgressBar.setPrefWidth(380);
        songProgressBar.setPrefHeight(10);
        songProgressBar.setStyle("-fx-accent: #00FF00;");

        vBox1 = new VBox(songProgressBar, label, hBox);
        vBox1.setSpacing(5);
        vBox1.setAlignment(Pos.CENTER);

        vBox = new VBox(menuBar, vBox1);
        vBox.setSpacing(100);
        vBox.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(vBox, 400, 200);
        primaryStage.setTitle("MusicPlayer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void begin(){
        timer = new Timer();
        task = new TimerTask() {
            public void run() {
                double current = mediaPlayer.getCurrentTime().toSeconds();
                double end = media.getDuration().toSeconds();
                System.out.println((int)current+"    "+(int)end);

                label = new Label(secondsCurrent((int)current)+"/"+secondsEnd((int)end));
                label.setTranslateX(-70);

                songProgressBar.setProgress(current/end);
                if(current/end == 1){
                    cancell();
                }
            }
        };
        vBox1 = new VBox(songProgressBar, label, hBox);
        vBox1.setSpacing(5);
        vBox1.setAlignment(Pos.CENTER);

        vBox = new VBox(menuBar, vBox1);
        vBox.setSpacing(100);
        vBox.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(vBox, 400, 200);
        primaryStage.setTitle("MusicPlayer");
        primaryStage.setScene(scene);
        primaryStage.show();

        timer.scheduleAtFixedRate(task, 1000, 1000);
    }
    public void cancell(){
        timer.cancel();
    }
    public String secondsCurrent(int s){
        int r = 0;
        if(s >= 10 && s < 60){
            return "0:"+s;
        }else if(s >= 60){
            r = s / 60;
            if(s % 60 >= 10){
                return r+":"+s%60;
            }
            return r+":0"+s%60;
        }else
            return "0:0"+s;
    }
    public String secondsEnd(int s){
        int r = 0;
        if(s >= 10 && s < 60){
            return "0:"+s;
        }else if(s >= 60){
            r = s / 60;
            if(s % 60 >= 10){
                return r+":"+s%60;
            }
            return r+":0"+s%60;
        }else
            return "0:0"+s;
    }
}