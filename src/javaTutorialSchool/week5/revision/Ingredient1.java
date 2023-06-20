package javaTutorialSchool.week5.revision;

import java.util.Scanner;

public class Ingredient1 {
    private String name;
    private String measurementUnit;

    public Ingredient1(String name, String measurementUnit) {
        this.name = name;
        setMeasurementUnit(measurementUnit);
//        this.measurementUnit = measurementUnit;
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

    public static Ingredient1 createIngredient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the name of the ingredient: ");
        String name = scanner.nextLine();
        System.out.println("Please input the measurement of the ingredient: ");
        String measurement = scanner.nextLine();
        return new Ingredient1(name, measurement);
    }

    public void displayIngredient() {
        System.out.printf("The ingredient is: %s and the measurement unit is: %s\n", this.getName(), this.getMeasurementUnit());
    }

    public void setMeasurementUnit(String measurementUnit) {
        String[] newingredient = {"spoon", "teaspoon", "mg", "kg"};
        boolean mark = false;
        while (!mark) {
            for (String i : newingredient) {
                if (measurementUnit.equals(i)) {
                    mark = true;
                }
            }
            if (mark) {
                this.measurementUnit = measurementUnit;
            } else {
                System.out.println("Error, please re-enter your measurement again!");
                Scanner scanner = new Scanner(System.in);
                measurementUnit = scanner.nextLine();
            }
        }
    }
}

