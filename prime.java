public class prime {
    public static void main(String[] args) {
        System.out.println("Is it prime? :"+ checkPrime(17));
    }

    public static boolean checkPrime(int number){
        for(int i=3;i<Math.sqrt(number);i++){
            if(number%i != 0){
                return true;
            }
            
        }
        return false;
    }
}
