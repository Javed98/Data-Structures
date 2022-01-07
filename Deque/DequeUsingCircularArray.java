 class DequeUsingCircularArray{
  //final int MAX=100;
  int front=-1;
  int rear=0;
  int size;
  int arr[];
  //constructor
  DequeUsingCircularArray(int size){
    this.size=size;
    arr=new int[size];
  }
  
  //insertFirst(): This method is used to insert element at front
  public void insertFirst(int data){
    if(isFull()){
     return;
    }else if(isEmpty()){
      front=0;
      rear=0;
    }else if(front==0){
      front=size-1;
    }else{
      front=front-1;
    }
    arr[front]=data;
      
  }
  
  //insertLast(): This method is used to insert element at last 
  public void insertLast(int data){
    if(isFull()){
      return;
    }else if(isEmpty()){
      front=0;
      rear=0;
    }else if(rear==size-1){
      rear=0;
    }else{
      rear=rear+1;
    }
    arr[rear]=data;
  }

  //removeFirst(): This  method is used to remove element from front
public int removeFirst(){
  if(isEmpty()){
    return -1;
  }
  int temp=arr[front];
  front++;
  return temp;
}
  
  //removeLast(): This method is used to remove element from last
  public int removeLast(){
    if(isEmpty()){
      return -1;
    }
    int temp=arr[rear];
    rear--;
    return temp;
  }
  //getFirst(): This method is used to get the head value i.e first element
  public int getFirst(){
    if(isEmpty()){
      return -1;
    }
    return arr[front];
  }
  
  //getLast(): This method is used to get the last element 
  public int getLast(){
    if(isEmpty()){
      return -1;
    }
    return arr[rear];
  }
  
  //search(int data): This method is used to search element in Deque if present
  
  //isFull(): To check if Deque is full
  public boolean isFull(){
    if(front==0 && rear==size-1 || front==rear+1){
      return true;
    }
    return false;
  }
  
 //isEmpty(): To check if Deque is empty
 public boolean isEmpty(){
   if(front==-1){
     return true;
   }
   return false;
 } 
 
 // display Deque 
 public void display(){
   int temp=front;
   System.out.print("[");
   if(temp==0){
   while(temp<rear+1){
     System.out.print(arr[temp]+" ");
     temp++;   
      }
   }else{
         int prev=temp;
         while(temp<size){
           System.out.print(arr[temp]+" ");
           temp++;
          }
          
          temp=0;
           while(temp<rear+1){
           System.out.print(arr[temp]+" ");
           temp++;
           }
        }
  System.out.println("]");
 }
}
