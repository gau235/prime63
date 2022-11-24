package myTest;

import lgpl3.o.O;

/**
 * The continue.<br/>
 * The continue.
 *
 * @version 2021/11/22_22:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T009_DoWhileContinue" >
 *          T009_DoWhileContinue.java</a>
 *
 */
public class T009_DoWhileContinue {

	public static void main(String[] sAry) throws Throwable {

		int i = 1;
		do {

			if (i % 3 == 0)
				continue;

			O.l("i=" + i);

		} while (++i != 10);

	}
}
