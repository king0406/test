package jsoffer;
import java.util.Stack;

import jsoffer.jsoffer_3;
public class jsoffer_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//����ָ�룬ÿ�α������𲽸ı�next����
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
