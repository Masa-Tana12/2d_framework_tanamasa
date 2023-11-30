package com.example.demo.controller;

import java.util.Random;
public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
	}

	static void kadaiA() {
		for (int i = 1; i < 11; i++) {
			System.out.println("現在" + i + "回目のループです。");
		}
	}


	//メゾット
static void kadaiB() {

		Random random1 = new Random();
		int value1 = random1.nextInt(100) + 1;
		System.out.println("結果:" + value1);
	}
}
