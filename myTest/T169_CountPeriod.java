package myTest;

import static java.lang.System.out;

import java.util.Scanner;

import lgpl3.o.B;
import lgpl3.o.O;

/**
 * input abcabc will output 3.<br/>
 * input abcabc will output 3.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T169_CountPeriod" >T169_CountPeriod.java</a>
 *
 */
class T169_CountPeriod {

	public static void main(String[] sAry) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (B.I) {

			O.l(sc.toString()); // [position=26]

			out.println("pleas input a string:"); // input abcabc will output 3

			char[] cAry = sc.nextLine().toCharArray();

			O.l("input=");
			O.l(cAry);

			for (int period = 1; period <= cAry.length; period++) {

				if (cAry.length % period != 0) // 檢查用避免當 input vvavv 卻 output 週期為3
					continue;

				boolean isMe = B.I;

				for (int iAftSkip = period; iAftSkip < cAry.length; iAftSkip++) {

					if (cAry[iAftSkip] != cAry[iAftSkip % period]) // 所有的鋪排只為副歌
						isMe = B.O;

				}

				if (isMe) {

					out.println("period=" + period);
					break;

				}
			}

			// sc.reset();

		}
	}
}