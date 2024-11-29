class node {

   // a node consist of two part that is the data and address(node)
   // address is a referance to the next node
int data;
node next;
}

class linkedlist{
   //linkedlist consist of multiple collection of node
   //where they are connected by (address )next thus linking it to the next node
   // a linked list must set a head as it is the starting point of the list
   node head;
   public void insert(int data){
      // creating a new node
      node newnode = new node ();
      // setting the attribute of the node
      newnode.data=data;
      newnode.next=null;
      // assigning variable to the head
      node n = head;
      if (head==null){
         //if there is no head thus assigning the newnode to the head
       head = newnode;
      }
      else {
         // to add the newnode at the very back of the list
         // must find the end of the list it is indicated when the referance of it is null
         //starting the search from head to tail linearly
         // adding it by changing the address of the current tail node to the newnode
      while (n.next!=null){
         n=n.next;
      }
      n.next=newnode;
      }
   }
   public void show(){
      node currentnode=head;
      System.out.print(currentnode.data+" ");
      while (currentnode.next!=null){
         currentnode=currentnode.next;
         System.out.print(currentnode.data+" ");
      }
   }
   public void insertfront(int data){
      node insertfrontnode = new node ();
      insertfrontnode.data=data;
      insertfrontnode.next=head;
      head=insertfrontnode;
      //System.out.println(insertfrontnode.data);
      
   }
   public int length(){
      node current = head;
      int lengthof =0;
      while (current.next!=null){
         current=current.next;
         lengthof++;
      }
      return lengthof+1;
   }

   public void insertAt(int data, int index){
      node newnode = new node ();
      newnode.data=data;
      newnode.next=null;
      node n= head;
      if (index==0){
         node insertfrontnode = new node ();
         insertfrontnode.data=data;
         insertfrontnode.next=head;
         head=insertfrontnode;
      }
      else {
         for (int i = 0; i < index - 1; i++) {
            n = n.next;
         }
         // .next is way to refer to address of the next node thus linking it
         // node 0    -->    node 1       -->  node 2
         // if newnode is inserted at index of 2 then
         // node 0    -->    node 1       --> newnode      --> node 2
         // (0)n.next -->  (1)n.next.next --> newnode.next --> (2)n.next.next.next
         //thus new index will be
         //(0)n.next -->  (1)n.next.next --> (2)newnode.next --> (3)n.next.next.next
         newnode.next = n.next;
         n.next = newnode;
      }
   }
   public void remove (int index){
      if (index==0){
         // node 0    -->    node 1       -->  node 2
         // supposed removing node 0 / head
         // (0)n.next --> (1)n.next.next --> (2)n.next.next.next
         // to remove node 0
         // (1)n.next.next---> (2)n.next.next.next

         node n = head;
         head=n.next;
      }
      else {
         // n.next referring to an address to the next node
         // (head) node 0    -->    node 1       -->  node 2
         // supposed removing node 1
         // (0)n.next --> (1)n.next.next --> (2)n.next.next.next
         // to remove node 1
         // (0)n.next ---> (2)n.next.next

         node n = head;
         for (int i = 0; i < index - 1; i++) {
            n = n.next;
         }
         n.next = n.next.next;
      }
   }
   
   
   
}

public class testlinkedlist {
   public static void main(String [] args){
      linkedlist newlist = new linkedlist();
      int i=0;
      while (i<10){
         newlist.insert(i);
         i++;
      }
      newlist.show();
      System.out.println();
      newlist.insertfront(999);
      newlist.insertfront(90);
      newlist.insertfront(213);
      newlist.show();
      System.out.println ("\nThe length is "+newlist.length());
      newlist.insertAt(30,3);
      newlist.insertAt(40,0);
      System.out.println ("\nThe length is "+newlist.length());
      newlist.show();
      System.out.println();
      newlist.insertAt(55,15);
      newlist.show();
      System.out.println ("\n removing at index  1");
      newlist.remove(1);
      newlist.show();
      System.out.println ("\n removing at index  0");
      newlist.remove(0);
      newlist.show();
      System.out.println ("\n removing at index  12");
      newlist.remove(12);
      newlist.show();
   }
}