module com.example.juegokebap {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.juegokebap to javafx.fxml;
    exports com.example.juegokebap.App;
}