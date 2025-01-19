package practiceArrays;

import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        //initialize variables
        Scanner scan = new Scanner(System.in);
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Double[] tempList = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        Double weekAvg = 0.0;
        
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println("What is the temperature on " + daysOfWeek[i] + "? ");
            String currTemp = scan.nextLine();
            
            if (currTemp.equalsIgnoreCase("week")) {
                // Calculate weekly average
                for (Double temp : tempList) {
                    weekAvg += temp;
                }
                weekAvg /= tempList.length;
                
                // Display results
                System.out.println("The weekly average for temperature is: " + weekAvg);
                System.out.println("Here are the temperatures for each day of the week:");
                for (int j = 0; j < daysOfWeek.length; j++) {
                    System.out.println(daysOfWeek[j] + ": " + tempList[j]);
                }
                // Continue the loop without incrementing `i`
                i--; 
                continue;
            }
            
            // Parse and store temperature. 
            tempList[i] = Double.parseDouble(currTemp);
        }
        
        // Final display 
        for (Double temp : tempList) {
            weekAvg += temp;
        }
        weekAvg /= tempList.length;
        
        System.out.println("The weekly average for temperature is: " + weekAvg);
        System.out.println("Here are the temperatures for each day of the week:");
        for (int j = 0; j < daysOfWeek.length; j++) {
            System.out.println(daysOfWeek[j] + ": " + tempList[j]);
        }
        
    }
}
