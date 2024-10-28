package com.crm.Javautility;

import java.util.Random;

public class RandomNumber {
public int randomNum() {
	Random random = new Random();
	int var = random.nextInt(1000);
	return var;
}
}
