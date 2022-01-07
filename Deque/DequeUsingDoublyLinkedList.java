
class DequeUsingDoublyLinkedList{
  Node head=null;
  Node tail=null;
  class Node{
    Node next;
    Node prev;
    int data;
    //constructor
    Node(int data){
      this.data=data;
    }
  }
  
  //addFirst(): Insert element at front 
  public void addFirst(int data){
    Node newNode=new Node(data);
    Node temp;
    if(isEmpty()){
      head=tail=newNode;
      head.prev=null;
      tail.next=null;
    }
    newNode.next=head;
    head.prev=newNode;
    head=newNode;
  }
  
  //addLast(): Insert Element at rear
  public void addLast(int data){
    Node newNode=new Node(data);
    if(isEmpty()){
      head=tail=newNode;
      head.prev=null;
      tail.next=null;
    }
    newNode.prev=tail;
    tail.next=newNode;
    tail=newNode;
  }
  
  //removeFirst(): remove front element 
  public int removeFirst(){
   Node temp;
   int data;
   if(isEmpty()){
     return -1;
   }
   temp=head;
   data=temp.data;
   head=head.next;
   head.prev=null;
   return data;
  }
  
  //removeLast(): Remove last element
  public int removeLast(){
    Node temp;
    int data;
    if(isEmpty()){
      return -1;
    }
    temp=tail;
    data=temp.data;
    tail=tail.prev;
    tail.next=null;
    return data;
  }
  
  //isEmpty(): To check Deque is empty or not
  public boolean isEmpty(){
   if(head==null){
     return true;
   } 
   return false;
  } 
  
  //size():size of Deque
  public int size(){
    Node temp=head;
    int count=0;
    while(temp!=null){
      count+=1;
      temp=temp.next;
    }
    return count;
  }
  
  //display(): Display Deque
  public void display(){
    Node temp=head;
    System.out.print("[");
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
    System.out.println("]");
  }
} 
    
