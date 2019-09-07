import java.util.*;
class Medicine
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc,m,y,dt,dx,i,j;
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String d="";
        tc=in.nextInt();
        if(tc>=1&&tc<=100)
        {
        for(i=1;i<=tc;i++)
        {
            d="";
            d=in.next();
            m=Integer.parseInt(d.substring(5,7))-1;
            y=Integer.parseInt(d.substring(0,4));
            dt=Integer.parseInt(d.substring(8,10));
            if(y>=1900&&y<=2038)
            {
            if(y%4==0&&(y%100!=0||y%400==0))
            a[1]=29;
            else
            a[1]=28;
            dx=dt+1;
            for(j=dx;j<=a[m];j++)
            {
                if(dx%2==1)
                {
                    System.out.println(dx);
                    break;
                }
            }
            if((dt==29&&a[m]==29)||(dt==31)||(dt==30&&a[m]==30))
            System.out.println(1);
        }
    }
        }
    }
}