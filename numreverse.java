class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=346;
		int reverse=0;
		while(n!=0)
		{
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		System.out.println(reverse);
	}
}
