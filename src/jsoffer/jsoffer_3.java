package jsoffer;

import java.util.ArrayList;

/**
 * public class ListNode { int val; ListNode next = null;
 * 
 * ListNode(int val) { this.val = val; } }
 *
 */
public class jsoffer_3 {
	ArrayList<Integer> list=new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if (listNode != null) {
			if(listNode.next!=null)
				this.printListFromTailToHead(listNode.next);
			list.add(listNode.val);
		}
		return list;
	}
}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}
