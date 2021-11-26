package myTest;

import static java.lang.System.out;

/**
 * To print stars.<br/>
 * To print stars.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T290_PrintStar" >T290_PrintStar.java</a>
 *
 */
class T290_PrintStar {

	public static void main(String[] sAry) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++)
				out.printf("*");

			out.printf("\n");

		}

		out.println("===============================");

		for (int i = 10; i >= 1; i--) {

			for (int j = 1; j <= i; j++)
				out.printf("*");

			out.printf("\n");

		}

		out.println("===============================");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5 - i; j++)
				out.printf(" ");

			for (int j = 1; j <= i; j++)
				out.printf("*");

			out.println();

		}
	}
}