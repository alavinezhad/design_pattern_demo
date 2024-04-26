package abstract_factory.first;

public class OrcFactory implements ItemFactory{
    @Override
    public Armor createArmor() {
        return new OrcArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new OrcWeapon();
    }
}
