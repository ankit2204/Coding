/* package whatever; // don't place package name! */

import java.math.BigInteger;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			String s[]=br.readLine().split(" ");
			int n=Integer.parseInt(s[0]);
			int a=Integer.parseInt(s[1]);
			int b=Integer.parseInt(s[2]);
			int c=Integer.parseInt(s[3]);
			int d=Integer.parseInt(s[4]);
			BigInteger ab=new BigInteger(String.valueOf(a));
			BigInteger bb=new BigInteger(String.valueOf(b));
			BigInteger cb=new BigInteger(String.valueOf(c));
		    BigInteger db=new BigInteger(String.valueOf(d));
		    BigInteger x=db;
		    BigInteger tpo=BigInteger.valueOf(0);
		    BigInteger tpe=new BigInteger(String.valueOf(d));
		    
		    for(int j=1;j<n;j++)
		    {
		    	BigInteger q=(ab.multiply(x.multiply(x))).add(bb.multiply(x));
		    	BigInteger p=q.add(cb);
		    	x=p;
		    	if(j%2==0)
		    	{
		    		tpe=tpe.add(p);
		    		}
		    		else
		    		{
		    			tpo=tpo.add(p);
		    			}
		    			
		    			}
		    			if(tpe.compareTo(tpo)>0)
		    			{
		    				BigInteger o=tpe.subtract(tpo);
		    				System.out.println(o);
		    				}
		    				else
		    				{
		    					BigInteger r=tpo.subtract(tpe);
		    				    System.out.println(r);
		    				}
		    					
		    					}
		    					
		    					}
}