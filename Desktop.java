package org.system;

public class Desktop extends Computer {
	void desktopSize()
	{
		System.out.println("SIZE : 32 ");
	}

	public static void main(String[] args) {
		 Desktop desktop = new Desktop();
		 desktop.computerMode();
		 desktop.desktopSize();
	}
}
