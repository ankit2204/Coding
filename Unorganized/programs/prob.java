import java.io.*;
class prob
{
  public static void main(String args[])throws IOException
  { System.out.println("enter no. of test cases");
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    int t=Integer.parseInt(br.readLine());
    double amt=0.000000;
    for(int i=0;i<t;i++)
    {
        double p=Double.parseDouble(br.readLine());
        if(p>(1-p))
        {
            amt=10000*p*(3-2*p);
            System.out.println(amt);
        }
        else
        {
            amt=10000*(1-p)*(1+2*p);
            System.out.println(amt);
        }
    }
     
    }
}