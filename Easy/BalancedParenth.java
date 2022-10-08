import java.util.Scanner;

public class Parentheses{
        boolean hasBalancedParentheses(String parenth)
        {
            int count=0; //count of current unclosed opening brackets
            for(int i=0;i<parenth.length();i++)
            {
                if(parenth.charAt(i)=='(')
                    count++;
                else if(parenth.charAt(i)==')')
                    count--;
                if(count<0) //less than zero->more closing brackets than opening brackets
                    return false;
            }
            if(count>0) //more than zero->less closing brackets than opening brackets
                return false;
            return true;
        }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter as many parentheses as you please(Such as:'(' or ')' only): ");
            String parentheses = sc.nextLine();
            Parenthesis object=new Parenthesis();
            System.out.println(object.hasBalancedParentheses(parentheses));

        }
    }
