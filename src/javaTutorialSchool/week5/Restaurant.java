package javaTutorialSchool.week5;

public class Restaurant {
    public static void main(String[] args) {
        Recipe chickenCurryRecipe = new Recipe("chicken curry");
        Recipe cookieCreamRecipe = new Recipe("cookie cream");
        chickenCurryRecipe.addComponents();
        chickenCurryRecipe.addComponents();
        cookieCreamRecipe.addComponents();
        cookieCreamRecipe.addComponents();
        chickenCurryRecipe.displayComponents();
        cookieCreamRecipe.displayComponents();

        System.out.printf("The number of recipes is: %d", Recipe.showNumberofRecipe());
    }
}
