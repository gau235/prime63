package myTest;

import static java.lang.System.out;

import lgpl3.o.O;

/**
 * Josephus Problem.<br/>
 * Josephus Problem.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T147_JosephusProblem" >T147_JosephusProblem.java</a>
 *
 */
class T147_JosephusProblem {

	public static void main(String[] sAry) {

		int[] ary = { 10, 20, 30, 40, 50 }; // 槍斃順序 30,10,50,20,40
		final int everyN = 3; // 報數到第幾人就槍斃

		O.l("init ary:");
		O.l(ary);
		O.l();

		int count = 0; // 報數
		int idx = 0; // init 第 0 位置
		// 當 count +1 同樣地 idx 也得 +1

		int killed = 0; // 已被槍斃人數

		while (killed < ary.length) {

			out.printf("count=%d, idx=%d\n", count, idx);

			count++; // 報數從 1 開始
			// idx++

			if (count == everyN) {

				out.printf("idx=%d, to kill=%d\n", idx, ary[idx]);
				killed++;
				ary[idx] = -1; // 已被槍斃
				count = 0; // reset to 0

			}

			do
				idx = (idx + 1) % ary.length;

			while (ary[idx] == -1); // 已被槍斃的人不會報數

		}
	}
}