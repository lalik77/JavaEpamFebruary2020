package com.homeworks.hackerrank;

import java.util.Scanner;

class MyNode {
    Node left;
    Node right;
    int data;

    MyNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}



public class JavaHeightBinaryTree {


    /*Method recursiv for height of binary tree*/


    public static int height(Node root) {

        if (root == null)
            return -1;

        else {

            int ldepht = height(root.left);
            int rdepht = height(root.right);

            if (ldepht > rdepht) return (ldepht + 1);
            else return (rdepht + 1);

        }


    }


    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);


    }
}