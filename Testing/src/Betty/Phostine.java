package Betty;

public class Phostine {
	int rollNo;
	public void display() {
		System.out.println( "welcome to all of you");
	}
	int age;
	public void display1() {
		System.out.println("Automation is very easy");
		

}
	
	public static void main(String[] args) {
		Phostine desk= new Phostine();
		desk.display();
		desk.display();
		desk.rollNo=25;
		desk.age=12;
		System.out.println("the value of the rollNo is" + desk.rollNo);
		System.out.println("the age of the sudent on roll b is" + desk.age);
		
	}

}