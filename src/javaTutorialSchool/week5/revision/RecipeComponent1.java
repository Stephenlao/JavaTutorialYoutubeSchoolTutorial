package javaTutorialSchool.week5.revision;

import javaTutorialSchool.week5.RecipeComponent;

import java.util.Scanner;

public class RecipeComponent1 {
    private Ingredient1 ingredient;
    private double amount;

    public RecipeComponent1(Ingredient1 ingredient, double amount) {
        this.ingredient = ingredient;
        this.amount = amount;
    }

    public static RecipeComponent1 createRecipe() {
        Ingredient1 ingredient1 = Ingredient1.createIngredient();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the amount: ");
        double amount = scanner.nextDouble();
        return new RecipeComponent1(ingredient1, amount);
    }

    public void displayRecipeComponent() {
        this.ingredient.displayIngredient();
        System.out.printf("The amount is: %.2f", this.amount);
    }
}
