package creational.Builder;

public class Meal {
    private String burger;
    private String drink;

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void display() {
        System.out.println("Burger: " + burger);
        System.out.println("Drink: " + drink);
    }
}
