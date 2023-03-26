import java.util.Scanner;
public class Lab9 {
    public static int string(String string) throws InvalidTimeException {
        String[] array = new String[3];
        array = string.split(":",3);
        if(array.length != 3) {
            throw new InvalidTimeException("Incorrect time format");
        }

        int hours = 0; int minutes = 0; int seconds = 0;

        try {
           hours = Integer.parseInt(array[0]);
           minutes = Integer.parseInt(array[1]);
           seconds = Integer.parseInt(array[2]);
        } catch(NumberFormatException e) {
            throw new InvalidTimeException("Incorrect time format");
        }


        for(int i = 0; i < array.length;i++){
            if(hours < 0 || hours > 23){
                throw new InvalidTimeException("Hours must be above 0 and below 24");
            } else if (minutes < 0 || minutes > 59){
                throw new InvalidTimeException("Minutes must be above 0 and below 60");
            } else if (seconds < 0 || seconds > 59){
                throw new InvalidTimeException("Seconds must be above 0 and below 60");
            }
        }

        int[] intArray = new int[3];
        for(int i =0;i< array.length;i++){
            intArray[i] = Integer.parseInt(array[i]);
        }

        int midnight = (intArray[0] * 60 * 60) + (intArray[1] * 60) + intArray[2];

        return midnight;
    }

    public static void main(String[] args) {
        try{ Scanner sc = new Scanner(System.in);
        System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS) ");
        String time1 = sc.next();
            int midnight1 = string(time1);
        System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS) ");
        String time2 = sc.next();
            int midnight2 = string(time2);



        System.out.println("Difference in seconds: " + (midnight2 - midnight1));

        } catch (InvalidTimeException e ) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
