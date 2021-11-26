package myTest;

import java.util.Arrays;

import lgpl3.comb.Pva;
import lgpl3.o.B;
import lgpl3.o.O;
import lgpl3.o.ary.Seq;

/**
 * Permutation.<br/>
 * Permutation.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=R50_Permutation" >R50_Permutation.java</a>
 *
 */
class R50_Permutation {

	static char[] swap(char[] ary, int i, int j) {

		char tmp = ary[i];
		ary[i] = ary[j];
		ary[j] = tmp;

		return ary;

	}

	/**
	 * 從 1 全相異數列中取出 k 個數做排列.<br/>
	 * To pick several numbers from a list of distinct numbers then to permutate.
	 *
	 * @see Pva#colRecurWNEqK(long, int, Seq)
	 */
	static void p(char[] ary, int from) {

		if (from == ary.length - 1) {

			O.l(Arrays.toString(ary));
			++B.n32;

			return;

		}

		for (int i = from; i != ary.length; i++) {

			swap(ary, from, i); // B64W6.swapVCell(b64, from, i);
			p(ary, from + 1); // p(swap(ary.clone(), from, i), from + 1);
			swap(ary, from, i); // B64W6.swapVCell(b64, from, i);

		}
	}

	public static void main(String[] args) {

		char[] ary = { 'A', 'B', 'C', 'D', };

		p(ary, 0);
		O.l("ans=" + B.n32);

	}
}