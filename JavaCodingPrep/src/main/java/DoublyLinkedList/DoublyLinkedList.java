package DoublyLinkedList;

public class DoublyLinkedList {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        DNode head = convertArrToDll(arr);
        insertBeforeNode(head.next,10); //condition head must not given

        printDll(head);
    }

    private static void insertBeforeNode(DNode node, int val) {
        DNode prev= node.back;
        DNode newNode = new DNode(val,node,prev);
        prev.next = newNode;
        node.back=newNode;


    }

    private static DNode insertBeforeKthElDl(DNode head, int i,int val) {

        if (i==1){
            return insertBeforeHeadDL(head,val);
        }

        int counter = 0;
        DNode temp = head;
        while ( temp!=null){
            counter++;
            if (counter == i){
                break;
            }
            temp=temp.next;
        }
        DNode prev = temp.back;
        DNode newNode = new DNode(val,temp,prev);
        temp.back=newNode;
        prev.next=newNode;
        return head ;

    }

    private static DNode insertBeforeTailDl(DNode head, int i) {

        if ( head == null){
            return null ;
        }else if ( head.next == null){
            return insertBeforeHeadDL(head,i);
        }
        DNode temp = head ;
        while (temp.next!=null){
            temp=temp.next;
        }
        DNode prev = temp.back;
        DNode newNode = new DNode( i,temp,prev);
        prev.next=newNode;
        temp.back=newNode;

        return head ;
    }

    private static DNode deleteDLTail(DNode head) {

        if (head == null || head.next == null) {
            return null;
        }
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        DNode prev = temp.back;
        temp.back = null;
        prev.next = null;

        return head;
    }

    private static DNode deleteDLHead(DNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        DNode prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }

    private static void printDll(DNode head) {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    private static DNode convertArrToDll(int[] arr) {
        DNode head = new DNode(arr[0], null, null);
        DNode prev = head;
        for (int i = 1; i < arr.length; i++) {
            DNode temp = new DNode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;

        }
        return head;

    }

    public static DNode deleteKthDL(DNode head, int k) {


        DNode temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            if (k == counter) {
                break;
            }
            temp = temp.next;
        }
        DNode prev = temp.back;
        DNode front = temp.next;


        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            return deleteDLHead(head);
        } else if (front == null) {
            return deleteDLTail(head);
        }
        prev.next = front;
        front.back = prev;
        temp.back = null;
        temp.next = null;

        return head;

    }


    public static DNode insertBeforeHeadDL(DNode head, int k){
        DNode temp = new DNode(k,head,null);
        head.back=temp;
        return temp ;
    }





}
