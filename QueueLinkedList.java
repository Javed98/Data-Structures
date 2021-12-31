class QueueLinkedList{
 Node front;
 Node rear;
 
 class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next=null;
  }
}
//enqueue(): insert element
public void enqueue(int data){
  Node newNode=new Node(data);
  if(rear==null){
    front=rear=newNode;
  }else{
    Node temp=rear;
    rear.next=newNode;
    rear=newNode;
  }
 }
 
 //dequeue():remove element
 public int dequeue(){
  if(isEmpty()) return 0;
    int data=front.data;
    front=front.next;
    return data;
 }
 
 //isEmpty()
 public boolean isEmpty(){
   if(rear==null){
     return true;
   }
   return false;
 }
 
 //peek()
 public int peek(){
   return front.data;
 }
 
//display queue
public void display(){
  Node temp=front;
  while(temp !=null){
    System.out.print(temp.data+",");
    temp=temp.next;
  } System.out.println();
 }
}
