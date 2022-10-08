// This program can decide if a string has balanced parenthesis and if the word "dog" is in a "doggish" context. Implements recursive method(s).
package StucturesClass;

public class Parentheses{
        static boolean isBalanced(String parenth)
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
        public static boolean dogishHelper(String word, char letter)
        {
            if (word == null || word.length() == 0) {
                return false;
            }
            if (word.charAt(0) == letter) {
                return true;
            }
            return dogishHelper(word.substring(1), letter);
        }
        public static boolean inDogish(String word) {
            if (word == null || word.length() == 0) {
                return false;
            }
            word = word.toLowerCase();
            if (!dogishHelper(word, 'd')) {
                return false;
            }
            word = word.substring(word.indexOf('d') + 1);

            if (!dogishHelper(word, 'o')) {
                return false;
            }
            word = word.substring(word.indexOf('o') + 1);
            if (!dogishHelper(word, 'g')) {
                return false;
            } else {
                return true;
            }
        }

        public static void main(String args[])
        {
            String test_bal_1 = isBalanced("") == true ? "pass" : "fail";
            String test_bal_2 = isBalanced("()") == true ? "pass" : "fail";
            String test_bal_3 = isBalanced("(()())") == true ? "pass" : "fail";
            String test_bal_4 = isBalanced("((())())") == true ? "pass" : "fail";

            String test_bal_5 = isBalanced(")(") == false ? "pass" : "fail";
            String test_bal_6 = isBalanced("((") == false ? "pass" : "fail";
            String test_bal_7 = isBalanced("())(()))())") == false ? "pass" : "fail";

            System.out.println(test_bal_1);
            System.out.println(test_bal_2);
            System.out.println(test_bal_3);
            System.out.println(test_bal_4);
            System.out.println(test_bal_5);
            System.out.println(test_bal_6);
            System.out.println(test_bal_7);
            String test_dog_1 = inDogish("dpoags") == true ? "pass" : "fail";
            String test_dog_2 = inDogish("dog") == true ? "pass" : "fail";
            String test_dog_3 = inDogish("doooooog") == true ? "pass" : "fail";
            String test_dog_4 = inDogish("dpopgp") == true ? "pass" : "fail";
            String test_dog_5 = inDogish("qwqwedqweqweoqweqwgasd") == true ? "pass" : "fail";

            String test_dog_6 = inDogish("") == false ? "pass" : "fail";
            String test_dog_7 = inDogish("cat") == false ? "pass" : "fail";
            String test_dog_8 = inDogish("apple") == false ? "pass" : "fail";
            String test_dog_9 = inDogish("do") == false ? "pass" : "fail";
            String test_dog_10 = inDogish("g") == false ? "pass" : "fail";

            System.out.println(test_dog_1);
            System.out.println(test_dog_2);
            System.out.println(test_dog_3);
            System.out.println(test_dog_4);
            System.out.println(test_dog_5);
            System.out.println(test_dog_6);
            System.out.println(test_dog_7);
            System.out.println(test_dog_8);
            System.out.println(test_dog_9);
            System.out.println(test_dog_10);
        }
        }


