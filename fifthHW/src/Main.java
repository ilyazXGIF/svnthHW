public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        System.out.println("statistic Hero: Health " + hero1.getHealth() + ", Damage " + hero1.getDamage() + ", Super " + hero1.getSuperAtack());

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(100);
        boss.setTypeOfDefence("Fire Protection");

        System.out.println("Bos statistic: health " + boss.getHealth() + ", Daamage " + boss.getDamage() + ", defence - " + boss.getTypeOfDefence());
    }
}