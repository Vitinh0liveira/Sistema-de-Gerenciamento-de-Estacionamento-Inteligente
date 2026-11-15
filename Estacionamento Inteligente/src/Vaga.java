public abstract class Vaga implements Exibivel{
    private boolean ocupado;
    private int numVaga;
    private String tipo;

    public Vaga(boolean ocupado, int numVaga, String tipo) {
        this.ocupado = ocupado;
        this.numVaga = numVaga;
        this.tipo = tipo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getNumVaga() {
        return numVaga;
    }

    public void setNumVaga(int numVaga) {
        this.numVaga = numVaga;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void livreOcupado() {
        if (isOcupado() == false) {
            System.out.println("Vaga livre");
        } else {
            System.out.println("Vaga ocupada");
        }
    }

    public void ocupar() {
        setOcupado(true);
    }

    public void liberar() {
        setOcupado(false);
    }

    public abstract boolean aceita(Veiculo v);


    @Override
    public String exibir() {
        return "Vaga " + getNumVaga() + " (" + getTipo() + ") - " + (isOcupado() ? "Ocupada" : "Livre");
    }

}


