import java.io.*;
import java.lang.*;
class Code
{
public static void main(String args[])throws IOException
{
int c=0,i=0;
int n=0;
int a[]=new int[90000];
String file = "C:/Users/Ankit/Desktop/12.txt";
try {
BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
String line;
while ((line = br.readLine()) != null)
{
int t=Integer.parseInt(line);
a[n]=t;
n++;
}
br.close();
}
catch (IOException e) {
    System.out.println("ERROR: unable to read file " + file);
    e.printStackTrace();   
}
      double fib[]=new double[n/2];
      for(i=2;i<n/2;i++)
      {
        fib[0]=0;
        fib[1]=1;
        fib[i]=fib[i-2]+fib[i-1];
        System.out.println(+fib[i]);
        for(int j=0;j<n;j++)
          {
              if(fib[i]==a[j])
                c++;
           }
 
      }
        System.out.print(c);
    }
}




            
