import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Veiculo> frota;

    public Locadora() {
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
    }

    public List<Veiculo> getFrota() {
        return frota;
    }

    public void listarVeiculo() {
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);

            System.out.printf("[%d] %s %s | Diaria: R$ %.2f\n", (i + 1), v.getMarca(), v.getModelo(), v.getPrecoBase());
        }
        System.out.println("======================================================");
    }

    // Alugar veículo
    public void alugueVeiculo(int dias, int idVeiculo) {

        Veiculo v = frota.get(idVeiculo -1);

        double total = v.calcularDiaria() * dias;

        System.out.println("===== Resumo do aluguel veiculo =====");
        System.out.println("Veiculo " + v.exibirDados());
        System.out.println("qtd dias: " + dias);
        System.out.printf("Valor diário: %.2f\n", v.calcularDiaria());
        System.out.printf("Total do periodo da regencia: %.2f ", total);
    }
}


