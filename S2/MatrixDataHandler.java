import java.io.*;

public class MatrixDataHandler {
    private int[][] matrix;
    private int height;
    private int width;
    private String filename;

    //tratare caz in care a fost modificat fisierul
    //separare in diferite metode -- citire matrice din fidier , scriere matrice in fisier, alocare spatiu matrice
    //tratare exceptii
    public MatrixDataHandler(int height, int width, String filename) {
        this.height = height;
        this.width = width;
        this.filename = filename;
        matrix = new int[height][width];
        initializeMatrix();
    }

    private void initializeMatrix() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public void readMatrixFromFile(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            height = Integer.parseInt(line.split(" ")[0]);
            width = Integer.parseInt(line.split(" ")[1]);
            matrix = new int[height][width];

            for (int i = 0; i < height; i++) {
                line = br.readLine();
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }
            br.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void writeMatrixToFile(String filename) {
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write(height + " " + width + "\n");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
            fw.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void allocateMatrixSpace(int height, int width) {
        this.height = height;
        this.width = width;
        matrix = new int[height][width];
        initializeMatrix();
    }

    public int getValueFromPosition(int posH, int posW) {
        if (posH < 0 || posH >= height || posW < 0 || posW >= width) {
            initializeMatrix();
        }
        return matrix[posH][posW];
    }

    public void modifyValueAndUpdateFile(int posH, int posW, int val) {
        if (posH < 0 || posH >= height || posW < 0 || posW >= width) {
            initializeMatrix();
        }
        matrix[posH][posW] = val;
        writeMatrixToFile(filename);
    }
}
