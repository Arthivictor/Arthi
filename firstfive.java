class firstfive
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]=new int[100];
	int d=0;
	for(int i=1;i<=5;i++)
	{
		a[d]=5*i;
		d++;
	}
	for(int j=0;j<d;j++)
	{
		System.out.println(a[j]);
	}
	}
}
