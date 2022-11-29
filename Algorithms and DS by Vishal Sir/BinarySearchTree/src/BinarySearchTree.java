import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
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
            if(data == temp.getData()) {
                return false;
            }

            if (data < temp.getData()) {
                //insert to left
                if (temp.getLeft() == null) {
                    temp.setLeft(newNode);
                    return true;
                }
                temp = temp.getLeft();
            } else {
                //insert to right
                if(temp.getRight() == null) {
                    temp.setRight(newNode);
                    return true;
                }
                temp = temp.getRight();
            }
        }
    }

    public Node getRoot() {
        return root;
    }

    public void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        inOrder(root.getRight());
    }

    public void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData() + " ");
    }

    public Integer getMax() {
         if(root == null) {
             return null;
         }

         Node temp = root;
         while(temp.getRight() != null) {
             temp = temp.getRight();
         }

         return temp.getData();
    }

    public Integer getMin() {
        if(root == null) {
            return null;
        }

        Node temp = root;
        while(temp.getLeft() != null) {
            temp = temp.getLeft();
        }

        return temp.getData();
    }

    public void preOrder() {
        Stack<Node> stack = new Stack<>();
        Node temp = root;

        while(temp != null || !stack.isEmpty()) {
            while (temp != null) {
                System.out.print(temp.getData() + " ");
                stack.push(temp);
                temp = temp.getLeft();
            }

            temp = stack.pop().getRight();
        }
        System.out.println();

    }

    public void inOrder() {
        Stack<Node> stack = new Stack<>();
        Node temp = root;

        while(temp != null || !stack.isEmpty()) {
            while(temp != null) {
                stack.push(temp);
                temp = temp.getLeft();
            }

            temp = stack.pop();
            System.out.print(temp.getData() + " ");
            temp = temp.getRight();
        }

        System.out.println();

    }

    public void postOrder() {

        class Pair {
            Node node;
            char flag;

            public Pair(Node node, char flag) {
                this.node = node;
                this.flag = flag;
            }
        }
        Node temp = root;
        Stack<Pair> stack = new Stack<Pair>();

        while(temp != null || !stack.isEmpty()) {

            while(temp != null) {
                stack.push(new Pair(temp, 'L'));
                temp = temp.getLeft();
            }

            Pair pair = stack.pop();

            if(pair.flag == 'L') {
                temp = pair.node.getRight();
                pair.flag = 'R';
                stack.push(pair);
            }
            else {
                System.out.print(pair.node.getData() + " ");
            }
        }
        System.out.println();
    }

    public boolean deleteNode(int data) {
        if(root == null) {
            return false;
        }

        //locate del node along with parent node
        Node parent = root, del = root;
        while(del.getData() != data) {
            parent = del;
            if(data < del.getData()) {
                del = del.getLeft();
            }
            else {
                del = del.getRight();
            }
            if(del == null) {
                return false;
            }
        }

        while( true ) {
            //check if the del node is terminal
            if (del.getLeft() == null && del.getRight() == null) {

                if (del == root) {
                    root = null;
                    return true;
                }

                if (del == parent.getLeft()) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
                return true;
            }

            //del is a non terminal node, shift it down the tree
            if(del.getLeft() != null) {
                //find max from left subtree
                Node max = del.getLeft();
                parent = del;

                while(max.getRight() != null) {
                    parent = max;
                    max = max.getRight();
                }

                int temp = del.getData();
                del.setData(max.getData());
                max.setData(temp);

                del = max;

            }
            else {
                //find min from right subtree
                Node min = del.getRight();
                parent = del;

                while (min.getLeft() != null) {
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







