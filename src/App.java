import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Salvar Palavras em um arquivo de texto!");
        
        //Declaração de variáveis
        String palavraSalvar;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com a palavra a ser salva");
        palavraSalvar = scanner.nextLine();
        scanner.close();

        File file = new File("palavras.txt");
        FileWriter writer = new FileWriter(file, true);

        try {
            if(file.createNewFile()){
                System.out.println("Arquivo criado: " + file.getName());
            } else {
                System.out.println("Arquivo já existe");
            }

            writer.close();

        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }

        
        



    }
}
