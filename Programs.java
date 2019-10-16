package org.hcl;



public class Programs {
public static void main(String[] args) {
	String s="Iniyavan7777@gmail.com";
	String ucase="";
	String lcase="";
	String numbers="";
	String special="";
	int ucount=0;
	int lcount=0;
	int scount=0;
	int ncount=0;
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(Character.isLowerCase(c)) {
			lcase=lcase+c;
			lcount++;
		}else if(Character.isUpperCase(c)) {
			ucase=ucase+c;
			ucount++;
	}else if(Character.isDigit(c)) {
		numbers=numbers+c;
		ncount++;
	}else {
		special=special+c;
		scount++;
		}
		
	}
	System.out.println(lcase+" count is "+lcount);
	System.out.println(ucase+" count is "+ucount);
	System.out.println(numbers+" count is "+ncount);
	System.out.println(special+" count is "+scount);
	
}
}
