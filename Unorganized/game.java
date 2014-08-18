import java.io.*;
import java.lang.Math;
class Game
{
public static void main(String args[])throws IOException
{long s=1;
for(int i=0;i<170;i++)
{
if(s>1000000009)
{
s=s%1000000009;
}
s=s*830;
}
long t=s%1000000009;
System.out.println(+t);
}
}
 
