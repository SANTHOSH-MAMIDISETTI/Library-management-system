import java.util.Scanner;
//public class test {
//    static class Node{
//        String data;
//        Node previous;
//        Node next;
//        public Node(String data) {
//            this.data = data;
//        }
//    }
//    Node head, tail = null;
//    public void addNode(String data) {
//        Node newNode = new Node(data);
//        if(head == null){
//            head = tail = newNode;
//            head.previous = null;
//            tail.next = null;
//        }
//        else {
//            tail.next = newNode;
//            newNode.previous = tail;
//            tail = newNode;
//            tail.next = null;
//        }
//    }
//    public void display() {
//        Node current = head;
//        if(head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//        while(current != null) {
//            System.out.print(current.data + "\n ");
//            current = current.next;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        test dList = new test();
//        dList.addNode(" 1. Biographies");
//        dList.addNode("2. Comics");
//        dList.addNode("3. Documentaries");
//        dList.addNode("4. Finance");
//        dList.addNode("5. General knowledge");
//        dList.addNode("6. History");
//        dList.addNode("7. Novels");
//        dList.addNode("8. Science Fiction");
//        dList.addNode("9. Subjects");
//        dList.display();
//        System.out.println("\nSelect the number: ");
//        int x = sc.nextInt();
//        switch (x){
//            case 1:
//                Biography();
//                break;
//            case 2:
//                Comics();
//                break;
//            case 3:
//                Documentaries();
//                break;
//            case 4:
//                Finance();
//                break;
//            case 5:
//                General_Knowledge();
//                break;
//            case 6:
//                History();
//                break;
//            case 7:
//                Novels();
//                break;
//            case 8:
//                Science_FIction();
//                break;
//            case 9:
//                Subjects();
//                break;
//
//            default:
//                System.out.println("\033[0;1m" + "Wrong Entry.... "+ "\u001B[0m");
//                // run function again in main code
//        }
//    }
//    public static void Biography(){
//        System.out.println("\033[0;1m" + "Biographies: "+ "\u001B[0m");
//
//    }
//    public static void Comics(){
//        System.out.println("\033[0;1m" + "Comics: "+ "\u001B[0m");
//    }
//    public static void Documentaries(){
//        System.out.println("\033[0;1m" + "Documentaries: "+ "\u001B[0m");
//    }
//    public static void Finance(){
//        System.out.println("\033[0;1m" + "Finance: "+ "\u001B[0m");
//    }
//    public static void General_Knowledge(){
//        System.out.println("\033[0;1m" + "General Knowledge: "+ "\u001B[0m");
//    }
//    public static void History(){
//        System.out.println("\033[0;1m" + "History: "+ "\u001B[0m");
//    }
//    public static void Novels(){
//        System.out.println("\033[0;1m" + "Novels: "+ "\u001B[0m");
//    }
//    public static void Science_FIction(){
//        System.out.println("\033[0;1m" + "Science Fiction: "+ "\u001B[0m");
//    }
//    public static void Subjects(){
//        System.out.println("\033[0;1m" + "Subjects: "+ "\u001B[0m");
//    }
//}
// Java code to implement binary search
// on Singly Linked List

// Node Class
// Java program to implement Binary Search for strings
//class test {
//
//    // Returns index of x if it is present in arr[],
//    // else return -1
//    static int binarySearch(String[] arr, String x)
//    {
//        int l = 0, r = arr.length - 1;
//        while (l <= r) {
//            int m = l + (r - l) / 2;
//
//            int res = x.compareTo(arr[m]);
//
//            // Check if x is present at mid
//            if (res == 0)
//                return m;
//
//            // If x greater, ignore left half
//            if (res > 0)
//                l = m + 1;
//
//                // If x is smaller, ignore right half
//            else
//                r = m - 1;
//        }
//
//        return -1;
//    }
//
//    // Driver method to test above
//    public static void main(String []args)
//    {
//        String[] arr = { "contribute", "geeks", "ide", "practice"};
//        Scanner sc = new Scanner(System.in);
//        String x = ;
//        int result = binarySearch(arr, x);
//
//        if (result == -1) {
//            System.out.println("Element not present");
//        }
//        else {
//            System.out.println("Element found at "
//                    + "index " + result);
//        }
//        System.out.println(arr[result]);
//    }
//
//}
// Java program to sort an array of strings using Trie

// Author : Rohit Jain
// GFG user_id : @rj03012002

import java.util.*;



