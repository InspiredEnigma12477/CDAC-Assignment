public class Node {
    private int data;
    private Node left, right;
    private char lFlag, rFlag;

    public Node(int data) {
        this.data = data;
        left = right = null;
        lFlag = rFlag = 'T';
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public char getlFlag() {
        return lFlag;
    }

    public void setlFlag(char lFlag) {
        this.lFlag = lFlag;
    }

    public char getrFlag() {
        return rFlag;
    }

    public void setrFlag(char rFlag) {
        this.rFlag = rFlag;
    }
}
