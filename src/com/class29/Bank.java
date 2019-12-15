package com.class29;

public interface Bank {
	void haveChecking();

	void haveSaving();
}

interface Trustable {
	void trust();
}

class Finance {
	public void financing() {
		System.out.println("Financial transactions must happen");
	}
}

class BOA extends Finance implements Bank, Trustable {

	@Override
	public void haveChecking() {
		System.out.println(" BOA has a checking account ");

	}

	@Override
	public void haveSaving() {
		System.out.println(" BOA has a saving account");

	}

	@Override
	public void trust() {
		System.out.println(" You can trust BOA with yoour money");
	}

}

class CapitalOne  extends Finance implements Bank, Trustable {

	@Override
	public void haveChecking() {
		System.out.println(" Capital one has a checking account ");

	}

	@Override
	public void haveSaving() {
		System.out.println(" Capital one  has a saving account");

	}

	@Override
	public void trust() {
		System.out.println(" You can trust Capital one  with yoour money");
	}
}
class CapitaiOneChild extends CapitalOne{
}
