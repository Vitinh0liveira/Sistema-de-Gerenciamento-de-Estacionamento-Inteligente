public class Carro extends Veiculo {

    public Carro(String placa, String modelo, String cor) {
        super(placa, modelo, cor);
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
