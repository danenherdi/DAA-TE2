public class Main {

    // Hamiltonian Path performance
    public static void doHamiltonianPath(int[][] arr){
        long hamiltonianPathStartTime = System.currentTimeMillis();
        HamiltonianPath.hamiltonianPath(arr, arr.length);
        long hamiltonianPathEndTime = System.currentTimeMillis();
        long memoryUsed = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long hamiltonianPathResultTime = hamiltonianPathEndTime - hamiltonianPathStartTime;

        System.out.println("Penggunaan memori Hamiltonian path: " + memoryUsed + " bytes");
        System.out.println("Waktu eksekusi Hamiltonian path: " + hamiltonianPathResultTime + " ms");
        System.out.println();
    }

    // Hamiltonian Cycle performance
    public static void doHamiltonianCycle(int[][] arr){
        long hamiltonianCycleStartTime = System.currentTimeMillis();
        HamiltonianCycle.hamCycle(arr, arr.length);
        long hamiltonianCycleEndTime = System.currentTimeMillis();
        long memoryUsed = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long hamiltonianCycleResultTime = hamiltonianCycleEndTime - hamiltonianCycleStartTime;

        System.out.println("Penggunaan memori Hamiltonian cycle: " + memoryUsed + " bytes");
        System.out.println("Waktu eksekusi Hamiltonian cycle: " + hamiltonianCycleResultTime + " ms");
        System.out.println();
    }

    public static void main(String[] args) {


        // create graph with 16 vertices
        System.out.println("Graph Kecil dengan 16 Verteks\n");
        int[][] graph16 = Util.createGraph16Vertices();
        doHamiltonianPath(graph16);
        System.out.println();
        doHamiltonianCycle(graph16);

        System.out.println("==================================================\n");

        // create graph with 18 vertices
        System.out.println("Graph Sedang dengan 18 Verteks\n");
        int[][] graph18 = Util.createGraph18Vertices();
        doHamiltonianPath(graph18);
        System.out.println();
        doHamiltonianCycle(graph18);

        System.out.println("==================================================\n");

        // create graph with 18 vertices
        int[][] graph20 = Util.createGraph20Vertices();
        System.out.println("Graph Besar dengan 20 Verteks\n");
        doHamiltonianPath(graph20);
        System.out.println();
        doHamiltonianCycle(graph20);

    }
}