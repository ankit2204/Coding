import java.io.*;
class fiboric
{
  public static void main(String args[])throws IOException
    {
      InputStreamReader ir=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(ir);
      int n=Integer.parseInt(br.readLine());
      fiboric obj=new fiboric();
       System.out.println(obj.rec(n));
    }
        public int rec(int n)
          {  
             if(n==0)
             {
               return 0;
             }
             else if(n==1)
             {
               return 1;
             }
             else
             {
               return rec(n-1) + rec(n-2);
             }
          }
}