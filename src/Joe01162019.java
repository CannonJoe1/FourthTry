/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package joe01162019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;



/**
 *
 * @author Cannon
 */
public class Joe01162019 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // **************  Set  **************
        // Demonstrates that sets will not accept duplicates and, because they store
        // via use of a hash function, will not store in the order entered
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Joe");
        stringSet.add("Jim");
        stringSet.add("Joe");
        stringSet.add("Matt");
        stringSet.add("Tim");
        
        
        Iterator<String> iterator = stringSet.iterator();
        while(iterator.hasNext()) 
        {
            String name = iterator.next();
            System.out.println(name);
        }
        System.out.println("");

        
        // **************  List  **************        
        // Demonstrates that lists will allow duplicates and will store them 
        // in the order in which they are entered
        List<String> stringList = new ArrayList<>(); 
        stringList.add("Joe");
        stringList.add("Joe");
        stringList.add("Jim");
        stringList.add("Matt");
        stringList.add("Tim");
        
        for (int i = 0; i < stringList.size(); i++) 
        {
            String name = stringList.get(i);
            System.out.println(name);
        }
        System.out.println("");

        
        // **************  Map  **************
        // 1. Demonstrates the association between a string key and its associate
        // string value. 2. Shows they store via use of a hash function, which
        // means they will not store in the order entered. 3. Uses "put" rather
        // than "add" because of hash function use.
        Map<String, String> hashMap = new HashMap<>(); 
        hashMap.put("Al", "Toyota"); 
        hashMap.put("Danica", "Honda");
        hashMap.put("Takuma", "Honda");
        hashMap.put("Hélio", "Chevrolet");
        hashMap.put("Graham", "Honda");
        hashMap.put("Will", "Chevrolet");
        
        // Traverse via an iterator
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) 
        {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
        System.out.println("");

        
        // **************  Tree  **************
        // Demonstrates loading an integer binary tree and traversing it in 
        // preorder, postorder, and  inorder traversal
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(2);
        Node n4 = new Node(5);

        Binarytree tree = new Binarytree(3);    //           3
        tree.add(tree.root, n1, "left");        //         1/ \
        tree.add(tree.root, n2, "right");       //             4
        tree.add(n2, n3, "left");               //           2/ \
        tree.add(n2, n4, "right");              //                5

        tree.preorder(tree.root);       // output in preorder
        System.out.println("");
        tree.postorder(tree.root);      // output in postorder
        System.out.println("");
        tree.inorder(tree.root);        // output in inorder
        System.out.println("");
        
        
        // **************  Queue  **************
        // Implement the java queue interface using an implementing class, 
        // LinkedList, from a standard java library. Add values to the end
        // via the "offer" method and view the first via "peek", and pop them
        // via use of "remove" as a FIFO data structure.
        java.util.Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        queue.offer("f");
        queue.offer("g");
        queue.offer("h");
        queue.offer("i");
        queue.offer("j");
        queue.offer("k");
        queue.offer("l");
        queue.offer("m");

        System.out.println(queue.peek());

        while (queue.size() > 0)
        {
            System.out.println(queue.remove() + " ");
        }
        
        System.out.println(queue.peek());   // queue is empty so returns NULL
        System.out.println("");

        
        // **************  Stack  **************
        // Implementing the stack class shown below, push and pop into the LIFO
        // data structure
        Stack<String> arrayStack = new Stack<>();
        arrayStack.push("Ha ha!");

        arrayStack.push("New York");
	arrayStack.push("City,");
        arrayStack.push("New York");
        arrayStack.push("Size entry");

	System.out.println("Stack size after push : "+arrayStack.size());
        String topElement = arrayStack.pop();
        System.out.println(topElement);
	System.out.println("Topmost element : " + topElement);
	System.out.println("Stack size after pop : "+arrayStack.size());
        topElement = arrayStack.pop();
        System.out.println(topElement);
        topElement = arrayStack.pop();
        System.out.println(topElement);
        topElement = arrayStack.pop();
        System.out.println(topElement);
        topElement = arrayStack.pop();
        System.out.println(topElement);
        System.out.println("");
    }
    
}

class Stack<T> 
{
    private int currentElementPosition = 0;
    private Object[] elements;
    private final int INITIAL_SIZE = 10;

    /**
     * Constructor which initializes the array to be used as the stack
     */
    public Stack() 
    {
        elements = new Object[INITIAL_SIZE];
    }

    /**
     * Pop operation which retrieves topmost element from the stack
     * 
     * @return
     */
    @SuppressWarnings("unchecked")
    public T pop() 
    {
        // retrieve top most element
        T t = (T) elements[--currentElementPosition];
        // empty its position
        elements[currentElementPosition] = null;
        return t;
    }

    /**
     * Push operation which adds item to the stack
     * 
     * @param elementToPush
     */
    public void push(T elementToPush) 
    {
        // check if array is full
        if (currentElementPosition == elements.length) 
        {
                expandSize();
        }
        elements[currentElementPosition++] = elementToPush;
    }

    public int size() 
    {
        return currentElementPosition;
    }
 
    /**
     * Increases the size of the array by double its existing size
     */
    private void expandSize() 
    {
        int increasedSize = elements.length * 2;
        // create a new array with double size and copy existing contents into it
        elements = Arrays.copyOf(elements, increasedSize);
    }
}


class Binarytree
{
    public Node root;

    public Binarytree(int data)
    {
        root = new Node(data);
    }

    public void add(Node parent, Node child, String orientation)
    {
        if (orientation.equals("left"))
        {
           parent.setLeft(child);
        }
        else
        {
            parent.setRight(child);
        }
    }
    
    // output the tree's contents
    public void preorder(Node root) 
    {
        if(root !=  null) 
        {
          //Visit the node by Printing the node data  
          System.out.printf("%d ",root.key);
          preorder(root.left);
          preorder(root.right);
        }
    }
    
    
    public void postorder(Node root) 
    { 
        if(root !=  null) 
        {
          postorder(root.left);
          postorder(root.right);
          System.out.printf("%d ",root.key);
        }
    } 
  
    /* Given a binary tree, print its nodes in inorder*/
    void inorder(Node root) 
    { 
        if(root !=  null) 
        {
          inorder(root.left);
          System.out.printf("%d ",root.key);
          inorder(root.right);
        }
    } 
}

class Node 
{
    public int key;
    public Node left;
    public Node right;

    Node (int key) 
    {
        this.key = key;
        right = null;
        left = null;
    }

    public void setKey(int key) 
    {
        this.key = key;
    }

    public int getKey() 
    {
        return key;
    }

    public void setLeft(Node left) 
    {
        this.left = left;
    }

    public Node getLeft() 
    {
        return left;
    }

    public void setRight(Node right ) 
    {
        this.right = right;
    }

    public Node getRight() 
    {
        return right;
    }
}
