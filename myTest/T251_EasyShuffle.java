package myTest;

import static java.lang.System.out;

import java.util.Arrays;

import lgpl3.shuffle.Shuffler;

/**
 * To shuffle.<br/>
 * To shuffle.
 *
 * @version 2021/05/12_19:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T251_EasyShuffle" >T251_EasyShuffle.java</a>
 *
 */
class T251_EasyShuffle {

	/**
	 * @see Shuffler#shuffle(String[])
	 */
	public static void main(String[] sAry) {

		int[] ary = { 10, 20, 30, 40, 50, 60 };

		out.println("bef=");
		out.println(Arrays.toString(ary));

		out.println("aft=");

		for (int i = 0; i != ary.length; i++) {

			int j = (int) (ary.length * Math.random());

			int tmp = ary[i];
			ary[i] = ary[j];
			ary[j] = tmp;

		}

		out.println(Arrays.toString(ary));

	}
}