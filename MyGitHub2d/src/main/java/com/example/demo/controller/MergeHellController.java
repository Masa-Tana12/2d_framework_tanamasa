package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	//import java.util.Random;
	//結果出力
	public static void main(String[] args) {
		int value1 = kadaiB();
		System.out.println("結果:" + value1);
	}

	//メゾット
	public static int kadaiB() {
		Random random1 = new Random();
		return random1.nextInt(100) + 1;
	}
}
