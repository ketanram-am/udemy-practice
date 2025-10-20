
public class Division {
    public static void main(String[] args) {
        int i, number=1000;
        int sum=0;
        int count=0;
        for(i=0;i<=number;i++){
            if(((i%3)==0) && (i%5==0)){
                System.out.print(i+" ");
                count++;
                sum = sum +  i;
                if(count==5){
                    break;
                }
            }
        }
        System.out.println("\n"+sum+" is the sum of numbers.\n"+"Total numbers are; "+count);

    }
}

