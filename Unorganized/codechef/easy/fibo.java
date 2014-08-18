import java.io.*;
class fibodp
{
  public static void main(String args[])throws IOException
    {
      InputStreamReader ir=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(ir);
      int n=Integer.parseInt(br.readLine());
      int fib[]=new int[n];
      for(int i=2;i<n;i++)
      {
        fib[0]=0;
        fib[1]=1;
        fib[i]=fib[i-2]+fib[i-1];
      }
        for(int i=0;i<n;i++)
      {
        System.out.print(+fib[i]);
      }
    }
}
 
        