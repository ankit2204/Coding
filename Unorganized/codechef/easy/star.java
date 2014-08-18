import java.io.*;
class star
{
public static void main(String args[])throws IOException
{

for(int i=5;i>0;i--)
{
   for(int j=1;j<i;j++)
   {
     System.out.print(" ");
   }
    
  for(int k=i;k<5;k++)
   {
     System.out.print("*");
   }
  for(int p=i;p<=5;p++)
  {
     System.out.print("*");
  }
   System.out.println(); 
}
for(int x=4;x>0;x--)
{
   for(int y=x;y<=4;y++)
   {
     System.out.print(" ");
   }
    
  for(int z=1;z<x;z++)
   {
     System.out.print("*");
   }
  for(int q=0;q<x;q++)
  {
     System.out.print("*");
  }
   System.out.println(); 
}


}
}