public class CarroEletrico extends Carro{
    private boolean recarga;

    public CarroEletrico(String placa, String modelo, String cor, boolean recarga) {
        super(placa, modelo, cor);
        this.recarga = recarga;
    }
    
    @Override
    public double calcularTarifa(int min) {
        double valor = super.calcularTarifa(min);
        if(isRecarga() == false){
            return valor;
        }else{
            return valor - ((10.0/100.0) * valor);
        }
    }

    public boolean isRecarga() {
        return recarga;
    }

    public void setRecarga(boolean recarga) {
        this.recarga = recarga;
    }
    
}
