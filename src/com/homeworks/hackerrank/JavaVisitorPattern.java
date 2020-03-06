package com.homeworks.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

enum Color {
    RED,
    GREEN

}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color , int depth) {
        super(value,color,depth);
    }

    @Override
    public void accept(TreeVis visitor) {
        visitor.visitNode(this);
        for (Tree child : children )
            child.accept(visitor);
    }

    public void addChild(Tree child) {
        children.add(child);
    }


}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);

    }
}

abstract class TreeVis {

    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);
}
/* SumInLeavesVisitor class  */
class SumInLeavesVisitor extends TreeVis {

    private int result =0;
    public int getResult() {
        //implement this
        return result;
    }

    public void visitNode(TreeNode node) {
        //implement this
        // nothing to do
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        result+=leaf.getValue();
    }
}

/*Product of red nodes clas*/

class ProductOfRedNodesVisitor extends TreeVis {
    private long result = 1;
    private final int M = 1000000007;

    public int getResult() {
        //implement this
        return (int)result;
    }

    public void visitNode(TreeNode node) {

        if(node.getColor() == Color.RED ) {
            result = (result * node.getValue()) % M;
        }
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if (leaf.getColor() == Color.RED) {

            result = ( result * leaf.getValue() )% M;
        }
    }
}

/*Fancy visitor class */

class FancyVisitor extends TreeVis {
    private int nonLeafEventDephthSum = 0;
    private int greenLeavesSum = 0;


    public int getResult() {
        //implement this
        return Math.abs( nonLeafEventDephthSum - greenLeavesSum);
    }

    public void visitNode(TreeNode node) {
        if( node.getDepth() % 2 == 0 ) {
            nonLeafEventDephthSum += node.getValue();
        }
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if( leaf.getColor() == Color.GREEN ) {

            greenLeavesSum += leaf.getValue();
        }

    }
}

public class JavaVisitorPattern {
    private static int [] values;
    private static Color[] colors;
    private static HashMap < Integer,HashSet<Integer> > map;


    /* Recursively adds children of a TreeNode */
    private static void addChildren(TreeNode parent, Integer parentNum) {
        /* Get HashSet of children and loop through them */
        for (Integer treeNum : map.get(parentNum)) {
            map.get(treeNum).remove(parentNum); // removes the opposite arrow direction

            /* Add child */
            HashSet<Integer> grandChildren = map.get(treeNum);
            boolean childHasChild = (grandChildren != null && !grandChildren.isEmpty());
            Tree tree;
            if (childHasChild) {
                tree = new TreeNode(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
            } else {
                tree = new TreeLeaf(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
            }
            parent.addChild(tree);

            /* Recurse if necessary */
            if (tree instanceof TreeNode) {
                addChildren((TreeNode) tree, treeNum);
            }
        }
    }


    public static Tree solve() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /* Writing nodes and colors */
        values = new int[n];
        colors = new Color[n];
        map = new HashMap(n);

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt() == 0 ? Color.RED : Color.GREEN;
        }

        /* Writing edges */
        for (int i = 0; i < n - 1; i++) { // loop3 : begin of loop 3
            int u = sc.nextInt();
            int v = sc.nextInt();

            /* Edges are undirected: Add 1st direction */
            HashSet<Integer> uNeighbors = map.get(u);
            if (uNeighbors == null) {
                uNeighbors = new HashSet();
                map.put(u, uNeighbors);
            }
            uNeighbors.add(v);

            /* Edges are undirected: Add 2nd direction */
            HashSet<Integer> vNeighbors = map.get(v);
            if (vNeighbors == null) {
                vNeighbors = new HashSet();
                map.put(v, vNeighbors);
            }
            vNeighbors.add(u);
        } // end of loop 3
        sc.close();

        /* Handle 1-node tree */
        if (n == 1) {
            return new TreeLeaf(values[0], colors[0], 0);
        }

        /* Create Tree */
        TreeNode root = new TreeNode(values[0], colors[0], 0);
       addChildren(root, 1);
        return root;


        //read the tree from STDIN and return its root as a return value of this function


    }

    /* for Test
    * 5
      4 7 2 5 12
      0 1 0 0 1
      1 2
      1 3
      3 4
      3 5
    *
    * */

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }


}


