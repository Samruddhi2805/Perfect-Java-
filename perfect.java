import java.util.* ;
public class perfect
{
public static void main(String args[])
{
int i,n,s=0;
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number=" );
n=scan.nextInt();

for(i=2;i<=n;i++)
{
if(n%i==0)
{
s=s+i;
}
}
if(s==n)
{
System.out.println("The number is Perfect.");
}
else
{
System.out.println("The number is not Perfect.");
}
}
}