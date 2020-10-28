import java.util.*;
import java.lang.*;

public class Encapsulation_Example{

	public static void main(String[] args){

	Test exm=new Test();
	exm.setName("JAVA");
	exm.setScore(5);

	System.out.println("Course Name : "+exm.getName());
	System.out.println("Score : "+exm.getScore());

	}
}

class Test{

	private String coursename;
	private int score;

	public String getName(){
		return coursename;
	}

	public int getScore(){
		return score;
	}

	public void setName(String name){
		this.coursename=name;
	}

	public void setScore(int marks){
		this.score=marks;
	}

}
