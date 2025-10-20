<<<<<<< HEAD
public class NewSwitch {
    public static void main(String[] args) {
        System.out.println("Th name of day is "+ printWeekDay(9));
    }

    public static String printWeekDay(int day){
       return switch(day){
        case 0 ->{ System.out.println("Its is day one");
                yield "Sunday";
            }

        case 1 ->{ System.out.println("It is day two");
                yield "Monday";
        }

        case 2 ->{ System.out.println("It is day three");
                yield "Tuesday";
        }

        default -> {yield "Unkonown";}
        };
    }
    
}
=======
public class NewSwitch {
    public static void main(String[] args) {
        System.out.println("Th name of day is "+ printWeekDay(9));
    }

    public static String printWeekDay(int day){
       return switch(day){
        case 0 ->{ System.out.println("Its is day one");
                yield "Sunday";
            }

        case 1 ->{ System.out.println("It is day two");
                yield "Monday";
        }

        case 2 ->{ System.out.println("It is day three");
                yield "Tuesday";
        }

        default -> {yield "Unkonown";}
        };
    }
    
}
>>>>>>> 96a27af067fb2ac6229f5333feeedac72e17c4f3
