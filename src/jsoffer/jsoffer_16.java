package jsoffer;
import jsoffer.jsoffer_3;
public class jsoffer_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1==null) return list2;
		if(list2==null) return list1;
		ListNode ln;
		if(list1.val>list2.val) {
			ln=list2;
			list2=list2.next;
		} else {
			ln=list1;
			list1=list1.next;
		}
		ListNode pre=ln;
		while(list1!=null&&list2!=null){
			if(list1.val>list2.val){
				ln.next=list2;
				ln=ln.next;
				list2=list2.next;
			}else{
				ln.next=list1;
				ln=ln.next;
				list1=list1.next;
			}
		}
		while(list1!=null){
			ln.next=list1;
			list1=list1.next;
		}
		while(list2!=null){
			ln.next=list2;
			list2=list2.next;
		}
		ln.next=null;
		return pre;
    }
}
