// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack Stones = new Stack(5);
        
      // Insert new elements into the stack
      Stones.push("Diamond");
      Stones.push("Corundum");
      Stones.push("Topaz");
      Stones.push("Quartz");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + Stones.size());
  
      // Show top element in the stack
      System.out.println("The Hardest stone is: " + Stones.peek());
  
      // Remove top element in the stack
      Stones.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      Stones.printStack();
  
      // Show top element in the stack
      System.out.println("The Hardest stone is: " + Stones.peek());
    }
  }
