package pack3;



public class PrivateAccSpecifier {
private void display()
{
	System.out.println("Private Method");
	
}
public static void main(String[] args) {
	PrivateAccSpecifier accessSpecifier = new PrivateAccSpecifier();
	accessSpecifier.display();
}
}
