import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

         int[] dataPoints = new int[100];
         Random rnd = new Random();
        int index = 0;
       int sum = 0;
       int average = 0;

         for (int i = 0; i < dataPoints.length; i++){
             dataPoints[i] = rnd.nextInt(100) + 1;
             sum += dataPoints[i];
              System.out.println(dataPoints[i]);

         }
        average = sum / dataPoints.length;
         for (int i = 0; i < dataPoints.length; i++){

            if (i > 0){

             System.out.printf(" | ");

             }
         System.out.printf("%d", dataPoints[i]);
         }
         System.out.println("\nThe sum of the random array dataPoints is " + sum);
         System.out.println("The average of the random array dataPoints is " + average);


         Scanner in = new Scanner(System.in);
         int count = 0;
         int userData = SafeInput.getRangedInt(in,"Enter a int from 1 - 100", 1,100);
         for (int i = 0; i < dataPoints.length; i++){
             if (dataPoints[i] == userData){
                 count++;
             }
         }
         if (count > 0){
             System.out.println("The value " + userData + " was found" + count + " times");
         }
         else{
             System.out.println("The value " + userData + " was not found");
         }
         int userData2 = SafeInput.getRangedInt(in,"Enter a int from 1 - 100", 1,100);
         boolean found = false;
         for (int i = 0; i < dataPoints.length; i++){
             if (userData2 == dataPoints[i]){
                 System.out.println("The value " + userData2 + " was found at index " + i);
                 found = true;
                 break;
             }

         }
         if (!found){
             System.out.println("The value " + userData2 + " was not found");
         }
         int min = dataPoints[0];
         int max = dataPoints[0];
         for (int i = 0; i < dataPoints.length; i++){
             if (dataPoints[i] < min){
                 min = dataPoints[i];
             }
             if (dataPoints[i] > max){
                 max = dataPoints[i];
             }

         }
        System.out.println("The minimum value of the arrays is " + min);
        System.out.println("The maximum value of the arrays is " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
public static double getAverage(int values[]){
    int sum = 0;

    // Calculate the sum of all elements in the array
    for (int value : values) {
        sum += value;
    }

    // Return the average as a double
    return (double) sum / values.length;

}
    }