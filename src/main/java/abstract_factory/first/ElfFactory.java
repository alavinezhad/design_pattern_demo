package abstract_factory.first;

public class ElfFactory implements ItemFactory{
    @Override
    public Armor createArmor() {
        return new ElfArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new ElfWeapon();
    }
}
