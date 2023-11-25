module com.example.clientservercommunicator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clientservercommunicator to javafx.fxml;
    exports com.example.clientservercommunicator;
}