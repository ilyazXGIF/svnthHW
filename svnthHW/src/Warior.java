public class Warior extends Hero{
    public Warior(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warior" + getSuperAbility());
    }

    @Override
    public String info() {
        return super.info();
    }
}
