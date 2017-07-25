import java.util.*;
/**
 * Class iterator for the SList class
 * @param <T> Generic defined to compile with the SList class
 */
public class SListIterator<T>{
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