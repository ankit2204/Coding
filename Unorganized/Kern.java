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
  System.out.println("Enter the value of assumed overall heat transfer coefficient : ");
  double Ua=Double.parseDouble(br.readLine());
  double q=(Fh*cph*1000*(T1-T2))/3600;
  System.out.println("duty is :"+q); 
  
//Calculating mean temperature difference and heat transfer area required
  
  double T=(T1-T4)/(T2-T3);
  double Td=Math.log(T);
  double Tm=((T1-T4)-(T2-T3))/Td;
  System.out.println("LMTD "+Tm);
  double r=(T1-T2)/(T4-T3);
  double s=(T4-T3)/(T1-T3);
  System.out.println("enter the no.of passes : ");
  int p=Integer.parseInt(br.readLine());
  System.out.println("enter the value of Ft for R and S= "+r+" "+s);
  double Ft=Double.parseDouble(br.readLine());
  double Tmf=Tm*Ft;
  double A=q/(Ua*Tmf);
  System.out.println("Area :"+A);
  
//Tube details
  
  System.out.println("enter the outer dia of tube in meters : ");
  double odt=Double.parseDouble(br.readLine());
  System.out.println("enter the inner dia of tube in meters : ");
  double idt=Double.parseDouble(br.readLine());
  System.out.println("enter the length of tubes : ");
  double l=Double.parseDouble(br.readLine());
  System.out.println("enter the thermal conductivity of tubes : ");
  double kt=Double.parseDouble(br.readLine());

//Calculating number of tubes required  
  
  double ntd=(A/(3.148*l*odt));
  int nt=(int)ntd;
  nt=nt+1;
  if(nt%2!=0)
  {
    nt=nt+1;
  }
  System.out.println("tube no :"+nt);

//Fluid allocation
  
  System.out.println("which fluid do you want on tube side input 1 for hot and 2 for cold : ");
  int select=Integer.parseInt(br.readLine());
  
//If hot fluid is allocated to tube side  

  if(select==1)
  {

//Calculating tube side velocity
    
  vt=(p*Fh*4/(3600*ph*3.148*idt*idt*nt));

//Calculating shell diameter
    
    if(p==2)
    {
      double co=(nt/0.249);
      db=odt*Math.pow(co,2.207);
    }
    else if(p==4)
    {
      double co=(nt/0.175);
      db=odt*Math.pow(co,2.285);
    }
    System.out.println("enter the clearance for bundle dia ="+db);
    double cl=Double.parseDouble(br.readLine());
    ds=db+cl;

//Calculating tube side heat transfer coefficient

    Re=(ph*vt*idt)/uh;
    Pr=(cph*1000*uh)/kh;
    System.out.println("enter the value of jh for Re and L/di ="+Re);
    double jht=Double.parseDouble(br.readLine());
    hi=(jht*Re*Math.pow(Pr,0.33)*kh)/(idt);

//Calculating shell side pressure drop

    as=((0.25/1.25)*ds*ds/5);
    de=1.10*((1.25*1.25*odt*odt)-(0.917*odt*odt))/odt;
    vs=Fc/(3600*pc*as);
    Res=(pc*vs*de)/uc;
    Prs=(cpc*uc*1000)/kc;
    System.out.println("enter the value of jh for shell side for Re and L/di ="+Res);
    double jhs=Double.parseDouble(br.readLine());
    hs=(kc/de)*jhs*Res*Math.pow(Prs,0.33);

//Calculating overall heat transfer coefficient

    double a1=(1/hi)+rh;
    double a2=Math.log(odt/idt);
    double a3=(1/hs)+rc;
    ho=(a1*odt/idt)+((odt*a2)/kt)+a3;
    hov=1/ho;
    System.out.println("tube side htc :"+hi);
    System.out.println("shell side htc :"+hs);
    System.out.println("Overall htc :"+hov);

//Calculating tube side pressure drop
  
  System.out.println("enter the value of jf for tube side for Re= "+Re);
  double jft=Double.parseDouble(br.readLine());
  pdt=p*(8*jft*(l/idt)+2.5)*vt*vt*ph/200000;
  System.out.println(" tube side pressure drop in bars :"+pdt);
  
//Calculating shell side pressure drop

    System.out.println("enter the value of jf for shell side for Re= "+Re);
    double jfs=Double.parseDouble(br.readLine());
    pds=4*jfs*(ds/de)*(5l/ds)*vs*vs*pc;
    System.out.println("pressure drop is :"+pds);
  
  }

//If cold fluid is allocated to tube side

else if(select==2)
{

//Calculating tube side velocity
  
  vt=(p*Fc*4/(3600*pc*3.148*idt*idt*nt));
  System.out.println("tube side velocity "+vt);
  
//Calculating shell side diameter
  
  if(p==2)
  {
    double co=(nt/0.249);
    db=odt*Math.pow(co,1/2.207);
  }
  else if(p==4)
  {
    double co=(nt/0.175);
    db=odt*Math.pow(co,1/2.285);
  }
  System.out.println("enter the clearance for bundle dia ="+db);
  double cl=Double.parseDouble(br.readLine());
  ds=db+cl;

//Calculating tube side heat transfer coefficient
  
  Re=(pc*vt*idt)/uc;
  Pr=(cpc*1000*uc)/kc;
  System.out.println("enter the value of jh for Re and L/di ="+Re);
  double jht=Double.parseDouble(br.readLine());
  hi=(jht*Re*Math.pow(Pr,0.33)*kc)/(idt);

//Calculating shell side heat transfer coefficient using kerns method
  
  as=((0.25/1.25)*ds*ds/5);
  System.out.println("As "+as);
  de=1.10*((1.25*1.25*odt*odt)-(0.917*odt*odt))/odt;
  System.out.println("De "+de);
  vs=Fh/(3600*ph*as);
  System.out.println("shell side velocity "+vs);
  Res=(ph*vs*de)/uh;
  Prs=(cph*1000*uh)/kh;
  System.out.println("enter the value of jh for shell side for Re and L/di ="+Res);
  double jhs=Double.parseDouble(br.readLine());
  hs=(kh/de)*jhs*Res*Math.pow(Prs,0.33);
  double a1=(1/hi)+rc;
  double a2=Math.log(odt/idt);
  double a3=(1/hs)+rh;

//Calculating overall heat transfer coefficient
  
  ho=(a1*odt/idt)+((odt*a2)/kt)+a3;
  hov=1/ho;
  System.out.println("tube side htc :"+hi);
  System.out.println("shell side htc :"+hs);
  System.out.println("Overall htc :"+hov);

//Calculating tube side pressure drop
  
  System.out.println("enter the value of jf for tube side for Re= "+Re);
  double jft=Double.parseDouble(br.readLine());
  pdt=p*(8*jft*(l/idt)+2.5)*vt*vt*pc/200000;
  System.out.println(" tube side pressure drop in bars :"+pdt);
  
//Calculating shell side pressure drop
  
  System.out.println("enter the value of jf for shell side for Re= "+Res);
  double jfs=Double.parseDouble(br.readLine());
  pds=4*jfs*(ds/de)*(5*l/ds)*vs*vs*ph/100000;
  System.out.println(" shell side pressure drop in bars :"+pds);
  
}
}
}

