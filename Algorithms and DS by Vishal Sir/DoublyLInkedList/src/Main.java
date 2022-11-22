public class Main {
    public static void main(String[] args) {

        DoublyLinkedList dll =  new DoublyLinkedList();

        dll.display();
        dll.insert(10);
        dll.display();
        dll.insert(20);
        dll.display();
        dll.insert(30);
        dll.display();
        dll.insert(40);
        dll.display();

        dll.insert(50, 1);
        dll.display();
        dll.insert(60, 4);
        dll.display();
        dll.insert(70, 7);
        dll.display();
        dll.insert(90, 10);
        dll.display();

        dll.deleteByValue(50);
        dll.display();
        dll.deleteByValue(60);
        dll.display();
        dll.deleteByValue(70);
        dll.display();
        dll.deleteByValue(70);
        dll.display();

        /*dll.deleteByPosition(1);
        dll.display();
        dll.deleteByPosition(3);
        dll.display();
        dll.deleteByPosition(5);
        dll.display();
        if( dll.deleteByPosition(5) ) {
            System.out.println("Success");
            dll.display();
        }
        else {
            System.out.println("failed...");
        }*/



    }
}
