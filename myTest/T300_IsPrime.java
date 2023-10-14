package myTest;

import static lgpl3.o.B.T;

import lgpl3.o.O;
import lgpl3.prime64.Miner;

/**
 * HanoiTowerRecur.<br/>
 * HanoiTowerRecur
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T300_IsPrime" >src</a>
 *
 */
class T300_IsPrime {

	/**
	 * @see Miner#testPrime32(int)
	 */
	static boolean isPrime(int n) {

		if (n == 1)
			return !T;

		if (n == 2)
			return T;

		if (n % 2 == 0)
			return !T;

		for (int divisor = 3; divisor * divisor <= n; divisor += 2) {

			if (n % divisor == 0)
				return !T;

		}

		return T;

	}

	public static void main(String[] sAry) {

		for (int i = 0; i != 20; i++) {

			if (isPrime(i))
				O.l("i=" + i);

		}

		O.l("===================");

		for (int i = 21; i != 31; i += 2) {

			if (Miner.testPrime32(i))
				O.l("i=" + i);

		}
	}
}