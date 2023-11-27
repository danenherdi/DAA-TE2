import java.util.Random;

public class Util {

    // Method untuk generate graph dengan 16 verteks
    static int[][] createGraph16Vertices() {
        int N = 16;
        int[][] graph = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = 0;
            }
        }
        graph[0][1] = 1;
        graph[0][5] = 1;

        graph[1][2] = 1;
        graph[1][0] = 1;

        graph[2][1] = 1;
        graph[2][3] = 1;

        graph[3][2] = 1;
        graph[3][4] = 1;

        graph[4][3] = 1;
        graph[4][7] = 1;

        graph[5][0] = 1;
        graph[5][6] = 1;
        graph[5][8] = 1;
        graph[5][9] = 1;

        graph[6][5] = 1;
        graph[6][7] = 1;
        graph[6][10] = 1;

        graph[7][4] = 1;
        graph[7][6] = 1;
        graph[7][11] = 1;
        graph[7][12] = 1;

        graph[8][5] = 1;
        graph[8][9] = 1;
        graph[8][13] = 1;

        graph[9][5] = 1;
        graph[9][8] = 1;
        graph[9][10] = 1;

        graph[10][6] = 1;
        graph[10][9] = 1;
        graph[10][11] = 1;

        graph[11][7] = 1;
        graph[11][10] = 1;
        graph[11][12] = 1;

        graph[12][7] = 1;
        graph[12][11] = 1;
        graph[12][15] = 1;

        graph[13][8] = 1;
        graph[13][14] = 1;

        graph[14][13] = 1;
        graph[14][15] = 1;

        graph[15][12] = 1;
        graph[15][14] = 1;

        return graph;
    }

    // Method untuk generate graph dengan 18 verteks
    static int[][] createGraph18Vertices() {
        int N = 18;
        int[][] graph = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = 0;
            }
        }

        graph[0][1] = 1;
        graph[0][6] = 1;
        graph[0][11] = 1;

        graph[1][0] = 1;
        graph[1][2] = 1;

        graph[2][1] = 1;
        graph[2][3] = 1;

        graph[3][2] = 1;
        graph[3][4] = 1;

        graph[4][3] = 1;
        graph[4][5] = 1;

        graph[5][4] = 1;
        graph[5][10] = 1;
        graph[5][16] = 1;

        graph[6][0] = 1;
        graph[6][7] = 1;
        graph[6][11] = 1;

        graph[7][6] = 1;
        graph[7][8] = 1;
        graph[7][16] = 1;

        graph[8][7] = 1;
        graph[8][9] = 1;

        graph[9][8] = 1;
        graph[9][10] = 1;

        graph[10][5] = 1;
        graph[10][9] = 1;
        graph[10][16] = 1;

        graph[11][6] = 1;
        graph[11][12] = 1;
        graph[11][0] = 1;

        graph[12][11] = 1;
        graph[12][13] = 1;

        graph[13][12] = 1;
        graph[13][14] = 1;
        graph[13][17] = 1;

        graph[14][13] = 1;
        graph[14][15] = 1;
        graph[14][17] = 1;

        graph[15][14] = 1;
        graph[15][16] = 1;

        graph[16][7] = 1;
        graph[16][10] = 1;
        graph[16][15] = 1;
        graph[16][5] = 1;

        graph[17][13] = 1;
        graph[17][14] = 1;


        return graph;
    }

    // Method untuk generate graph dengan 20 verteks
    static int[][] createGraph20Vertices() {
        int N = 20;
        int[][] graph = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = 0;
            }
        }

        graph[0][1] = 1;
        graph[0][5] = 1;

        graph[1][0] = 1;
        graph[1][2] = 1;

        graph[2][1] = 1;
        graph[2][3] = 1;

        graph[3][2] = 1;
        graph[3][4] = 1;

        graph[4][3] = 1;
        graph[4][10] = 1;

        graph[5][0] = 1;
        graph[5][6] = 1;
        graph[5][11] = 1;

        graph[6][5] = 1;
        graph[6][7] = 1;
        graph[6][12] = 1;

        graph[7][6] = 1;
        graph[7][8] = 1;

        graph[8][7] = 1;
        graph[8][9] = 1;

        graph[9][8] = 1;
        graph[9][10] = 1;
        graph[9][14] = 1;

        graph[10][4] = 1;
        graph[10][9] = 1;
        graph[10][15] = 1;

        graph[11][5] = 1;
        graph[11][12] = 1;
        graph[11][16] = 1;

        graph[12][6] = 1;
        graph[12][11] = 1;
        graph[12][13] = 1;

        graph[13][12] = 1;
        graph[13][14] = 1;

        graph[14][13] = 1;
        graph[14][15] = 1;
        graph[14][9] = 1;

        graph[15][14] = 1;
        graph[15][18] = 1;
        graph[15][10] = 1;

        graph[16][11] = 1;
        graph[16][17] = 1;
        graph[16][19] = 1;

        graph[17][16] = 1;
        graph[17][18] = 1;
        graph[17][19] = 1;

        graph[18][15] = 1;
        graph[18][17] = 1;
        graph[18][19] = 1;

        graph[19][16] = 1;
        graph[19][17] = 1;
        graph[19][18] = 1;

        return graph;
    }
}
