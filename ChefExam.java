import java.util.*;
class ChefExam
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int test_cases,n,i,j,c;
        String correct_ans="",chef_ans="";
        char ch,ch2;
        System.out.println("Enter total number of test cases:");
        test_cases=in.nextInt();
        for(i=1;i<=test_cases;i++)
        {
            c=0;
            System.out.println("Enter total number of question:");
            n = in.nextInt();
            System.out.println("Enter Correct Answers:");
            correct_ans = in.next();
            System.out.println("Enter Chef's Original Answers:");
            chef_ans = in.next();
            for(j=0;j<n;j++)
            {
                ch = correct_ans.charAt(j);
                ch2 = chef_ans.charAt(j);
                if(ch==ch2)
                   c++;
                else if(ch2=='N'||ch2=='n')
                   System.out.print("");
                else
                {
                    if(j!=n-1)
                      j++;
                    else
                      System.out.print("");
                }
            }
            System.out.println("Score is : "+c);
        }
    }
}