public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(80);
        bst.insert(20);
        bst.insert(40);
        bst.insert(35);
        bst.insert(60);
        bst.insert(100);
        bst.insert(70);
        System.out.println( bst.insert(70) );

        bst.preOrder( bst.getRoot() );
        System.out.println();
        bst.preOrder();
        System.out.println();

        bst.inOrder( bst.getRoot() );
        System.out.println();
        bst.inOrder();
        System.out.println();

        bst.postOrder( bst.getRoot() );
        System.out.println();
        bst.postOrder();
        System.out.println();

        System.out.println("Max = " + bst.getMax() );
        System.out.println("Min = " + bst.getMin() );

        bst.deleteNode(50);
        bst.preOrder();
        bst.inOrder();
        bst.postOrder();
        System.out.println();

        bst.deleteNode(20);
        bst.preOrder();
        bst.inOrder();
        bst.postOrder();
        System.out.println();

        bst.deleteNode(70);
        bst.preOrder();
        bst.inOrder();
        bst.postOrder();
        System.out.println();

        bst.deleteNode(70);
        bst.preOrder();
        bst.inOrder();
        bst.postOrder();
        System.out.println();
    }
}

