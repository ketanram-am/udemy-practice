public class TimeConverter {
    public static void main(String[] args) {
       // System.out.println(getDurationString(670975));
        System.out.println(getDurationString(65,145));
    }

    public static String getDurationString(int second){
        if(second<0){
            String S= "Invalid Number of Seconds";
            return S;
        }
        

        return (""+ second/3600+"h "+(second%3600)/60+"m "+second%60+"s ");
    }

   public static String getDurationString(int min, int second){
    return getDurationString((min*60+second));
   }
}
