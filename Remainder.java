public class Remainder {

    public static void main(String[] args) {
        System.out.println("The sum of 123 is " + giveRemainder(231));
    }

    public static int giveRemainder(int num) {
        int sum = 0, rem = 0;

        if (num < 0) {
            return -1;
        }

        while (num > 0) {
            rem = num % 10;
            sum += rem;
            num = num / 10;

        }
        return sum;
    }

}
