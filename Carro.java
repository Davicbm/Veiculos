public class Carro extends Veiculo {
    private String marca;
    private String modelo;
    private String fabricante;
    private int potencia;
    private boolean tipoFlex;
    
    public Carro(String placa, String tipoCombustivel, String numeroChassi, String proprietario, String cor,
            double capacidadeTanque, String marca, String modelo, String fabricante, int potencia, double nivelTanque, 
            double quantidadeAcelerar, boolean tipoFlex) {
        super(placa, tipoCombustivel, numeroChassi, proprietario, cor, capacidadeTanque, nivelTanque, quantidadeAcelerar);
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipoFlex = tipoFlex;
    }

    public void abastecer(double quantidadeCombustivel){
        System.out.println("O carro está abastecendo!");
        super.abastecer(quantidadeCombustivel);
    }

    public void abastecer(double quantidadeCombustivel, String tipoCombustivel) {
        if(this.tipoFlex) {
            super.abastecer(quantidadeCombustivel);
            System.out.println("O carro flex está sendo abastecido com " + tipoCombustivel + "!");
        } else {
            System.out.println("O carro não é flex");
        }
    }
 
    public void acelerar(){
        System.out.println("O carro está acelerando!");
        super.acelerar();
    }

    public String toString() {
        return super.toString() + ", Marca = " + marca + ", Modelo = " + modelo + ", Fabricante = " + fabricante + ", Potência = " + potencia
                + ", Flex = " + tipoFlex + "\n";
    }
}
