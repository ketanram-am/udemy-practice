import java.util.Scanner;

public class NestedTernary {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number: ");
        int num=sc.nextInt();
 
        sc.close();

        String s= checkPositiveNegetiveNum(num);
        System.out.println(s);

    }
    
    public static String checkPositiveNegetiveNum(int num){
    String s= (num>0)?"positive"
            :(num<0)?"negative"
            :(num==0)?"zero":"Invalid";

            return s;
}

}
