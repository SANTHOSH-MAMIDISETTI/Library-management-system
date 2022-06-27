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
        dList.addNode(" 1. Biographies");
        dList.addNode("2. Comics");
        dList.addNode("3. Documentaries");
        dList.addNode("4. Finance");
        dList.addNode("5. General knowledge");
        dList.addNode("6. History");
        dList.addNode("7. Novels");
        dList.addNode("8. Science Fiction");
        dList.addNode("9. Subjects");
        dList.display();
        System.out.println("\nSelect the number: ");
        int x = sc.nextInt();
        switch (x){
            case 1:
                Biography();
                break;
            case 2:
                Comics();
                break;
            case 3:
                Documentaries();
                break;
            case 4:
                Finance();
                break;
            case 5:
                General_Knowledge();
                break;
            case 6:
                History();
                break;
            case 7:
                Novels();
                break;
            case 8:
                Science_FIction();
                break;
            case 9:
                Subjects();
                break;

            default:
                System.out.println("\033[0;1m" + "Wrong Entry.... "+ "\u001B[0m");
                // run function again in main code
        }
    }
    public static void Biography(){
        System.out.println("\033[0;1m" + "Biographies: "+ "\u001B[0m");
        ;
    }
    public static void Comics(){
        System.out.println("\033[0;1m" + "Comics: "+ "\u001B[0m");
    }
    public static void Documentaries(){
        System.out.println("\033[0;1m" + "Documentaries: "+ "\u001B[0m");
    }
    public static void Finance(){
        System.out.println("\033[0;1m" + "Finance: "+ "\u001B[0m");
    }
    public static void General_Knowledge(){
        System.out.println("\033[0;1m" + "General Knowledge: "+ "\u001B[0m");
    }
    public static void History(){
        System.out.println("\033[0;1m" + "History: "+ "\u001B[0m");
    }
    public static void Novels(){
        System.out.println("\033[0;1m" + "Novels: "+ "\u001B[0m");
    }
    public static void Science_FIction(){
        System.out.println("\033[0;1m" + "Science Fiction: "+ "\u001B[0m");
    }
    public static void Subjects(){
        System.out.println("\033[0;1m" + "Subjects: "+ "\u001B[0m");
    }
}  