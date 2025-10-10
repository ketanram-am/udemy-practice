public class Switch {
    public static void main(String[] args) {
        System.out.println(getSwitch('o'));
    }
       
       
       public static String getSwitch(char ch){
        return switch(ch){
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> "None";
        };
       
    }

}
