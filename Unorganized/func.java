import java.io.*;
import java.lang.Math;
class Kern
{
public static void main(String args[])throws IOException
{
  double vt,db=0,ds,Re,Pr,hi=0,ho,hs=0,vs,as,de,Res,Prs,pds=0,pdt=0,hov=0;
  InputStreamReader ir=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(ir);

  //Input of details of hot fluid and cold fluid
  
  System.out.println("Enter the flow rate of hot fluid in kg/h : ");
  double Fh=Double.parseDouble(br.readLine());
  System.out.println("Enter the flow rate of cold fluid kg /h : ");
  double Fc=Double.parseDouble(br.readLine());
  System.out.println("Enter the inlet temperature of hot fluid : ");
  double T1=Double.parseDouble(br.readLine());
  System.out.println("Enter the outlet temperature of hot fluid: ");
  double T2=Double.parseDouble(br.readLine());
  System.out.println("Enter the inlet temperature of cold fluid : ");
  double T3=Double.parseDouble(br.readLine());
  System.out.println("Enter the outlet temperature of cold fluid: ");
  double T4=Double.parseDouble(br.readLine());
  System.out.println("Enter heat capacity of hot fluid at average temperature in kJ/kgC: ");
  double cph=Double.parseDouble(br.readLine());
  System.out.println("Enter heat capacity of cold fluid at average temperature in kJ/kgC: ");
  double cpc=Double.parseDouble(br.readLine());
  System.out.println("Enter density of hot fluid at average temperature in kg/m3: ");
  double ph=Double.parseDouble(br.readLine());
  System.out.println("Enter density of cold fluid at average temperature in kg/m3: ");
  double pc=Double.parseDouble(br.readLine());
  System.out.println("Enter viscosity of hot fluid at average temperature Ns/m2: ");
  double uh=Double.parseDouble(br.readLine());
  System.out.println("Enter viscosity of cold fluid at average temperature Ns/m2: ");
  double uc=Double.parseDouble(br.readLine());
  System.out.println("Enter thermal conductivity of hot fluid at average temperature: ");
  double kh=Double.parseDouble(br.readLine());
  System.out.println("Enter thermal conductivity of cold fluid at average temperature: ");
  double kc=Double.parseDouble(br.readLine());
  System.out.println("Enter fouling factor of hot fluid: ");
  double rh=Double.parseDouble(br.readLine());
  System.out.println("Enter fouling factor of cold fluid: ");
  double rc=Double.parseDouble(br.readLine());
  System.out.println("Enter limiting tube side pressure drop in bars: ");
  double tpd=Double.parseDouble(br.readLine());
  System.out.println("Enter limiting shell side pressure drop in bars: ");
  double spd=Double.parseDouble(br.readLine());
  

//Tube details
  
  System.out.println("enter the outer dia of tube in meters : ");
  double odt=Double.parseDouble(br.readLine());
  System.out.println("enter the inner dia of tube in meters : ");
  double idt=Double.parseDouble(br.readLine());
  System.out.println("enter the length of tubes : ");
  double l=Double.parseDouble(br.readLine());
  System.out.println("enter the thermal conductivity of tubes : ");
  double k=Double.parseDouble(br.readLine());
  double q=(Fh*cph*1000*(T1-T2))/3600;
  System.out.println("duty is :"+q); 
  
//Calculating mean temperature difference and heat transfer area required
  
  double T=(T1-T4)/(T2-T3);
  double Td=Math.log(T);
  double Tm=((T1-T4)-(T2-T3))/Td;
  System.out.println("LMTD "+Tm);
  double r=(T1-T2)/(T4-T3);
  double s=(T4-T3)/(T1-T3);
  Kern obj=new Kern();
  Kern.heat(Fh,Fc,cph,cpc,ph,pc,uh,uc,kh,kc,rh,rc,q,Tm,r,s,odt,idt,l,k,tpd,spd);
 }

//Function for calculation of htc,pressure drops:
public static void heat(double Fh,double Fc,double cph,double cpc,double ph,double pc,double uh,double uc,double kh,double kc,double rh,double rc,double q,double Tm,double r,double s,double odt,double idt,double l,double k,double tpd,double spd)throws IOException

{ 
  InputStreamReader ir=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(ir);
  double vt,db=0,ds,Re,Pr,hi=0,ho,hs=0,vs,as,de=0,Res,Prs,pds=0,pdt=0,hov=0;
  double ft=0,fs=0,cpt=0,cps=0,pt=0,ps=0,ut=0,us=0,kt=0,ks=0,rt=0,rs=0;
  double pa=l/idt;
  
  System.out.println("enter the no.of passes : ");
  int p=Integer.parseInt(br.readLine());
  System.out.println("press 3 if triangular pitch and press 4 if square pitch is to be used : ");
  int pi=Integer.parseInt(br.readLine());
  System.out.println("enter the value of Ft for R and S= "+r+" "+s);
  double Ft=Double.parseDouble(br.readLine());
  double Tmf=Tm*Ft;
  System.out.println("Enter the value of assumed overall heat transfer coefficient : ");
  double Ua=Double.parseDouble(br.readLine());
  double A=q/(Ua*Tmf);
  System.out.println("Area :"+A);

  
//Calculating number of tubes required  
  
  double ntd=(A/(3.148*l*odt));
  int nt=(int)ntd;
  nt=nt+1;
  if(p==2)
  {
  if(nt%2!=0)
  {
    nt=nt+1;
  }
  }
  else if(p==4)
  {
     if(nt%4!=0)
  {
    if(nt%2==0)
  {nt=nt+2;
  }
   else if((nt+1)%4==0)
     {nt=nt+1;
     }
   else
     {nt=nt+3;
     }}
   }
System.out.println("tube no :"+nt);

//Fluid allocation
  
  System.out.println("which fluid do you want on tube side input 1 for hot and 2 for cold : ");
  int select=Integer.parseInt(br.readLine());
  
//If hot fluid is allocated to tube side  

  if(select==1)
  {
     ft=Fh;
     pt=ph;
     ut=uh;
     kt=kh; 
     cpt=cph;
     fs=Fc;
     ps=pc;
     us=uc;
     ks=kc; 
     cps=cpc;
     rt=rh;
     rs=rc;
  }
 
else if(select==2)
{
     ft=Fc;
     pt=pc;
     ut=uc;
     kt=kc; 
     cpt=cpc;
     fs=Fh;
     ps=ph;
     us=uh;
     ks=kh; 
     cps=cph;
     rt=rc;
     rs=rh;
}

//Calculating tube side velocity
    
  vt=(p*ft*4/(3600*pt*3.148*idt*idt*nt));

//Calculating shell diameter
    
    if(pi==3)
    {
    if(p==2)
    {
      double co=(nt/0.249);
      db=odt*Math.pow(co,1/2.207);
    }
    else if(p==4)
    {
      double co=(nt/0.175);
      db=odt*Math.pow(co,1/2.285);
    }}
    else if(pi==4)
    {if(p==2)
    {
      double co=(nt/0.156);
      db=odt*Math.pow(co,1/2.291);
    }
    else if(p==4)
    {
      double co=(nt/0.158);
      db=odt*Math.pow(co,1/2.263);
    }}
    System.out.println("enter the clearance for bundle dia ="+db);
    double cl=Double.parseDouble(br.readLine());
    ds=db+cl;

//Calculating tube side heat transfer coefficient

    Re=(pt*vt*idt)/ut;
    Pr=(cpt*1000*ut)/kt;
    System.out.println("enter the value of jh for Re and L/di ="+Re+" "+pa);
    double jht=Double.parseDouble(br.readLine());
    hi=(jht*Re*Math.pow(Pr,0.33)*kt)/(idt);

//Calculating shell side heat transfer coefficient

    as=((0.25/1.25)*ds*ds/5);
    if(pi==3)
    {de=1.10*((1.25*1.25*odt*odt)-(0.917*odt*odt))/odt;
    }
    else if(pi==4)
    {de=1.27*((1.25*1.25*odt*odt)-(0.785*odt*odt))/odt;
    } 
    vs=fs/(3600*ps*as);
    Res=(ps*vs*de)/us;
    Prs=(cps*us*1000)/ks;
    System.out.println("enter the value of jh for shell side for Re and L/di ="+Res+" "+pa);
    double jhs=Double.parseDouble(br.readLine());
    hs=(ks/de)*jhs*Res*Math.pow(Prs,0.33);

//Calculating overall heat transfer coefficient

    double a1=(1/hi)+rt;
    double a2=Math.log(odt/idt);
    double a3=(1/hs)+rs;
    ho=(a1*odt/idt)+((odt*a2)/k)+a3;
    hov=1/ho;
    System.out.println("tube side htc :"+hi);
    System.out.println("shell side htc :"+hs);
    System.out.println("Overall htc :"+hov);
    if(hov<0.7*Ua || hov>1.3*Ua)
    {
      System.out.println("Calculated heat transfer coefficient is not in range with U assumed so to assume a new value press 1 or to continue press 2");
      int ch=Integer.parseInt(br.readLine());
      if(ch==1)
      {
        heat(Fh,Fc,cph,cpc,ph,pc,uh,uc,kh,kc,rh,rc,q,Tm,r,s,odt,idt,l,k,tpd,spd);
      }
      else if(ch==2)
     {
       System.out.println("Overall htc :"+hov);
     }
   }
   else
     {
       System.out.println("Overall htc :"+hov);
     }  
  
//Calculating tube side pressure drop

  System.out.println("enter the value of jf for tube side for Re= "+Re);
  double jft=Double.parseDouble(br.readLine());
  pdt=p*(8*jft*(l/idt)+2.5)*vt*vt*pt/200000;
  System.out.println(" tube side pressure drop in bars :"+pdt);
  
  if(pdt>tpd)
    {
      System.out.println("pressure drop for tube side exceeds the limit,so press 1 to recalculate with changes and 2 to continue with the design");
      int chp=Integer.parseInt(br.readLine());
      if(chp==1)
      {
        heat(Fh,Fc,cph,cpc,ph,pc,uh,uc,kh,kc,rh,rc,q,Tm,r,s,odt,idt,l,k,tpd,spd);
      }
      else if(chp==2)
      {
       System.out.println("tube side pressure drop is :"+pdt);
      }
   }
   else
     {
      System.out.println("tube side pressure drop is :"+pdt);
     }
  
//Calculating shell side pressure drop

    System.out.println("enter the value of jf for shell side for Re= "+Res);
    double jfs=Double.parseDouble(br.readLine());
    pds=4*jfs*(ds/de)*(5*l/ds)*vs*vs*ps/100000;
    System.out.println("pressure drop is :"+pds); 
     
    if(pds>spd)
    {
      System.out.println("pressure drop for shell side exceeds the limit,so press 1 to recalculate with changes and 2 to continue with the design");
      int chp=Integer.parseInt(br.readLine());
      if(chp==1)
      {
      heat(Fh,Fc,cph,cpc,ph,pc,uh,uc,kh,kc,rh,rc,q,Tm,r,s,odt,idt,l,k,tpd,spd);
      }
     else if(chp==2)
     {
       System.out.println("shell side pressure drop is :"+pds);
     }
   }
   else
     {
      System.out.println("shell side pressure drop is :"+pds);
      return;
     }  
  }
}



