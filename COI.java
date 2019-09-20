import java.io.*;
import java.util.*;
class COI
{
	public static void main(String[] args) throws Exception
	{
	      Scanner in = new Scanner(System.in);
	      try
	      {
		    int N,Q,Y,sum=0;
		    N=in.nextInt();
		    if(N>=1&&N<=1000)
		    {
		    int a[]=new int[N];
		    for(int i=0;i<N;i++)
		         a[i]=in.nextInt();
		    Q=in.nextInt();
		    int b[][]=new int[Q][3];
		    for(int i=0;i<Q;i++)
		    {
		        for(int j=0;j<3;j++)
		        b[i][j]=in.nextInt();
		    }
		    for(int i=0;i<Q;i++)
		    {
		        Y=b[i][2];
		        sum=0;
		        for(int j=b[i][0]-1;j<b[i][1];j++)
		        {
		            if(Y>a[j])
		              sum=sum+a[j];
		        }
		        if(sum<Y)
		        System.out.println(-1);
		        else
		        System.out.println(sum);
		    }
		  }
	      }
	      catch(Exception e)
	      {
			return;
	      }
	}
}