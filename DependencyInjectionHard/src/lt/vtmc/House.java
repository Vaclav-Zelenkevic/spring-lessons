package lt.vtmc;

public class House {
	private Window window;
	
	public House() {}
	
	public House(Window window) {
		//window = new PlasticFrameWindow();
		this.window = window;
	}
	
	public static void main(String[] args) {
		//new House().window.mountWindow();
		Window window = new WoodenFrameWindow();
		new House(window).window.mountWindow();
		
		House otherHouse = new House();
		otherHouse.setWindow(window);
		otherHouse.window.mountWindow();
	}

	public void setWindow(Window window) {
		this.window = window;
	}
}
