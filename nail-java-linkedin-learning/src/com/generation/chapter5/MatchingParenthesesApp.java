package com.generation.chapter5;

import java.util.Map;
import java.util.Stack;


public class MatchingParenthesesApp {
	
	 public static boolean matchingParentheses(String s) {
	        Stack<Character> stack = new Stack<>();
	        Map<Character, Character> blockSymbols = Map.of(')','(',
	                ']', '[',
	                '>','<');

	        for (int i = 0; i < s.length(); i++) {
	            char current = s.charAt(i);

	            if (blockSymbols.containsValue(current)) {
	                stack.push(current);
	                continue;
	            }

	            if (blockSymbols.containsKey(current) &&
	                    (stack.isEmpty() ||
	                            blockSymbols.get(current) != stack.pop())) {
	                return false;
	            }
	        }

	        return stack.isEmpty();
	    } 
	 public static void main(String[] args) {
	        String t1 = "(<[ ]>)";
	        String t2 = "[<incre>ment]";
	        String t3 = "<increment>";
	        String t4 = "()incre<>ment<>[]";

	        String t5 = "<increment(";
	        String t6 = "[)incr]ement(";
	        String t7 = "<i(ncr>e)ment";
	        String t8 = "(<increment>";

	        	
	        System.out.println(matchingParenthesesM(t1));
	        System.out.println(matchingParenthesesM(t2));
	        System.out.println(matchingParenthesesM(t3));
	        System.out.println(matchingParenthesesM(t4));

	        System.out.println(matchingParenthesesM(t5));
	        System.out.println(matchingParenthesesM(t6));
	        System.out.println(matchingParenthesesM(t7));
	        System.out.println(matchingParenthesesM(t8));
	        
	        System.out.println(matchingParentheses(t1));
	        System.out.println(matchingParentheses(t2));
	        System.out.println(matchingParentheses(t3));
	        System.out.println(matchingParentheses(t4));

	        System.out.println(matchingParentheses(t5));
	        System.out.println(matchingParentheses(t6));
	        System.out.println(matchingParentheses(t7));
	        System.out.println(matchingParentheses(t8));
	    }

	private static boolean matchingParenthesesM(String text) {
		Stack<Character> myStack = new Stack<>();
		for(int i=0; i<text.length();i++) {
			if(text.charAt(i)=='(' || text.charAt(i)=='[' || text.charAt(i)=='<'){
				myStack.add(text.charAt(i));
			}else if(text.charAt(i)==')'){
				if(myStack.isEmpty()) {
					return false;
				}
				Character saveChar=myStack.pop();
				if(saveChar!='(')
					return false;
			}else if(text.charAt(i)==']'){				
				if(myStack.isEmpty()) {
					return false;
				}
				Character saveChar=myStack.pop();
				if(saveChar!='[')
					return false;
			}else if(text.charAt(i)=='>'){				
				if(myStack.isEmpty()) {
					return false;
				}
				Character saveChar=myStack.pop();
				if(saveChar!='<')
					return false;
			}
		}
	
	if(myStack.isEmpty()){
			return true;
		}
	return false;
	}
}
