package abstract_factory.first;

public class OrcWeapon implements Weapon{
    @Override
    public void attack() {
        System.out.println("Orc Weapon attack!");
    }
}
