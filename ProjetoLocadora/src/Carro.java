// PILAR 3 - HERANÇA
// Carro e Moto herdam tudo de Veiculo, mas cada um adiciona
// seus próprios atributos e implementa calcularDiaria() do seu jeito.

//CARRO -> qtdPortas (atributo)
// método calcularDiaria -> se qtdPortas >= 4 então acréscimo de 20%


public class Carro extends Veiculo {
    private int quantidadePortas;

    //construtor
    public Carro(String marca, String modelo, int ano, String placa, double precoBase, int quantidadePortas) {
        super(marca, modelo, ano, placa, precoBase);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public double calcularDiaria() {
        // carro com 4 portas terá acrescimo de 20%

        if (quantidadePortas >= 4) {
            return getPrecoBase() * 1.20;
        }

        return getPrecoBase();
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + " " + quantidadePortas;
    }
}





