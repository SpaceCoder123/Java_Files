class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(String data) {
        Node newNode = new Node(data); // every time the function is called a node is created
        if (head == null) { // head is a reference to the first node
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) { // head is a reference to the first node
            head = newNode;
            return;
        }
        Node CurrentNode = head;
        while (CurrentNode.next != null) {
            CurrentNode = CurrentNode.next;
        }
        CurrentNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node CurrentNode = head;
        while (CurrentNode != null) {
            System.out.print(CurrentNode.data + "-> ");
            CurrentNode = CurrentNode.next;
        }
        System.out.print("null");

    }

    public void delete_first() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    // delete last
    public void delete_last() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }

}
class linkedListex {

        // there are three types of linked list
        // singular linked list
        // double linked list
        // circular linked list

        // in a singular linked list, there will be nodes in which data will be stored and there will be a next node which will connect from one node to another and the end will have a null pointer
        // insert operation
        // print operation
        // delete operation
        // size operation


        public static void main(String[] args) {
            LL list1 = new LL();
            // add operation (add first) at first position
            // add operation (add last)
            list1.addFirst("a");
            list1.addFirst("is");

            list1.addLast("list");

            list1.addFirst("this");
            //list1.printList();
            list1.delete_first();
            // list1.printList();
            list1.delete_last();
            list1.printList();


        }
}



