package myTest;

import static java.lang.System.out;

/**
 * Try catch and finally.<br/>
 * Try catch and finally.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T138_Finally" >T138_Finally.java</a>
 *
 */
class T138_Finally {

	public static void main(String[] sAry) {

		try {

			int[] ary = new int[10];
			ary[50] = -1;

		} catch (ArithmeticException arithmeticEx) {

			out.println("arithmeticEx=");

		} finally {

			out.println("finally=");
		}

		out.println("end main=");

	}
}