package temp;

/*
 * $ java ArgsEx 10 20 30
 * 세 수의 합 : 60
 * 
 * 
 */
public class ArgsEx {
	public static void main(String[] args) {
	
	//	System.out.println(args);
	int a, b, c;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	c=Integer.parseInt(args[2]);
	
	System.out.println("세 수의 합 : "+(a+b+c));
	}
}
