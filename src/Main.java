//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import creational.AbFactory.Weapon;
import creational.Singleton.*;
import creational.AbFactory.*;
import creational.Prototype.*;
import creational.Builder.*;
import creational.Factory.*;

public class Main {
    public static void main(String[] args) {
        // Фабричний метод (Factory Method)
        System.out.println("Factory Method Pattern:");
        WeaponFactory pistolFactory = new PistolFactory();
        Weapon pistol = pistolFactory.createWeapon();
        pistol.fire();

        WeaponFactory rifleFactory = new RifleFactory();
        Weapon rifle = rifleFactory.createWeapon();
        rifle.fire();
        System.out.println();

        // Одинак (Singleton)
        System.out.println("Singleton Pattern:");
        GameEngine gameEngine1 = GameEngine.getInstance();
        gameEngine1.start();

        GameEngine gameEngine2 = GameEngine.getInstance();
        gameEngine2.start();

        System.out.println(gameEngine1 == gameEngine2); // Output: true
        System.out.println();

        // Фабрика (Factory)
        System.out.println("Factory Pattern:");
        Vehicle car = VehicleFactory.createVehicle("Car");
        System.out.println("Type of vehicle: " + car.getType());

        Vehicle bike = VehicleFactory.createVehicle("Bike");
        System.out.println("Type of vehicle: " + bike.getType());
        System.out.println();

        // Будівельник (Builder)
        System.out.println("Builder Pattern:");
        MealDirector mealDirector = new MealDirector();

        MealBuilder vegMealBuilder = new VegMealBuilder();
        Meal vegMeal = mealDirector.createMeal(vegMealBuilder);
        vegMeal.display();

        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();
        Meal nonVegMeal = mealDirector.createMeal(nonVegMealBuilder);
        nonVegMeal.display();
        System.out.println();

        // Прототип (Prototype)
        System.out.println("Prototype Pattern:");
        ItemRegistry itemRegistry = new ItemRegistry();

        Item pistol1 = itemRegistry.createItem("pistol");
        System.out.println("Item created: " + pistol1.getName());

        Item pistol2 = itemRegistry.createItem("pistol");
        System.out.println("Item created: " + pistol2.getName());

        System.out.println("Are they same? " + (pistol1 == pistol2));
    }
}
