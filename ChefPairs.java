import java.util.*;
class ChefPairs
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc,i,j,n=2,c,k,s=0,d=0;
        tc=in.nextInt();
        for(i=1;i<=tc;i++)
        {
            c=0;
            n=in.nextInt();
            s=s+n;
            int a[]=new int[n];
            for(j=0;j<n;j++)
            a[j]=in.nextInt();
            for(j=0;j<n-1;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    if(a[j]%2==0&&a[k]%2==1)
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}