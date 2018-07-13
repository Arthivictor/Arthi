class palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
int n=454,m=0,x,y=0,z;
z=n;
while(n>0)
{
x=n%10;
y=(m*10)+x;
n=n/10;
	}
if(z==y)
{
System.out.print("palindrome");
}
else
{
System.out.print("not a palindrome");
}
}
}

