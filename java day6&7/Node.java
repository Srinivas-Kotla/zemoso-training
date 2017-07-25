/**
 * Node class to define a data type containing data and the reference to the next Node.
 * @param <T> Generic defined to allow the node contain any data
 */
public class Node<T>{
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