import java.io.*;
class insertion
{
public static void main(String[] args)throws IOException
{int j=0,temp=0;
int a[]=new int[10];
System.out.println("Enter the array to be sorted");
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
for(int i=0;i<6;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
for(int i=1;i<6;i++)
{
   j=i-1;
   temp=a[i];
   while(j>=0 && a[j]>temp)
  {
    a[j+1]=a[j];
    a[j]=temp;
    j=j-1;
  }
}
for(int i=0;i<6;i++)
{
System.out.println(+a[i]);
}
}
}

