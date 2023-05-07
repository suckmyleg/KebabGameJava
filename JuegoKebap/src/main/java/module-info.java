module com.example.juegokebap {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires javafx.graphics;

    opens com.example.juegokebap to javafx.fxml;
    exports com.example.juegokebap;
    exports com.GameEngine.Utils;
    opens com.GameEngine.Utils to javafx.fxml;
    exports com.example.juegokebap.Stages;
    opens com.example.juegokebap.Stages to javafx.fxml;
    exports com.example.juegokebap.Objects;
    opens com.example.juegokebap.Objects to javafx.fxml;
    exports com.example.juegokebap.App;
    opens com.example.juegokebap.App to javafx.fxml;
    exports com.GameEngine.Objects;
    opens com.GameEngine.Objects to javafx.fxml;
    exports com.GameEngine.Stages;
    opens com.GameEngine.Stages to javafx.fxml;
    exports com.GameEngine.Maps;
    opens com.GameEngine.Maps to javafx.fxml;
    exports com.GameEngine.Controllers;
    opens com.GameEngine.Controllers to javafx.fxml;
    exports com.GameEngine.Management;
    opens com.GameEngine.Management to javafx.fxml;
    exports com.GameEngine.Vectors;
    opens com.GameEngine.Vectors to javafx.fxml;
}