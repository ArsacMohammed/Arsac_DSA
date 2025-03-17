package LinkedList;

public class ArrayToLinkedList {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        Node head = ArrayToLL(arr);
//        printLL(head);
//        lengthOfLL(head);
//        Boolean targetPresent = checkIfPresent(head, 9);
//        if (targetPresent){
//            System.out.println("Target Present ");
//        }else{
//            System.out.println("Target not present ");
//        }
//        Node resultHead = deleteHead(head);
//          Node resultkth = removeKth(head,1);
//        Node removeElementk = deleteSpecificEl(head , 9);
//        Node resultHeadAfterTailDelete = deleteTail(head);
        Node replacehead = insertBeforeValue(head,9,1);
    }

    private static Node deleteTail(Node head) {
        if (head == null || head.next == null ){
            return head;
        }
        Node temp = head;
        while(temp.next.next != null ){
            temp= temp.next;
        }
        temp.next = null;
        printLL(head);
        return head;
    }


    public static Node deleteHead(Node head) {
        if ( head == null){
            return head;
        }
        head = head.next;
        return head;


    }
    private static void printLL(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }

    private static boolean  checkIfPresent(Node head, int i) {
        Node temp = head;
        while (temp!=null){
            if ( temp.data == i){
                System.out.println("Target element is present :: "+i);
                return true;
            }
            temp= temp.next;
        }
        return false;
    }

    private static void lengthOfLL(Node head) {
        Node temp = head ;
        int count =0 ;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("length of the linked list :: "+count );
    }

    private static Node ArrayToLL(int[] arr) {

        Node head =new Node(arr[0]);
        Node mover = head;
        for (int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }


    public static Node removeKth(Node head , int k) {
        if ( head == null ){
            return head ;
        }
        if ( k == 1 ){
            head = head.next;
            printLL(head);
            return head;
        }
        Node temp = head ;
        int counter =0;
        Node prev=null;
        while ( temp.next != null ){
            counter++;
            if ( counter == k){
                prev.next = prev.next.next ;
                break;
            }
            prev = temp;
            temp=temp.next;
        }
        printLL(head);
        return head;
    }

    public static Node  deleteSpecificEl(Node head , int  k) {
        if (head ==null){
            return head ;
        }
        if (head.data == k ){
            head = head.next;
            printLL(head);
            return head ;
        }
        Node temp = head;
        Node prev= null;
        while ( temp!=null){
            if ( temp.data == k){
                prev.next = prev.next.next;
                break;
            }
            prev= temp;
            temp = temp.next;

        }
        printLL(head);
        return head;
    }


    public static Node  replaceHead(Node head,  int val ){
        if (head==null ){
            return new Node(val);
        }
        Node temp = new Node (5);
        temp.next=head;
        printLL(temp);
        return temp;
    }

    public static Node replaceTails(Node head, int k) {
        if (head == null ){
            return new Node (k);
        }
        Node temp = head ;
        while (temp.next != null ){
            temp=temp.next;
        }
        Node tailEl = new Node (k);
        temp.next =tailEl;
        printLL(head);
        return head;
    }


    public static Node insertKth(Node head , int el , int k ){
        if ( head == null ){
            return new Node (el);
        }

        if (k==1){
            Node temp = new Node (el);
            temp.next = head;
            printLL(head);
            return temp ;
        }
        int counter =0;
        Node temp = head;
        while (temp !=null){
            counter++;
            if ( counter == k-1 ){
                Node x = new Node (el);
                x.next=temp.next ;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }

        printLL(head);
        return head ;
    }

    public static Node insertBeforeValue(Node head , int el , int k ){
        if ( head == null ){
            return null;
        }

        if (head.data==k){
            Node temp = new Node (el);
            temp.next =head ;
            printLL(temp);
            return head;
        }
        Node temp = head;
        while (temp.next !=null){
            if ( temp.next.data == k ){
                Node x = new Node (el);
                x.next=temp.next ;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }

        printLL(head);
        return head ;
    }

}

