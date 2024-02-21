package creational.Prototype;

public class Weapon extends Item {
    public Weapon(String name) {
        this.name = name;
    }

    @Override
    public Item clone() {
        return new Weapon(this.name);
    }

    public void fire() {
    }
}
