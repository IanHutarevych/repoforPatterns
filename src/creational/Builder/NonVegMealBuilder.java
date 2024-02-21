package creational.Builder;

public class NonVegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.setBurger("Chicken Burger");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Pepsi");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
