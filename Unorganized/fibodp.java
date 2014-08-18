import java.io.*;
import java.math.*;
class fibodp
{
  public static void main(String args[])throws IOException
    {
      InputStreamReader ir=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(ir);
      int n=Integer.parseInt(br.readLine());
      BigInteger[] series = new BigInteger[n];
      series[0]=BigInteger.ZERO;
      series[1]=BigInteger.ONE;
      BigInteger x=BigInteger.valueOf(1000000007);
      for(int i=2;i<n;i++)
      {
        series[i]=series[i-2].add(series[i-1]);
        System.out.println(series[i]);
      }
        
       BigInteger m[]=new BigInteger[1000];
       m[0]=BigInteger.valueOf(2);
       for(int j=1;j<=511;j=j+2)
      {
       BigInteger d=BigInteger.valueOf(5);
       
       m[j+1]=(series[j].multiply(d)).subtract(m[j-1]);
       if(m[j+1].compareTo(x)>=0)
       {
         m[j+1]=m[j+1].remainder(x);
           }
       }
      BigInteger c=m[2].multiply(m[4]);
      c=c.remainder(x);
      BigInteger e=m[8].multiply(m[16]);
       e=e.remainder(x);
      BigInteger f=m[32].multiply(m[64]);
        f=f.remainder(x);
      BigInteger g=m[128].multiply(m[256]);
         g=g.remainder(x);
      BigInteger h=g.multiply(f.multiply(e.multiply(c)));
          h=h.remainder(x);
       BigInteger o=h.multiply(m[512]);
          o=o.remainder(x);
      System.out.println(o);
     
}
}
 
        