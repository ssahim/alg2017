package llist;

public class listoperation {

    node head;

    void addfirst(int data){
        node newNode=new node(data);
        newNode.next=head;
        head=newNode;
    }

    void display(){
        node current=head;
        while (current!=null){
            System.out.print(current.data+"=>");
            current=current.next;
        }
        System.out.print("null");
    }

    void addlast(int data){
        node current =head;
        while (current.next!=null){
            current=current.next;
        }
        node newNode=new node(data);

        current.next=newNode;
    }

    void addAfter(int current, int newElement){
        node iterator=head;

        while (iterator.data!=current){
            iterator=iterator.next;
        }

        node newNode=new node(newElement);
        node temp=iterator.next;
        iterator.next=newNode;
        newNode.next=temp;


    }
}
