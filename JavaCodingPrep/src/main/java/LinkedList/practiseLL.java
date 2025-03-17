package LinkedList;

public class practiseLL {

    public static void main(String[] args) {
        int  [] arr = {2,4,3,7,6,4,9};
        Node head = convertArrToLL(arr);
//        Node head1 = deleteLLTail(head);
//        printLinkedList(head1);
        Boolean isPresent = checkIfPresentLL(head,9);
        lengthll(head);
    }

    private static void lengthll(Node head) {
        Node temp = head ;
        int counter=0;
        while ( temp != null){
            counter++;
            temp= temp.next ;
        }
        System.out.print("Length "+counter);

    }

    private static Boolean checkIfPresentLL(Node head, int i) {
        Node temp = head;
        while( temp !=null){
            if (temp.data==i){
                System.out.println("Target element is present :: "+i);
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    private static Node deleteLLTail(Node head) {
        if ( head == null || head.next ==null){
            return head;
        }
        Node temp = head ;
        while ( temp.next.next!=null){
            temp=temp.next;
        }
        temp.next = null;
        return head  ;
    }

    private static Node deleteLLHead(Node head) {
        if ( head !=null ){
            head = head.next;
        }
        return head;
    }

    private static void printLinkedList(Node head) {
        Node temp = head ;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }

    private static Node convertArrToLL(int [] arr) {
        Node head = new Node (arr[0]);
        Node mover= head ;
        for (int i =1 ;i<arr.length;i++){
            Node temp = new Node (arr[i]);
            mover.next =temp;
            mover =temp ;
        }
        return head;
    }


}
