package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class CustomerController {
    public AnchorPane CustomerFormContext;

    public void btnBackCustomer(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/DashBoard.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        CustomerFormContext.getChildren().clear();
        CustomerFormContext.getChildren().add(load);

    }
}
