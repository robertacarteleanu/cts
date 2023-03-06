import java.io.*;

public class MatrixDataHandlerS {
    private int[][] matrix;
    private int height;
    private int width;
    private String filename;
    /**
     * Constructorul care initializeaza matricea pe baza valorilor primite pentru dimensiuni.
     * Apoi, matricea initializata este scrisa in fisierul filename.
     * @param height
     * @param width
     * @param filename
     */
    public MatrixDataHandlerS(int height, int width, String filename) {
        this.height = height;
        this.width = width;
        this.filename = filename;
        matrix = new int[height][];
        for (int i = 0; i < height; i++) {
            matrix[i] = new int[width];
        }
        if(!this.WriteMatrixFromFile())
            System.out.println("Exceptie la scrierea in fisier.");

    }
    /**
     * Metoda scrie matricea in fisierul denumit <this.filename>
     * @return Se returneaza true daca scrierea s-a facut cu succes si false in caz contrar.
     */
    public boolean WriteMatrixFromFile(){
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
            return true;
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    /**
     * Returneaza valoarea de pe o anumita pozitie.
     * Inainte de a o returna se va actualiza matricea cu datele din fiser.
     * @param posHeight Linia de pe care se citeste.
     * @param posWidth Coloana de pe care se citeste.
     * @return
     */
    public int getValueFromPosition( int posHeight, int posWidth) {
       if(!this.ReadMatrixFromFile())
           System.out.println("Citirea din fisier a esuat. Datele returnate sunt cele existente in <matrix> local.");
       return this.matrix[posHeight][posWidth];

    }

    /**
     * Citeste din fiser datele pentru mattrice conform clasei curente.
     * @return true - daca s-a citit cu succes si false, daca a aparut exceptie
     */
    public boolean ReadMatrixFromFile(){
        try {
            // !!!
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            height = Integer.parseInt(line.split(" ")[0]);
            width = Integer.parseInt(line.split(" ")[1]);

            for (int i = 0; i < height; i++) {
                line = br.readLine();
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }
            br.close();
            return true;
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    /**
     * Se citesc valorile din fisier, se modifica valoarea dorita si apui se rescriu datele in fisier.
     * @param posHeight Coloana pe care se scrie
     * @param posWidth Linia pe care se scrie
     * @param value Noua Valoare
     */
    public void modifyValueAndUpdateFile(int posHeight, int posWidth, int value) {
       this.ReadMatrixFromFile();
       this.matrix[posHeight][posWidth]=value;
       this.WriteMatrixFromFile();
    }
}
