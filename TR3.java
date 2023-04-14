import java.util.*;

class TR3{

	static String inp;
	static int i, len;

	static Vector<Character> ops = new Vector<Character>();  
	static void convert(){
	    char ch = inp.charAt(i);
	    if (i > len)
	        return;
	    else if (ch == '('){
	        i++;
	        convert();
	    }
	    else if (ch == ')'){
	        System.out.println(ops.lastElement());
	        ops.remove(ops.size() - 1);
	        i++;
	        convert();
	    }
	    else if (Character.isDigit(ch)){ 
	        i++;
	        System.out.println(ch);
	        convert();
	    }
	    else if ((ch == '+') || (ch == '*')){
	        i++;
	        ops.add(ch);
	        convert();
	    }
	}


	public static void main(String args[]){
	    System.out.print("Infix to postfix conversion using recursion\n");
	    i = 0;
	    inp = "(5+5)";
	    len = inp.length();
	    convert();
	    System.out.print("\n");
	    ops.clear(); 

	    // i = 0;
	    // inp = "((5+5)*(6+6))";
	    // len = inp.length();
	    // convert();
		// System.out.print("\n");
		// ops.clear(); 
		
	    // i = 0;
	    // inp = "((4+8)*((5+5)*(6+6)))";
	    // len = inp.length();
	    // convert();	
	    // System.out.print("\n");	
	}
}