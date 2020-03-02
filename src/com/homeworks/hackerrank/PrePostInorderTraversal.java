package com.homeworks.hackerrank;

import java.util.Scanner;

/*
   for test
 6
1 2 5 3 6 4
*
15
1 14 3 7 4 5 15 6 13 10 11 2 12 8 9

* */

class Node {

    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data=data;
        left = null;
        right = null;
    }
}



public class PrePostInorderTraversal {

    public static void preOrder(Node root) {
        if(root!=null) {

            System.out.print( root.data + " " );
            preOrder(root.left); // recursive call
            preOrder(root.right);
        }


    }

    public static void postOrder(Node root) {
        if(root!=null) {

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void inOrder(Node root) {

        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);

        }
    }

    public static Node insert (Node root,int data) {

        if ( root == null ) {
            return new Node(data);
        }else {

            Node cur;
            if( data <= root.data ) {

                cur = insert(root.left,data);
                root.left = cur ;
            }else {

                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }

    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//        Node root = null;
//        while(t-- > 0) {
//            int data = scan.nextInt();
//            root = insert(root, data);
//        }
//        scan.close();
//        preOrder(root);


        int[] treeValues = new int[]{1,14,3,7,4,5,15,6,13,10,11,2,12,8,9};
        Node r=null;

        for (int i=0 ; i < treeValues.length ; i++ ) {

            r=insert(r,treeValues[i]);

        }
        preOrder(r); // PLR - parent left right
        System.out.println();
        postOrder(r); // LRP - left right parent
        System.out.println();
        inOrder(r); // LPR - left parent right

    }


}
