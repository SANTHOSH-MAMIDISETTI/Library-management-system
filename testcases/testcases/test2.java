package testcases;

public class test2 {
    class Priority {
        int p;
        int v;

        Priority(int p, int v) {
            this.p = p;
            this.v = v;
        }
    }

    int size;
    Priority[] arr;
    int front;
    int rear;

    test2(int s) {
        size = s;
        arr = new Priority[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        if (rear < 0) {
            return true;
        } else {
            return false;
        }
    }

    void add(int priorty, int value) {
        Priority pr = new Priority(priorty, value);
        if (size - 1 == rear) {
            System.out.println("\nQueue is full\n");
            return;
        } else if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = pr;
        for (int i = 0; i < rear + 1; i++) {
            for (int j = i + 1; j < rear + 1; j++) {
                if (arr[j].p < arr[i].p) {
                    Priority temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void getmin() {
        if (isEmpty()) {
            System.out.println("Empty priority queue!!");
            return;
        }
        System.out.println("min: " + "(" + arr[0].p + "," + arr[0].v + ")");
    }

    public void removemin() {
        if (isEmpty()) {
            System.out.println("Empty priority queue!!");
            return;
        }
        Priority temp = arr[0];
        rear = rear - 1;
        for (int i = 0; i < rear + 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Element removed: " + "(" + temp.p + "," + temp.v + ")");
    }

    public void displayQueue() {
        if (front == -1) {
            System.out.print("Queue is Empty");
            return;
        }
        System.out.print("Elements in the queue are: ");
        for (int i = front; i <= rear; i++) {
            System.out.print("(" + arr[i].p + "," + arr[i].v + ")");
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test2 obj = new test2(7);
        System.out.println(obj.isEmpty());
        obj.add(1, 21);
        obj.add(9, 17);
        obj.add(12, 43);
        obj.add(21, 132);
        obj.add(11, 77);
        obj.displayQueue();
        obj.getmin();
        obj.removemin();
        obj.displayQueue();
        obj.removemin();
        obj.displayQueue();
        obj.removemin();
        obj.displayQueue();
        obj.removemin();
        obj.displayQueue();
        obj.removemin();
        obj.displayQueue();
        System.out.println("Is Empty: " + obj.isEmpty());
        obj.removemin();
    }
}
//books