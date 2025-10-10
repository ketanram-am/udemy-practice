public class Height {
    public static void main(String[] args) {
         int inch,feet;
         feet=5;
         inch=8;
         System.out.println("The Height in cm is"+fromFeetToInch(feet, inch));
    }

public static double fromInchToCm(int inchHeight){
    double heightInCm = (inchHeight*2.54);
    System.out.println("Given height in inches: "+inchHeight);
    return heightInCm;
}

public static double fromFeetToInch(int feetHeight,int inchHeight){
    int HeightInInch = (feetHeight*12 + inchHeight);
    System.out.println("Feet: "+feetHeight+"ft "+"Inches: "+inchHeight);
    return fromInchToCm(HeightInInch);
}



}
