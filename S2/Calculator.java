import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /**
     * Aceasta metoda calculeaza suma dintre x ridicat la puterea a-5a si y ridicat la putearea a-7a.
     * @return Returneaza rezultatul calculat.
     * @throws IOException Arunca exceptie daca datele introduse nu au formatul corect.
     */
    public double pow(double value, int pow) {

        double result = value;
        for (int i = 1; i < pow; i++) {
            result *= value;
        }
      return result;
    }

    public double adunare() throws IOException {
        double result = 0.0;
        double x = 0.0, y = 0.0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Tastati valoarea pentru X:");
                x = Double.parseDouble(reader.readLine());
                System.out.println("Tastati valoarea pentru Y:");
                y = Double.parseDouble(reader.readLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Formatul datelor introduse este invalid. Va rugam introduceti din nou.");
            }
        }

        double x5 = pow(x, 5);
        double y7 = pow(y, 7);
        result = x5 + y7;

        reader.close();

        return result;
    }
}
