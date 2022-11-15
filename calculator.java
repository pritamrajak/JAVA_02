/*  Method Overloading  */
class calculator{
	int addition(int opt1,int opt2){
		return opt1+opt2;
	}
	int addition(int opt1,int opt2,int opt3){
		return opt1+opt2+opt3;
	}
}

class ctpp{
	public static void main(String args[]){
		calculator obj=new calculator();
		System.out.println("Addition of two number : "+obj.addition(34,23));
		System.out.println("Addition of three number : "+obj.addition(34,23,32));
	}
}
