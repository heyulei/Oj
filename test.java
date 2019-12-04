public class Test {
    static class DListNode {
        public DListNode pre;
        public DListNode next;
        public int val;

        public DListNode(int val) {
            this.val = val;
        }
    }

    static class DList {
        DListNode node = new DListNode(-1);//傀儡节点
        public static void addFirst(DListNode head, int val) {
            if (head.next == null) {
                DListNode newNode = new DListNode(val);
                head.next = newNode;
                newNode.pre = head;
                newNode.next = head;
                head.pre = newNode;
                return;
            }
            DListNode newNode = new DListNode(val);
            newNode.pre = head;
            newNode.next = head.next;
            head.next.pre = newNode;
            head.next = newNode;

        }
        static void display(DListNode head){

        }

    }
    public static void main(String[] args) {
        DListNode head = new DListNode(-1);
        DList.addFirst(head, 1);
        DList.addFirst(head, 2);
        DList.addFirst(head, 3);
        DList.addFirst(head, 4);
    }
}

