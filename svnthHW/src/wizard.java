public class wizard extends Hero{
    public wizard(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("wizard" + getSuperAbility());
    }

    @Override
    public String info() {
        return super.info();
    }
}
