public class Medic extends Hero {
    private double healPoints;

    public Medic(int health, int damage, double healPoints, String superAbility) {
        super(health, damage, superAbility);
        this.healPoints = healPoints;
    }


    public String increaseExperience(){
        double ten = (((10 * healPoints ) / 100) + healPoints);
        return "healPoint" + healPoints + "healPoint * 10%" + ten;

    }

    @Override
    public String info() {
        return super.info();
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic" + getSuperAbility());

    }
}
