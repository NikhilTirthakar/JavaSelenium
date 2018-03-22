
package OOPS;

public class Overriding {

	public static void main(String[] args)
	{
		/*FirstClass ref = new FirstClass();
		ref.MethodOne();
		ref.MethodTwo();//Overriding
*/
		SecondClass ref1 = new FirstClass();//RuntTime Polymorphisam
		ref1.MethodTwo();
		
	}

}
