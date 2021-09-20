package org.system;

public class Desktop extends Computer{

	float screenSize = 18.5f;
	public void desktopSize()
	{
		System.out.println("The Screen size of the desktop :"+screenSize);
	}
	public static void main(String[] args) {
		Desktop scSize = new Desktop();
		scSize.desktopSize();
		scSize.ComputerModel();
		
	}

}
