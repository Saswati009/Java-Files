class sum
{
public static void main(String...s)
{
int n,i,sum=0;
n=Integer.parseInt(s[0]);
while(n!=0)
{
i=n%10;
sum+=i;
n/=10;
}
System.out.println(sum);
}
}
