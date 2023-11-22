package pkg1;

public class Student {
	
	String name;
	int rollNo;
	int age;

	public void display1() { // user defined method
		System.out.println("Welcome to java");
//		System.out.println("Welcome to line 2");
//		System.out.println(a+4);
	}

	public void display3() {
		System.out.println("Automation is easy");
	}

	public static void main(String[] args) { // java defined method
		Student abc = new Student(); // object is used to access class's methods and variables

		abc.display1();
		abc.display3();
		abc.name="Panda";
		abc.rollNo = 1;
		abc.age = 15;
		System.out.println("Name of student is "+abc.name+" and his roll Number is " + abc.rollNo +" and his age is "+abc.age);
//		System.out.println("Age is " + abc.age);
	}

}
