
public class MethodOverloadingDemo {
	private void area(int length, int width) {
		System.out.println("�rea of Rectangle: " +(length*width));
	}
	
public void area(int radius) {
	System.out.println("�rea of Circle: " +(Math.PI*radius*radius));
}
	public static void main(String[] args) {
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		demo.area(30,40);
		demo.area(20);

	}

}
