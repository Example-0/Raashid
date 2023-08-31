package Assignment;

import java.util.Scanner;

public class FindAreaOfCricle {
      public static void main(String[] args) {
		
    	  Scanner scanner = new Scanner(System.in);
    	
    	  System.out.println("Enter the radius: ");
    	  /*we are storing the entered radius in double 
    	   * because a user can enter radius in decimals 
    	   */
       double radius = scanner.nextDouble();
       //Area = PI*radius*radius
       double area = Math.PI * (radius * radius);
       System.out.println("The area of circle is: " +area);
       //Circumference = 2*PI*radius
       double cricumference = Math.PI * 2*radius;
       
       System.out.println("The cricumference of the cricle is:"+cricumference);
       
       
       
      }
}
