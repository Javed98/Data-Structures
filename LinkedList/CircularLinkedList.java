class CircularLinkedList{
  node head;
  node tail;
  
  class node{
    int data;
    node next;
    
    //constructor 
    node(int data){
      this.data=data;
      next=null;
    }
  }

//add node 
public void addNode(int data){
  node newNode=new node(data);
  if(head==null){
    head=newNode;
    tail=newNode;
    tail.next=head;
  }else{
    tail.next=newNode;
    tail=newNode;
    tail.next=head;
  }
}
//add node at beginning
public void addFirst(int data){
  node newNode=new node(data);
  node temp;
  temp=head;
  head=newNode;
  head.next=temp;
  tail.next=head;
}

//add at index
public void add(int position,int data){
  node current=head;
  node newNode=new node(data);
  node temp;
  int index=0;
  if(position==0){
    head=newNode;
  }
  while(index<position-1){
    current=current.next;
    index++;
  }
  temp=current.next.next;
  current.next=newNode;
  newNode.next=temp;
}

//display list
public void display(){
  node current=head;
  if(head==null){
    System.out.println("List is Empty");
    return;
  }
  
  do{
    System.out.print(current.data+" ");
    current=current.next;
  }while(current != head);
  System.out.println();
}
//length of list
int count=0;
public int lengthOfList(){
  node current=head;
  if(head==null){
    return count;
  }
    do{
      count++;
      current=current.next;
    }while(current != head);
    
  return count;
 }
//reverse list
public node reverse(node head){
  node prev=null;
  node next=null;
  node current=head;
  if(head==null){
    return null;
  }
  do{
    next=current.next;
    current.next=prev;
    prev=current;
    current=next;
  }while(current != head);
  head.next=prev;
  head=prev;
  return head;
 } 
 //delete node from beginning
 public void removeFirst(){
   node temp;
   temp=head.next;
   tail.next=temp;
   head=temp;
 }
 
 //delete node from end
 public void removeLast(){
   node current=head;
   node temp;
   do{
     current=current.next;
   }while(current.next!=tail);
   temp=tail.next;
   current.next=temp;
   tail=null;
   tail=current;
 }
 //delete with index
 public void remove(int i){
   node current=head;
   node temp;
   int index=0;
   if(i<1){
     head=null;
     return;
   }
     while(index<i-1){
       index++;
       current=current.next;
     }
     temp=current.next.next;
     current.next=null;
     current.next=temp;
   }
   
}
