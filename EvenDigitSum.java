public class EvenDigitSum {
   public static int getEvenDigitSum(int number){
      int sum =0, lastDigit = 0;
              
       if(number < 0){
           return -1;
       }
       
       while(number>0){
           lastDigit = number%10;
           
           if(lastDigit%2==0){
               sum+=lastDigit;
           }
           number = number / 10;
       }
       
       return sum;
   }
}