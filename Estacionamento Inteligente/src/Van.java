public class Van extends Veiculo{

    public Van(String placa, String modelo, String cor) {
        super(placa, modelo, cor);
    }

    @Override 
    
    public double calcularTarifa(int min){
        if(min<=15){
            
            return TabelaTarifa.TR_15MIN + ((10.0/100.0)*TabelaTarifa.TR_15MIN);
        }
        else if(min<=30){
            return TabelaTarifa.TR_30MIN+ ((10.0/100.0)*TabelaTarifa.TR_30MIN);
        }
        else if(min<=60){
            return TabelaTarifa.TR_1h+ ((10.0/100.0)*TabelaTarifa.TR_1h);
        }
        else{
            return TabelaTarifa.TR_AH+ ((10.0/100.0)*TabelaTarifa.TR_AH);
        }
    }
    
}
