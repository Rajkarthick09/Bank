package org.hcl;

public class Arrays {
public static void main(String[] args) {
	int a[]= {10,30,40,50,20};
	int temp=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
		
}
	
System.out.println(a[2]*a[1]);	

}}
