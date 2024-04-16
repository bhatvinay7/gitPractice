// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Queue {
  static int front; // Corrected spelling
  static int rear;
  static int[] array;
  static int size;

  public Queue(int size) {
    front = -1;
    rear = -1;
    array = new int[size];
    this.size = size;
  }

  public static boolean isEmpty() {
    if(front == -1 && rear==-1){
        return true;
    }
    return false;// Check both front and rear
  }

  public static boolean isFull() {
    return (rear + 1) % size == front; // Handle wrap-around
  }

  public static void add(int value) {
    if (isFull()) {
      System.out.println("Queue is full");
      return;
    }
    if (front == -1) {
      front = 0;
    }
    rear = (rear + 1) % size; // Handle wrap-around
    array[rear] = value;
  }

  public static int remove() {
    if (isEmpty()) {
      return -1;
    }
    int pop = front;
    front = (front + 1) % size; // Handle wrap-around
    return array[pop];
  }

  public static int peek() {
    if (!isEmpty()) {
      return array[front];
    }
    return -1; // Indicate empty queue
  }

  public static void print() {
    if (!isEmpty()) {
      int temp = front;
    //   System.out.print(array[temp] + " "); // Removed the extra space before array[temp]
      while (temp != rear) { // Iterate until reaching rear
        System.out.print(array[temp] + " ");
        temp = (temp + 1) % size; // Handle wrap-around
      }
      System.out.println(array[rear]); // Print the last element
    } else {
      System.out.println("Queue is empty");
    }
  }

  public static void main(String[] args) {
    Queue obj = new Queue(4);
    Queue.add(1);
    Queue.add(2);
    Queue.add(3);
    Queue.add(4);
    Queue.print();
    Queue.remove();
    Queue.add(0);
    Queue.print();
  }
}

