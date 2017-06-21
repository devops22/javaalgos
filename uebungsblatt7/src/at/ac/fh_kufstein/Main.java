package at.ac.fh_kufstein;

public class Main {

    public static void main(String[] args) {

        Node rootnode = new Node(100);

        insertAtBegin(rootnode, 10);
        append(rootnode, 23);
        delete(rootnode, 10);
        printList(rootnode);



    }

    static class Node
    {
        int val;
        Node next;
        Node (int i){
            val = i;
            next = null;
        }
    }


    static Node insertAtBegin(Node root, int value)
    {

        Node NewRoot;
        NewRoot = new Node(value);
        NewRoot.next = root;
        return NewRoot;
    }

    static Node append(Node root, int value)
    {
        Node currentNode = root;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        Node newNode = new Node(value);
        currentNode.next = newNode;
        return root;
    }

    static void printList(Node root)
    {
        Node currentNode = root;
        while(currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
        return;
    }

    static Node delete(Node root,int value)
    {
        Node currentNode = root;
        while(currentNode != null) {
            if ((currentNode.next).val == value) {
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }
        if (root.val == value) root = root.next;
        return root;
    }

    static Node insertOrdered(Node root,int value)
    {
        Node currentNode = root;
        if (currentNode.val > value)
        {
            Node NewRoot = new Node(value);
            NewRoot.next = root;
            return NewRoot;
        }
        else{
            while (currentNode.next != null && (currentNode.next).val <= value) {
                currentNode = currentNode.next;
            }
            Node InsertedNode = new Node(value);
            InsertedNode.next = currentNode.next;
            currentNode.next = InsertedNode;
            return root;
        }
    }

    static Node bubbleSortListe(Node root, int Laenge)
    {
        Node currentNode = root;
        for(int i = 0; i <Laenge; i++)
        {
            while(currentNode.next != null)
            {
                if (currentNode.val > currentNode.next.val) {
                    int temp = currentNode.val;
                    currentNode.val = currentNode.next.val;
                    currentNode.next.val = temp;
                }
                currentNode = currentNode.next;
            }
        }
        return root;
    }

    static Node InsertionSortListe(Node root)
    {
        Node RootSortedList = new Node(root.val);
        Node currentNode = root;
        while(currentNode.next != null)
        {
            RootSortedList = insertOrdered(RootSortedList,currentNode.next.val);
            currentNode = currentNode.next;
        }
        return RootSortedList;
    }


}
