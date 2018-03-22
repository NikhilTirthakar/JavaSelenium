package OOPS;

public class FirstClass extends SecondClass//inheritance
{
	public void MethodOne()
	{
		System.out.println("This is my FirstClass");
	}

	@Override
	public void MethodTwo()
	{
		System.out.println("This is my NewSecondClass");
	}

}
