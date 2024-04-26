package abstract_factory.first;

public class ElfWeapon implements Weapon{
    @Override
    public void attack() {
        System.out.println("Elf Weapon attack!");
    }
}
