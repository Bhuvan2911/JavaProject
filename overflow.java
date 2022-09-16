package Handling;

public class overflow {
	public void findA() {
		 findB();
		
	}
	public void findB() {
		findA();
	}
	
	
public static void main(String[] args) {
	overflow o = new overflow();
	o.findA();
}

}
