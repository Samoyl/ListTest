package com.samoyl.test;

public class MainTest {

	public static void main(String[] args) {
		LoopList list = new LoopList();
		list.checkInput();

		if (list.check) {
			list.buildList();
			list.normalLoop();
			list.advancedLoop();
		}
	}

}
