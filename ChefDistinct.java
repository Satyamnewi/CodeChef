import java.io.*;
import java.util.*;
class ChefDistinct
{
	public static void main(String[] args) throws Exception
	{
	      Scanner in = new Scanner(System.in);
	      try
	      {
		    int T,N,f;
		    T=in.nextInt();
		    for(int i=1;i<=T;i++)
		    {
		        f=0;
		        N=in.nextInt();
		        int A[]=new int[N];
		        for(int j=0;j<N;j++)
		          A[j]=in.nextInt();
		        Arrays.sort(A);
		        for(int j=0;j<N-1;j++)
		        {
		            if(A[j]==A[j+1])
		            {
		                f=1;
		                break;
		            }
		        }
		        if(f==1)
		        System.out.println("Yes");
		        else
		        System.out.println("No");
		    }
	      }
	      catch(Exception e)
	      {
			return;
	      }
	}
}