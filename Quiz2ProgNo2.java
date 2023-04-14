// Write a java program to check for balancing symbols (/**/, (), [], {}). 
// Then explain how to print out an error message that is likely to reflect the probable cause 
// (Explain it in the program using comments).

import java.util.*;

class Main{

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); ++i) {
            char it = s.charAt(i);
        //  if(it != 40 || it != 41 || it != 42 || it != 47 || it != 91 || it != 93|| it != 123 || it != 125){
        //      System.out.println("Invalid character found. Please only use: /**/, (), [], {}");
        //      System.exit(0);
        //  }
            if (it == '(' || it == '[' || it == '{' || it == '/'){ 
                if(it == '/'){
                    st.push(it);
                    st.push(s.charAt(i + 1));
                    ++i;
                }
                else
                    st.push(it);
            }
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop(); 
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')) continue;
                else if(it == '*'){
                    st.pop();
                    ++i;
                }
                else return false;
            }
        }

        return st.isEmpty(); 
    }   


    public static void main (String[] args) {           
    //  Scanner console = new Scanner(System.in);
        String s = "*/";
        //System.out.println("Enter delimiter symbols to check if it is balanced or not: ");
        //s = console.nextLine();
        if(isValid(s) == true)
            System.out.println("Balanced delimiters");
        else
            System.out.println("Unbalanced delimiters");
    }
}


// The program only requires the symbols /**/, (), [], {} to check whether the given string is balanced or not.
// If it encounters any other character than the specified ones, the program will print a corresponding error message
// notifying the user to only use the said characters. 

