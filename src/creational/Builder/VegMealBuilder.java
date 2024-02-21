package creational.Builder;

public class VegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.setBurger("Veggie Burger");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
