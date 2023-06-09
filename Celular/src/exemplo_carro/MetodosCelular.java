package exemplo_carro;
import java.util.Scanner;

public class MetodosCelular {
    private String marca;
    private String modelo;
    private String cor;
    private int volume;
    private boolean ligarCelular;

    Scanner entrada = new Scanner(System.in);

    public MetodosCelular(String marca, String modelo, String cor, int volume) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.volume = volume;
        this.ligarCelular = false;
    }

    //Informacoes referentes ao celular

    public void CelularInformacoes() {
        System.out.println("A marca do celular e: " + this.marca);
        System.out.println("O modelo do celular e: " + this.modelo);
        System.out.println("A cor do celular e: " + this.cor);
        System.out.println("A carga do celular esta em: " + this.volume);
    }

    //Funcao para exibir o menu ao usuario

    public void ExibirMenu() {
        System.out.println("Seu celular - Digite a acao a ser realizada");
        System.out.println("=-=-=-=-=-=-=-=-=-=-");
        System.out.println("1 - Ver informações do celular (Recomendado primeiro)");
        System.out.println("2 - Ligar celular");
        System.out.println("3 - Desligar celular");
        System.out.println("4 - Aumentar o volume");
        System.out.println("5 - Diminuir o volume");
        System.out.println("6 - Finalizar operacao");
    }

    //Funcao para ligar o celular

    public void LigarCelular() {
        if(this.ligarCelular) {
            System.out.println("O celular ja esta ligado");
        } else {
            this.ligarCelular = true;
            System.out.println("O celular foi ligado com sucesso");
        }
    }

    //Funcao para desligar o celular

    public void DesligarCelular() {
        if(this.ligarCelular) {
            this.ligarCelular = false;
            System.out.println("O celular foi desligado com sucesso");
        } else {
            System.out.println("O celular ja esta desligado");
        }
    }

    //Funcao para aumentar o volume do celular

    public void AumentarVolume() {
        if (this.ligarCelular == true && this.volume < 100) {
            this.volume += 10;
            System.out.println("Volume aumentado em 10 pontos, agora ele esta em " + this.volume + " de 100");
        } else if(this.ligarCelular == true && this.volume > 99) {
            System.out.println("O volume esta no maximo, " + this.volume + " de 100");
        } else {
            System.out.println("Ligue primeiro o celular para aumentar o volume");
        }
    }

    //Funcao para diminuir o volume do celular

    public void DiminuirVolume() {
        if(this.ligarCelular == true && this.volume > 0) {
            this.volume -= 10;
            System.out.println("Volume diminuido em 10 pontos, agora ele esta em " + this.volume + " de 100");
        } else if(this.ligarCelular == true && this.volume < 1) {
            System.out.println("O volume esta no minimo, " + this.volume + " de 100");
        } else {
            System.out.println("Ligue primeiro o celular para diminuir o volume");
        }
    }

    //Funcao para o usuario escolher a funcao

    public void EscolherFuncao(int opcao) {
        switch(opcao) {
            case 1:
            CelularInformacoes();
            break;

            case 2:
            LigarCelular();
            break;

            case 3:
            DesligarCelular();
            break;

            case 4:
            AumentarVolume();
            break;

            case 5:
            DiminuirVolume();
            break;

            case 6:
            System.out.println("Operacao finalizada com sucesso");
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
        } while(opcao != 6);
    }

}
