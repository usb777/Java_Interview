package OOP_exploration;


interface ITest 
{
	default void zen()
	{
		System.out.println("hello world");
	}
}

interface ITest1 
{
	default void zen()
	{
		System.out.println("bab babba");
	}
}

class Test implements ITest,ITest1
{

    

	
	Test()
	{	super();	}

	@Override
	public void zen() {
		// TODO Auto-generated method stub
		ITest.super.zen();
		ITest1.super.zen();
	}

	
}


public class OOP_Test 
{

	
	
	
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		
		t.zen();

	}

}
