class graphMatrix {
    
    public static void main(String[] args) {
        graph g= new graph(10);
        g.displayGraph();
    }
}




// Graph implementation with the help of Adjacency matrix

public class graph {
   ArrayList<Integer> neigbours=new ArrayList<Integer>();

   int [][] cities;
   int size;

   graph(int size){

       this.size=size;
       cities=new int[size][size];
       for (int i=0;i<size;i++){
           for (int j=0;j<size;j++){
               cities[i][j]=0;
           }
       }
   }

   void addEdge(int city1, int city2){
       cities[city1][city2]=1;
       cities[city2][city1]=1;
   }

   void displayGraph(){

       for (int i=0;i<size;i++){
           for (int j=0;j<size;j++){
               System.out.print(cities[i][j]);
           }

           System.out.println();
       }

   }

   boolean isConnected(int c1, int c2){
       if (cities[c1][c2]==1 && cities[c2][c1]==1)
           return true;
       else
           return false;
   }


   public ArrayList<Integer> getNeigbours(int vertex) {
       for (int i = 0; i < size; i++) {
           if (i == vertex) {
               for (int j = 0; j < size; j++) {
                   if (cities[i][j]==1)
                       neigbours.add(j);
               }
           }
       }

       return neigbours;
   }
}
