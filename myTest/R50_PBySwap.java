package myTest;

import lgpl3.o.B;
import lgpl3.o.O;

class R50_PBySwap {

	static char[] swap(char[] ary, int from, int next) {

		char tmp = ary[from];
		ary[from] = ary[next];
		ary[next] = tmp;

		return ary;

	}

	static int count;

	static void p(char[] ary, int from) {

		if (from == ary.length - 1) {

			O.l(ary);

			++count;

			return;

		}

		for (int next = from; next != ary.length; next++) {

			swap(ary, from, next);
			p(ary, from + 1);
			swap(ary, next, from); // 交換回來嗎

			////////// 或者用以下
			// char[] tmpAry = ary.clone();
			// swap(tmpAry, from, next);
			// p(tmpAry, from + 1);

		}
	}

	public static void main(String[] args) {

		char[] ary = { 'A', 'B', 'C', 'D', };

		p(ary, 0);

		O.l("count=" + count);

		B.n32 = 0;

	}
}