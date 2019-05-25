//Nick Menendez

package Main;

import java.io.*;

public class Output{
	//Fields;
	private PrintWriter out;
	private String fileName;
	private boolean isAppend;
	
	//Constructor
	Output(){
		fileName = "db.txt";
		isAppend = false;
	}
	
	//Methods
	public void openSaveFile(){
		try{
			out = new PrintWriter(new FileWriter(fileName, isAppend));
		} catch(IOException ioe){
			System.out.println("Error opening file!");
			System.exit(0);
		}
	}
	public PrintWriter getOut(){
		return out;
	}
	public void printToFile(String s){
		out.println(s);
	}
	//Write one movie to the save file
	public void saveMovie(Movie movie){
		out.println(movie.getTitle() + "*" + movie.getActor1() + "*" + movie.getActor2() + "*" + Integer.toString(movie.getYear()) + "*" + Integer.toString(movie.getRuntime()) + "*" + movie.getDirector());
	}
	//Save the entire database to the file
	public void saveDatabase(Database movies){
		openSaveFile();
		for (int i = 0; i < movies.getDatabase().size(); i++)
			saveMovie(movies.getElement(i));
		System.out.println("The movie database has been saved.  Goodbye!");
		getOut().close();
	}
}
