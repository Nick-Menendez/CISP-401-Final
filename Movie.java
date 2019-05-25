//Nick Menendez

package Main;

public class Movie{
	//Fields
	private String title;
	private String actor1;
	private String actor2;
	private int year;
	private int runtime;
	private String director;
	
	//Constructor
	public Movie(String title, String a1, String a2, int year, int time, String director){
		this.title = title;
		actor1 = a1;
		actor2 = a2;
		this.year = year;
		runtime = time;
		this.director = director;
	}
	
	//get methods
	public String getTitle(){
		return title;
	}
	public String getActor1(){
		return actor1;
	}
	public String getActor2(){
		return actor2;
	}
	public int getYear(){
		return year;
	}
	public int getRuntime(){
		return runtime;
	}
	public String getDirector(){
		return director;
	}
}
