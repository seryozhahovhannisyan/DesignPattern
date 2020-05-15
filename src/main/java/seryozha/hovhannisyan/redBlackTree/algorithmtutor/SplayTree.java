package seryozha.hovhannisyan.redBlackTree.algorithmtutor;

// https://github.com/Bibeknam/algorithmtutorprograms/blob/master/data-structures/splay-trees/SplayTree.java
// Splay tree implementation in Java
// Author: AlgorithmTutor
// Tutorial URL: http://algorithmtutor.com/Data-Structures/Tree/Splay-Trees/

// data structure that represents a node in the tree
class SplayNode {
    int data; // holds the key
    SplayNode parent; // pointer to the parent
    SplayNode left; // pointer to left child
    SplayNode right; // pointer to right child

    public SplayNode(int data) {
        this.data = data;
        this.parent = null;
        this.left = null;
        this.right = null;
    }
}

public class SplayTree {
    private SplayNode root;

    public SplayTree() {
        root = null;
    }

    private void printHelper(SplayNode currPtr, String indent, boolean last) {
        // print the tree structure on the screen
        if (currPtr != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "     ";
            } else {
                System.out.print("L----");
                indent += "|    ";
            }

            System.out.println(currPtr.data);

            printHelper(currPtr.left, indent, false);
            printHelper(currPtr.right, indent, true);
        }
    }

    private SplayNode searchTreeHelper(SplayNode node, int key) {
        if (node == null || key == node.data) {
            return node;
        }

        if (key < node.data) {
            return searchTreeHelper(node.left, key);
        }
        return searchTreeHelper(node.right, key);
    }

    private void deleteNodeHelper(SplayNode node, int key) {
        SplayNode x = null;
        SplayNode t = null;
        SplayNode s = null;
        while (node != null){
            if (node.data == key) {
                x = node;
            }

            if (node.data <= key) {
                node = node.right;
            } else {
                node = node.left;
            }
        }

        if (x == null) {
            System.out.println("Couldn't find key in the tree");
            return;
        }
        // split operation
        splay(x);
        if (x.right != null) {
            t = x.right;
            t.parent = null;
        } else {
            t = null;
        }
        s = x;
        s.right = null;
        x = null;

        // join operation
        if (s.left != null){ // remove x
            s.left.parent = null;
        }
        root = join(s.left, t);
        s = null;
    }

    // rotate left at node x
    private void leftRotate(SplayNode x) {
        SplayNode y = x.right;
        x.right = y.left;
        if (y.left != null) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            this.root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    // rotate right at node x
    private void rightRotate(SplayNode x) {
        SplayNode y = x.left;
        x.left = y.right;
        if (y.right != null) {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            this.root = y;
        } else if (x == x.parent.right) {
            x.parent.right = y;
        } else {
            x.parent.left = y;
        }
        y.right = x;
        x.parent = y;
    }

    // Splaying operation. It moves x to the root of the tree
    private void splay(SplayNode x) {
        while (x.parent != null) {
            if (x.parent.parent == null) {
                if (x == x.parent.left) {
                    // zig rotation
                    rightRotate(x.parent);
                } else {
                    // zag rotation
                    leftRotate(x.parent);
                }
            } else if (x == x.parent.left && x.parent == x.parent.parent.left) {
                // zig-zig rotation
                rightRotate(x.parent.parent);
                rightRotate(x.parent);
            } else if (x == x.parent.right && x.parent == x.parent.parent.right) {
                // zag-zag rotation
                leftRotate(x.parent.parent);
                leftRotate(x.parent);
            } else if (x == x.parent.right && x.parent == x.parent.parent.left) {
                // zig-zag rotation
                leftRotate(x.parent);
                rightRotate(x.parent);
            } else {
                // zag-zig rotation
                rightRotate(x.parent);
                leftRotate(x.parent);
            }
        }
    }

    // joins two trees s and t
    private SplayNode join(SplayNode s, SplayNode t){
        if (s == null) {
            return t;
        }

        if (t == null) {
            return s;
        }
        SplayNode x = maximum(s);
        splay(x);
        x.right = t;
        t.parent = x;
        return x;
    }


    private void preOrderHelper(SplayNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderHelper(node.left);
            preOrderHelper(node.right);
        }
    }

    private void inOrderHelper(SplayNode node) {
        if (node != null) {
            inOrderHelper(node.left);
            System.out.print(node.data + " ");
            inOrderHelper(node.right);
        }
    }

    private void postOrderHelper(SplayNode node) {
        if (node != null) {
            postOrderHelper(node.left);
            postOrderHelper(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Pre-Order traversal
    // Node->Left Subtree->Right Subtree
    public void preorder() {
        preOrderHelper(this.root);
    }

    // In-Order traversal
    // Left Subtree -> SplayNode -> Right Subtree
    public void inorder() {
        inOrderHelper(this.root);
    }

    // Post-Order traversal
    // Left Subtree -> Right Subtree -> Node
    public void postorder() {
        postOrderHelper(this.root);
    }

    // search the tree for the key k
    // and return the corresponding node
    public SplayNode searchTree(int k) {
        SplayNode x = searchTreeHelper(root, k);
        if (x != null) {
            splay(x);
        }
        return x;
    }

    // find the node with the minimum key
    public SplayNode minimum(SplayNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // find the node with the maximum key
    public SplayNode maximum(SplayNode node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    // find the successor of a given node
    public SplayNode successor(SplayNode x) {
        // if the right subtree is not null,
        // the successor is the leftmost node in the
        // right subtree
        if (x.right != null) {
            return minimum(x.right);
        }

        // else it is the lowest ancestor of x whose
        // left child is also an ancestor of x.
        SplayNode y = x.parent;
        while (y != null && x == y.right) {
            x = y;
            y = y.parent;
        }
        return y;
    }

    // find the predecessor of a given node
    public SplayNode predecessor(SplayNode x) {
        // if the left subtree is not null,
        // the predecessor is the rightmost node in the 
        // left subtree
        if (x.left != null) {
            return maximum(x.left);
        }

        SplayNode y = x.parent;
        while (y != null && x == y.left) {
            x = y;
            y = y.parent;
        }

        return y;
    }

    // insert the key to the tree in its appropriate position
    public void insert(int key) {
        SplayNode node = new SplayNode(key);
        SplayNode y = null;
        SplayNode x = this.root;

        while (x != null) {
            y = x;
            if (node.data < x.data) {
                x = x.left;
            } else {
                x = x.right;
            }
        }

        // y is parent of x
        node.parent = y;
        if (y == null) {
            root = node;
        } else if (node.data < y.data) {
            y.left = node;
        } else {
            y.right = node;
        }

        // splay node
        splay(node);
    }

    // delete the node from the tree
    void deleteSplayNode(int data) {
        deleteNodeHelper(this.root, data);
    }

    // print the tree structure on the screen
    public void prettyPrint() {
        printHelper(this.root, "", true);
    }

    public static void main(String [] args) {
        SplayTree tree = new SplayTree();
//        tree.insert(33);
//        tree.insert(42);
//        tree.insert(45);
//        tree.insert(57);
//        tree.insert(48);
//        tree.insert(66);
//        tree.prettyPrint();

        tree.insert(44);
        tree.insert(67);
        tree.insert(5);
        tree.insert(89);
        tree.insert(41);
        tree.insert(98);
        tree.insert(1);
        tree.prettyPrint();
        tree.searchTree(33);
        tree.searchTree(44);
        tree.prettyPrint();
        tree.deleteSplayNode(89);
        tree.deleteSplayNode(67);
        tree.deleteSplayNode(41);
        tree.deleteSplayNode(5);
        tree.prettyPrint();
        tree.deleteSplayNode(98);
        tree.deleteSplayNode(1);
        tree.deleteSplayNode(44);
        tree.deleteSplayNode(33);
        tree.prettyPrint();
    }
}
