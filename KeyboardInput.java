//Nick Menendez

package Main;

import java.util.Scanner;

public class KeyboardInput{
	//Fields
	private Scanner keyb;
	private String input;
	
	
	//Constructor
	KeyboardInput(){
		keyb = new Scanner(System.in);
		input = "";
	}
	
	//Methods
	public void prompt(String s){
		System.out.print(s);
	}
	public void retrieveText(){
		input = keyb.nextLine();
	}
	public void done(){
		keyb.close();
	}
	public String getInput(){
		return input;
	}
	
}
