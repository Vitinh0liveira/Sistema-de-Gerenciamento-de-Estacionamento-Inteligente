public class App {
    public static void main(String[] args) throws Exception {
        Veiculo c = new Carro("X10", "bmw", "azul", 4);

        System.out.println("Veiculo: "+c.exibir());
        System.out.println("Valor: "+c.calcularTarifa(40));
    }
}
