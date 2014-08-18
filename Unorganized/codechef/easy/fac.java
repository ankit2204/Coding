      import java.io.*;
import java.number.*;

    class fact
    {
    public static void main(String args[])throws IOException
    {
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    int n=Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++)
    {long long int fac=1;
    int t=Integer.parseInt(br.readLine());
    for(int j=1;j<=t;j++)
    {
    fac=fac*j;
    }
    System.out.println(fac);
    }
    }
    } 