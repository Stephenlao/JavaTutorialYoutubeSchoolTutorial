package javaTutorialSchool.week5;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private ArrayList<RecipeComponent> components;

    private static int count;

    public Recipe(String name) {
        this.name = name;
        this.components = new ArrayList<RecipeComponent>();
        count++;
    }

    public void addComponents() {
        System.out.println("Adding new components...");
        components.add(RecipeComponent.createRecipeComponent());
    }

    public void displayComponents() {
        System.out.println(name + "(recipe)");
        for (RecipeComponent i : components) {
            i.displayRecipeComponent();
            System.out.println(" ");
            System.out.println("--------------");
        }
    }


    public static int showNumberofRecipe() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
