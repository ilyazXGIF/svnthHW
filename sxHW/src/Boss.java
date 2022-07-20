public class Boss extends GameEntity{

    public Boss(){

        super();
    }

    private weapon bossWeapon;




    public weapon getBossWeapon() {

        return bossWeapon;
    }

    public void setBossWeapon(weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }
}
