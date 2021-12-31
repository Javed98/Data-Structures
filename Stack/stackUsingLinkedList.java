import java.util.*;

class stackUsingLinkedList{
  LinkedList list;
  //constructor
  stackUsingLinkedList(){
  list=new LinkedList<Integer>();
  }
  
  //push an element
  public void push(int data){
    list.addFirst(data);
  }
  
  //pop an element
  public int pop(){
    if(is_empty()){
      return 0;
    }
    int x=(int)list.getFirst();
     list.remove();
     return x;
  }
  // returns the topmost element
  public int peek(){
    if(is_empty()){
      return 0;
    }else{
      return (int)list.getFirst();
    }
    
  }
  // is_empty() : To check whether the stack is empty or not
  public boolean is_empty(){
    if(list.size()<=0){
      return true;
    }else{
      return false;
    }
  }
  //display the stack
  public void display(){
    for(int i=0;i<list.size();i++){
    System.out.print(list.get(i)+" ");
    }
    System.out.println();
  }
}
