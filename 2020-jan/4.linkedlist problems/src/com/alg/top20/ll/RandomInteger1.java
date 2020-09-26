package com.alg.top20.ll;

import java.util.HashMap;

public class RandomInteger1 {
	private long a, b, m, seed;

	public RandomInteger1() {
		this(System.currentTimeMillis());
	}

	public RandomInteger1(long seed) {
		this.seed = seed;
		this.a = 5;
		this.b = 7;
		this.m = 11;
	}

	public int nextInt(int n) {
		seed = (a * seed + b) % m;
		return (int) (seed % n);
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		RandomInteger1 random = new RandomInteger1();
		for (int i = 1; i <= 10000; ++i) {
			int r = random.nextInt(n);
			if (hmap.get(r) == null)
				hmap.put(r, 1);
			else
				hmap.put(r, hmap.get(r) + 1);
			System.out.println(r);
		}
		System.out.println(hmap);
	}
}
