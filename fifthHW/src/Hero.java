public class Hero {
    private int health;
    private int damage;
    private String superAtack;

    public Hero() {
        }
    public Hero(int health, int damage,  String superAtack){
        this.health = health;
        this.damage = damage;
        this.superAtack = superAtack;
    }


    public Hero(int health, int damage){
        this.health = health;
        this.damage = damage;
    }


    public int getHealth() {
        return health;
    }


    public int getDamage() {
        return damage;
    }


    public String getSuperAtack() {
        return superAtack;
    }

}
