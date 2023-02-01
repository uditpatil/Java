public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }  

    public void remove(){
        if(head == null){
            System.out.println("LinkedList is Empty");
        }
        else if(head.next == null){
            head == null;
        }
        else{
            Node runner = head;
            While(runner.next != null){
                runner = null;
            }
        }
    }

    public void printValues(){
        if(head == null) {
            System.out.println("LinkedList is Empty");
        }
        else if(head.next == null){
            System.out.println(head.value)
        }
        else{
            System.out.println(head.value);
            while(head.next != null){
                System.out.println(head.next.value);
            }
        }
    }

}  

