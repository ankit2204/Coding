import java.io.*;
class optimize
{
  public static void main(String args[])throws IOException
  { System.out.println("enter the knapsack capacity");
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    int k=Integer.parseInt(br.readLine());
    System.out.println("enter the no. of items");
    int n=Integer.parseInt(br.readLine());
    System.out.println("enter their value and weights");
    int w[]=new int[n+1];
    int v[]=new int[n+1]; 
    int o[][]=new int[n+1][k+1]; 
      for(int i=1;i<=n;i++)
       {
          w[i]=Integer.parseInt(br.readLine());
          v[i]=Integer.parseInt(br.readLine());
       }
       
       for(int j=1;j<=n;j++)
         {
           for(int m=0;m<=k;m++)
             { o[0][m]=0;
               if(w[j]>m)
               {
                 o[j][m]=o[j-1][m];
               }
               else
               {
                 o[j][m]=max(o[j-1][m],v[j]+o[j-1][m-w[j]]);
               }
              }
          }
       System.out.println(+o[n][k]);
       trace(w,o,n,k);
  }

   public static int max(int x,int y)
    {
      if(x>=y)
       {
         return x;
       }
      else
       {
         return y;
       }
     }

    public static void trace(int w[],int o[][],int n,int k)
   {
     int p=n;
     int q=k;
     int i=n-1;
     int t[]=new int[n];
     while(p>0)
     { 
       if(o[p][q]==o[p-1][q])
         {
           t[i]=0;
           i--;
           p=p-1;
         }
      else
         {
           t[i]=1;
           i--;
           q=q-w[p];
           p=p-1;
         }    
     }
for(int j=0;j<n;j++)
{
System.out.print(+t[j]);
System.out.print(" ");
}
   }
}        