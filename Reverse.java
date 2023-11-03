class User
{
	int num=103,rem=0,rev=0;
  public void Model1()
  {
	for(num=103;num!=0;num/=10)
	{
		rem=num%10;
		rev=rev*10+rem;
	}
	System.out.println(rev);
	System.out.println("rev");
  }
	/*public void Model2(103,0,0)
	{
		rem=num%10;
		rev=rev*10+rem;
	}
	System.out.println(rev);*/
}
 class Reverse
{
	public static void main(String args[])
	{
		User obj=new User();
		obj.Model1();
		//obj.Model2();	
	}
}
