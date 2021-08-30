package week3day2;

public class desktopModel implements Hardware, software {

	
	public void software1(String name, double versionno) {
		System.out.println("Software Name :" + name + "," + "Version Number :" + versionno);
		
	}

	public void hardware(String name, double modelno) {
		System.out.println("Hardware Name :" + name + "," + "Version Number :" + modelno);
		
	}
	public static void main(String[] args) {
		desktopModel dm = new desktopModel();
		dm.software1("Java", 16.0);
		dm.hardware("Monitor", 12.2);

	}


}
