package creational.AbFactory;


public class RifleFactory implements WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Rifle();
    }
}