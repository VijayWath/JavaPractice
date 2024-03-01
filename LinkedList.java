public class LinkedList {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print
    public void printLinkedList() {
        if (head == null) {
            System.out.println("NULL");
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("First Node");
        list.addFirst("First Node");
        list.addFirst("First Node");
        list.addFirst("First Node");
        list.printLinkedList();
    }
}
