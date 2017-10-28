package jsoffer;

import jsoffer.jsoffer_3;
public class jsoffer_14 {

	public static void main(String[] args) {

	}
//两个指针，先让第一个指针和第二个指针都指向头结点，然后再让第一个指正走(k-1)步，到达第k个节点。然后两个指针同时往后移动，当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了。。
	public ListNode FindKthToTail(ListNode head,int k) {
		int sum=0;
		ListNode temp=head;
		while(head!=null){
			sum++;
			head=head.next;
		}
		int num=sum-k;
		if(num<0) return null;
		while(num-->0) temp=temp.next;
		return temp;
    }
}
