package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	//結果出力
	public static void main(String[] args) {
		kadaiB();
		int value1 = kadaiB();
		System.out.println(value1 + "が出ました");
	}

	public static int kadaiB() {
		Random random1 = new Random();
		return random1.nextInt(100) + 1;
	}
}
