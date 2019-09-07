import java.util.*;
class ChefProxy
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc,i,j,D,c,f,c1;
        String s;
        float p=0;
        char ch,ch1,ch2,ch3,ch4;
        tc=in.nextInt();
        if(tc>=1&&tc<=200)
        {
            for(i=1;i<=tc;i++)
            {
                D=in.nextInt();
                s=in.next().toUpperCase();
                c=f=c1=0;
                for(j=0;j<D;j++)
                {
                    ch=s.charAt(j);
                    if(ch=='P')
                    c++;
                    if(ch=='P'||ch=='A')
                    System.out.print("");
                    else
                    f=1;
                }
                if(f!=1)
                {
                    c1=c;
                    f=0;
                    for(j=2;j<D-2;j++)
                    {
                        ch=s.charAt(j);
                        ch1=s.charAt(j-1);
                        ch2=s.charAt(j-2);
                        ch3=s.charAt(j+1);
                        ch4=s.charAt(j+2);
                        if(ch=='A'&&(ch1=='P'||ch2=='P')&&(ch3=='P'||ch4=='P'))
                        {
                            c++;
                            p=(float)(c*100)/(float)D;
                            if(p>=75)
                            {
                                f=1;
                                System.out.println(c-c1);
                                break;
                            }
                        }
                    }
                    if(f==0)
                    System.out.println(-1);
                }
            }
        }
    }
}