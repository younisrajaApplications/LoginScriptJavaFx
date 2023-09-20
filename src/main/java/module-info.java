module com.javafxapplications.loginscriptjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafxapplications.loginscriptjavafx to javafx.fxml;
    exports com.javafxapplications.loginscriptjavafx;
}