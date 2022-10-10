
import java.util.*;

class stack {
    static int j = 0;
    int size;
    int s;
    int a[] = null;

    stack() {
        size = 8;
        s = size;
        a = new int[size];
    }

    stack(int size) {
        this.size = size;
        s = size;
        a = new int[size];
    }

    public void enqueue(int v) {
        a[--size] = v;
        // System.out.println(a[j-1]);
    }

    public void print() {
        System.out.println(Arrays.toString(a));
        // if(a!=null)
        // {
        // a = null;

        // }
    }

    public void dequeue() {
        a = null;
        // a = new int[8];
    }

    public boolean empty() {
        if (a == null)
            return true;
        else
            return false;
    }

    public int getSize() {
        return s;
    }
    // last in first out
}

class queue {
    static int j = 0;
    // first in first out
    int size;
    int a[] = null;

    queue() {
        size = 8;
        a = new int[size];
    }

    queue(int size) {
        this.size = size;
        a = new int[size];
    }

    public void enqueue(int v) {
        a[j++] = v;
        // System.out.println(a[j-1]);
    }

    public void dequeue() {
        a = null;
        // a = new int[8];
    }

    public boolean empty() {
        if (a == null)
            return true;
        else
            return false;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        System.out.println(Arrays.toString(a));

    }
}

public class stack_que {
    public static void main(String[] args) {

        queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.print();
        System.out.println("Size of the queue is :  " + q.getSize());
        q.dequeue();
        System.out.println(q.empty());
        q = new queue();
        System.out.println(q.empty());

        stack s = new stack();
        s.enqueue(1);
        s.enqueue(2);
        s.enqueue(3);
        s.print();
        System.out.println("Size of the stack is :  " + s.getSize());
        s.dequeue();
        System.out.println(s.empty());
        s = new stack();
        System.out.println(s.empty());
    }
}