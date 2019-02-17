public class Node {

    int number;
    Node nextNode;
    Node previousNode;


    public Node(int number) {
        this.number = number;
    }

    public int getDataFromNode(){
        return number;
    }

    public Node getNextNode(){
        return  nextNode;
    }

    public void setNextNode(int number){
        nextNode = new Node(number);
    }

    public Node getPreviousNode(){
        return  previousNode;
    }

    public void setPreviousNode(int number){
        previousNode = new Node(number);
    }



}
