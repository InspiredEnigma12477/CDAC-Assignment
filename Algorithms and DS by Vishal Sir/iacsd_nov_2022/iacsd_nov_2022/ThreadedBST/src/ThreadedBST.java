public class ThreadedBST {
    private Node root;

    public ThreadedBST() {
        root = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;

        while(true) {
            if(temp.getData() == data) {
                return false;
            }

            if(data < temp.getData()) {
                if(temp.getlFlag() == 'T') {
                    newNode.setRight(temp);
                    newNode.setLeft(temp.getLeft());
                    temp.setLeft(newNode);
                    temp.setlFlag('L');
                    return true;
                }
                temp = temp.getLeft();
            }
            else {
                if(temp.getrFlag() == 'T') {
                    newNode.setLeft(temp);
                    newNode.setRight(temp.getRight());
                    temp.setRight(newNode);
                    temp.setrFlag('L');
                    return true;
                }
                temp = temp.getRight();
            }
        }

    }

    public void inorder() {
        Node temp = root;
        char flag = 'L';
        System.out.print("Inorder: ");

        while(temp != null) {
            while (temp.getlFlag() == 'L' && flag == 'L') {
                temp = temp.getLeft();
            }

            System.out.print(temp.getData() + " ");
            flag = temp.getrFlag();
            temp = temp.getRight();
        }
        System.out.println();

    }

    public void preorder() {
        Node temp = root;
        char flag = 'L';
        System.out.print("Preorder: ");

        while(temp != null) {

            while (temp.getlFlag() == 'L' && flag == 'L') {
                System.out.print(temp.getData() + " ");
                temp = temp.getLeft();
            }
            if(flag == 'L') {
                System.out.print(temp.getData() + " ");
            }
            flag = temp.getrFlag();
            temp = temp.getRight();

        }
        System.out.println();

    }

    public void postorder() {
        Node temp = root;
        char flag = 'L';
        System.out.print("Postorder : ");

        while(temp != null) {

            while(temp.getlFlag() == 'L' && flag == 'L') {
                temp = temp.getLeft();
            }

            flag = temp.getrFlag();

            //check if temp has a right child
            if(flag == 'L') {
                //temp has a right child, so shift to the right child and continue the iteration from begenning
                temp = temp.getRight();
            }
            else {
                while(true) {
                    System.out.print(temp.getData() + " ");
                    //check if the visited node(temp) is right child
                    if (isRightChild(temp)) {
                        //temp is right child
                        while (temp.getlFlag() == 'L') {
                            temp = temp.getLeft();
                        }
                        temp = temp.getLeft();

                    } else {
                        //temp is left child
                        while (temp.getrFlag() == 'L') {
                            temp = temp.getRight();
                        }
                        temp = temp.getRight();
                        break;
                    }
                }
            }
        }
        System.out.println();
    }

    private boolean isRightChild(Node node) {
        if(node == root) {
            return false;
        }

        Node temp = root;
        while(temp != null) {
            if (node.getData() < temp.getData()) {
                temp = temp.getLeft();
                if (temp == node) {
                    return false;
                }
            } else {
                temp = temp.getRight();
                if (temp == node) {
                    return true;
                }
            }
        }

        return false;
    }


    //deleting right child : del's inorder successor will become inorder successor of parent
    //parent.setr(del.getr)
    //parent.setrflag(T)

    //deleting left child : del's inorder predecessor will become inorder predecessor of parent
    //pare.setle(del.getl)
    //parent.setlflag(T)

    public boolean deleteNode(int data) {
        if(root == null) {
            return false;
        }

        Node parent = root, del = root;

        //locate node to be deleted along with parent node
        while(del.getData() != data) {
            parent = del;
            if(data < del.getData()) {
                if(del.getlFlag() == 'T') {
                    return false;
                }
                del = del.getLeft();
            }
            else {
                if(del.getrFlag() == 'T') {
                    return false;
                }
                del = del.getRight();
            }
        }

        while(true) {
            //check if the del is terminal node
            if( del.getlFlag() == 'T' && del.getrFlag() == 'T' ) {

                if(del == root) {
                    root = null;
                    return true;
                }

                if(del == parent.getLeft()) {
                    //del is left child
                    parent.setLeft(del.getLeft());
                    parent.setlFlag('T');
                    return true;
                }
                else {
                    //del is right child
                    parent.setRight(del.getRight());
                    parent.setrFlag('T');
                    return true;
                }
            }

            //shift del down the tree
            if(del.getlFlag() == 'L') {
                //max from left
                Node max = del.getLeft();
                parent = del;

                while(max.getrFlag() == 'L') {
                    parent = max;
                    max = max.getRight();
                }

                int temp = max.getData();
                max.setData(del.getData());
                del.setData(temp);

                del = max;
            }
            else {
                //min from right
                Node min = del.getRight();
                parent = del;

                while(min.getlFlag() == 'L') {
                    parent = min;
                    min = min.getLeft();
                }

                int temp = min.getData();
                min.setData(del.getData());
                del.setData(temp);

                del = min;
            }
        }


    }
}






