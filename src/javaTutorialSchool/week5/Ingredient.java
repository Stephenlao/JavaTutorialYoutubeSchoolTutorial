package javaTutorialSchool.week5;

import java.util.Scanner;

public class Ingredient {
    private String name;
    private String measurementUnit;

    public Ingredient(String name, String measurementUnit) {
        this.name = name;
        setMeasurementUnit(measurementUnit);
    }

//The method is declared as public static Ingredient.
// It indicates that the method is accessible from other classes
// and returns an instance of the Ingredient class.

    // static value should have return statement
    public static Ingredient createIngredient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the name of the ingredient: ");
        String ingredientInput = scanner.nextLine();
        System.out.println("Please input the measurement of the ingredient: ");
        String measurementInput = scanner.nextLine();
        return new Ingredient(ingredientInput, measurementInput);
    }

    public void displayIngredient() {
        System.out.printf("The ingredient is: %s and the measurement unit is: %s\n", name, measurementUnit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        String[] availableUnits = {"spoon", "teaspoon", "mg", "kg"};
        boolean matched = false;
        // for loop through availableUnits String
        // if it matches measurementUnit return matched = true
        // then assign measurementUnit to this.measurementUnit
        // quit while loop, comeback to constructor "Ingredient"
        // inside constructor called method "createIngredient"
        // execute this method and then run "displayIngredient"
        while (!matched) {
            for (String i : availableUnits) {
                if (measurementUnit.equals(i)) {
                    matched = true;
                }
            }
            if (matched) {
                this.measurementUnit = measurementUnit;
            } else {
                System.out.print("Error");
                Scanner scanner = new Scanner(System.in);
                measurementUnit = scanner.nextLine();
            }

        }
    }

    public static void main(String[] args) {
        Ingredient i1 = Ingredient.createIngredient();
        i1.displayIngredient();
        Ingredient i2 = Ingredient.createIngredient();
        i2.displayIngredient();
    }


}
