import java.io.*;
class Test
{static int a=0;
static int check=0;
public static void main(String args[])throws IOException
{int cla=0;
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
System.out.println("enter the number of friends");
int n=Integer.parseInt(br.readLine());
int arr=n;
String name[]=new String[n];
int budget[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("enter the initials and budget of"+i+"person");
name[i]=br.readLine();
budget[i]=Integer.parseInt(br.readLine());
}
System.out.println("enter the trip location");
String location=br.readLine();
System.out.println("enter the distance of trip location in km");
int dist=Integer.parseInt(br.readLine());
Test t=new Test();
Test.calc(n,dist,arr,budget,name);
}


public static void calc(int k,int dist,int arr,int budget[],String name[])
{
double van_cost=0;
if(k<=10)
{
van_cost=1000+(1.50*dist);
}
else
{
van_cost=2000+(3*dist);
}
double trvl_share=van_cost/k;
double tot_share=trvl_share+800;
for(int i=0;i<k;i++)
{
double net=0.8*budget[i];
if(net>=tot_share)
{
a++;
}
}
int len=a+1;
if(check==len)
{
output(len,tot_share,arr,budget,name);
}
else
{
check=len;
k=len;
calc(k,dist,arr,budget,name);
}
}

public static void output(int f,double total,int arr,int budget[],String name[])
{
int g=f-1;
System.out.println("no.of persons going on the trip "+g);
System.out.println("The persons going for trip are..:");
  for(int i=0;i<arr;i++)
  {
  double net_bud=0.8*budget[i];
    if(net_bud>=total)
    {

      System.out.println(name[i]);
      System.out.println("their individual expenditure on lodging and travelling is:"+total); 
    }
  }
System.out.println("The persons not going for trip are..:");
  for(int i=0;i<arr;i++)
   {
     double net_budg=0.8*budget[i];
     if(net_budg<total)
     { 
       double shortage=total-net_budg;
       System.out.println(name[i]);
       System.out.println("his budget falling short of:"+shortage);
     }
   }

}
}