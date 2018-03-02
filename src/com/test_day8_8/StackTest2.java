package com.test_day8_8;

import java.util.Stack;

public class StackTest2 {
    

	public static void main(String[] args){
    	String s="65+35";
    	String s2="",s3="";
    	Stack stack=new Stack();
    	Stack stack2=new Stack();
        for(int i=0;i<s.length();i++){
        	char a=s.charAt(i);
        	stack.push(a);
        }
    	int index=stack.search('+');
    	System.out.println(index);
    	for(int i=s.length()-1;i<index;i--){
    		s2=s2+(String)stack.peek();
    		stack.pop();
    	}
    	for(int i=s.length()-index-1;i<=0;i++){
    		s3=s3+(String)stack.peek();
    		stack.pop();
    	}
    	System.out.print(s2);
    	Double y=Double.parseDouble(s3);
    	System.out.print(y);
    	
    }
}
