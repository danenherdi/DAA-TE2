// Referensi Kode : https://www.geeksforgeeks.org/hamiltonian-path-using-dynamic-programming/
public class HamiltonianPath{
    // Function to check whether there
    // exists a Hamiltonian Path or not
    static boolean Hamiltonian_path(int adj[][], int N)
    {
        boolean dp[][] = new boolean[N][(1 << N)];
        int path[][] = new int[N][(1 << N)];

        // Set all dp[i][(1 << i)] to
        // true
        for(int i = 0; i < N; i++)
            dp[i][(1 << i)] = true;

        // Iterate over each subset
        // of nodes
        for(int i = 0; i < (1 << N); i++)
        {
            for(int j = 0; j < N; j++)
            {

                // If the jth nodes is included
                // in the current subset
                if ((i & (1 << j)) != 0)
                {

                    // Find K, neighbour of j
                    // also present in the
                    // current subset
                    for(int k = 0; k < N; k++)
                    {

                        if ((i & (1 << k)) != 0 &&
                                adj[k][j] == 1 && j != k &&
                                dp[k][i ^ (1 << j)])
                        {

                            // Update dp[j][i]
                            // to true
                            dp[j][i] = true;
                            path[j][i] = k; // Store the previous node in the path
                            break;
                        }
                    }
                }
            }
        }

        // Traverse the vertices
        int lastNode = -1;
        for(int i = 0; i < N; i++)
        {
            // Hamiltonian Path exists
            if (dp[i][(1 << N) - 1])
                lastNode = i;
                break;
        }

        if (lastNode != -1) {
            System.out.println("Hamiltonian Path:");
            printHamiltonianPath(path, lastNode, (1 << N) - 1);
            return true;
        } else {
            System.out.println("No Hamiltonian Path found");
            return false;
        }
    }

    static void printHamiltonianPath(int[][] path, int lastNode, int mask) {
        int N = path.length;
        int[] result = new int[N];
        int index = N - 1;

        while (mask > 0) {
            result[index--] = lastNode;
            int prevNode = path[lastNode][mask];
            mask ^= (1 << lastNode);
            lastNode = prevNode;
        }

        // Print the Hamiltonian Path
        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
