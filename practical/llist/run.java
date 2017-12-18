package llist;

public class run {

    public static void main(String[] args) {
        listoperation l=new listoperation();

        l.addfirst(2);
        l.addfirst(3);
        l.addlast(66);
        l.addlast(90);

        l.addAfter(66,99);
        l.addAfter(2,100);
        l.addAfter(99,200);
        l.display();
    }
}
