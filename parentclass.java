/* Single Inheritance */

class parentclass{
	parentclass(){
		System.out.println("Constructor of parent");
	}
}
class javaexample extends parentclass{
	javaexample(){	
		System.out.println("Constructor of Child");
	}
	public static void main(String args[]){
		new javaexample();
	}
}
