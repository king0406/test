package jsoffer;

import jsoffer.jsoffer_3;
public class jsoffer_14 {

	public static void main(String[] args) {

	}
//����ָ�룬���õ�һ��ָ��͵ڶ���ָ�붼ָ��ͷ��㣬Ȼ�����õ�һ��ָ����(k-1)���������k���ڵ㡣Ȼ������ָ��ͬʱ�����ƶ�������һ����㵽��ĩβ��ʱ�򣬵ڶ����������λ�þ��ǵ�����k���ڵ��ˡ���
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
