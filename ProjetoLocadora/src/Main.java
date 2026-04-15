import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Carro carro1 = new Carro("Porsche", "cayenne", 2027, "hhh-8888", 2350, 4);
        //Moto moto1 = new Moto("Kawasaki", "ninja 650", 2025, "zzz-9999", 500, 100);


        //System.out.println(carro1.exibirDados());
        //System.out.println(moto1.exibirDados());

        Locadora locadora = new Locadora();

        locadora.adicionarVeiculo(new Carro("Porsche", "cayenne", 2027, "hhh-8888", 2350, 2));
        locadora.adicionarVeiculo(new Moto("Kawasaki", "ninja 650", 2025, "zzz-9999", 500, 400));

        locadora.listarVeiculo();

        int tamanho = locadora.getFrota().size();

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o veiculo (1 a " + tamanho + "): ");
        int veiculoSelecionado = sc.nextInt();

        System.out.println("Quantos dias voce deseja ficar com o veiculo ?");
        int dias = sc.nextInt();

        locadora.alugueVeiculo(dias, veiculoSelecionado);
    }
}
