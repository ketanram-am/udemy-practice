public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(!isValid(a)|| !isValid(b)|| !isValid(c)){
            return false;
        }
        
        int aLastDigit= a%10;
        int bLastDigit= b%10;
        int cLastDigit= c%10;
        
        return(aLastDigit==bLastDigit||
                aLastDigit==cLastDigit||
                bLastDigit==cLastDigit);
        
    }
    
    public static boolean isValid ( int num ){
        return (num>=10 && num<=1000);
    }
}