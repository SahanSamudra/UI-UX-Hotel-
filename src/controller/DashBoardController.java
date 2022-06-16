package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class DashBoardController {

    public AnchorPane DashBoardFormContext;
    public Button buttonLogout;

    public void btnRooms(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/Rooms.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        DashBoardFormContext.getChildren().clear();
        DashBoardFormContext.getChildren().add(load);
    }

    public void btnCustomer(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/Customer.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        DashBoardFormContext.getChildren().clear();
        DashBoardFormContext.getChildren().add(load);

    }

    public void btnLogout(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/LogInForm.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        DashBoardFormContext.getChildren().clear();
        DashBoardFormContext.getChildren().add(load);
    }

    public void btnMealPackages(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/Meal.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        DashBoardFormContext.getChildren().clear();
        DashBoardFormContext.getChildren().add(load);
    }


    public void btnReports(ActionEvent actionEvent) throws IOException {


            URL resource = getClass().getResource("../view/Reports.fxml");
            assert resource != null;
            Parent load= FXMLLoader.load(resource);
            DashBoardFormContext.getChildren().clear();
            DashBoardFormContext.getChildren().add(load);


    }

    public void btnBilling(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/Billing.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        DashBoardFormContext.getChildren().clear();
        DashBoardFormContext.getChildren().add(load);

    }
}
