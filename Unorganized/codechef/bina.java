import java.io.*;
class Atm
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
  {int k=0;
   
  int n=Integer.parseInt(br.readLine());
  for(int j=1;j<=n;j++)
    {int l=0;
     int bin[]=new int[12];
     int y=j;
     while(y>0)
     {
       bin[l]=y%2;
       y=y/2;
       l++;
     }
      for(int x=0;x<12;x++)
      {
        if(bin[x]==1)
        {
          k++;
        }
      }
     }
   System.out.println(+k);
  }
}
}