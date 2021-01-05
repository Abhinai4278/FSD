public class TypeCasting {
public static void main(String[] args) {
	

	char c = 'A'; 
	System.out.println("Implicit Type Casting:");
	
	
	
	int i =c;
	System.out.println("Value of i :"+i);
	
	long l = c;
	
	System.out.println("Value of l :" +l);
	
	float f =c;
	
	System.out.println("Value of fl :" +f);
	
	System.out.println("Explicit Type Casting");
	
	double d1 = 4256.7;
	
	int i3 = (int) d1;
	
	float f1 = (float) d1;
	System.out.println("Value of i3: " +i3);
	System.out.println("Value of f1: " +f1);
			
}
}
