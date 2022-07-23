public class Main {
    public static void main(String[] args) {
        Warior warior = new Warior(100, 30, "Critical damage");
        Medic medic = new Medic(50,30,10,"Heal");
        wizard wizard = new wizard(60,40,"Fireball");
        Hero[] massive = {
                warior,medic,wizard};
        for (int i = 0; i < massive.length; i++) {
            massive[i].applySuperAbility();
            System.out.println(massive[i].info());
            if (massive[i] == medic){
                medic.increaseExperience();
            }

        }


    }
}