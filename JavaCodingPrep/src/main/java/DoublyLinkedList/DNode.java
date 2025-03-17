package DoublyLinkedList;

public class DNode {

    int data;
    DNode next;
    DNode back;

    public DNode(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
    public DNode(int data , DNode next , DNode prev){
        this.data=data;
        this.next=next;
        this.back=prev;
    }
}
