public class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(String placa, String modelo, String cor, int qtdPortas) {
        super(placa, modelo, cor);
        this.qtdPortas = qtdPortas;
    }
    @Override 
    public double calcularTarifa(int min){
        if(min<=15){
            return TabelaTarifa.TR_15MIN;
        }
        else if(min<=30){
            return TabelaTarifa.TR_30MIN;
        }
        else if(min<=60){
            return TabelaTarifa.TR_1h;
        }
        else{
            return TabelaTarifa.TR_AH;
        }
    }
}
