package exemplo_carro;
import java.util.Scanner;

public class MetodosCarro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private boolean dentroCarro;
    private boolean ligarCarro;

    Scanner entrada = new Scanner(System.in);

    public MetodosCarro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.dentroCarro = false;
        this.ligarCarro = false;
    }

    //Informações referentes ao carro

    public void CarroInformacoes() {
        System.out.println("A marca do carro e: " + this.marca);
        System.out.println("O modelo do carro e: " + this.modelo);
        System.out.println("A cor do carro e: " + this.cor);
        System.out.println("O ano do carro e: " + this.ano);
    }

    //Funcao para exibir o menu ao usuario

    public void ExibirMenu() {
        System.out.println("Seu carro");
        System.out.println("Digite a opcao a ser realizada: ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("1 - Ver informacoes do carro");
        System.out.println("2 - Entrar no carro");
        System.out.println("3 - Sair do carro");
        System.out.println("4 - Ligar o carro");
        System.out.println("5 - Desligar o carro");
        System.out.println("6 - Finalizar operacao");
    }

    //Funcao para entrar no carro

    public void EntrarCarro() {
        if(this.dentroCarro) {
            System.out.println("Voce ja esta dentro do carro");
        } else {
            this.dentroCarro = true;
            System.out.println("Voce entrou no carro");
        }
    }

    //Funcao para sair do carro

    public void SairCarro() {
        if(this.dentroCarro) {
            this.dentroCarro = false;
            System.out.println("Voce saiu do carro");
        } else {
            System.out.println("Voce ja esta fora do carro");
        }
    }

    //Funcao para ligar o carro

    public void LigarCarro() {
        if(this.dentroCarro && !this.ligarCarro) {
            this.ligarCarro = true;
            System.out.println("O carro foi ligado com sucesso");
        } else if (!this.dentroCarro) {
            System.out.println("Voce precisa estar dentro do carro para liga-lo");
        } else {
            System.out.println("O carro ja esta ligado");
        }
    }

    //Funcao para desligar o carro

    public void DesligarCarro() {
        if(this.dentroCarro && this.ligarCarro) {
            this.ligarCarro = false;
            System.out.println("O carro foi desligado");
        } else if(!this.dentroCarro) {
            System.out.println("Voce precisa estar dentro do carro para desliga-lo");
        } else {
            System.out.println("O carro ja esta desligado");
        }
    }

    //Funcao para finalizar operacao

    public void FinalizarOperacao() {
        if(this.ligarCarro) {
            this.ligarCarro = false;
            System.out.println("Para finalizar a operacao, o carro deve estar desligado");
        } else {
            System.out.println("Operacao finalizada com sucesso");
        }
    }

    //Funcao para o usuario poder escolher a opcao a ser realizada

    public void EscolherFuncao(int opcao) {
        switch(opcao) {
            case 1:
            CarroInformacoes();
            break;
            
            case 2:
            EntrarCarro();
            break;
            
            case 3:
            SairCarro();
            break;

            case 4:
            LigarCarro();
            break;

            case 5:
            DesligarCarro();
            break;

            case 6:
            FinalizarOperacao();
            break;

            default: 
            System.out.println("Opcao invalida, reinicie o programa e tente novamente");
        }
    }

    //Funcao para iniciar o programa

    public void Iniciar() {
        int opcao = 0;

        do {
            ExibirMenu();
            opcao = entrada.nextInt();
            EscolherFuncao(opcao);
        } while (opcao != 6);
    }
}
