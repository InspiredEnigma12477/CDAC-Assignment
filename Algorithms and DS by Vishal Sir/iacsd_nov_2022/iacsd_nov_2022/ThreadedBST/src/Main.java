public class Main {
    public static void main(String[] args) {
        ThreadedBST tbst = new ThreadedBST();

        tbst.inorder();

        tbst.insert(50);
        tbst.insert(20);
        tbst.insert(10);
        tbst.insert(40);
        tbst.insert(30);
        tbst.insert(48);
        tbst.insert(80);
        tbst.insert(60);
        tbst.insert(100);
        tbst.insert(70);
        tbst.insert(70);

        tbst.inorder();
        tbst.preorder();
        tbst.postorder();

        System.out.println();
        System.out.println(tbst.deleteNode(50));
        tbst.inorder();
        tbst.preorder();
        tbst.postorder();

        System.out.println();
        System.out.println(tbst.deleteNode(10));
        tbst.inorder();
        tbst.preorder();
        tbst.postorder();

        System.out.println();
        System.out.println(tbst.deleteNode(80));
        tbst.inorder();
        tbst.preorder();
        tbst.postorder();

        System.out.println();
        System.out.println(tbst.deleteNode(80));
        tbst.inorder();
        tbst.preorder();
        tbst.postorder();
    }
}


//insert to left
/**
 * 1. Parent will become inorder successor of newnode (nn.setr(temp))
 * 2. parent's inorder predecessor will become inorder predecessor of newnode (nn.sl(t.gl()))
 * 2. newnode will become left child of parent
 */

//insert to right
/**
 * 1. parent will become inorder predecessor of newnode( nn.setleft(t))
 * 2. parent's inorder successor will become inorder successor of newnode (nn.sr(t.gr()))
 * 3. newnode will become right child of parent
 */
