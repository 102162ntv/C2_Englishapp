module com.ntv.c2englishapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ntv.c2englishapp to javafx.fxml;
    exports com.ntv.c2englishapp;
}
