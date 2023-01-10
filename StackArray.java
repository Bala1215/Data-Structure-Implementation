import java.util.Arrays;

public class StackArray{

  private  int capacity, top;
  int[] stackArr;
 
  public StackArray(int capacity){
      this.capacity = capacity;
      stackArr = new int[capacity];
      top = -1;
  }

  public String toString(){
      return this.stackArr;
  }
  
  public  boolean isFull(){
     return top == capacity ? true : false;
  }

  public boolean isEmpty(){
     return top == -1 ? true : false;
  }

  public  void push(int data){
     if(isFull()==false){
          stackArr[++top] = data;
      }
  }
  
  public int pop(){
    int topElement =-1;
     if(isEmpty()==false){
        topElement  = stackArr[this.top];
        this.top--;
       
     }
     return topElement;
  
 }

 public int peek(){
    return isEmpty()==false ? stackArr[this.top] : -1; 
 }

 public static void main(String[] args){
   //Creation of Stack using array  
   StackArray stackArray = new StackArray(5);
    
   stackArray.push(10);
   stackArray.push(20);
   System.out.println(Arrays.toString(stackArray.stackArr));
   System.out.println(stackArray.pop());
   System.out.println(Arrays.toString(stackArray.stackArr));
    
 }
  

}