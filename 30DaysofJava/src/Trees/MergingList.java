package Trees;

class MNode{
	int data;
	MNode next;
	public MNode(int data){
		this.data=data;
		this.next=null;
	}
}
public class MergingList {
MNode head1;
MNode head2;
	public static void main(String[] args) {
		MergingList list1=new MergingList();
		MergingList list2=new MergingList();
		MergingList list=new MergingList();
		list1.head1=new MNode(10);
		list1.head1.next=new MNode(50);
		list1.head1.next=new MNode(70);
		list1.head1.next.next=new MNode(90);
		list1.head1.next.next.next=new MNode(100);
		
		list2.head2=new MNode(20);
		list2.head2.next=new MNode(30);
		list2.head2.next.next=new MNode(40);
		list2.head2.next.next.next=new MNode(60);
		list2.head2.next.next.next.next=new MNode(80);
		System.out.println("Printing list1: ");
		list1.printList(list1.head1);
		System.out.println("Printing list2: ");
		list2.printList(list2.head2);
		
		MNode new_head=list.mergeList(list1.head1,list2.head2);
		System.out.println("Printing merged list: ");
		list.printList(new_head);
		

	}
	private MNode mergeList(MNode p, MNode q) {
		MNode S=null;
		MNode new_head;
		if(p==null)
			return q;
		if(q==null)
			return p;
		if(p!=null && q!=null){
			if(p.data<=q.data){
				S=p;
				p=S.next;
			}
			else{
				S=q;
				q=S.next;
			}
		}
		new_head=S;
		while(p!=null && q!=null){
		if(p.data<=q.data){
			S.next=p;
			S=p;
			p=S.next;
		}	
		else{
			S.next=q;
			S=q;
			q=S.next;
		}
		}
		if(p==null){
			S.next=q;
		}
		if(q==null){
			S.next=p;
		}
		return new_head;
		
	}
	private void printList(MNode head) {
	while(head!=null){
		System.out.print(head.data +" ");
		head=head.next;
	}	
	System.out.println();
		
	}

}
