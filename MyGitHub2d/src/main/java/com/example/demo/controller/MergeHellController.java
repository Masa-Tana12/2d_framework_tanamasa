package com.example.demo.controller;

import java.util.Random;
public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		int value1 = kadaiB();
		System.out.println("結果:" + value1);
	}

	static void kadaiA() {
		for (int i = 1; i < 11; i++) {
			System.out.println("現在" + i + "回目のループです。");
		}
	}


	//メゾット
static int kadaiB() {

		Random random1 = new Random();
		return random1.nextInt(100) + 1;
	}
}
