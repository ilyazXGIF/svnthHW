public class Main {
    public static void main(String[] args) {
        System.out.println(calculateDay(21,-3));
        System.out.println(calculateDay(19,10));
        System.out.println(calculateDay(51,13));
        System.out.println(calculateDay(-5,-70));
        System.out.println(calculateDay(100000,9990));
        generateRandomAge();


    }

    public static void generateRandomAge(){
        int a = 10;
        int b = 23;

        int generateRandomAge = a + (int) (Math.random() * b);
        System.out.println(generateRandomAge);
        if(generateRandomAge > 4){
            System.out.println("можешь идти гулять");
        } else if (generateRandomAge < 4) {
            System.out.println("делай уроки");

        }

    }




    public static String calculateDay(int age, int temperature) {
        String goWalk = "Можно идти гулять";
        String stayAtHome = "Оставайся дома";


        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return goWalk;
        }
        else if (age < 20 && age > 0 && temperature < 28) {
            return goWalk;
        }
        if (age > 45 && temperature > -10 && temperature < 25) {
            return goWalk;
        }
        else {
            return stayAtHome;
        }
    }
}