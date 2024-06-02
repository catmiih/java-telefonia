import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar Clientes
        System.out.print("Nome do Cliente 1: ");
        String nome1 = scanner.nextLine();
        System.out.print("Endereço do Cliente 1: ");
        String endereco1 = scanner.nextLine();
        Cliente cliente1 = new Cliente(nome1, endereco1);

        System.out.print("Nome do Cliente 2: ");
        String nome2 = scanner.nextLine();
        System.out.print("Endereço do Cliente 2: ");
        String endereco2 = scanner.nextLine();
        Cliente cliente2 = new Cliente(nome2, endereco2);

        // Criar Linhas Telefonicas para Cliente 1
        System.out.print("Número da Linha Fixa do Cliente 1: ");
        String numeroFixa1 = scanner.nextLine();
        System.out.print("Minutos gastos na Linha Fixa do Cliente 1: ");
        int minutosFixa1 = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        LinhaTelefonica linhaFixa1 = new Fixa(minutosFixa1, numeroFixa1, cliente1);
        cliente1.adicionarLinhaTelefonica(linhaFixa1);

        System.out.print("Número da Linha Móvel do Cliente 1: ");
        String numeroMovel1 = scanner.nextLine();
        System.out.print("Minutos gastos na Linha Móvel do Cliente 1: ");
        int minutosMovel1 = scanner.nextInt();
        System.out.print("Plano de dados habilitado? (true/false): ");
        boolean planoDeDados1 = scanner.nextBoolean();
        scanner.nextLine();
        LinhaTelefonica linhaMovel1 = new Movel(minutosMovel1, numeroMovel1, planoDeDados1,cliente1);
        cliente1.adicionarLinhaTelefonica(linhaMovel1);

        // Criar Linhas Telefonicas para Cliente 2
        System.out.print("Número da Linha Fixa do Cliente 2: ");
        String numeroFixa2 = scanner.nextLine();
        System.out.print("Minutos gastos na Linha Fixa do Cliente 2: ");
        int minutosFixa2 = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        LinhaTelefonica linhaFixa2 = new Fixa(minutosFixa2, numeroFixa2, cliente2);
        cliente2.adicionarLinhaTelefonica(linhaFixa2);

        System.out.print("Número da Linha Móvel do Cliente 2: ");
        String numeroMovel2 = scanner.nextLine();
        System.out.print("Minutos gastos na Linha Móvel do Cliente 2: ");
        int minutosMovel2 = scanner.nextInt();
        System.out.print("Plano de dados habilitado? (true/false): ");
        boolean planoDeDados2 = scanner.nextBoolean();
        scanner.nextLine(); // Consome a nova linha
        LinhaTelefonica linhaMovel2 = new Movel(minutosMovel2, numeroMovel2, planoDeDados2,cliente2);
        cliente2.adicionarLinhaTelefonica(linhaMovel2);
        System.out.println("\n\n================================================");

        // Imprimir informações
        System.out.println("\n\n================================================");
        System.out.println(cliente1);
        System.out.println("Custos das Linhas do Cliente 1:");
        for (LinhaTelefonica linha : cliente1.getLinhasTelefonicas()) {
            int minutosExcedentes = linha.getQtdMinutosGastos() - (linha instanceof Fixa ? Fixa.FRANQUIA : 0);
            System.out.println(linha + " - Custo: " + linha.calcular(minutosExcedentes));
        }
        System.out.println("\n\n================================================");
        System.out.println(cliente2);
        System.out.println("Custos das Linhas do Cliente 2:");
        for (LinhaTelefonica linha : cliente2.getLinhasTelefonicas()) {
            int minutosExcedentes = linha.getQtdMinutosGastos() - (linha instanceof Fixa ? Fixa.FRANQUIA : 0);
            System.out.println(linha + " - Custo: " + linha.calcular(minutosExcedentes));
        }

        scanner.close();
    }
}