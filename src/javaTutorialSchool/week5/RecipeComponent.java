package javaTutorialSchool.week5;

import java.util.Scanner;

public class RecipeComponent {
    private Ingredient ingredient;
    private Double amount;

    public RecipeComponent(Ingredient ingredient, Double amount) {
        this.ingredient = ingredient;
        this.amount = amount;
    }

    public static RecipeComponent createRecipeComponent() {
        Ingredient ingredient = Ingredient.createIngredient();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the amount: ");
        double amountInput = scanner.nextDouble();
        return new RecipeComponent(ingredient, amountInput);
    }

    public void displayRecipeComponent() {
        this.ingredient.displayIngredient();
        System.out.printf("The amount is: %.2f", amount);
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
