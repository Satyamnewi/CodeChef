import java.io.*;
import java.util.*;
class SPAMCLAS
{
	public static void main(String[] args) throws Exception
	{
	      Scanner in = new Scanner(System.in);
	      try
	      {
		    int T,N,minX,maxX,a[][],r[][],sum,c1,c2;
		    T=in.nextInt();
		    r=new int[T][2];
		    for(int i=1;i<=T;i++)
		    {
		        c1=c2=0;
		        N=in.nextInt();
		        minX=in.nextInt();
		        maxX=in.nextInt();
		        a=new int[N][2];
		        for(int j=0;j<N;j++)
		        {
		            for(int k=0;k<2;k++)
		               a[j][k]=in.nextInt();
		        }
		        for(int j=minX;j<=maxX;j++)
		        {
		            sum=j;
		            for(int k=0;k<N;k++)
		            {
		               sum=a[k][0]*sum+a[k][1];
		            }
		            if(sum%2==0)
		            {
		               c1++;
		               r[i-1][0]=c1;
		            }
		            else
		            {
		               c2++;
		               r[i-1][1]=c2;
		            }
		        }
		    }
		    for(int i=0;i<T;i++)
		    {
		        for(int j=0;j<2;j++)
		        System.out.print(r[i][j]+"  ");
		        System.out.println();
		    }
	      }
	      catch(Exception e)
	      {
			return;
	      }
	}
}