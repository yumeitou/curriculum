package check;

import constants.Constants;

public class Check {
	public static void main(String[] args) { 
		
		System.out.print("printNameメソッド → ");
		printName();
		
		
		Pet pet1 = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		Pet robotpet1 = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);

		pet1.introduce();
		robotpet1.introduce();
		
	}
	
	private static String firstName = "伊藤";
	private static String lastName = "優芽";
	
	private static void printName() {
		System.out.println(firstName + lastName);
	}
}
