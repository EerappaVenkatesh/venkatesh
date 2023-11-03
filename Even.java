class User
{
	int num=46;
	public void model1()
	{
		
		if(num%2==0)
		System.out.println(num+" is even");
		else
		System.out.println(num+" is odd");
	}
	public void model2()
	{
		if(num%2==0)
		System.out.println(num+" is even");
		else
		System.out.println(num+" is odd");
	}
}
class Even
{
	public static void main(String args[])
	{
		User obj=new User();
		obj.model1();
		System.out.println("Model 2");
		obj.model2();
	}
}