package org.example;

import java.util.*;
/**Implement contain and add method in Binary Search Tree**/
public class BinarySearchTree {
    static class BST {
        private Node root;

        public BST() {
            this.root = new Node();
        }

        public void put(int value) {
            // TODO: implement me
        }

        public boolean contains(int value) {
            // TODO: implement me

            if(root.val == value)
                return true;
            if(root.left != null)
                root.left.val.equals(value);
            if(root.right != null)
                root.right.val.equals(value);
            // no matching node was found
            return false;
        }

        public List<Integer> inOrderTraversal() {
            final ArrayList<Integer> acc = new ArrayList<>();
            inOrderTraversal(root, acc);
            return acc;
        }

        private void inOrderTraversal(Node node, List<Integer> acc) {
            if (node == null) {
                return;
            }
            inOrderTraversal(node.left, acc);
            inOrderTraversal(node.right, acc);
            acc.add(node.val);
        }

        private static class Node {
            Integer val;
            Node left;
            Node right;
        }
    }

    public static void testBST() {
        final BST searchTree = new BST();
        searchTree.put(3);
        searchTree.put(1);
        searchTree.put(2);
        searchTree.put(5);
        assertFalse(searchTree.contains(0));
        assertTrue(searchTree.contains(1));
        assertTrue(searchTree.contains(5));
        assertFalse(searchTree.contains(6));
        assertEquals(Arrays.asList(1, 2, 3, 5), searchTree.inOrderTraversal());
    }

    private static void assertFalse(boolean rez) {
        if (rez) {
            throw new RuntimeException("Test failed");
        } else {
            System.out.println("Test passed");
        }
    }

    private static void assertTrue(boolean rez) {
        if (!rez) {
            throw new RuntimeException("Test failed");
        } else {
            System.out.println("Test passed");
        }
    }

    private static void assertEquals(List<Integer> expected, List<Integer> result) {
        if (!expected.equals(result)) {
            System.out.println(String.format("Test failed \"%s\" not equeals to \"%s\"", expected, result));
        } else {
            System.out.println("Test passed");
        }
    }

    // TODO: write some more tests
    public static void main(String[] args) {
        testBST();
    }

}
