import java.io.*;
class Prob
{
public static void main(String args[])throws IOException
{
int k=0,temp=0,p;
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int n=Integer.parseInt(br.readLine());
int w[]=new int[n];
for(int i=0;i<n;i++)
{
  String s[]=br.readLine().split(" ");
  int x=Integer.parseInt(s[0]);
  if(x==1)
  {
    int y=Integer.parseInt(s[1]);
    w[k]=y;
    p=k;
    while(p>0)
    {
      if(w[p]>w[p-1])
      {
        temp=w[p];
        w[p]=w[p-1];
        w[p-1]=temp;
        p=p-1;
      }
    }
  k++;
  System.out.println(k);
  }
  else
  { 
    int z=k/3;
    if(z==0)
    {
      System.out.println("No reviews yet");
    }
    else
    {
      System.out.println(+w[z-1]);
    }
  }
}
}
}