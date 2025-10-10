public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a , int b){
        
        if(a<10 || b<10){
            return -1;
        }
        int gcd =1;
        int min = a<b? a : b;
        
        for(int i=1;i<=min;i++)
        {
             if(a%i==0 && b%i==0){
                  gcd = i;
                 
             }
         }
    return gcd;
    }
}
