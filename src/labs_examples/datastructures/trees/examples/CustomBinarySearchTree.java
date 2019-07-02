package labs_examples.datastructures.trees.examples;

import java.util.Stack;

/**
 * Created by Kevin Graham - https://codingnomads.co
 */
public class CustomBinarySearchTree {
    // we always track the "root" Node, from which the entire tree grows
    Node root;
    int size;

    /**
     * This main() method is just for testing the BST - it is not a required component of the tree itself
     *
     * @param args®
     */
    public static void main(String[] args) {
        // create the
        CustomBinarySearchTree bst = new CustomBinarySearchTree(3, 7, 1, 5, 2, 4, 6);

        System.out.println("Printing Tree contents recursively - inOrder");
        bst.printInorderRecursive(bst.root);
        System.out.println();

        System.out.println("Printing Tree contents recursively - preOrder");
        bst.printPreorderRecursive(bst.root);
        System.out.println();

        System.out.println("Printing Tree contents recursively - postOrder");
        bst.printPostorderRecursive(bst.root);
        System.out.println();

        System.out.println("Printing Tree contents iteratively");
        bst.printPreorderIterative(bst.root);
        System.out.println();

    }

    /**
     * VarArgs constructor that takes in zero or more int data points to insert into the BST
     *
     * @param data VarArgs int
     */
    CustomBinarySearchTree(int ... data) {

        // if the user passes no data to insert, simply initialize an empty tree
        if (data.length < 1) {
            root = null;
        }

        // otherwise, initialize tree with given data
        else {
            for (int i = 0; i < data.length; i++) {
                // for each int data that the user passed in, call the insert() method and pass each int
                insert(data[i]);
            }
        }
    }

    /**
     * Adds an Integer to an empty tree, if the tree is not empty it calls the recursive insert() method
     * to find the appropriate place to insert the data
     *
     * @param data to be added
     */
    public void insert(int data) {

        // if the tree is empty, create a new root node
        if (root == null) {
            root = new Node(data);
            size++;
        }
        // start the recursive insert() method, passing the data and the "root" node
        else {
            insert(data, root);
        }
    }

    /** HELPER METHOD
     * Recursively adds an Integer to the tree
     * @param data to be added
     * @param node the root node
     * @return new node recursively
     */
    private Node insert(int data, Node node) {

        // create new root node
        if (node == null) {
            node = new Node(data);
            size++;
        }

        // move to leftChild of tree
        if (data < node.data) {
            // recursive call - passing the left child Node (effectively traversing left)
            node.leftChild = insert(data, node.leftChild);
        }
        // move to rightChild of tree
        else if (data > node.data){
            // recursive call - passing the left child Node (effectively traversing left)
            node.rightChild = insert(data, node.rightChild);
        }
        // if data is not < or > node.data it must be equal to - we prevent duplicates (keys) which break the tree
        else {
            return node;
        }

        // once we find the proper node where we should insert the data, call rebalanceInsert() which will
        // continuously attempt to keep the Tree in balance
        return rebalanceInsert(node, data);
    }

    /** HELPER METHOD
     * Rebalances tree during insertion
     * @param node root
     * @param data data added
     * @return root of balanced tree
     */
    private Node rebalanceInsert(Node node, int data) {

        // get heights of child nodes
        int leftHeight = height(node.leftChild);
        int rightHeight = height(node.rightChild);

        // update height of node to the greatest of its child heights
        node.height = 1 + Math.max(leftHeight, rightHeight);

        // calculate balance factor of node
        int balanceFactor = leftHeight - rightHeight;

        // leftChild is bigger and new node is less than leftChild - we need to move the current node.leftChild so that
        // it will become node.rightChild and the new node that we're inserting will become node.leftChild
        if (balanceFactor > 1 && data < node.leftChild.data) {
            //
            return rotateRight(node);
        }
        // rightChild is bigger and new node is greater than rightChild - inverse of above section - need to move
        // current right child to left child because the node we're inserting is larger than right chuild
        if (balanceFactor < -1 && data > node.rightChild.data) {
            //
            return rotateLeft(node);
        }
        // leftChild is bigger and new node is greater than leftChild
        if (balanceFactor > 1 && data > node.leftChild.data) {
            // rotate leftChild first to get to simple case
            node.leftChild = rotateLeft(node.leftChild);
            // then do simple rotation
            return rotateRight(node);
        }
        // rightChild is bigger and new node is less than rightChild
        if (balanceFactor < -1 && data < node.rightChild.data) {
            // rotate rightChild first to get to simple case
            node.rightChild = rotateRight(node.rightChild);
            // then do simple rotation
            return rotateLeft(node);
        }

        return node;
    }

