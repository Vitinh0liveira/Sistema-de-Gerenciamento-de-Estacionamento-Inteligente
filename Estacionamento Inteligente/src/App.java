public class App {
    public static void main(String[] args) throws Exception {
        Veiculo c = new Carro("X10", "bmw", "azul");
        Veiculo c1 = new CarroEletrico("x1", "BYD", "preto", false);

        System.out.println("Veiculo: "+c.exibir());
        System.out.println("Valor: "+c.calcularTarifa(40));

        System.out.println("Veiculo: "+c1.exibir());
        System.out.println("Valor: "+c1.calcularTarifa(189));
    }
}
