package Assignment36;
class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    node head;

    public LL() {
        this.head = null;
    }

    void Display() {
        node temp = head;
        if (temp == null) {
            System.out.println("LL is Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    int Count() {
        int iCount = 0;
        node temp = head;
        while (temp != null) {
            iCount++;
            temp = temp.next;
        }
        return iCount;
    }

    void insertFirst(int data) {
        node newn = new node(data);

        if (head == null) {
            head = newn;
        } else {
            newn.next = head;
            head = newn;
        }
    }

    void insertLast(int data) {
        node newn = new node(data);
        node temp = null;
        if (head == null) {
            head = newn;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;
        }
    }

    void insertAtPos(int data, int iPos) {
        int iCount = 0, i = 0;
        iCount = Count();
        if (iPos < 0 || iPos > iCount) {
            System.out.println(" Invalid Position ");
            return;
        }
        if (iCount == 1) {
            insertFirst(data);
        } else if ((iCount + 1) == iPos) {
            insertLast(data);
        } else {

            node temp = null;
            node newn = new node(data);
            temp = head;

            for (i = 1; i < iPos - 1; i++) {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next = newn;
        }
    }

    void deleteFirst() {

        if (head == null) {
            System.out.println("LL is empty");
            return;
        } else if (head.next == null) {
            head = null;
            return;
        } else {
            node temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        } else if (head.next == null) {
            head = null;
            return;
        } else {
            node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void deleteAtPos(int iPos) {
        int iCount = 0, i = 0;
        iCount = Count();

        if (iPos < 0 || iPos > iCount) {
            System.out.println(" Invalid Position ");
            return;
        }

        if (iPos == 1) {
            deleteFirst();
        } else if (iPos==iCount) {
            deleteLast();
        } else {
            node temp = head;

            for (i = 1; i < iPos; i++) {
                temp = temp.next;
            }
            node target = temp.next;
            temp = temp.next.next;
            target.next = null;
        }
    }
}

public class program_36 {
    public static void main(String[] A) {
        LL linklist = new LL();
        linklist.insertFirst(1);
        linklist.insertFirst(2);
        linklist.insertLast(3);
        linklist.Display();
        System.out.println();
        linklist.insertAtPos(4, 3);
        linklist.Display();
        System.out.println();
        System.out.println();
        linklist.deleteFirst();
        linklist.Display();
        System.out.println();
        linklist.deleteLast();
        linklist.Display();
        System.out.println();
        linklist.deleteAtPos(2);
        linklist.Display();
    }
}


