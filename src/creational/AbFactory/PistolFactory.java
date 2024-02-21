package creational.AbFactory;



public class PistolFactory implements WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Pistol();
    }
}