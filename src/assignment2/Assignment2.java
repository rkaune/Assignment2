/* Assignment 2 - Control Tower 
 * Mr. Kaune
 * April 4,2022
*/

package assignment2;
import java.util.Scanner;
import assignment2.Airplane;

public class Assignment2
{
  public static void main(String[] args)
  {
    // Create Scanner and Airplane 1
    Scanner scan = new Scanner(System.in);
    Airplane p1 = new Airplane();

    // Get Airplane 2 details
    System.out.println("Enter the details of the second airplane (call-sign, distance, bearing and altitude):");
    String cs = scan.nextLine();
    double dist = scan.nextDouble();
    int dir = scan.nextInt();
    int alt = scan.nextInt();
    cs = cs.toUpperCase();

    /* To create a plane with the characteristics described above, call
     * the constructor with the variables matching the signature:
     * (String cs, double dist, int dir, int alt).
     */
    Airplane p2 = new Airplane(cs, dist, dir, alt);

    /* When the airplane objects p1 and p2 are concatenated into a
     * String, the toString method is called automatically, causing the
     * representation requested by the assignment to be printed. When
     * the method call p1.distTo(p2) is concatenated into the String,
     * the result of this call is concatenated into the string.
     */
    System.out.println("\nInitial Positions:");
    System.out.println("\"Airplane 1\": " + p1);
    System.out.println("\"Airplane 2\": " + p2);
    System.out.println("The distance between the planes is " + p1.distTo(p2) + " miles.");
    System.out.println("The difference in height between the planes is " + Math.abs(p1.getAlt()-p2.getAlt()) + " feet.");

    // Calling the gainAlt method 4 times moves the plane up 4000 feet
    p1.gainAlt();
    p1.gainAlt();
    p1.gainAlt();
    p1.gainAlt();

    //Calling the loseAlt method 2 times moves the plane down 2000 feet
    p2.loseAlt();
    p2.loseAlt();

    // Moves the planes the desired distances and directions
    p1.move(10.5, 50);
    p2.move(8.0, 125);

    //Repeat print statements from before
    System.out.println("\nNew Positions:");
    System.out.println("\"Airplane 1\": " + p1);
    System.out.println("\"Airplane 2\": " + p2);
    System.out.println("The distance between the planes is " + p1.distTo(p2) + " miles.");
    System.out.println("The difference in height between the planes is " + Math.abs(p1.getAlt()-p2.getAlt()) + " feet.");
  }
}
