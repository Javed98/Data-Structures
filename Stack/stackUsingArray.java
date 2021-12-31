class stackUsingArray{
  int stack[];
  
  //constructor
  staxkUsingArray(int size){
    stack=new int[size];
  }
  
  int top=-1;
  
  //push item 
  public boolean push(int data){
    
    if(top==stack.length-1){
      System.out.println("Overflow!!");
      return false;
    }else{
      top++;
      stack[top]=data;
      return true;
    }
  }

  //pop item
  public int pop(){
    if(is_empty()){
      System.out.println("Underflow");
      return 0;
    }else{
      int x=stack[top];
      top--;
      return x;
    }
  }
  
  //peek : return element at top
  public int peek(){
    if(top<0){
      return 0;
    }
    return stack[top];
  }
  
  //isEmpty(): To check whether stack is empty or not
  public boolean is_empty(){
    if(top>=0){
      return false;
    }else{
      return true;
    }
  }
  //display stack
  public void display(){
    for(int i=top;i>=0;i--){
      System.out.print(stack[i]+" ");
    }
    System.out.println();
  }
  
  
}
