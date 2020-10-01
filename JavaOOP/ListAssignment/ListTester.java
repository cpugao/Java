public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList singlylinkedlist = new SinglyLinkedList();
        singlylinkedlist.add(3);
        singlylinkedlist.add(4);
        singlylinkedlist.add(10);
        singlylinkedlist.add(2);
        singlylinkedlist.add(14);
        singlylinkedlist.add(17);
        singlylinkedlist.printValues();
        singlylinkedlist.remove();
    }
}