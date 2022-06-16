package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class BillingController {
    public AnchorPane BillingFormContext;

    public void btnBackBilling(ActionEvent actionEvent) throws IOException {


        URL resource = getClass().getResource("../view/DashBoard.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        BillingFormContext.getChildren().clear();
        BillingFormContext.getChildren().add(load);
    }
}
