public class Teste {
    public static void main(String[] args){
        Veiculo veiculo = new Veiculo("ABC-1234", "gasolina", "938UEY2", "Carlota",
                                "branco", 50.5, 32, 3);
        
        Carro carro1 = new Carro("EFG-9876", "álcool", "12344JH", "Tony Stark", "preto",
            70, "Ferrari", "Ferrari SF90", "Fiat Chrysler Automobiles", 1100,
            0 ,5, false);
        
        Carro carro2 = new Carro("HIJ-5432", "gasolina e álcool", "902847A", "Barbie",
                            "rosa", 50, "Hyundai", "HB20", "Hyundai", 120, 30, 
                    10, true);
        
        veiculo.abastecer(40);
        veiculo.acelerar();
        veiculo.acelerar();
        veiculo.abastecer(3);
        System.out.println("-- Veículo --");
        System.out.println(veiculo.toString() + "\n");

        carro1.abastecer(70);
        carro1.acelerar();
        System.out.println("-- Carro --");
        System.out.println(carro1.toString());

        carro2.acelerar();
        carro2.acelerar();
        carro2.abastecer(50, "álcool");
        System.out.println("-- Carro Flex --");
        System.out.println(carro2.toString());
    }
}
