package com.Final;

public final class FinalExample {
	final int a = 5;
	final int b;

	public  FinalExample(int a) {
		b = a;
	}

	public final void addition() {

	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public static void main(String[] args) {
		FinalExample ss = new FinalExample(6);
		 String kk=new String("tttt");
		kk.concat("test");
		// ss.a=7;
		System.out.println(ss.a);
		System.out.println(kk);
		kk=new String("hhhh");
			System.out.println(kk);
	}

}
