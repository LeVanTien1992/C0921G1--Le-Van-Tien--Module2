package ss22_behavior_design_pattern.thuc_hanh.trien_khai_template_method;

public class TacoMeal extends Meal{
    @Override
    public void prepareIngredients() {
        System.out.println("Getting ground beef and shells");
    }

    @Override
    public void cook() {
        System.out.println("Cooking ground beef in pan");
    }

    @Override
    public void eat() {
        System.out.println("The tacos are tasty");
    }

    @Override
    public void cleanUp() {
        System.out.println("Doing the dishes");
    }
}
