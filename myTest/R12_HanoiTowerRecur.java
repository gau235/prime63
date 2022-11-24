package myTest;

import static java.lang.System.out;

import lgpl3.comb.selfCallva.sample.Ex10_TowerOfHanoi;

/**
 * HanoiTowerRecur.<br/>
 * HanoiTowerRecur
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=R12_HanoiTowerRecur" >R12_HanoiTowerRecur.java</a>
 *
 * @see Ex10_TowerOfHanoi
 */
class R12_HanoiTowerRecur {

	static void hanoi(int num, String s1, String s2, String s3) {

		out.println("I am here");

		if (num == 1)
			out.println("num==1, move 1 from " + s1 + " to " + s2);

		else {

			hanoi(num - 1, s1, s3, s2);

			out.println("num!=1, move " + num + " from " + s1 + " to " + s2);

			hanoi(num - 1, s3, s2, s1);

		}
	}

	public static void main(String[] sAry) {

		hanoi(3, "SW", "D", "A");
	}
}