    /** HELPER METHOD
     * Rotates the node's leftChild to the node position
     * @param
     * @return - the new root of the subtree
     */
    private Node rotateRight(Node node) {
        // copy node's leftChild child (which will become the root node of this subtree)
        Node child = node.leftChild;
        // make a backup of right child (the right child is about to be overwritten)
        Node formerRightChild = child.rightChild;

        // rotate - set the new right child to the node we're inserting
        child.rightChild = node;
        // set the left child to what was formerly the right child
        node.leftChild = formerRightChild;

        // update heights
        int leftHeight = height(node.leftChild);
        int rightHeight = height(node.rightChild);
        node.height = 1 + Math.max(leftHeight, rightHeight);

        leftHeight = height(child.leftChild);
        rightHeight = height(child.rightChild);
        child.height = 1 + Math.max(leftHeight, rightHeight);

        node = child;
        return node;
    }

    /** HELPER METHOD
     * Rotates the node's rightChild to the node position
     * @param
     * @return - the new root of the subtree
     */
    private Node rotateLeft(Node node) {
        // copy node's right child (which will become the root node of this subtree)
        Node child = node.rightChild;
        // make a backup of left child (the left child is about to be overwritten)
        Node grandChild = child.leftChild;

        // rotate - set the new left child to the node we're inserting
        child.leftChild = node;
        // set the right child to what was formerly the left child
        node.rightChild = grandChild;

        // update heights
        int leftHeight = height(node.leftChild);
        int rightHeight = height(node.rightChild);
        node.height = 1 + Math.max(leftHeight, rightHeight);

        leftHeight = height(child.leftChild);
        rightHeight = height(child.rightChild);
        child.height = 1 + Math.max(leftHeight, rightHeight);

        node = child;
        return node;
    }

    /**
     * Removes a value from the tree
     * @param target value to be removed
     */
    public void remove(int target) {

        // make sure node exists - if it doesn't
        if (!search(target)) {
            return;
        }

        // start the recursive helper method
        System.out.println("removing " + target);
        root = remove(target, root);
    }

    /** HELPER METHOD
     * Recursively removes a value from the tree
     * @param target value to be removed
     * @param node node for recursive calls
     * @return node for recursive calls
     */
    private Node remove(int target, Node node) {

        // move recursively leftChild
        if (target < node.data) {
            node.leftChild = remove(target, node.leftChild);
        }
        // move recursively rightChild
        else if (target > node.data){
            node.rightChild = remove(target, node.rightChild);
        }
        // currently at the target Node
        else {

            // currently at a leaf Node
            if (node.leftChild == null && node.rightChild == null) {
                // delete current Node
                size--;
                return null;
            }
            // no leftChild branch
            else if (node.leftChild == null) {
                // delete current Node and link to rightChild branch
                size--;
                return node.rightChild;
            }
            // no rightChild branch
            else if (node.rightChild == null) {
                // delete current Node and link to leftChild branch
                size--;
                return node.leftChild;
            }
            // two branches
            else {
                // get the smallest node that's bigger than leftChild node
                // swap its value to the current node position then remove the old node

                // start at the top of the rightChild branch
                Node smallest = node.rightChild;

                // iterate down the leftChild to the smallest node
                while (smallest.leftChild != null) {
                    smallest = smallest.leftChild;
                }

                // swap current data with smallest
                int temp = node.data;
                node.data = smallest.data;
                smallest.data = temp;

                // remove old smallest node
                node.rightChild = remove(target, node.rightChild);
            }

        }

        return rebalanceRemove(node);
    }

    /** HELPER METHOD
     * Rebalances tree after removal
     * @param node root
     * @return root of balanced tree
     */
    private Node rebalanceRemove(Node node) {

        // update height
        int leftHeight = height(node.leftChild);
        int rightHeight = height(node.rightChild);
        node.height = 1 + Math.max(leftHeight, rightHeight);

        // calculate balance factor of node
        int balanceFactor = leftHeight - rightHeight;

        // calculate leftChild balance
        leftHeight = 0;
        rightHeight = 0;
        if (node.leftChild != null) {
            leftHeight = height(node.leftChild.leftChild);
            rightHeight = height(node.leftChild.rightChild);
        }
        int balanceLeft = leftHeight - rightHeight;

        // calculate rightChild balance
        leftHeight = 0;
        rightHeight = 0;
        if (node.rightChild != null) {
            leftHeight = height(node.rightChild.leftChild);
            rightHeight = height(node.rightChild.rightChild);
        }
        int balanceRight = leftHeight - rightHeight;

        // rebalance
        if (balanceFactor > 1 && balanceLeft >= 0) {
            return rotateRight(node);
        }
        if (balanceFactor > 1 && balanceLeft < 0) {
            node.leftChild = rotateLeft(node.leftChild);
            return rotateRight(node);
        }
        if (balanceFactor < -1 && balanceRight <= 0) {
            node =  rotateLeft(node);
            return node;
        }
        if (balanceFactor < -1 && balanceRight > 0) {
            node.rightChild = rotateRight(node.rightChild);
            return rotateLeft(node);
        }

        return node;
    }



