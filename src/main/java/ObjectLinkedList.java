public class ObjectLinkedList {
    Node head;
    Node tail;
    int size;

    public class Node {
        Object data;
        Node next;
        Node prev;

        public Node(Object data) {
            this.data = data;
            this.next = null;
            this.prev = null;
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

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
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
            while (this.head.next != null) {
                this.head = head.next;
            }
            Node temp = this.getHead(); // moj head z pustym next
            nextNode.prev = temp;
            temp.setNext(nextNode); // ustawiam next w moim headzie na dany node
            size += 1;
        }
    }

    public void remove(Object item) {
        Node nextNode = new Node(item);
        Node temp = this.head;
        int len = this.getSize();
        for (int i = 0; i < len; i++) {
            if (head.getData() == item) {

                if (temp.getNext() != null && temp.getPrev() != null) {
                    temp.prev.setNext(temp.getNext());
                    temp.next.setPrev(temp.getPrev());
                    this.size -= 1;
                } else if (temp.getNext() == null) {
                    temp.prev.setNext(null);
                    this.setHead(temp.getNext());
                    this.size -= 1;
                } else {
                    temp.next.setPrev(null);
                    this.setHead(temp.getNext());
                    this.size -= 1;
                }
            } else {
                head = head.next;
            }

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
