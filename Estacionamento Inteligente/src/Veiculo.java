public abstract class Veiculo implements Exibivel{
    private String placa;
    private String modelo;
    private String cor;

    public Veiculo(String placa, String modelo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String exibir() {
        return placa + " | " + modelo + " | " + cor;
    }

    public abstract double calcularTarifa(long min);
    
} 

    

