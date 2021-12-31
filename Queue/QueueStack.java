import java.util.*;

class QueueStack{
  Stack s1=new Stack<Integer>();
  Stack s2=new Stack<Integer>();
  
  //enqueue(): insert element
  public void enqueue(int data){
    while(!s1.isEmpty()){
      s2.push(s1.pop());
    }
    s1.push(data);
    while(!s2.isEmpty()){
      s1.push(s2.pop());
    }
  }
  
  //dequeue(): removes an element
  public int dequeue(){
    if(s1.isEmpty()){
      System.out.println("queue is empty");
      return 0;
    }
    int data=(int)s1.peek();
    s1.pop();
    return data;
  }
  
  //display queue
  public void display(){
    System.out.println(s1);
  }
  
}
