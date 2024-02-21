package creational.AbFactory;



public class Pistol implements Weapon {
    @Override
    public void fire() {
        System.out.println("Firing pistol pow pow");
    }
}