//class test {
//
//    // Alphabet size
//    static final int MAX_CHAR = 26;
//
//    // trie node
//    static class Trie {
//
//        // index is set when node is a leaf
//        // node, otherwise -1;
//        int index;
//
//        Trie child[] = new Trie[MAX_CHAR];
//
//        /*to make new trie*/
//        Trie()
//        {
//
//            for (int i = 0; i < MAX_CHAR; i++)
//                child[i] = null;
//            index = -1;
//        }
//    }
//
//    /* function to insert in trie */
//    static void insert(Trie root, String str, int index)
//    {
//
//        Trie node = root;
//
//        for (int i = 0; i < str.length(); i++) {
//			/* taking ascii value to find index of
//		child node */
//            int ind = str.charAt(i) - 'a';
//
//            /* making new path if not already */
//            if (node.child[ind] == null)
//                node.child[ind] = new Trie();
//
//            // go to next node
//            node = node.child[ind];
//        }
//
//        // Mark leaf (end of word) and store
//        // index of word in arr[]
//        node.index = index;
//    }
//
//    /* function for preorder traversal */
//    static boolean preorder(Trie node, String arr[])
//    {
//
//        if (node == null) {
//
//            return false;
//        }
//
//        for (int i = 0; i < MAX_CHAR; i++) {
//
//            if (node.child[i] != null) {
//
//                /* if leaf node then print key*/
//                if (node.child[i].index != -1) {
//
//                    System.out.print(
//                            arr[node.child[i].index] + " ");
//                }
//
//                preorder(node.child[i], arr);
//            }
//        }
//        return false;
//    }
//
//    static void printSorted(String arr[], int n)
//    {
//
//        Trie root = new Trie();
//
//        // insert all keys of dictionary into trie
//        for (int i = 0; i < n; ++i) {
//
//            insert(root, arr[i], i);
//        }
//
//        // print keys in lexicographic order
//        preorder(root, arr);
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        String arr[] =new String[4];
//        int n = arr.length;
//        for (int i = 0; i <= 3; i++){
//            arr[i] = sc.nextLine();
//        }
//        printSorted(arr, n);
//    }
//}


// Java implementation to print
// the string in Lexicographical order
class GFG
{

    // Used for index in heap
    static int x = -1;

    // Predefining the heap array
    static String []heap = new String[1000];

    // Defining formation of the heap
    static void heapForm(String k)
    {
        x++;

        heap[x] = k;

        int child = x;

        String tmp;

        int index = x / 2;

        // Iterative heapiFy
        while (index >= 0)
        {

            // Just swapping if the element
            // is smaller than already
            // stored element
            if (heap[index].compareTo(heap[child]) > 0)
            {

                // Swapping the current index
                // with its child
                tmp = heap[index];
                heap[index] = heap[child];
                heap[child] = tmp;
                child = index;

                // Moving upward in the
                // heap
                index = index / 2;
            }
            else
            {
                break;
            }
        }
    }

    // Defining heap sort
    static void heapSort()
    {
        int left1, right1;

        while (x >= 0)
        {
            String k;
            k = heap[0];

            // Taking output of
            // the minimum element
            System.out.print(k + "\n ");

            // Set first element
            // as a last one
            heap[0] = heap[x];

            // Decrement of the
            // size of the string
            x = x - 1;

            String tmp;

            int index = 0;

            int length = x;

            // Initializing the left
            // and right index
            left1 = 1;

            right1 = left1 + 1;

            while (left1 <= length)
            {
                if (heap[index].compareTo(heap[left1]) <= 0 &&
                        heap[index].compareTo(heap[right1]) <= 0)
                {
                    break;
                }
                else
                {

                    // Swapping
                    if (heap[left1].compareTo(heap[right1])< 0)
                    {
                        tmp = heap[index];
                        heap[index] = heap[left1];
                        heap[left1] = tmp;
                        index = left1;
                    }

                    else
                    {
                        tmp = heap[index];
                        heap[index] = heap[right1];
                        heap[right1] = tmp;
                        index = right1;
                    }
                }

                // Changing the left index
                // and right index
                left1 = 2 * left1;
                right1 = left1 + 1;
            }
        }
    }

    // Utility function
    static void sort(String k[], int n)
    {

        // To heapiFy
        for (int i = 0; i < n; i++)
        {
            heapForm(k[i]);
        }

        // Calling heap sort function
        heapSort();
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        String arr[] = {"Zero to one\n", "Rich dad poor dad\n", "Atomic habits\n", "Harryporter\n"};
String[] arr = new String[4];
        int i = 0;
         while( i<=3){
             String input = sc.nextLine();
             arr[i] = input;
             i++;
         }
        int n = arr.length;
        sort(arr, n);
    }
}
