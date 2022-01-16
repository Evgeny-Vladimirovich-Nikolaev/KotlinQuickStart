import java.util.Random;


public class Food {

    public static void main(String[] args) {
        System.out.println("Вы можете себе позволить " + chooseFood());
    }

    private static int countMoney() {
        return new Random().nextInt(600);
    }

    private static String chooseFood () {
        int money = countMoney();
        if(money > 500) {
            return "пиццу";
        } else if ( money > 200) {
            return "шаурму";
        } else {
            return "доширак";
        }
    }
}
