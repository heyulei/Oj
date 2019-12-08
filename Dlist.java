public class Dlist {
    static class DListNode {
        public DListNode pre;
        public DListNode next;
        public int val;

        public DListNode(int val) {
            this.val = val;
        }
    }

    static class DList {
        //DListNode node = new DListNode(-1);//傀儡节点
        static class DList {
            HomeWork12.DListNode node = new HomeWork12.DListNode(-1);//傀儡节点
            public void addIndex(HomeWork12.DListNode head, int index, int data) {
                HomeWork12.DListNode ret = null;
                int size = size(head);
                if (index == size){
                    addLast(head,data);
                    return;
                }
                if (size ==0 ){
                    addFirst(head,data);
                    return;
                }
                if (index>size||size<0){
                    return;
                }
                HomeWork12.DListNode cur = head.next;
                for (int i = 0;i < index; i++){
                    cur = cur.next;
                }
                HomeWork12.DListNode newNode = new HomeWork12.DListNode(data);
                newNode.next = cur.next;
                newNode.pre = cur;
                cur.next.pre = newNode;
                cur.next = newNode;
            }
            private int size (HomeWork12.DListNode head){
                int size = 0;
                HomeWork12.DListNode cur = head;
                while (cur.next!=head){
                    size++;
                    cur = cur.next;
                }
                return size;
            }
            public static void addLast(HomeWork12.DListNode head, int val) {
                if (head.next == null) {
                    addFirst(head,val);
                    return;
                }
                HomeWork12.DListNode newNode = new HomeWork12.DListNode(val);
                newNode.next = head;
                newNode.pre = head.next.pre;
                head.pre.next = newNode;
                head.pre = newNode;
            }
            public static void addFirst(HomeWork12.DListNode head, int val) {
                if (head.next == null) {
                    HomeWork12.DListNode newNode = new HomeWork12.DListNode(val);
                    head.next = newNode;
                    newNode.pre = head;
                    newNode.next = head;
                    head.pre = newNode;
                    return;
                }
                HomeWork12.DListNode newNode = new HomeWork12.DListNode(val);
                newNode.pre = head;
                newNode.next = head.next;
                head.next.pre = newNode;
                head.next = newNode;

            }


        }
    public static void main(String[] args) {
        DListNode head = new DListNode(-1);
        DList.addLast (head, 1);
        DList.addLast(head, 2);
        DList.addLast(head, 3);
        DList.addLast(head, 4);
    }
}

Stack<Integer> stack = new Stack<>();
