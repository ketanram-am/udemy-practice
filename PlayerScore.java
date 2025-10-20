<<<<<<< HEAD
class PlayerScore{
   public static void main(String[] args) {
    int a= calculateHighScorePosition(1500);
    dailyHighScorePosition("Ketan",a );

    a= calculateHighScorePosition(1000);
    dailyHighScorePosition("Moahn", a);

    a=calculateHighScorePosition(500);
    dailyHighScorePosition("Sai", a);

    a= calculateHighScorePosition(100);
    dailyHighScorePosition("Rahd", a);

    a= calculateHighScorePosition(25);
     dailyHighScorePosition("Ram", a);
   }

    public static void dailyHighScorePosition(String name,int position){
    System.out.println(name+" managed to get into poisition "+position+" on the high score list");
    
   }
        

 public static int calculateHighScorePosition(int score){
      int position=4;
        if(score>=1000){
            position = 1;
        }   
        else if(score>=500){
            position = 2;
        }   
        else if(score>=100){
            position= 3;
        }

        return position;
 }
}
=======
class PlayerScore{
   public static void main(String[] args) {
    int a= calculateHighScorePosition(1500);
    dailyHighScorePosition("Ketan",a );

    a= calculateHighScorePosition(1000);
    dailyHighScorePosition("Moahn", a);

    a=calculateHighScorePosition(500);
    dailyHighScorePosition("Sai", a);

    a= calculateHighScorePosition(100);
    dailyHighScorePosition("Rahd", a);

    a= calculateHighScorePosition(25);
     dailyHighScorePosition("Ram", a);
   }

    public static void dailyHighScorePosition(String name,int position){
    System.out.println(name+" managed to get into poisition "+position+" on the high score list");
    
   }
        

 public static int calculateHighScorePosition(int score){
      int position=4;
        if(score>=1000){
            position = 1;
        }   
        else if(score>=500){
            position = 2;
        }   
        else if(score>=100){
            position= 3;
        }

        return position;
 }
}
>>>>>>> 96a27af067fb2ac6229f5333feeedac72e17c4f3
