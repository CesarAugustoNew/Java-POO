
    public class Moto extends Veiculo {
        //um novo atributo cílindrada
        //se a cílindrada > 300 acrescimo de 30%

        private int cilindrada;

        //construtor
        public Moto (String marca, String modelo, int ano, String placa, double precobase, int cilindrada) {
            super(marca, modelo, ano, placa, precobase);
            this.cilindrada = cilindrada;
        }

        @Override
        public double calcularDiaria() {
            //moto > 300 cilindrada acrescimo de 20%

            if (cilindrada > 300){
                return getPrecoBase() * 1.15;
            }
            return getPrecoBase();
        }

        @Override
        public String exibirDados() {
            return super.exibirDados() + " " + cilindrada;
        }
    }
