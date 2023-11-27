// Referensi Kode : https://www.geeksforgeeks.org/hamiltonian-path-using-dynamic-programming/
public class HamiltonianPath{

    // Method untuk mengecek adanya hamiltonian path di graph
    public static void hamiltonianPath(int adj[][], int N)
    {
        // Inisiasi Array 2D untuk penanda path yang diisi dengan nilai awal "false"
        boolean dp[][] = new boolean[N][(1 << N)];

        // Inisiasi Array 2D untuk menyimpan path yang diambil
        // diisi dengan nilai awal 0
        int path[][] = new int[N][(1 << N)];

        // Mengatur verteks i untuk left shift nilai 2^i untuk subset awal menjadi "true"
        for(int i = 0; i < N; i++) {
            dp[i][(1 << i)] = true;
        }

        // Iterate untuk setiap subset verteks
        for(int i = 0; i < (1 << N); i++) {
            for(int j = 0; j < N; j++) {

                // Kondisi ketika verteks ke-j berada di dalam subset verteks i
                if ((i & (1 << j)) != 0) {

                    // Iterasi untuk mencari verteks k yang merupakan tetangga (edge) dari verteks j
                    // dan berada di subset i
                    for(int k = 0; k < N; k++) {

                        /* Kondisi pertama untuk mengecek verteks k terdapat di subset verteks i
                           Kondisi kedua untuk mengecek ketersediaan edge antara verteks k dan j
                           Kondisi ketiga untuk mengecek ketersediaan ujung path dari verteks k
                           dan menghilangkan verteks j dari subset i. */
                        if (((i & (1 << k)) != 0) && (adj[k][j] == 1 && j != k) && (dp[k][i ^ (1 << j)])) {

                            // Update dp[j][i] menjadi true karena merupakan tetangga (edge)
                            dp[j][i] = true;

                            // Menyimpan verteks sebelumnya ke dalam path
                            path[j][i] = k;
                            break;
                        }
                    }
                }
            }
        }

        // Iterasi untuk melintasi keseluruhan verteks
        int lastNode = -1;
        for(int i = 0; i < N; i++) {
            // Kondisi ketika terdapat Hamiltonian path
            if (dp[i][(1 << N) - 1]) {
                lastNode = i;
                break;
            }
        }

        // Mencetak Hamiltonian path ketika terdeteksi ada
        if (lastNode != -1) {
            System.out.println("Hamiltonian Path:");
            printHamiltonianPath(path, lastNode, (1 << N) - 1);
        }
        else {
            System.out.println("No Hamiltonian Path found");
        }
    }

    // Method untuk mencetak Hamiltonian path
    private static void printHamiltonianPath(int[][] path, int lastNode, int mask) {
        int N = path.length;
        int[] result = new int[N];
        int index = N - 1;

        while (mask > 0) {
            // Menyimpan verteks terakhir ke dalam hasil array
            result[index--] = lastNode;

            // Mengambil verteks sebelumnya dari path
            int prevNode = path[lastNode][mask];

            // Update bitmask dengan menghapus bit yang sesuai dari verteks terakhir
            mask ^= (1 << lastNode);

            lastNode = prevNode;
        }

        // Mencetak Hamiltonian path
        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
