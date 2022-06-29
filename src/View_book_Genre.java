import java.util.Scanner;
public class View_book_Genre extends Library {
    static class Node{
        String data;
        Node previous;
        Node next;
        public Node(String data) {
            this.data = data;
        }
    }
    Node head, tail = null;
    public void addNode(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data + "\n ");
            current = current.next;
        }
    }
    public static void viewbookgenre() {
        Scanner sc = new Scanner(System.in);
        View_book_Genre dList = new View_book_Genre();
        dList.addNode(" 1. Comics");
        dList.addNode("2. Programming Books");
        dList.addNode("3. Engineering Books");
        dList.addNode("4. Best Sellers");
        dList.addNode("5. Famous People Recommends");
        dList.addNode("6. Science Fiction");
        dList.addNode("7. Bohemian Literature");
        dList.addNode("8.  Novels etc...");
        dList.display();
        System.out.println("\nSelect the number: ");
        int x = sc.nextInt();
        switch (x){
            case 1:
                Comics();
                break;
            case 2:
                Programming_Books();
                break;
            case 3:
                Engineering_books();
                break;
            case 4:
                Best_Sellers();
                break;
            case 5:
                Famous_people_recommends();
                break;
            case 6:
                Science_fiction();
                break;
            case 7:
                Bohemian_literature();
                break;
            case 8:
                Others();
                break;
            default:
                System.out.println("\033[0;1m" + "Wrong Entry.... "+ "\u001B[0m");
                // run function again in main code
        }
    }
    public static void Programming_Books(){
        System.out.println("\033[0;1m" + "Programming Books: "+ "\u001B[0m");
    }
    public static void Comics(){
        System.out.println("\033[0;1m" + "Comics: "+ "\u001B[0m");
    }
    public static void Engineering_books(){
        System.out.println("\033[0;1m" + "Documentaries: "+ "\u001B[0m");
    }
    public static void Best_Sellers(){
        System.out.println("\033[0;1m" + "Finance: "+ "\u001B[0m");
    }
    public static void Famous_people_recommends(){
        System.out.println("\033[0;1m" + "General Knowledge: "+ "\u001B[0m");
    }
    public static void Science_fiction(){
        System.out.println("\033[0;1m" + "History: "+ "\u001B[0m");
    }
    public static void Bohemian_literature(){
        System.out.println("\033[0;1m" + "Novels: "+ "\u001B[0m");
    }
    public static void Others(){
        System.out.println("\033[0;1m" + "Science Fiction: "+ "\u001B[0m");
    }

}  