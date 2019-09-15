import java.io.*;
import java.util.*;
class PRIME1
{
   public static void main(String args[])throws Exception
   {
       Scanner in=new Scanner(System.in); 
       try
       {
           int T,m,n,c,s=0;
           int a[]=new int[1000];
           T=in.nextInt();
           for(int i=1;i<=T;i++)
           {
              m=in.nextInt();
              n=in.nextInt();
              for(int j=m;j<=n;j++)
              {
                   c=0;
                   for(int k=1;k<=j/2;k++)
                   {
                       if(j%k==0)
                       c++;
                   }
                   if(c==1)
                   a[s++]=j;
               }
              a[s++]=-1;
           }  
           for(int i=0;i<s;i++)
           {
              if(a[i]==-1)
              System.out.println();
              else
              System.out.println(a[i]);
           }
       }
       catch(Exception e)
        {
             return;
        }
   }
}