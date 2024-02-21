package creational.Builder;

public class MealDirector {
    public Meal createMeal(MealBuilder mealBuilder) {
        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }
}