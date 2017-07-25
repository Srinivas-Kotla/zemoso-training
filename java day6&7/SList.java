/**
 * Class defined to form a single linked list which has reference only to the next object but not
 * the previous one
 * @param <T> Defined to have a generic linked list
 */
public class SList<T>{
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