import java.io.*;
import java.util.*;
class C_lan
{
 void cquiz()
  {
   int n=2,r=0,r1=0,w=0;
   String a[]={"What is the 16-bit compiler allowable range for integer constants?\n1.-3.4e38 to 3.4e38\t2.-32767 to 32768\t3.-32668 to 32667\t4.-32768 to 32767\n","What is required in each C program?\n1.The program must have at least one function.\t2.The program does not require any function.\t3.Input data\t4.Output data"};
   int b[]=new int[20];
   int c[]={4,1};
   String d[]={" In a 16-bit C compiler, we have 2 bytes to store the value.\nThe range for signed integers is -32768 to 32767.\nThe range for unsigned integers is 0 to 65535.\nThe range for unsigned character is 0 to 255."};
   Scanner s=new Scanner(System.in);
   for(int i=0;i<n;i++)
   {
     int s1=i+1;
     System.out.println("Question-"+s1+":"+a[i]);
     b[i]=s.nextInt();
     if(b[i]==c[i])
      {
         r=r+4;
         r1=r1+1;
      }
     else
       {
         r=r-1;
         w=w+1;
       }
   }
       System.out.println("correct:"+r1);
       System.out.println("wrong:"+w);
       System.out.println("result:"+r+" out of "+n*4);
       if(r<=0)
       {
          if(r<=0)
           {
              System.out.println("your are failed");
           }
           else
           {
              int t;
              t=((r*100)/(n*4));
              System.out.println("your percentage: "+t);
           }
             
       }
  
}
}
class Python
{
 void pquiz()
 {
   int  n=2,r=0,r1=0,w=0;
   String a[]={"1) What is the maximum possible length of an identifier?\n1.16\t2.32\t3.64\t4.None of these above\n","2) Who developed the Python language?\n1.Zim Den\t2.Guido van Rossum\t3.Niene Stom\t4..Wick van Rossum\n"};
   int b[]=new int[20];
   int c[]={4,2};
   String d[]={};
   Scanner s=new Scanner(System.in);
   for(int i=0;i<n;i++)
   {
     int s1=i+1;
     System.out.println("Question-"+s1+":"+a[i]);
     b[i]=s.nextInt();
     if(b[i]==c[i])
        {
          r=r+4;
          r1=r1+1;
        }
       else
       {
         r=r-1;
         w=w+1;
       }
    }
      
       System.out.println("correct:"+r1);
       System.out.println("wrong:"+w);
       System.out.println("result:"+r+" out of "+n*4);
       if(r<=0)
           {
              System.out.println("your are failed");
           }
           else
           {
              int t;
              t=((r*100)/(n*4));
              System.out.println("your percentage: "+t);
           }
  
  }
}
class Java
{
 void jquiz()
 {
  int  n=1,r=0,r1=0,w=0;
  String a[]={"Which of the following option leads to the portability and security of Java?\n1.Bytecode is executed by JVM\t2.The applet makes the Java code secure and portable\t3.Use of exception handling\t4.Dynamic binding between objects\n"};
  int b[]=new int[20];
  int c[]={1};
  String d[]={};
  Scanner s=new Scanner(System.in);
   for(int i=0;i<n;i++)
   {
     System.out.println("Question-"+i+":"+a[i]);
     b[i]=s.nextInt();
     if(b[i]==c[i])
      {
         r=r+4;
         r1=r1+1;
      }
     else
       {
         r=r-1;
         w=w+1;
       }
       System.out.println("correct:"+r1);
       System.out.println("wrong:"+w);
       System.out.println("result:"+r+" out of "+n*4);
       if(r<=0)
       {
          
          if(r<=0)
           {
              System.out.println("your are failed");
           }
           else
           {
              int t;
              t=((r*100)/(n*4));
              System.out.println("your percentage: "+t);
           }
             
       }
  }
}
}
class Quiz
{
  public static void main(String args[])
   {
     String r;
     int n2=3;
     String b[]={"21481a05a0","21481a0588","21481a05b7"};
     int n;
     Scanner s=new Scanner(System.in);
     System.out.println("enter your id:");
     r=s.next();
     for(int i=0;i<n2;i++)
     {
       if(r.equals(b[i]))
        {
          System.out.println("enter your choice in following option:\n1.C language\t2.Python\t3.Java:");
          n=s.nextInt();
          switch(n)
          {
             case 1:C_lan c=new C_lan();
                    c.cquiz();
                    break;
             case 2:Python p=new Python();
                    p.pquiz();
                    break;
             case 3:Java j=new Java();
                    j.jquiz();
                    break;
             default:System.out.println("enter correct option");
          }break;
        }
      else
       {
          if(i==n2)
          {
             System.out.println("your not eligible");
             break;
          }
       }

     }
       
  }
}
