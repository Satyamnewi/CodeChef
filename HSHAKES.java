import java.io.*;
import java.util.*;
class HSHAKES
{
	public static void main(String[] args) throws Exception
	{
	      Scanner in = new Scanner(System.in);
	      try
	      {
		    int T,sum=0,res=0,f=1;
		    T=in.nextInt();
		    int a[]=new int[T];
		    int b[][]=new int[T][100];
		    for(int i=0;i<T;i++)
		    {
		         a[i]=in.nextInt();
		         for(int j=0;j<a[i];j++)
		            b[i][j]=in.nextInt();
		    }
		    for(int i=0;i<T;i++)
		    {
		        sum=0;
		        for(int j=0;j<a[i];j++)
		        {
		            f=f*b[i][j];
		            sum=sum+b[i][j];
		        }
		        if(a[i]<=2)
		          res=f;
		        else
		           res=(int)(sum*(sum-1))/2;
		        System.out.println(res);
		    }
	      }
	      catch(Exception e)
	      {
			return;
	      }
	}
}