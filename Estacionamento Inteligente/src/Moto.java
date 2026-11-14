public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String modelo, String cor, int cilindradas) {
        super(placa, modelo, cor);
        this.cilindradas = cilindradas;
    }
    
    @Override 
    public double calcularTarifa(int min){
        if(min<=15){
            
            return TabelaTarifa.TR_15MIN / 2;
        }
        else if(min<=30){
            return TabelaTarifa.TR_30MIN / 2;
        }
        else if(min<=60){
            return TabelaTarifa.TR_1h / 2;
        }
        else{
            return TabelaTarifa.TR_AH / 2;
        }
    }
    
}
