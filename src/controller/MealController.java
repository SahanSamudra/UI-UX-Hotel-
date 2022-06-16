package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class MealController {
    public AnchorPane MealFormContext;
    public AnchorPane LocalMealContext;
    public AnchorPane MealContext;

    public void btnBackHomeMeal(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/DashBoard.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        MealFormContext.getChildren().clear();
        MealFormContext.getChildren().add(load);
    }

    public void OpenLocalMeal(ActionEvent actionEvent) throws IOException {
       URL resource = getClass().getResource("../view/Local Meal.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        MealContext.getChildren().clear();
        MealContext.getChildren().add(load);

    }

    public void OpenChineseMeal(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/Chinese Meal.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        MealContext.getChildren().clear();
        MealContext.getChildren().add(load);
    }

    public void OpenFrenchMeal(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/French Meal.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        MealContext.getChildren().clear();
        MealContext.getChildren().add(load);

    }
}
