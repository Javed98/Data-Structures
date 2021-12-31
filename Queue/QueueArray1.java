import java.util.*;
class QueueArray{
  private int array[];
  int front;
  int back;
  int capacity;
  int currentSize;
  // constructor
  QueueArray(int size){
    this.capacity=size;
    array=new int[capacity];
    front=-1;
    back=-1;
    currentSize=0;
  }
  //Enqueue:add element 
  public boolean enqueue(int data){
    if(front<0){
      front++;
      back++;
    }
    if(isFull()) return false;
    if(back==capacity) back=0;
    array[back]=data;
    currentSize++;
    back++;
    return true;
  }
  //Dequeue:remove element
  public int dequeue(){
    if(isEmpty()) return 0;
    if(front==capacity) front=0;
    int data=array[front];
    array[front]=0;
    currentSize--;
    front++;
    return data;
  }
  //isEmpty():to check whether the queue is empty or not
  public boolean isEmpty(){
    if(currentSize==0) return true;
    else return false;
  }
  
  //isFull(): to check if queue is full
  
  public boolean isFull(){
    if(currentSize==capacity) return true;
    else return false;
  }
  
  //peek(): returns the topmost element
  
  public int peek(){
    return array[front];
  }
  
  //Display queue
  public void display(){
    
      System.out.println(Arrays.toString(array));
      
    
  }
}
