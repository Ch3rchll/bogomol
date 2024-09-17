module com.example.bogomol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bogomol to javafx.fxml;
    exports com.example.bogomol;
}