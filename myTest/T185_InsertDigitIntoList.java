package myTest;

import static java.lang.System.out;

import java.util.ArrayList;

/**
 * InsertAryList.<br/>
 * InsertAryList
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T185_InsertDigitIntoList" >
 *          T185_InsertDigitIntoList.java</a>
 *
 */
class T185_InsertDigitIntoList {

	public static void main(String[] sAry) {

		int n = 3859;
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (n > 0) {

			list.add(0, (n % 10));
			n /= 10;

		}

		out.println("list=" + list);

	}
}