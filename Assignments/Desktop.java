package week3.day2.Assignments;

public class Desktop implements Software, HardWare {
	
	public void desktopModel() {
		System.out.println("class Method");
	}
public void hardwareResources() {

		System.out.println("interface HardWare:"+x);
	}
public void softwareResources() {
	System.out.println("interface Software"+y);

	}
public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.desktopModel();
		desk.hardwareResources();
		desk.softwareResources();

	}

}
