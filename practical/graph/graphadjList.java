import java.util.Iterator;
import java.util.LinkedList;


class graphadjList  {
	public static void main(String[] args) {
		GrapList g=new GrapList(10);
		g.addEdge(1,2);
		g.displayGraph();

	}
}

class GrapList{

   private int V;
   private LinkedList<Integer> adj[];

   GrapList(int v){
       V=v;
       adj=new LinkedList[v];
       for (int i = 0; i < v; ++i) {
           adj[i]=new LinkedList();
       }
   }

   void addEdge(int v, int w){
       adj[v].add(w);
   }

   void displayGraph(){
       for (int i = 0; i <adj.length ; ++i) {
           System.out.print(adj[i]);
       }
       System.out.println();
   }

    
}


