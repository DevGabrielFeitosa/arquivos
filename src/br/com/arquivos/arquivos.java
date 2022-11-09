package br.com.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class arquivos {

    public static void main(String[] args) throws IOException {

        pessoa pessoa1 = new pessoa();
        pessoa pessoa2 = new pessoa();
        pessoa pessoa3 = new pessoa();

        pessoa1.setEmail("pessoa1@gmail.com");
        pessoa1.setIdade(50);
        pessoa1.setNome("Aleatorio");

        pessoa2.setEmail("pessoa2@gmail.com");
        pessoa2.setIdade(30);
        pessoa2.setNome("Aleatorio 2");

        pessoa3.setEmail("pessoa3@gmail.com");
        pessoa3.setIdade(20);
        pessoa3.setNome("Aleatorio 3");

        List<pessoa> pessoas = new ArrayList<pessoa>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);


        File arquivo = new File("C:\\Users\\PICHAU\\Documents\\arquivo.csv");

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        FileWriter escreverArquivo = new FileWriter(arquivo);

        for (pessoa p : pessoas) {
            escreverArquivo.write(p.getNome() + ";" + p.getIdade() + ";" + p.getEmail() + "\n");
        }

        //escreverArquivo.write("Teste");
        escreverArquivo.flush();
        escreverArquivo.close();
    }

}

