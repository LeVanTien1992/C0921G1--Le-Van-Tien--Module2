package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_linked_list_theo_thu_vien_cua_java_util_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4, 9);
        System.out.println("Linked list: ");
        ll.printList();

        ll.addLast(69);
        System.out.println("After add last: ");
        ll.printList();

        ll.remove(3);
        System.out.println("After remove: ");
        ll.printList();

        System.out.println("Have 9: " + ll.contains(9));
        System.out.println("Have 96: " + ll.contains(96));

        System.out.println("LinkedList size: " + ll.size());
        System.out.println("Index of 9: " + ll.indexOf(9));

        System.out.println("First Node: " + ll.getFirst());
        System.out.println("Last Node: " + ll.getLast());

        ll.clear();
        System.out.println("After clear: ");
        ll.printList();
    }
}
