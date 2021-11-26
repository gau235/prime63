package myTest;

import java.util.StringTokenizer;

/**
 * StringTokenizer.<br/>
 * 高考普考.
 *
 * @version 2021/05/18_11:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T008_StringTokenizer" >T008_StringTokenizer.java</a>
 *
 */
class T008_StringTokenizer {

	public static void main(String args[]) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 5; i++)
			if ((i & 0x0001) == 0)
				sb.append("This is a test");

			else
				sb.append("This is a pencil");

		System.out.println(sb);

		StringTokenizer tk = new StringTokenizer(sb.toString(), "ts");

		int count = tk.countTokens();
		System.out.println("Total number of Tokens: " + count);

		for (int i = 0; i < count; i++)
			System.out.println("token_" + i + "=" + tk.nextToken());

	}
}