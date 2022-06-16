package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class ReportsController {
    public AnchorPane ReportsFormContext;

    public void btnBackReports(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoard.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        ReportsFormContext.getChildren().clear();
        ReportsFormContext.getChildren().add(load);
    }
}
