package com.kmagwenzi;

import com.kmagwenzi.models.*;
import java.util.Scanner;

public class TrianglesConsole{

	private static Scanner scan = new Scanner(System.in);
	private static int selection;

	public static void main(String[] args) {

		TrianglesConsole.showTitle();

		Menu: while (true) {
					TrianglesConsole.showMenu();
					TrianglesConsole.selection = TrianglesConsole.getSelection();

					if(TrianglesConsole.selection == 0)	break Menu;

					Triangle triangle = TrianglesConsole.getTriangleObject(selection);
					System.out.println();
					triangle.subMenuHeader();

					SubMenu: while (true){

						triangle.setTriangleData();
						triangle.draw();
						TrianglesConsole.showSubMenu(triangle);
						switch (TrianglesConsole.selection){
							case 1:
								// Draw Another Triangle
								continue;

							case 3:
								// Show Application Menu
								break SubMenu;
							}
					}
					
			System.out.println("\n------------------------------------------------------------------");

		}

		System.out.println("\nGoodbye ...");

	}

	private static int getSelection(){
			System.out.println();
			System.out.print("selection: ");
			return scan.nextInt();

	}

	private static void showTitle() {
		System.out.println();
		System.out.println();
		System.out.println("                               *");
		System.out.println("                              * *");
		System.out.println("                             *   *");
		System.out.println("                            * * * *");
		System.out.println("                           *       *");
		System.out.println("                          * *     * *");
		System.out.println("                         *   *   *   *");
		System.out.println("                        * * * * * * * *");
		System.out.println("                       *               *");
		System.out.println("                      * *             * *");
		System.out.println("                     *   *           *   *");
		System.out.println("                    * * * *         * * * *");
		System.out.println("                   *       *       *       *");
		System.out.println("                  * *     * *     * *     * *");
		System.out.println("                 *   *   *   *   *   *   *   *");
		System.out.println("                * * * * * * * * * * * * * * * *");
		System.out.println("       =================================================");      
		System.out.println("           _____     _                   _");           
		System.out.println("          |_   _| __(_) __ _ _ __   __ _| | ___  ___ ");
		System.out.println("            | || '__| |/ _` | '_ \\ / _` | |/ _ \\/ __|");
		System.out.println("            | || |  | | (_| | | | | (_| | |  __/\\__ \\");
		System.out.println("            |_||_|  |_|\\__,_|_| |_|\\__, |_|\\___||___/");
    System.out.println("                                   |___/ ");    
		System.out.println("       =================================================");            
		System.out.println("       *               *               *               *");
    System.out.println("      * *             * *             * *             * *");
    System.out.println("     *   *           *   *           *   *           *   *");
    System.out.println("    * * * *         * * * *         * * * *         * * * *");
    System.out.println("   *       *       *       *       *       *       *       *");
    System.out.println("  * *     * *     * *     * *     * *     * *     * *     * *");
    System.out.println(" *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *");
    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");

	}

	private static void showMenu() {
		System.out.println();
		System.out.println();
		System.out.println("           ---------- //// Triangles \\\\\\\\\\ ---------");
		System.out.println("     ------------------------------------------------------");
		System.out.println();
		System.out.println("        Character        [1]   Pascals               [5]");
		System.out.println("        Count Down       [2]   Sierpinski Gasket     [6]");
		System.out.println("        Till the End     [3]   Pascals Prime Pattern [7]");
		System.out.println("        Continuous Count [4]   Exit                  [0]");
		System.out.println();
		System.out.println("     ------------------------------------------------------");
		System.out.println(" --------------------------------------------------------------");

	}

	private static void showSubMenu(Triangle triangle) {
		System.out.println();
		System.out.println("  ------ Sub Menu ------");
		System.out.println("     1 - Draw Another");
		System.out.println("     2 - Save to File");
		System.out.println("     3 - View Menu");
		System.out.println("  ----------------------");



		TrianglesConsole.selection = TrianglesConsole.getSelection();

		if(TrianglesConsole.selection == 2)
			printToFile();


	}

	private static void printToFile() {

	}

	private static Triangle getTriangleObject(int selection) {

		final int EXIT_CODE = 0;

		final int CHARACTER_TRIANGLE             = 1;
		final int COUNT_DOWN_TRIANGLE            = 2;
		final int TILL_THE_END_TRIANGLE          = 3;
		final int CONTINUOUS_COUNT_TRIANGLE      = 4;

		final int PASCALS_TRIANGLE               = 5;
		final int SERPINKIS_TRIANGLE             = 6;
		final int PASCALS_PRIME_PATTERN_TRIANGLE = 7;

		switch (selection) {
		
			case CHARACTER_TRIANGLE:
				return new CharacterTriangle();


			case COUNT_DOWN_TRIANGLE:
				return new CountDownTriangle();

			case TILL_THE_END_TRIANGLE:
				return new TillTheEndTriangle();

			case CONTINUOUS_COUNT_TRIANGLE:
				return new ContinuousCountTriangle();

			case PASCALS_TRIANGLE:
				return new PascalsTriangle();

			case SERPINKIS_TRIANGLE:
				return new SierpinskiTriangle();

			case PASCALS_PRIME_PATTERN_TRIANGLE:
				return new PascalsPrimePatternTriangle();

			case EXIT_CODE:
				return null; 

			default:
				System.out.println("Please Enter a valid selection");
		 }
		 return null;
	}

}
