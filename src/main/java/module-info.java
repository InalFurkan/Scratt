module com.example.scrat {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.base;


    opens com.example.scrat to javafx.fxml;
    exports com.example.scrat;
}