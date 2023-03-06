import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        CalculatorRefactored calculator = new CalculatorRefactored();
//        double result = calculator.calculatePowXPlusPowY();
//        System.out.println("Rezultatul este: " + result);


        MatrixDataHandlerS mH = new MatrixDataHandlerS(5, 7, "matrix.txt");
        mH.modifyValueAndUpdateFile( 3, 4, 345);

    }
}
