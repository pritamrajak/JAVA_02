/* Single inheriatance with super */

class Parentclass{
	Parentclass(){
		System.out.println("Constructor of Parent");
	}
	void disp(){
		System.out.println("Parent Method");
	}
}

class Javaexample extends Parentclass{
	Javaexample(){
		System.out.println("Contructor of child ");
	}
	void disp(){
		System.out.println("Child Method");
		super.disp();
	}
	public static void main(String args[]){
		Javaexample obj = new Javaexample();
		obj.disp();
	}
}
