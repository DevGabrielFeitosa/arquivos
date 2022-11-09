package br.com.arquivos;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lerArquivoTxt {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream entradaArquivo = new FileInputStream("C:\\Users\\PICHAU\\Documents\\arquivo.csv");

        Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

        List<pessoa> pessoas = new ArrayList<pessoa>();

        while (lerArquivo.hasNext()) {
            String linha = lerArquivo.nextLine();

            if (linha != null && !linha.isEmpty()) {

                String[] dados = linha.split("\\;");

                pessoa pessoa = new pessoa();

                pessoa.setNome(dados[0]);
                pessoa.setIdade(Integer.parseInt(dados[1]));
                pessoa.setEmail(dados[2]);

                pessoas.add(pessoa);
            }

        }

        for (pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

}
