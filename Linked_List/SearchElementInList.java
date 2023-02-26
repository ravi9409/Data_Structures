public class SearchElementInList<T> {
    //Node inner class for SLL
    public class Node {
        public T data;
        public Node nextNode;

    }

    public Node headNode; //head node of the linked list
    public int size;      //size of the linked list

    //Constructor - initializes headNode and size
    public SearchElementInList() {
        headNode = null;
        size = 0;
    }

    //Helper Function that checks if List is empty or not
    public boolean isEmpty() {
        if (headNode == null) return true;
        return false;
    }

    //Inserts new data at the start of the linked list
    public void insertAtHead(T data) {
        //Creating a new node and assigning it the new data value
        Node newNode = new Node();
        newNode.data = data;
        //Linking head to the newNode's nextNode
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    public void insertAfter(T data, T previous) {
      Node newNode=new Node();
      newNode.data=data;
      Node currentNode=headNode;
      while(currentNode!=null && !currentNode.data.equals(previous)){
          currentNode=currentNode.nextNode;
      }
      newNode.nextNode=currentNode.nextNode;
      currentNode.nextNode=newNode;
      size++;
    }

    // Helper Function to printList
    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = headNode;
        System.out.print("List : ");
        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " -> ");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null");
    }

    public boolean searchElement(T data){
        Node node=headNode;
        while(node.nextNode!=null){
            node=node.nextNode;
            if(node.data.equals(data)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        SearchElementInList<Integer> sll = new SearchElementInList<Integer>();
        sll.printList();
        for (int i = 1; i <= 10; i++) {
            sll.insertAtHead(i);
        }
        System.out.println("----------------------------------");
        System.out.println(sll.searchElement(6));
    }
}