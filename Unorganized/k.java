import java.io.*;
import java.math.*;
class fibodp
{
  public static void main(String args[])throws IOException
    {
      InputStreamReader ir=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(ir);
      BigInteger[] series = new BigInteger[513];
      series[0]=BigInteger.ZERO;
      series[1]=BigInteger.ONE;
      for(int i=2;i<=513;i++)
      {
        series[i]=series[i-2].add(series[i-1]);
        System.out.println(series[i]);
      }

}
}