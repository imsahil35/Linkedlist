class Node{
    public Object item;
    public Node next;//pointing to next node
}
public class Linkedlistimp{
    private int size;
    private Node head;

   public Linkedlistimp(){
        this.size=0;
        this.head= null;   
   }
   public void insertingnode(String i){
    Node node= new Node();
    node.item= i;
    Node current=this.head;
    if (this.head==null){
        this.head=node;
        this.head.next= null;
        this.size=1;
        System.out.println(this.head.toString());
    }else{
        while(current.next!=null){
            current=current.next;
        }
        current.next=node;
        node.next=null;
        this.size+=1;
    }
   }
   public void addAtStarting(String i) {
    Node n = new Node();
    n.item = i;
    n.next = this.head;
    this.head = n;
    this.size+=1;
}
public void addAtMiddle(String i,int pos)
{
    Node node=new Node();
    Node current=this.head;
    if(this.head!=null && pos<=this.size)
    {
        for(int j=0;j<pos-1;j++) {
            current=current.next;
        }
        node.item=i;
        node.next=current.next;
        current.next=node;
        this.size+=1;
    }
    else
    {
        System.out.println("position is greater than size");
    }
}
    public void deletenode(){
        if(this.head==null){
            System.out.println("No nodes");
        }
        else{
            this.head = this.head.next;
            this.size-=1;
        }
    }
    public void deleteend(){
        Node current = this.head;
        while(current.next!=null){
            current = current.next;
            if(current.next.next==null){
                current.next=null;
            }
        }
        this.size-=1;
    }
    public void deletepos(int pos){
        Node temp = this.head;
        for(int i=0;i<pos;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        this.size -=1;
    }
    public void find(int value){
        Node current = this.head;
        boolean flag = false;
        for(int i=0;i<size;i++){
            if(current.item.equals(value)){
                System.out.println("Element is present");
                flag = true;
                break;
            }
            current = current.next;
        }
        if(!flag){
            System.out.println("Element not present");
        }
    }
    public void display(){
        Node current = this.head;
        for(int i=0;i<size;i++){
            System.out.println(current.item);
            current = current.next;
        }
    }
    public static void main(String[] args){
        Linkedlistimp llist = new Linkedlistimp();
        llist.insertingnode("sahil");
        llist.insertingnode("naveen");
        llist.insertingnode("prashanth");
        llist.insertingnode("tarak");
        // llist.display();
        // llist.addAtStarting("hari");
        llist.addAtMiddle("suresh",2);
        llist.display();
    }
}
