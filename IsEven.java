public class IsEven {
    public static void main(String[] args) {
        int i = 0;
        int odd=0,even=0;

        while (i < 20) {

            if(even==3){
                break;
            }
            if (!checkEven(i)) {
                odd++;
                
                i++; 
                continue;
            }
            even++;
            System.out.println(i + " is even");
            i++;
            
        }
        System.out.println("Even Numbers: "+even+"\nOdd Numbers: "+odd);
    }

    public static boolean checkEven(int i) {
        return i % 2 == 0;
    }
}
