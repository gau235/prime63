package myTest;

import lgpl3.o.O;

/**
 * Binary search.<br/>
 * Binary search.
 */
class R49_TriSearch {

	static int triSearchRecur(int[] unsortedAry, int key, int from, int to) {

		if (to <= from)

			return -1;

		if (to == from + 1) { // 只剩 1 筆資料

			if (unsortedAry[from] == key)

				return from;

			return -1;

		}

		if (to == from + 2) { // 只剩 2 筆資料

			if (unsortedAry[from] == key)

				return from;

			if (unsortedAry[from + 1] == key)

				return from + 1;

			return -1;

		}

		int mid1 = from + ((to - from) / 3);
		int mid2 = to - ((to - from) / 3);

		if (unsortedAry[mid1] == key)

			return mid1;

		if (unsortedAry[mid2] == key)

			return mid2;

		int found = triSearchRecur(unsortedAry, key, from, mid1);

		if (found < 0) {

			found = triSearchRecur(unsortedAry, key, mid1, mid2);

			if (found < 0)

				found = triSearchRecur(unsortedAry, key, mid2, to);

		}

		return found;

		// 這是一個遞迴的對未排序陣列進行三分搜尋的演算法，由於此演算法會將陣列切成三塊分別搜尋，
		// 直到只剩 2 個元素無法切割成 3 塊，接著循序搜尋這 2 個元素，實際上是對所有陣列中的數各處理 1 次，
		// 因此不管最好最差，時間複雜度均為 O(n)

	}

	public static void main(String[] sAry) {

		int[] unsortedAry = { 0, 10, 20, -30, 40, 55 };

		int key = unsortedAry[unsortedAry.length - 1];
		key = 55;

		O.l("triSearch=" + triSearchRecur(unsortedAry, key, 0, unsortedAry.length));

	}
}