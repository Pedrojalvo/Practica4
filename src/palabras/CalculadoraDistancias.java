package palabras;

public class CalculadoraDistancias {

    public static int calcularDistancia(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();


        int[][] matriz = new int[m + 1][n + 1];


        for (int i = 0; i <= m; i++) {
            matriz[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            matriz[0][j] = j;
        }


        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    matriz[i][j] = matriz[i - 1][j - 1];
                } else matriz[i][j] = 1 + Math.min(Math.min(matriz[i - 1][j], matriz[i][j - 1]), matriz[i - 1][j - 1]);
            }
        }

        return matriz[m][n];
    }
}


