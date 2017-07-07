import java.util.*;
class SList<T>{
 		public T data;
 		public  SList<T> next;

 		public SList(){
 			this.data = null;
 			this.next = null;
 		}

 		public SList(T data){
 			this.data = data;
 			this.next = null;
 		}

 		public SListIterator<T> Iterator(){
 			return new SListIterator<T>(this);
 		}

 		public String toString(){
 			SList<T> temp = this;
 			String s = "SList : [";
 			while(temp.next!=null){
 				s = s+ temp.data.toString()+", ";
 				temp = temp.next;
 			}
 			s = s+temp.data.toString()+"]";
 			return s;
 		}
}

class SListIterator<T>{
	private SList<T> head;
	private SList<T> point;
	public SListIterator(SList<T> head){
		this.head = head;
		this.point = new SList<T>();
		this.point.next = head;
	}
	public void add(T data){
			SList<T> temp = head;
			if(!this.isEmpty()){
 			SList<T> node = new SList<T>(data);
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

	public void remove(){
 			SList<T> temp = head;
 			SList<T> prevTemp = new SList<T>();
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

	public T next()throws NoSuchElementException{
			if(point.next==null)
					throw new NoSuchElementException();
			else {
				point = point.next;
				return point.data;
			}
	}

	public Boolean hasNext(){
			if(point.next != null)
 			return true;
 			else 
 			return false;
	}

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
		SList<Integer> head = new SList<Integer>();
		//System.out.println(head.toString());
		SListIterator<Integer> it = head.Iterator();
		System.out.println(it.isEmpty());
		it.next();
		//it.remove();
		it.add(5);

		//it.add(6);
		//it.remove();
		System.out.println(it.isEmpty());
		//System.out.println(head.toString());
	}
}

