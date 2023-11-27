// Referensi Kode: https://www.geeksforgeeks.org/hamiltonian-cycle/
public class HamiltonianCycle {
    static int[] path;

    // Method untuk mengecek kondisi verteks v jika dapat dimasukkan ke Hamiltonian cycle
    private static boolean isSafe(int v, int graph[][], int path[], int pos) {
        // Kondisi ketika verteks sudah merupakan tetangga dari verteks sebelumnya
        if (graph[path[pos - 1]][v] == 0)
            return false;

        // Kondisi ketika verteks sudah dimasukkan ke dalam path
        for (int i = 0; i < pos; i++)
            if (path[i] == v)
                return false;

        return true;
    }

    // Method untuk mencari cycle secara rekursif
    private static boolean hamCycleUtil(int graph[][], int path[], int pos, int N)
    {
        // Base case ketika semua verteks sudah ada di cycle
        if (pos == N)
        {
            // Kondisi ketika terdapat edge dari verteks terakhir ke verteks pertama
            if (graph[path[pos - 1]][path[0]] == 1)
                return true;
            else
                return false;
        }

        // Iterasi untuk mencari verteks lain (selain 0 dikarenakan sudah include ke cycle)
        for (int v = 1; v < N; v++)
        {
            // Cek kondisi ketika verteks dapat dimasukkan ke cycle
            if (isSafe(v, graph, path, pos))
            {
                path[pos] = v;

                // Rekursi untuk mencari verteks lainnya
                if (hamCycleUtil(graph, path, pos + 1, N) == true)
                    return true;

                // Menghapus verteks ketika tidak dimasukkan ke cycle
                path[pos] = -1;
            }
        }
        return false;
    }


    // Method untuk membuat Hamiltonian Cycle dengan memanggil util rekursif-nya
    public static int hamCycle(int graph[][], int N)
    {
        path = new int[N];
        for (int i = 0; i < N; i++)
            path[i] = -1;


        // Set verteks 0 ke dalam cycle (sebagai awalan)
        path[0] = 0;
        if (hamCycleUtil(graph, path, 1, N) == false)
        {
            System.out.println("\nTidak ada Hamiltonian Cycle");
            return 0;
        }

        printSolution(path, N);
        return 1;
    }

    // Method untuk mencetak Hamiltonian cycle
    private static void printSolution(int path[], int N)
    {
        System.out.println("Hamiltonian Cycle:");
        for (int i = 0; i < N; i++)
            System.out.print(" " + path[i] + " ");

        System.out.println(" " + path[0] + " ");
    }
}