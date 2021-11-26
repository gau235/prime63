package myTest;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

/**
 * The implements and extends.<br/>
 * The implements and extends.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T930_Ref" >T930_Ref.java</a>
 *
 */
interface Contract {
}

class Super implements Contract {

	void show() {

		out.println("inSuper");
	}
}

class Sub extends Super {

	@Override
	void show() {

		out.println("inSub");
	}
}

public class T930_Ref {

	public static void main(String[] sAry) {

		List<Object> objs = new ArrayList<Object>();

		Contract c1 = new Super();
		Contract c2 = new Sub();

		Super s1 = new Sub();

		objs.add(c1);
		objs.add(c2);
		objs.add(s1);

		for (Object elem : objs) // out.println(elem.getClass().getName());
			((Super) elem).show();

	}
}