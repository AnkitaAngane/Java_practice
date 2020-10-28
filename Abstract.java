public class Abstract{

	public static void main(String[] args){

	A exm1=new B();
	A exm2=new C();

	System.out.println("COURSE DETAILS : ");
	exm1.setName();
	exm1.setScore();
	System.out.println("COURSE DETAILS : ");
	exm2.setName();
	exm2.setScore();

	}

}

abstract class A{

	abstract void setName();
	abstract void setScore();

}

class B extends A{

	void setName(){
		System.out.println("Course Name : JAVA");
	}

	void setScore(){
		System.out.println("Score : 5");
	}

}

class C extends A{

	void setName(){
                System.out.println("Course Name : PYTHON");
        }

        void setScore(){
                System.out.println("Score : 5");
        }

}
