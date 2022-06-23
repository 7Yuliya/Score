module com.example.score {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.score to javafx.fxml;
    exports com.example.score;
}