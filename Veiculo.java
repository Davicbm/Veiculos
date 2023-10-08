public class Veiculo{
    private String placa;
    private String tipoCombustível;
    private String numeroChassi;
    private String proprietario;
    private String cor;
    private double capacidadeTanque = 0;
    private double nivelTanque = 0;
    private double quantidadeAcelerar;

    public Veiculo (String placa, String tipoCombustivel, String numeroChassi, String proprietario, String cor, double capacidadeTanque,
    double nivelTanque, double quantidadeAcelerar){
        this.placa = placa;
        this.tipoCombustível = tipoCombustivel;
        this.numeroChassi = numeroChassi;
        this.proprietario = proprietario;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
        this.nivelTanque = nivelTanque;
        this.quantidadeAcelerar = quantidadeAcelerar;
    }

    public void abastecer(double quantidadeCombustivel){
        if (quantidadeCombustivel <= capacidadeTanque && (quantidadeCombustivel + nivelTanque) <= capacidadeTanque){
            nivelTanque += quantidadeCombustivel;
            System.out.println("O veículo está abastecendo...");
            if (nivelTanque == capacidadeTanque){
                System.out.println("O tanque foi completamente abastecido!");
            }
        } else {
            System.out.println("O veículo está abastecendo...");
            quantidadeCombustivel += nivelTanque - capacidadeTanque;
            nivelTanque = capacidadeTanque;
            System.out.println("O tanque do veículo foi completamente abastecido, mas desperdiçou: " + quantidadeCombustivel + " de combustível.");
        }
    }

    public void acelerar(){
        if (nivelTanque >= quantidadeAcelerar){
            nivelTanque -= quantidadeAcelerar;
            System.out.println("O veículo está acelerando...");
        } else {
            System.out.println("O veículo não possui combustível para acelerar!");
        }
    }

    public String toString() {
        return "Placa = " + placa + ", Tipo de Combustível = " + tipoCombustível + ", Número do Chassi = " + numeroChassi
                + ", Proprietário = " + proprietario + ", Cor = " + cor + ", Capacidade do Tanque = " + capacidadeTanque
                + ", Nível do Tanque = " + nivelTanque + ", Quantidade para Acelerar(combustível) = "+ quantidadeAcelerar;
    }
}