import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double [][] matriz = new double[3][3];

        int line = Integer.parseInt(br.readLine());
        String calc = br.readLine();

        for(int i = 0; i < matriz.length; i++){
            for(int k = 0; k < matriz[i].length; k++){
                double a = Double.parseDouble(br.readLine());
                matriz[i][k] = a;
            }
        }

        if(calc.equals("S")){
            double soma = 0;
            DecimalFormat decimal = new DecimalFormat("0.0");
            for(int i = 0; i < matriz.length; i++){
                soma += matriz[line][i];
            }
            System.out.println(decimal.format(soma));
        }
        else if(calc.equals("M")){
            double media = 0;
            DecimalFormat decimal = new DecimalFormat("0.0");
            for(int i = 0; i < matriz.length; i++){
                media += matriz[line][i];
            }
            media = media/12;
            System.out.println(decimal.format(media));
        }
    }
}