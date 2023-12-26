package datastructures.trees;

import java.util.*;

public class Main {
    public ArrayList<Node> depthFirstValue(Node root) {
        Stack<Node> stack = new Stack<Node>();
        ArrayList<Node> result = new ArrayList<Node>();
        if (root.value == 0)
            return result;
        stack.push(root);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            result.add(current);

            if (current.right != null)
                stack.push(current.right);

            if (current.left != null)
                stack.push(current.left);
        }
        return result;
    }

    public ArrayList<Node> breadthFirstValues(Node root) {
        ArrayList<Node> result = new ArrayList<Node>();
        if (root == null) {
            return result;
        }

        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.pollLast();
            result.add(current);
            if (current.left != null)
                queue.addFirst(current.left);
            if (current.right != null)
                queue.addFirst(current.right);

        }
        return result;
    }

    public boolean findElement(Node root, int target) {
        LinkedList<Node> queue = new LinkedList<>();
        if (root == null)
            return false;
        queue.addFirst(root);
        while (!queue.isEmpty()) {
            Node current = queue.pollLast();
            if (target == current.value) {
                return true;
            }
            if (current.left != null)
                queue.addFirst(current.left);
            if (current.right != null)
                queue.addFirst(current.right);
        }
        return false;
    }

    public boolean findElementRecursive(Node root, int target) {
        if (root == null)
            return false;
        if (target == root.value)
            return true;
        return findElement(root.left, target) || findElement(root.right, target);
    }

    public int treeSum(Node root) {
        if (root == null) {
            return 1;
        }
        return root.value + treeSum(root.left) + treeSum(root.right);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

//        ArrayList<Node> res = main.depthFirstValue(a);
        int res = main.treeSum(a);

        System.out.println(res);
//        res.forEach((n) -> System.out.println(n.value));
    }
}