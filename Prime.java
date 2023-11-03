class User
{
	int start=1,end=100,num,count=0;
	public void model1()
	{
		for(start=1;start<=end;start++)
		{
			count=0;
			for(num=2;num<start;num++)
			{
				if(start%num==0)
				{
					count++;
					break;
				}
			
				
			}
			
		}
		if(count==0&&start!=1)
			System.out.println(start);
	}
	
}
class Prime
{
	public static void main(String args[])
	{
		User obj=new User();
		obj.model1();	
	}
}