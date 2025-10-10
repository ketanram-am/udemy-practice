public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of first nd last of 15865442 is "+ sumFirstAndLastDigit(15865442));
    }
   public static int sumFirstAndLastDigit(int number){
       int sum=0,lastNum=0,firstNum=0;
       if(number<0){
           return -1;
       }
       
       if(number==0){
           return 0;
       }
       
       if(number<10){
           return number+number;
       }
       
       lastNum= number%10;
       firstNum = number;
       while(firstNum>9){
        firstNum = firstNum / 10 ;
        
       }
       sum = firstNum + lastNum;
       
 
      return sum;
   }
}