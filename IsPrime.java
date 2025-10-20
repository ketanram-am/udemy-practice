
public class IsPrime {

    public static void main(String[] args) {
        int number = 795690785, count = 1 ;
        for (int i = 2; i <=number; i++) {
           
            if (checkPrime(i)) {
                
                count++;
            }
        }
        System.out.println("The number is : " + count);

    }

    public static boolean checkPrime(int number) {

        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }
        }
       System.out.println(number+" is prime ");
        return true;
    }
}