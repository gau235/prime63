package myTest;

import lgpl3.o.O;
import lgpl3.o.ary.Ary32va;

/**
 * To distinct.<br/>
 * To distinct.
 *
 * @version 2021/05/15_11:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T800_DistinctTrimSortedAry" >
 *          T800_DistinctTrimSortedAry.java</a>
 *
 */
class T800_DistinctTrimSortedAry {

	public static void main(String[] sAry) {

		int[] ary = { 2, 2, 3, 7, 7, 7, 9, 9, 10, 10 }; // list 必須是遞增數列
		int[] ary2 = ary.clone();

		// ary2 = Arrays.stream(ary2).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
		// O.l("desc=");
		O.l(ary2);

		int count = 1; // start index
		int max = ary[0];

		for (int v : ary) { // O.l("v=" + v + ", count=" + count + ", max=" + max);

			if (v > max) {

				ary[count++] = v;
				max = v;

			}
		}

		O.l("validated count=" + count);

		int[] retAry = new int[count];
		for (int i = 0; i < count; i++)
			retAry[i] = ary[i];

		O.l("trim=");
		O.l(retAry);

		Ary32va.eq(O.delTailAll0(retAry), Ary32va.distinct(ary2));

	}
}