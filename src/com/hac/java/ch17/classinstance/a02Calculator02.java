package com.hac.java.ch17.classinstance;

class Calculator2 {
	static double PI = 3.14;	//static 
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class a02Calculator02 {
	 public static void main(String[] args) {
	 
	    Calculator2 c1 = new Calculator2();
        System.out.println(c1.PI);
 
        Calculator2 c2 = new Calculator2();
        System.out.println(c2.PI);
 
        System.out.println(Calculator.PI);
	 
	    }

}