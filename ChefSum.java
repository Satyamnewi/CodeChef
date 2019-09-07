import java.io.*;
import java.util.*;
class ChefSum
{
	public static void main(String[] args) throws Exception
	{
	      Scanner in = new Scanner(System.in);
	      try
	      {
	          int T,N,k,a[],f=0;;
	          T=in.nextInt();
	          for(int i=1;i<=T;i++)
	          {
	              f=0;
	              N=in.nextInt();
	              k=in.nextInt();
	              a=new int[N];
	              for(int j=0;j<N;j++)
	                 a[j]=in.nextInt();
	              for(int j=0;j<N-1;j++)
	              {
	                  for(int x=j+1;j<N;j++)
	                  {
	                      if((a[j]+a[x])==k)
	                      {
	                          f=1;
	                          break;
	                      }
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