/**
 * Created by zemoso on 24/7/17.
 */
import java.util.*;

/**
 * Node class to define a data type containing data and the reference to the next Node.
 * @param <T> Generic defined to allow the node contain any data
 */
class Node<T>{
    /**
     * Data containing field variable
     */
    public T data;
    /**
     * Field containing the reference to the next node
     */
    public Node<T> next;

    /**
     * Default constructor initialising both the data and next node to null
     */
    public Node(){
        this.data = null;
        this.next = null;
    }

    /**
     * Constructor which takes data and put in the field data
     * @param data data to be stored
     */
    public Node(T data){
        this.data = data;
        this.next = null;
    }
}

/**
 * Class defined to form a single linked list which has reference only to the next object but not
 * the previous one
 * @param <T> Defined to have a generic linked list
 */
class SList<T>{
    /**
     * Field to define the head node of the list
     */
    public Node<T> head;

    /**
     * Default constructor to create a head node for the list
     */
    public SList(){
        head = new Node<T>();
    }

    /**
     * Method to return an iterator for the list
     * @return SList Iterator
     */
    public SListIterator<T> Iterator(){
        return new SListIterator<T>(this);
    }

    /**
     * Returns the data in the data in a string form
     * @return String of the data
     */
    public String toString(){
        if(head.data==null){
            return "List is empty";
        }
        else {
            Node<T> temp = this.head;
            String s = "SList : [";
            while (temp.next != null) {
                s = s + temp.data.toString() + ", ";
                temp = temp.next;
            }
            s = s + temp.data.toString() + "]";
            return s;
        }
    }
}

/**
 * Class iterator for the SList class
 * @param <T> Generic defined to compile with the SList class
 */
class SListIterator<T>{
    /**
     * Node head to have information of the head node of the list
     */
    private Node<T> head;
    /**
     * Point node to indicate the present node iterator pointing to
     */
    private Node<T> point;
    /**
     * list to store the parent list of the iterator
     */
    private SList<T> list;

    /**
     * Constructor to initialise the member variables of the iterator
     * @param list It is the linked list for which we are creating the iterator
     */
    public SListIterator(SList<T> list){
        this.head = list.head;
        this.point = new Node<T>();
        this.point.next = list.head;
        this.list = list;
    }

    /**
     * Method to data at the end of the list
     * @param data Data to be stored
     */
    public void add(T data){
        Node<T> temp = head;
        if(!this.isEmpty()){
            Node<T> node = new Node<T>(data);
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
        else{
            temp.data = data;
            temp.next = null;
        }

    }

    /**
     * Method to remove data at the end of the list
     */
    public void remove(){
        Node<T> temp = head;
        Node<T> prevTemp = new Node<T>();
        if(temp.next==null){
            temp.data=null;
        }
        else
        {
            while(temp.next !=null){
                prevTemp = temp;
                temp = temp.next;
            }

            prevTemp.next = null;
        }
    }

    /**
     * Method to add data at given index
     * @param index Index at which is to be added
     * @param data Data to be added
     */
    public void addAtIndex(int index,T data){
        Node<T> temp = head;
        Node<T> prevTemp = new Node<T>();
        Node<T> node = new Node<T>(data);
        int i = 0;
        if(this.isEmpty()){
            temp.data = data;
            temp.next = null;
        }
        else {
            while(i<index && temp != null){
                prevTemp = temp;
                temp = temp.next;
                i++;
            }
            if(temp == null){
                System.out.println("Index out of bounds");
            }
            else if(i==0){
                node.next = temp;
                list.head = node;
                head = list.head;
            }
            else{
                prevTemp.next = node;
                node.next = temp;
            }
        }

    }

    /**
     * Method to remove data at any given index
     * @param index Index at which data is to be removed
     */
    public void removeAtIndex(int index){
        Node<T> temp = head;
        Node<T> prevTemp = new Node<T>();
        int i=0;
        if(this.isEmpty()){
            System.out.println("Nothing to remove list is empty");
        }
        else{
            while(i<index && temp !=null){
                prevTemp = temp;
                temp = temp.next;
                i++;
            }
            if(temp == null){
                System.out.println("Index out of bounds....Can't remove");
            }
            else if(i==0){
                list.head = list.head.next;
                head = list.head;
            }
            else{
                prevTemp.next = temp.next;
            }
        }
    }

    /**
     * Method to return the next element the point referring to
     * @return Returns the data of the node
     * @throws NoSuchElementException if no next node
     */
    public T next()throws NoSuchElementException{
        if(point.next==null)
            throw new NoSuchElementException();
        else {
            point = point.next;
            return point.data;
        }
    }

    /**
     * Checks if the list has any next node
     * @return Returns true if list has next node else false
     */
    public Boolean hasNext(){
        if(point.next != null)
            return true;
        else
            return false;
    }

    /**
     * Checks if the list is empty
     * @return True if list is empty else false
     */
    public Boolean isEmpty(){
        if(head.data == null){
            return true;
        }
        else
            return false;
    }
}

public class TestSlist{
    public static void main(String[] args) {
        SList<Integer> list = new SList<Integer>();
        //System.out.println(head.toString());
        SListIterator<Integer> it = list.Iterator();
        System.out.println(list.toString());
        System.out.println(it.isEmpty());
        it.add(2);
        System.out.println(list.toString());
        it.remove();
        System.out.println(list.toString());
        it.addAtIndex(0,1);
        it.add(5);
        it.add(4);
        it.add(6);
        it.addAtIndex(3,3);
        it.addAtIndex(0,1);
        it.addAtIndex(2,100);
        it.removeAtIndex(0);
        it.removeAtIndex(0);
        it.removeAtIndex(0);
        it.removeAtIndex(3);
        //it.remove();
        System.out.println(it.isEmpty());
        System.out.println(list.toString());
    }
}


