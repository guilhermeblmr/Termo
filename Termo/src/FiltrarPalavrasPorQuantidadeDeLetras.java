import java.io.*;

public class FiltrarPalavrasPorQuantidadeDeLetras {
    public static void main(String[] args) {
        String nomeArquivoEntrada = "palavrasJogo.txt";
        String nomeArquivoSaida = "PalavraModificada.txt";

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(nomeArquivoEntrada), "UTF-8"));
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(nomeArquivoSaida), "UTF-8"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String palavra = linha.trim();
                int quantidadeLetras = palavra.length();

                int limiteLetras = 5;

                if (quantidadeLetras == limiteLetras) {
                    writer.write(palavra);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
