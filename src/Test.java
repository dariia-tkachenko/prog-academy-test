import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        float bitcoinCourse = queryValue("What is Bitcoin price today?");
        float dollars = queryValue("How much $ do you have?");
        float bitcoins = dollars / bitcoinCourse;
        System.out.println("You can buy " + bitcoins + " BTC");
    }

    public static float queryValue(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        float result = scan.nextFloat();
        return result;
    }
}
