package jsoffer;
import java.util.Stack;

import jsoffer.jsoffer_3;
public class jsoffer_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//两个指针，每次遍历，逐步改变next方向
	public ListNode ReverseList(ListNode head) {
		if(head==null) return null;
		Stack<ListNode> st=new Stack<ListNode>();
		while(head.next!=null){
			st.push(head);
			head=head.next;
		}
		ListNode ln=head;
		while(!st.isEmpty()){
			ln.next=st.pop();
			ln=ln.next;
		}
		ln.next=null;
		return head;
    }
}
