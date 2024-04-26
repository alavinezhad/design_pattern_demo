package abstract_factory.first;

public class Main {
    public static void main(String[] args) {
        ItemFactory elfFactory = new ElfFactory();
        ItemFactory orcFactory = new OrcFactory();

        elfFactory.createWeapon().attack();
        elfFactory.createArmor().attack();

        orcFactory.createArmor().attack();
        orcFactory.createWeapon().attack();
    }
}
