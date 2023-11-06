class User
{
	int num=101,rev=0,rem=0;
  public void Model1()
  {
	for(num=103;num!=0;num/=10)
	{
		rem=num%10;
		rev=rev*10+rem;
	}
	System.out.println(rev);
  }
}
 class Reverse
{
	public static void main(String args[])
	{
		User obj=new User();
		obj.Model1();	
	}
}
