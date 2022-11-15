/* Method overriding */

class human{
	public void eat(){
		System.out.println("Human is eating");
	}
}
class boy extends human{
	public void eat(){
		System.out.println("Boy is eating");
	}
	public static void main(String args[]){
		boy obj=new boy();
		obj.eat();
	}
}
