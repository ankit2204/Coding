class Atm
{
public static void main(String args[])
{
long i=1441440;
while(true)
{
int s=0;
for(int j=1;j*j<=i;j++)
{
if(i%j==0)
{
s=s+2;
}
}
System.out.println(i);
System.out.println(s);
if(s>=290)
{
System.out.print(i);
break;
}
else
{
i++;
} 
}
}
}



    

