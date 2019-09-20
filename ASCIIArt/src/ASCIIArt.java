/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	// Big Baller always make big moves!
	public static void firstrow() {
		System.out.println("--------------------------------------------------");
		System.out.println("|\"                                              \"|");
		System.out.println("|                                                |");
		System.out.println("|                                                |");
		System.out.println("|                                                |");
		System.out.println("|                                                |");
		System.out.println("|              |------------------|              |");
		System.out.println("|              |                  |              |");
		System.out.println("|              |                  |              |");
		System.out.println("|              |                  |              |");
		System.out.println("|              |                  |              |");
		System.out.println("|              |                  |              |");
		System.out.println("|--------------|------------------|--------------|");
		
	}
	public static void rim() {
		System.out.println("|--------------####################--------------|");
		System.out.println("               ####################               ");
		System.out.println("                ##################                ");
		System.out.println("                 ################                 ");
		System.out.println("                  ##############                  ");
		System.out.println("                   ############                   ");
		System.out.println("                   ############                   ");
	}
	public static void pole() {
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
		System.out.println("                      |   |                       ");
	}
	public static void base() {
		System.out.println("              *********************               ");
		System.out.println("              *********************               ");
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");

	}
	public static void main (String [] args) {
		firstrow();
		rim();
		pole();
		base();
		System.out.println("Ball is life!");
	}
}