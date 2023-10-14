package myTest;

import java.util.StringTokenizer;

import lgpl3.o.O;

/**
 * StringTokenizer.<br/>
 * 高考普考.
 *
 * @version 2021/05/18_11:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T008_StringTokenizer" >src</a>
 *
 */
class T008_StringTokenizer {

	public static void main(String args[]) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 5; i++)

			if ((i & 0x0001) == 0) sb.append("This is a test");

			else sb.append("This is a pencil");

		O.l(sb);

		// StringTokenizer tk = new StringTokenizer(sb.toString(), "sz");
		StringTokenizer tk = new StringTokenizer(sb.toString(), "st");
		// 如果遇到t或是s就將字串切一刀 (t 與 s 也隨之去掉)

		int count = tk.countTokens();
		O.l("Total number of Tokens: " + count);

		for (int i = 0; i < count; i++)

			O.l("token_" + i + "=" + tk.nextToken());

	}
}