import java.util.*;
class GudduOnDate
{
    int sum(int j)
    {
        int dig=0,div=0,sum=0;
        for(div=j;div>0;div/=10)
        {
            dig=div%10;
            sum=sum+dig;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        GudduOnDate ob=new GudduOnDate();
        int tc,n,i,j,s1,s2;
        tc=in.nextInt();
        if(tc>=1&&tc<=10)
        {
             s2=0;
             n=in.nextInt();
             if(n>=1&&n<=100000)
             {
             s2=ob.sum(n);
             for(i=1;i<=tc;i++)
             {
                  for(j=1;j<=Math.pow(10,18);j++)
                  {
                      s1=0;
                      s1=ob.sum(j);
                      if((s1+s2)%10==0&&((s1+s2)>=10))
                      {
                          System.out.println(n+""+j);
                          break;
                      }
                  }
             }
            }
        }
    }
}