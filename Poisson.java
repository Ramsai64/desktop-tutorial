import java.io.*;
import java.util.*;
import java.lang.*;
class Poisson
{
  public static void main(String args[])
   {
      double l;
      int n,r;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the lambda:");
      l=s.nextDouble();
      System.out.println("enter the random variable:");
      n=s.nextInt();
      System.out.println("enter your choice:1.single value\t2.greater than value\t3.less than value\t4.greater than or equal to value\t5.less than or equal to value\t:");
      r=s.nextInt();
      switch(r)
      {
          case 1:double c=Math.pow(2.718218,-l);
                 double d=Math.pow(l,n);
                 double w;
                 int p;
                 Fact t=new Fact();
                 p=t.fact(n);
                 w=(c*d)/p;
                 System.out.println("final answer of poisson distribution:"+w);
                 break;
          case 2:double sum=0;
                 Fact t1=new Fact();
                 for(int i=0;i<n;i++)
                 {
                    double c1=Math.pow(2.718218,-l);
                    double d1=Math.pow(l,n);
                    double w1;
                    int p1;
                    p1=t1.fact(n);
                    w1=(c1*d1)/p1;
                    sum=sum+w1;
                 }
                 sum=1-sum;
                 System.out.println("final answer of poisson distribution:"+sum);  
                 break;         
           case 3:double sum1=0;
                 Fact t2=new Fact();
                 for(int i=0;i<n;i++)
                 {
                    double c2=Math.pow(2.718218,-l);
                    double d2=Math.pow(l,n);
                    double w2;
                    int p2;
                    p2=t2.fact(n);
                    w2=(c2*d2)/p2;
                    sum1=sum1+w2;
                 }
                 System.out.println("final answer of poisson distribution:"+sum1);
                 break; 
         case 4:double sum2=0;
                 Fact t3=new Fact();
                 for(int i=0;i<n+1;i++)
                 {
                    double c3=Math.pow(2.718218,-l);
                    double d3=Math.pow(l,n);
                    double w3;
                    int p3;
                    p3=t3.fact(n);
                    w3=(c3*d3)/p3;
                    sum2=sum2+w3;
                 }
                 sum2=1-sum2;
                 System.out.println("final answer of poisson distribution:"+sum2);
                 break;
           case 5:double sum3=0;
                 Fact t4=new Fact();
                 for(int i=0;i<n+1;i++)
                 {
                    double c4=Math.pow(2.718218,-l);
                    double d4=Math.pow(l,n);
                    double w4;
                    int p4;
                    p4=t4.fact(n);
                    w4=(c4*d4)/p4;
                    sum3=sum3+w4;
                 }
                 System.out.println("final answer of poisson distribution:"+sum3); 
                 break; 
         default:System.out.println("your enter incorrect one so you can enter again");    
       }
    }
}
class Fact
 {
      int fact(int num)
       {  
        int fact = 1;  
        int i = 1;    
        while( i <= num ){  
            fact = fact * i;   
            i++; //increment i by 1   
        }     
    
        return fact;
    }  
}  
            
    
       
   
        