import java.util.*;
class Msg
{
    String s;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter message to decode");
        s=in.nextLine();
    }
    char asciiconvert(int a)
    {
        char ch;
        ch=(char)a;
        return ch;
    }
    int bool(int b)
    {
        int t=0;
        if((b>=65&&b<=90)||(b>=97&&b<=122)||(b==32))
        t=1;
        return t;
    }
    void print()
    {
        System.out.println("The decoded message is:");
        String s2="";
        int Ascii=0;
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            s2=s2+ch;
            Ascii=Integer.parseInt(s2);
            if(bool(Ascii)==1)
            {
                System.out.print(asciiconvert(Ascii));
                s2="";
            }
        }
    }
    public static void main(String args[])
    {
        Msg ob=new Msg();
        ob.accept();;
        ob.print();
    }
}