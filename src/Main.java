import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String resultOne = ageTemperature(22,-10);
        String resultTwo = ageTemperature(18,0);
        String resultThree = ageTemperature(48, 25);
        String resultFour = ageTemperature(50, 30);
        String resultHome = ageTemperature(105, -90);
        String resultRandom = ageTemperature(generateRandomAge(), -10);
        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
        System.out.println(resultFour);
        System.out.println(resultHome);
        System.out.println(resultRandom);
    }

    public static String ageTemperature(int age, int temperature) {
        if ((age >= 20 || age == 45)&&(temperature >= -20 || temperature == 30)){
            return goToWalk();
        }else if (age < 20 && (temperature >= 0 || temperature == 28)){
            return goToWalk();
        }else if(age > 45 && (temperature >= -10 || temperature == 25)){
            return goToWalk();
        }else {
            return home();

        }

    }
    public static String goToWalk (){
        return "Можно идти гулять";
    }
    public static String home(){
        return "Оставайся дома";

    }
    public static int generateRandomAge(){
        int minNum = 0;
        int maxNum = 100;
        int diffNum = maxNum - minNum;
        Random randomNum = new Random();
        int numRandom = randomNum.nextInt(diffNum + 1) + minNum;
        return numRandom;
    }
}