package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class OrderController {

    @FXML
    private Button browseButton;

    @FXML
    private Button proButton;

    @FXML
    private Button guidedRecipesButton;

    @FXML
    private Button allYumsButton;

    @FXML
    private Button drinksButton;

    @FXML
    private Button sidesButton;

    @FXML
    private Button breakfastsButton;

    @FXML
    private Button dessertsButton;

    @FXML
    private Button dinnersButton;

    @FXML
    private Label mainTitle;

    @FXML
    private ImageView firstRecipeImage;

    @FXML
    private Label firstRecipeTitle;

    @FXML
    private Label firstRecipeDetails;

    @FXML
    private ImageView secondRecipeImage;

    @FXML
    private Label secondRecipeTitle;

    @FXML
    private Label secondRecipeDetails;

    @FXML
    private ImageView thirdRecipeImage;

    @FXML
    private Label thirdRecipeTitle;

    @FXML
    private Button learnMoreButton;

    @FXML
    private void handleBrowse() {
        System.out.println("Browse button clicked!");
    }

    @FXML
    private void handlePro() {
        System.out.println("Pro button clicked!");
    }

    @FXML
    private void handleGuidedRecipes() {
        System.out.println("Guided Recipes button clicked!");
    }

    @FXML
    private void handleAllYums() {
        System.out.println("All Yums button clicked!");
    }

    @FXML
    private void handleDrinks() {
        System.out.println("Drinks button clicked!");
    }

    @FXML
    private void handleSides() {
        System.out.println("Sides button clicked!");
    }

    @FXML
    private void handleBreakfasts() {
        System.out.println("Breakfasts button clicked!");
    }

    @FXML
    private void handleDesserts() {
        System.out.println("Desserts button clicked!");
    }

    @FXML
    private void handleDinners() {
        System.out.println("Dinners button clicked!");
    }

    @FXML
    private void handleLearnMore() {
        System.out.println("Learn More button clicked!");
    }
}
