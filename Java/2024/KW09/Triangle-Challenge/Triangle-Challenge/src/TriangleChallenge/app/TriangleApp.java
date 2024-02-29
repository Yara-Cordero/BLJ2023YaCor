package TriangleChallenge.app;

import TriangleChallenge.exceptions.*;
import java.util.Scanner;

// TODO: Import the exceptions

public class TriangleApp {

  private String company;
  private String handler;

  private boolean isRunning;

  private String sideAInput;
  private String sideBInput;
  private String sideCInput;

  private double sideA;
  private double sideB;
  private double sideC;

  private String code;

  private Scanner scan = new Scanner(System.in);

  /**
   * The constructor.
   * 
   * @param company of type String to print in the application header
   * @param handler of type String to print in the application header
   */
  public TriangleApp(String company, String handler) {
	// TODO: Persist company and handler in the intended fields
	// TODO: Set field isRunning to true
  }

  /**
   * This method starts the actual application. It will remain in a loop as long
   * as the field "isRunning" is true.
   */
  public void start() {
    printHeader();
    while (isRunning) {
      System.out.println("\nTEST CASES TRIANGLE\n");

      sideAInput = promptSide("Side A:    ");





	  // TODO: Ask user for all 3 sides and assign to intended fields

      try {
        validateInput();
        code = determineTriangleType();
      } catch (TriangleException e) {
        code = e.getMessage();
      } finally {
        printResult();
        promptAction();
      }
    }
  }

  /**
   * This method prints the application header.
   */
  private void printHeader() {
	// TODO: Print a fancy app header with handler, company and current year

    System.out.println("***************************************************************\n");
    System.out.println("                      TRIANGLE CALCULATOR                      \n");
    System.out.println("***************************************************************\n");
    System.out.println("02/2024");
    System.out.println("");

  }

  /**
   * This method prints the evaluated code in an aesthetically pleasing way.
   */
  private void printResult() {
	// TODO: Print code
  }

  /**
   * This method prompts the user to give an input for a triangle side.
   * 
   * @param side of type String to display as title for the prompt.
   * @return the input of type String.
   */
  private String promptSide(String side) {
    System.out.println(side);
    // TODO: Ask user for input
    return scan.nextLine();
  }

  /**
   * This method prompts the user to give an input.<br>
   * "q": Quits the program.<br>
   * "c": Continues the program.<br>
   * else: Keeps asking for an input until "q" or "c" is entered.
   */
  private void promptAction() {
    String action = "";
    // TODO: Get valid prompt
	// TODO: Check if program needs to be cancelled (set isRunning to false)
	
    System.out.println("******************************");
  }

  /**
   * This method validates the three entered values, to be used as sides for a
   * triangle.
   * 
   * @throws TriangleException if the validation fails. This means that the
   *                           entered values do not lead to a triangle.
   */
  private void validateInput() throws TriangleException {
    try {
      sideA = Double.parseDouble(sideAInput);
      sideB = Double.parseDouble(sideBInput);
      sideC = Double.parseDouble(sideCInput);
      // TODO: Do the same for sideB and SideC
	  
    } catch (NumberFormatException nfe) {
      throw new IllegalTriangleSideException();
    }


    if (sideA == 0 || sideB == 0 || sideC == 0) {
      throw new ZeroTriangleSideException();
      // TODO: throws ZeroTriangleSideException
    }

    // TODO: Validate other triangle cases
  }

  /**
   * This method determines whether the three entered values lead to a
   * equilateral, isosceles, right-angled or scalene triangle.
   * 
   * @return The corresponding code for each triangle.
   */
  private String determineTriangleType() {
    // TODO: Based on sideA, sideB, sideC, return correct code
    if (sideA == sideB || sideA == sideC || sideB == sideC) {
      code = "TRI84TF";
    } else if (sideA == sideB && sideA == sideC && sideB == sideC) {
      code = "TRI66TF";
    } else if (sideC * sideC == sideA * sideA + sideB * sideB || sideA * sideA == sideC * sideC + sideB * sideB || sideB * sideB == sideA * sideA + sideC * sideC ) {
      code = "TRI72TF";
    }else {
      code = "TRI60TF";
    }
    return code;
  }
}
