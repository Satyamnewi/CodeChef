import java.util.*;
class DEM2019A
{
    int N,M,T,ab[][],tb[][],baseX,baseY,sum=0;
    int temp[]=new int[5]; 
    void accept()
    {
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        M=in.nextInt();
        T=in.nextInt();
        ab=new int[N][3];
        tb=new int[M][3];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<3;j++)
               ab[i][j]=in.nextInt();
        }
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<3;j++)
               tb[i][j]=in.nextInt();
        }
        baseX=in.nextInt();
        baseY=in.nextInt();
    }
    int primFac(int a,int ii,int chck)
    {
        int k=0,fd=0;
        for(int i=2;a>1;)
        {
            if(a%i==0)
            {
               temp[k++]=i;
               a=a/i;
            }
            else
            i++;
        }
        fd=primFac2(ii,chck);
        return fd;
    }
    int primFac2(int ii,int chck)
    {
        int finDist=0;
        Arrays.sort(temp);
        for(int i=0;i<5;i++)
        {
            if(chck==0)
            {
               if(temp[i]>ab[ii][2])
               {
                  finDist=temp[i];
                  break;
               }
            }
            else
            {
               if(temp[i]>tb[ii][2])
               {
                  finDist=temp[i];
                  break;
               }
            }
        }
        if(chck==0&&finDist==0)
        finDist=ab[ii][2];
        else if(chck==1&&finDist==0)
        finDist=tb[ii][2];
        return finDist;
    }
    int calc1(int j)
    {
        int dif=0,fd=0;
        dif=Math.abs(ab[j][0]-tb[j][0])+Math.abs(ab[j][1]-tb[j][1]);
        fd=primFac(dif,j,0);
        return fd;
    }
    int calc2(int j)
    {
        int dif=0,fd=0;
        dif=Math.abs(tb[j][0]-baseX)+Math.abs(tb[j][1]-baseY);
        fd=primFac(dif,j,1);
        return fd;
    }
    void check()
    {
        int sum1=0,sum2=0,j,c=0;
        for(j=0;j<N;j++)
        {
               sum1=calc1(j);
               sum2=calc2(j);
               sum=sum1+sum2;
               if(sum<=T)
               c++;
        }
        System.out.print(c);
    }
    public static void main(String args[])
    {
        DEM2019A ob=new DEM2019A();
        ob.accept();
        ob.check();
    }
}