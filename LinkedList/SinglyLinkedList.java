import java.util.*;

class SinglyLinkedList{
    node head=null;
    node tail=null;
    
class node{
        int data;
        
        node next;
    //constructor
    node(int d){
            data=d;
            next=null;
        }
    }
    
//add node
public void addNode(int d){
    node newNode=new node(d);
    if(head==null){
        head=newNode;
        tail=newNode;
        }else{
                tail.next=newNode;
                tail=newNode;
        }
}
//display list 
public void display(){
    node n=head;
    
    if(head==null){
        System.out.println("list is empty");
    }
    while(n != null){
        System.out.print(n.data+" ");
        n=n.next;
    }
    System.out.println();
  }
//count node
public int countNode(){
  node n=head;
  int count=0;
  if(head==null){
    return 0;
  }
  while(n !=null){
    count++;
    n=n.next;
  }
  return count;
  }
//delete a node from beginning 
public void removeFirst(){
  if(head==null){
    System.out.println("list is empty");
  }else{
    if(head != tail){
      head=head.next;
    }else{
      head=tail=null;
    }
  }
  }
//delete a node from last
public void removeLast(){
  
  if(head==null){
    System.out.println("list is empty");
    return;
  }else{
    // if list contains more than 1 element
    if(head != tail){
      node n=head;
      while(n.next != tail){
        n=n.next;
      }
      tail=n;
      tail.next=null;
    }else{
      head=tail=null;
    }
      
    }
  }
//insert a node from beginning 
  public void addFirst(int d){
    node n=new node(d);
    //check if list is empty
    if(head==null){
     head=n;
     tail=n; 
    }else{
      node temp=head;
      head=n;
     head.next=temp; 
    }
  }
//insert a node from last
  public void addLast(int d){
  node newnode=new node(d);
  if(head==null){
    head=newnode;
    tail=newnode;
  }else{
    tail.next=newnode;
    tail=newnode;  
  }      
 }
//search node 
public void searchNode(int d){
  node n=head;
  int i=0;
  boolean flag=false;
  
    if(head==null){
      System.out.println("list is empty");
    }else{
      while(n != null){
        //compare value
        if(n.data==d){
        flag=true;  
        break;
        }
        i++;
        n=n.next;
      }
      if(flag){
        System.out.println("Element found at index : "+i);
      }else{
      System.out.println("Element not found ");  
      }
      
    }
  }
//reverse list 
public node reverse(node head){
  node current=head;
  node next=null;
  node prev=null;
  while(current != null){
    next=current.next;
    current.next=prev;
    prev=current;
    current=next;
  }
  return prev;
}
//insert at index i 
public node insertAt(node head, int position, int data){
  node current=head;
  node newnode=new node(data);
  int index=0;
  while(index<position-1){
    current=current.next;
    index++;
  }
  
  newnode.next=current.next;
  current.next=newnode;
  return head;
}

//check if list is palindrome or not
public boolean isPalindrome(){
  node fast=head;
  node slow=head;
  node prev;
  node temp;
  
  while(fast!=null &fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
  }
  prev=slow;
  slow=slow.next;
  prev.next=null;
  
  while(slow!=null){
    temp=slow.next;
    slow.next=prev;
    prev=slow;
    slow=temp;
  }
  
  slow=prev;
  fast=head;
  
  while(slow!=null){
    if(fast.data!=slow.data){return false;}
    fast=fast.next;
    slow=slow.next;
  }
  return true;
}

//compare two lists
static boolean compareLists(node head1, node head2) {
        node current1=head1;
        node current2=head2;
        while(current1!=null && current2!=null){
            if(current1.data != current2.data ){
                return false;
            }
            current1=current1.next;
            current2=current2.next;
        }
        if(current1!=null || current2!=null){return false;}
     return true;         
    }
//delete node with key
public node removeKey(node head,int key){
  node current=head;
  node temp=null;
  while(current !=null){
    if(current.next.data==key){
     temp=current.next.next;
     current.next=null;
     current.next=temp;
     //break;
    }
    current=current.next;
  }
  
  return head;
}


}
