import java.util.*;
import java.lang.*;

public class Stack_Userdefined1 {
    //intial capacity 
    static int capacity = 5;
    static int top = -1;
    static int stack[] = new int[capacity];
    static int data;
    static int index;
    static int element;

    //no of elements in the stack : top+1 => Reason : top initial value is -1, if stack is empty top+1 == 0 i.e, there is no element in the stack
    public static int size() {
        return top + 1;
    }

    //check whether the stack is full or not
    public static boolean isFull() {

        return (top + 1) == capacity;

    }

    //check whether the stack is empty or not 
    //when top==-1, stack is empty ie., there is no element in the stack 
    public static boolean isEmpty() {

        return top == -1;

    }

    //before push any element into the stack , check whether the stack is full. Reason : here , stack is implemented by array.
    //In java, array has a fixed size. if it's exceeds the size of the stack array , then we can't push the element into the stack
    public static void push(int data) {
        if (isFull()) {
            System.out.println("\nWARNING : \"Stack is overflowing....!\"\n");
        } else {
            stack[++top] = data;
            System.out.println("\n"+data + " is pushed into the Stack\n");
        }
    }

    public static void pop() {
        if (isEmpty()) {
            System.out.println("\nWARNING : \"Stack is underflowing.......!\"\n");
        } else
            data = stack[top--];
        System.out.println("\n"+data + " was poped from the Stack\n");

    }

    //return the element which is at the top of the stack
    public static int peek() {
        return stack[top];
    }

    public static void peep(int peep) {
        // this method is used to access the element at specified index in the stack array
        System.out.println("\nThe element at   " + peep + " : " + stack[top - peep + 1]+"\n");
    }


    public static void update() {

        stack[index] = element;
        System.out.println("\nAfter updation, the element at " + loc + " : " + stack[index]+"\n");
    }

    public static void display() {
        System.out.print("\n top : ");
        for (int index = top; index >= 0; index--) {
            System.out.print("\t | "+stack[index]+"\t   | Index : "+index);
            System.out.print("\n\t |_________|");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int choice;
        Stack_Userdefined1 sb = new Stack_Userdefined1();
        do {
            System.out.println("        Stack using Array");
            System.out.println("1. Resize the Stack");
            System.out.println("2. Push an element to the Stack");
            System.out.println("3. Pop the element from the Stack");
            System.out.println("4. Size of the Stack ");
            System.out.println("5. Is the Stack is full?");
            System.out.println("6. Is the Stack is empty?");
            System.out.println("7. Peek of the Stack");
            System.out.println("8. Display the Stack");
            System.out.println("9. Get Class of the Stack");
            System.out.println("10.Peep the element of the Stack");
            System.out.println("11.Update the element of the Stack");
            System.out.println("12. Exit");
            System.out.print("Enter your choice : ");
            Scanner key = new Scanner(System.in);
            choice = key.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("\nThe Stack is created\n");
                    break;
                }
                case 2: {
                    System.out.print("\nEnter the value to be pushed into the Stack :");
                    int value = key.nextInt();
                    push(value);
                    break;
                }
                case 3: {
                    pop();
                    break;
                }
                case 4: {
                    System.out.println("\nThe size of the Stack : " + size()+"\n");
                    break;
                }
                case 5: {
                    System.out.println("\nIs the Stack is full? " + isFull()+"\n");
                    break;
                }
                case 6: {
                    System.out.println("\nIs the Stack is empty? " + isEmpty()+"\n");
                    break;
                }
                case 7: {
                    System.out.println("\nPeek of the Stack : " + peek()+"\n");
                    break;
                }
                case 8: {
                    System.out.println("\nThe elements in the Stack : ");
                    display();
                    System.out.println();
                    break;
                }
                case 9: {
                    System.out.println("The class of the Stack : " + sb.getClass());
                    break;
                }
                case 10: {
                    System.out.println("Enter the index to search : ");
                    int peep = key.nextInt();
                    peep(peep);
                    break;
                }
                case 11: {
                    System.out.print("\nEnter the index of the element  to be updated : ");
                    index = key.nextInt();
                    System.out.println("\n");
                    System.out.print("\nEnter new value of the element  ");
                    element = key.nextInt();
                    update();
                    break;
                }
                case 12: {
                    System.out.println(" \n======= Exit ======== ");
                    break;
                }
                default:
                    System.out.println("\n Invalid choice");
                    break;
            }
        } while (choice != 12);

    }
}
