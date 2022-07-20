public class Main {
    public static void main(String[] args) {
        weapon shortGun = new weapon();

        Boss boss = new Boss();
        boss.setDamage(100);
        boss.setHealth(700);
        boss.setBossWeapon(new weapon("Short Gun", "Winchester 1984"));
        System.out.println("BOSS Health " + boss.getHealth()+":" + " damage " + boss.getDamage()+": "  + "Type of weapon " + boss.getBossWeapon().getTypeOfWeapon() +", model " + boss.getBossWeapon().getNameOfWeapon());

    }
}