    /**
     * Searches the tree for the target value
     * @param target Integer to search for
     * @return whether the target value was found
     */
    boolean search(int target) {
        // call the search helper (recursive) method
        return search(target, root);
    }

    /** HELPER METHOD
     * Recursively searches the tree for the target value
     * @param target Integer to search for
     * @param node root of the tree
     * @return whether the target value was found
     */
    boolean search(int target, Node node) {
        // make sure end of branch hasn't been reached
        if (node != null) {
            if (node.data == target) {
                // target found - return true - it does exist
                return true;
            }
            // follow the leftChild branch
            else if (target < node.data) {
                return search(target, node.leftChild);
            }
            // follow the rightChild branch
            else if (target > node.data) {
                return search(target, node.rightChild);
            }
        }

        return false;
    }

    /**
     * Prints the data of each Node using preorder traversal recursively
     * @param node the starting Node
     */
    public void printInorderRecursive(Node node) {
        if (node == null)
            return;

        // first, recursively traverse all the way down the left side of the tree
        printInorderRecursive(node.leftChild);

        // then print out the data at each node
        System.out.print(node.data + " ");

        // then, recurse down the right side (of each subtree)
        printInorderRecursive(node.rightChild);
    }

    /**
     * Prints the data of each Node using preorder traversal recursively
     * @param node the starting Node
     */
    public void printPreorderRecursive(Node node) {
        if (node == null) return;

        // print out the data first
        System.out.print(node.data + " ");

        // recurse down the left tree
        printPreorderRecursive(node.leftChild);

        // recurse down the right tree
        printPreorderRecursive(node.rightChild);
    }

    /**
     * Prints the data of each Node using post-order (aka "bottoms up") traversal recursively
     * @param node the starting Node
     */
    public void printPostorderRecursive(Node node) {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorderRecursive(node.leftChild);

        // then recur on right subtree
        printPostorderRecursive(node.rightChild);

        // now print the node
        System.out.print(node.data + " ");
    }



    /**
     * Prints the data of each Node using preorder traversal iteratively
     * @param node the starting Node
     */
    public void printPreorderIterative(Node node) {
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.empty()) {
            Node n = stack.pop();

            if (n != null) {
                System.out.print(n.data + " ");
                stack.push(n.rightChild);
                stack.push(n.leftChild);
            }
        }
    }


    /**
     * Determines the lowest common ancestor between two values
     * @param value1 the data of a Node
     * @param value2 the data of a Node
     * @return the lowest common ancestor of the given data
     */
    public Node lowestCommonAncestor (int value1, int value2) {
        Node n = root;

        while (n != null) {
            // move rightChild
            if (n.data < value1 && n.data < value2) {
                n = n.rightChild;
            }
            // move leftChild
            else if (n.data > value1 && n.data > value2) {
                n = n.leftChild;
            }
            // target found
            else {
                return n;
            }
        }

        // no common ancestor
        return null;
    }

    /** HELPER METHOD
     * Gets the height of the given Node
     * @param node
     * @return
     */
    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    /**
     * Determines whether the tree has a logarithmic height
     * @return true if balanced, false if not balanced (the leftChild and rightChild side differ by more than 1)
     */
    public boolean isBalanced() {
        // get balance factor
        int balanceFactor = height(root.leftChild) - height(root.rightChild);

        // determine with the sides are within 1 level of each other
        return Math.abs(balanceFactor) <= 1;
    }

    /**
     * A Node of a Binary Tree
     */
    private class Node {
        Node leftChild;
        Node rightChild;

        // for simplicity, at the moment we're just going to store a simple int in our nodes
        // rather than a more useful key and value pair (implementing that is a lab later :)
        int data;
        int height;

        Node (int data) {
            this.data = data;
            this.height = 1;
        }

    }
}