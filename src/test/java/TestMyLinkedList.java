import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMyLinkedList {

    @Test
    public void testIsMyLinkedListExist(){
        MyLinkedList myLinkedList = new MyLinkedList();
    }

    @Test
    public void testIsEmpty(){
        MyLinkedList myLinkedList = new MyLinkedList();
        assertEquals( true ,myLinkedList.isEmpty());
    }

    @Test
    public void testIsAppend(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(10);
        assertEquals( "10 ",myLinkedList.toString());
    }

    @Test
    public void testSizeOfLinkedList(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(10);
        myLinkedList.append(10);
        assertEquals( 2,myLinkedList.size());
    }

    @Test
    public void testIfDeleteValue(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.deleteWithValue(2);
        assertEquals( "1 ",myLinkedList.toString());
    }

    @Test
    public void testIfInsert(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.insert(1,99);
        assertEquals( "1 1 99 2 ",myLinkedList.toString());
    }





}
