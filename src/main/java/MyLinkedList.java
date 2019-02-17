public class MyLinkedList {

    private Node head;
    private Node end;
    private int listCount;


    public MyLinkedList(){
        listCount = 0;
    }

    public int getListCount() {
        return listCount;
    }


    public void append(int number){
        Node currentNode = head;
        if(head == null){
            head = new Node(number);
            return;
        }
        while( currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(number);
        listCount++;
    }

    public void prepend(int number){
        Node newHead = new Node(number);
        newHead.nextNode = head;
        head = newHead;
        listCount++;

    }

    public void deleteWithValue(int data){
        if(head == null) return;
        if(head.number == data){
            head = head.nextNode;
            return;
        }
        Node current = head;
        while(current.nextNode != null){
            if(current.nextNode.number == data){
                current.nextNode = current.nextNode.nextNode;
                listCount--;
                return;
            }
            current = current.nextNode;
        }
    }


    public void displayList(){
        Node current = head;
        while(current!=null) {
            int data = current.getDataFromNode();
            current = current.getNextNode();
            System.out.println(data);
        }
    }

    public String toString(){
        String tempList ="";
        Node current = head;
        while(current!=null) {
            int data = current.getDataFromNode();
            current = current.getNextNode();
            tempList = tempList+data ;
            tempList = tempList+" " ;
        }
        return tempList;
    }


    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int size = 0;
        Node currentNode = head;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.nextNode;
//            currentNode = currentNode.getNextNode();
        }
        return size;
    }


    public Node getNodeByIndex(int index){
        if (isEmpty() || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index);
        }
        Node currentNode = head;
        int currentIndex = index;
        while (currentIndex > 0) {
            if (currentNode == null) {
                throw new IndexOutOfBoundsException("Index " + index);
            }
            currentNode = currentNode.getNextNode();
            currentIndex--;
        }
        return currentNode;
    }

    public Boolean insert(int position , int value) {
        if (head == null && position == 0) {
            head = new Node(value);
            return true;
        }
        Node current = head;
        int counter = 0;
        while (null != current.nextNode && position > counter++){
            current = current.nextNode;
        }
        Node newNode = new Node(value);
        newNode.nextNode = current.nextNode;
        current.nextNode = newNode;

        return true;
    }


}
