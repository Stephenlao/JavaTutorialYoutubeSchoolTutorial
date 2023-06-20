package javaTutorialSchool.week5.revision;

import javaTutorialSchool.week5.RecipeComponent;

import java.util.ArrayList;

public class Recipe1 {
    private String name;
    private ArrayList<RecipeComponent1> components;
    private static int count;

    public Recipe1(String name) {
        this.name = name;
        this.components = new ArrayList<RecipeComponent1>();
        count++;
    }

    public void addRecipe() {
        System.out.println("Add new components....");
        components.add(RecipeComponent1.createRecipe());
    }

    public void displayRecipe() {
        System.out.print(this.name + " " + "(Recipe)\n");
        for (RecipeComponent1 i : components) {
            i.displayRecipeComponent();
            System.out.println();
            System.out.println("--------------");
        }
    }

    public int countRecipe() {
        System.out.printf("The total number of recipes created is %d", count);
        return count;
    }
}
