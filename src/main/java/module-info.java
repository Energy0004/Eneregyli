module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.PracticeActivities;
    opens com.example.demo.PracticeActivities to javafx.fxml;
}