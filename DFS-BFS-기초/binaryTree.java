class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}

public class Main {
    Node root;

    // 전위 탐색
    public void preorder(Node root) {
        if (root == null) return;
        else {
            System.out.print(root.data + " ");
            preorder(root.lt);
            preorder(root.rt);
        }
    }

    // 중위 탐색
    public void inorder(Node root) {
        if (root == null) return;
        else {
            inorder(root.lt);
            System.out.print(root.data + " ");
            inorder(root.rt);
        }
    }

    // 후위 탐색
    public void postorder(Node root) {
        if (root == null) return;
        else {
            postorder(root.lt);
            postorder(root.rt);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        ;
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.preorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
    }
}
