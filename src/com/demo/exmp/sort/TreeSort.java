package com.demo.exmp.sort;

public class TreeSort {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(3, "John");
        tree.insert(8, "T1000");
        tree.insert(1, "Sara");
        tree.insert(2, "T800");

        Node findJohn = tree.find(3);
        findJohn.printNode();

        tree.print(findJohn);
    }
    public static class Node {
        public int key;
        public String data;
        public Node leftChild;
        public Node rightChild;
        public void printNode() {
            System.out.println("KEY " + key + " DATA: " + data);
        }
    }
    public static class Tree {
        Node root;
        public Node find(int key) {
            Node current = root;
            while (current.key != key) {
                if (current.key < key) {
                    current = current.leftChild;
                } else {
                    current = current.rightChild;
                }
                if (current == null) {
                    return null;
                }
            }
            return current;
        }
        public void insert(int key, String data) {
            Node node = new Node();
            node.key = key;
            node.data = data;
            if (root == null) {
                root = node;
            } else {
                Node current = root;
                Node prev = null;
                while (true) {
                    prev = current;
                    if (key < prev.key) {
                        current = current.leftChild;
                        if (current == null) {
                            prev.leftChild = node;
                            return;
                        }
                    } else {
                        current = current.rightChild;
                        if (current == null) {
                            prev.rightChild = node;
                            return;
                        }
                    }
                }
            }
        }
        public void print(Node startNode) {
            if (startNode != null) {
                print(startNode.leftChild);
                startNode.printNode();
                print(startNode.rightChild);
            }
        }
    }
}