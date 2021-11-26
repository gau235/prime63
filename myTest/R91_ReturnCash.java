package myTest;

import lgpl3.o.O;
import lgpl3.o.ary.Seq32;

/**
 * To return cash.<br/>
 * To return cash.
 *
 * @version 2021/11/23_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=R91_ReturnCash" >R91_ReturnCash.java</a>
 *
 */
class R91_ReturnCash {

	static int[] base = { 50, 20, 20, 15, 10, 2, 1, 1, 1 };

	static int len = base.length;

	static int lenMinus1 = len - 1;

	static int targetV = 75;

	static void retCash(Seq32 prefix, int idx, int lv) {

		Seq32 curPrefix;
		int sum;

		for (; idx != len; idx++) {

			curPrefix = ((idx == lenMinus1) ? prefix : prefix.clone()); // 老師影印考卷 正本留最後用

			curPrefix.a(base[idx]);

			if ((sum = curPrefix.sum()) == targetV) { // O.l(curPrefix.toStr() + " sum=" + sum + " lv=" + lv);

				O.l("===ok===" + curPrefix.toStr() + "\tlv=" + lv);

				continue;

			}

			if (sum > targetV)
				continue;

			retCash(curPrefix, idx + 1, lv + 1);

		}
	}

	public static void main(String[] sAry) {

		retCash(new Seq32(), 0, 1);
	}
}