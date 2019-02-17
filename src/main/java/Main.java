

public class Main {


    public static void main(String[] args) {

        MyLinkedList linkedList01 = new MyLinkedList();
        System.out.println( linkedList01.isEmpty() );
        linkedList01.append(10);
        linkedList01.append(110);
        linkedList01.append(20);
        linkedList01.append(2210);

        linkedList01.prepend(55);
        linkedList01.prepend(5);

        linkedList01.insert(2,3000);


        System.out.println(linkedList01.toString() );

        System.out.println( linkedList01.isEmpty() );

        System.out.println( "Size of linkedlist : "+ linkedList01.size() );

    }



}
