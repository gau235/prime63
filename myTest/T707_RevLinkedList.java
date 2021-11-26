package myTest;

import static java.lang.System.out;

import lgpl3.o.B;
import lgpl3.o.O;
import lgpl3.recycle.NodInLinkedList32;

/**
 * The linked list.<br/>
 * The linked list.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T707_RevLinkedList" >T707_RevLinkedList.java</a>
 *
 */
class T707_RevLinkedList {

	static NodInLinkedList32 reverseLinkedList(NodInLinkedList32 head) {

		// 准备 3 个变数, 如同费氏数列 f0, f1, f2 这样的迭代关系
		// 處長升官退休, 副處長變處長, 經理變副處長
		NodInLinkedList32 prev = null;
		NodInLinkedList32 cur = head;
		NodInLinkedList32 next = head.next;

		while (next != null) {

			cur.next = prev; // 把 cur->next 转向

			// 迭代关系
			prev = cur; // prev 往後挪
			cur = next; // cur 往後挪
			next = next.next; // next 往後挪

		}

		cur.next = prev; // 此时 cur 位於最後 node, 将 cur->next 转向
		head = cur; // 更新 head 並回傳

		return head;

	}

	static void toStr(NodInLinkedList32 cur) {

		while (B.I) {

			if (cur.next == null) {

				out.print(cur.toStr());

				return;

			} else {

				out.print(cur.toStr() + "->");
				cur = cur.next;

			}
		}
	}

	public static void main(String[] sAry) {

		NodInLinkedList32 n1 = new NodInLinkedList32(10);
		NodInLinkedList32 n2 = new NodInLinkedList32(20);
		NodInLinkedList32 n3 = new NodInLinkedList32(30);
		NodInLinkedList32 n4 = new NodInLinkedList32(40);

		// build the links
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		// n4.next = n5;

		O.l("LinkedList=");
		toStr(n1);
		O.l();

		O.l("reverse=");
		toStr(reverseLinkedList(n1));

	}
}
