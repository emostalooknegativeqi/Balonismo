package balao;

public class Main {
    public static void main(String[]args){
        //criar objetos do passeio
        Pessoa p1 = new Pessoa();
        Pessoa p2; //DECLARAÇÃO DO OBJETO
        p2 = new Pessoa();
        //...
        p1.nome = "monark";
        p1.cpf = "12345678990";
        p1.rg = "1122222154465";
        p1.telefone = 988888888;
        p1.numeroParaEmergencia = 977777777;
        p1.endereço = "rua juliana paiva, número 44";
        p1.termoCienciaRisco = true;

        p2.nome = "igor3k";
        p2.cpf = "12345678997";
        p2.rg = "11222221544665";
        p2.telefone = 988855888;
        p2.numeroParaEmergencia = 977227777;
        p2.endereço = "rua juliana paiva, número 44";
        p2.termoCienciaRisco = true;

        Piloto pl1 = new Piloto();
        pl1.nome = "davy jones";
        pl1.cpf = "15555555555";
        pl1.NumeroRegistro = "8645555";

        Balao b1 = new Balao();
        b1.NumeroIdentificacao = "861445";
        b1.RegistroRegularidade = "regular";
    }
}
