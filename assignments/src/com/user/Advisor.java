package com.user;
import java.util.Random;
public class Advisor {
	String advices[] = new String[5];
	public Advisor() {
		advices[0] = "Learn to say NO!";
		advices[1] = "Keep calm!";
		advices[2] = "Enjoy every moment!";
		advices[3] = "Some bonds are precious!";
		advices[4] = "Live in Present!";
	}
	public void getAdvice() {
		Random rm = new Random();
		int num = rm.nextInt(0, 5);
		System.out.println(advices[num]);
	}
}
