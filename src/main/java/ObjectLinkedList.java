public class ObjectLinkedList {
    Node head;
    Node tail;
    int size;

    public class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public ObjectLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(Object item) {
        Node nextNode = new Node(item);
        if (head == null) {
            this.head = nextNode;
            this.size += 1;
        } else {
            while (head.next != null) {
                head = head.next;
            }
            head.next = nextNode;
            size += 1;
        }
    }

    public void remove(Object item) {
        int len = this.getSize();
        for (int i = 1; i < len; i++) {
            if (head.getData() == item) {
                this.head = nextNode;
                this.size -= 1;
            } else {
                head = head.next;
            }

        }
        if (head.getData() == item) {
            this.head = nextNode;
            this.size -= 1;
        } else {
            while (head.next != null) {
                head = head.next;
            }
            head.next = nextNode;
            size += 1;
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
