module com.example.watertankvolumecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.watertankvolumecalculator to javafx.fxml;
    exports com.example.watertankvolumecalculator;
}