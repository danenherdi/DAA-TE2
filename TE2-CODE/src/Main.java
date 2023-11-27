public class Main {

    public static void doSort(int[] arr){
//        doRadixSort(arr);
//        doPeekSort(copiedArr);
    }

    // Radix sort performance
    public static void doHamiltonianPath(int[][] arr){
//        long radixSortStartTime = System.currentTimeMillis();
//        Radixsort.radixSort(arr);
//        long radixSortEndTime = System.currentTimeMillis();
//        long memoryUsed = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
//        long radixSortResultTime = radixSortEndTime - radixSortStartTime;
//
//        System.out.println("Penggunaan memori Radix Sort: " + memoryUsed + " bytes");
//        System.out.println("Waktu eksekusi Radix Sort: " + radixSortResultTime + " ms");
//        System.out.println();
    }

    // Peek sort performance
    public static void doHamiltonianCycle(int[][] arr){
//        long peekSortStartTime = System.currentTimeMillis();
//        Peeksort.peekSort(arr, 0, arr.length-1, 0, arr.length-1, new int[arr.length]);
//        long peekSortEndTime = System.currentTimeMillis();
//        long memoryUsed = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
//        long peekSortResultTime = peekSortEndTime - peekSortStartTime;
//
//        System.out.println("Penggunaan memori Peek Sort: " + memoryUsed + " bytes");
//        System.out.println("Waktu eksekusi Peek Sort: " + peekSortResultTime + " ms");
//        System.out.println();
    }

    public static void main(String[] args) {
        // create graph with 16 vertices
        int[][] graph16 = Util.createGraph16Vertices();
        HamiltonianPath.Hamiltonian_path(graph16, graph16.length);
        HamiltonianCycle.hamCycle(graph16, graph16.length);

        System.out.println("\n==================================================\n");

        // create graph with 18 vertices
        int[][] graph18 = Util.createGraph18Vertices();
        HamiltonianPath.Hamiltonian_path(graph18, graph18.length);
        HamiltonianCycle.hamCycle(graph18, graph18.length);

        System.out.println("\n==================================================\n");

        // create graph with 18 vertices
        int[][] graph20 = Util.createGraph20Vertices();
        HamiltonianPath.Hamiltonian_path(graph20, graph20.length);
        HamiltonianCycle.hamCycle(graph20, graph20.length);
        
//        System.out.println("==================================================");
//        System.out.println("Data Array Sorted");
//        System.out.println("==================================================");
//        System.out.println("Data 1000 Angka");
//        doSort(sortedArr1000);
//        System.out.println();
//        System.out.println("Data 10000 Angka");
//        doSort(sortedArr10000);
//        System.out.println();
//        System.out.println("Data 100000 Angka");
//        doSort(sortedArr100000);
//        System.out.println();
//
//        System.out.println("==================================================");
//        System.out.println("Data Array Random");
//        System.out.println("==================================================");
//        System.out.println("Data 1000 Angka");
//        doSort(randomArr1000);
//        System.out.println();
//        System.out.println("Data 10000 Angka");
//        doSort(randomArr10000);
//        System.out.println();
//        System.out.println("Data 100000 Angka");
//        doSort(randomArr100000);
//        System.out.println();
//
//        System.out.println("==================================================");
//        System.out.println("Data Array Reversed");
//        System.out.println("==================================================");
//        System.out.println("Data 1000 Angka");
//        doSort(reversedArr1000);
//        System.out.println();
//        System.out.println("Data 10000 Angka");
//        doSort(reversedArr10000);
//        System.out.println();
//        System.out.println("Data 100000 Angka");
//        doSort(reversedArr100000);

    }
}