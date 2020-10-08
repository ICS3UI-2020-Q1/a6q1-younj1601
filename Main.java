import java.util.Scanner;
/**
 *Averages an amount of heights and outputs the heights that are above average
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //get the amount of heights
    System.out.println("How many heights would you like to enter");
    int num = input.nextInt();

    //create an array for heights
    int[] heights = new int[num];
    
    //ask for the heights
    System.out.println("Please enter the heights on separate lines");
    
    //get heights from user and store them in array
    for(int i = 0; i < heights.length; i++){
      heights[i] = input.nextInt();
    }
      int sum = 0;

      //add up all of the heights into sum
      for(int i = 0; i < heights.length; i++){
        sum = sum + heights[i];
      }

      //determine the average and let the user know
      int average = sum/heights.length;
      System.out.println("The average height is " + average + " cm");

      System.out.println("The heights above average are");

      //get the heights that are above average
      for(int i = 0; i < heights.length; i++){
        if(heights[i] > average){
          System.out.println(heights[i]);
        }
      }
    
  }
}
