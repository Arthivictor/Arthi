class armnstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=127;
int n;
n=a;
int b;
int count=0;
int sum=0;
while(a>0)
{
a=a/10;
count++;
	}
while(a>0)
{
b=a%10;
sum=(int)(sum+Math.pow(b,count));
n=n/10;
}
if(sum==n)
{
System.out.print("armnstrong number");
}
else
{
System.out.print("not an armnstrong number");
}
}
}
