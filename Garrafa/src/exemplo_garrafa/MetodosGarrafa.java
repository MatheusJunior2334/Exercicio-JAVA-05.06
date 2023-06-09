package exemplo_garrafa;
import java.util.Scanner;

public class MetodosGarrafa {
    private String marca;
    private String modelo;
    private String cor;
    private int capacidadeAtual;
    private boolean tamparGarrafa;

    Scanner entrada = new Scanner(System.in);

    public MetodosGarrafa(String marca, String modelo, String cor, int capacidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeAtual = capacidadeAtual;
        this.tamparGarrafa = false;
    }

    //Funcao para exibir o menu ao usuario

    public void ExibirMenu() {
        System.out.println("Sua garrafa - Digite a acao a ser realizada");
        System.out.println("=-=-=-=-=-=-=-=-=-=-");
        System.out.println("1 - Ver informacoes da garrafa (Recomendado primeiro)");
        System.out.println("2 - Abrir a garrafa");
        System.out.println("3 - Fechar a garrafa");
        System.out.println("4 - Encher a garrafa");
        System.out.println("5 - Esvaziar a garrafa");
        System.out.println("6 - Amassar a garrafa e finalizar a operacao");
    }

    //Informacoes referentes a garrafa

    public void GarrafaInformacoes() {
        System.out.println("A marca da garrafa e: " + this.marca);
        System.out.println("O modelo da garrafa e: " + this.modelo);
        System.out.println("A cor da garrefa e: " + this.cor);
        System.out.println("A capacidade da garrafa e de: " + this.capacidadeAtual);
    }

    //Funcao para abrir a garrafa

    public void AbrirGarrafa() {
        if(this.tamparGarrafa) {
            System.out.println("A garrafa ja esta aberta");
        } else {
            this.tamparGarrafa = true;
            System.out.println("A garrafa foi aberta");
        }
    }

    //Funcao para fechar a garrafa

    public void FecharGarrafa() {
        if(this.tamparGarrafa) {
            this.tamparGarrafa = false;
            System.out.println("A garrafa foi tampada");
        } else {
            System.out.println("A garrafa ja esta tampada");
        }
    }

    //Funcao para encher a garrafa

    public void EncherGarrafa() {
        if(this.tamparGarrafa == true && this.capacidadeAtual < 100) {
            this.capacidadeAtual += 10;
            System.out.println("Garrafa enchido em 10 pontos, agora ela esta com " + this.capacidadeAtual + " pontos de 100");
        } else if (this.tamparGarrafa == true && this.capacidadeAtual > 99) {
            System.out.println("A garrafa ja esta totalmente enchida, " + this.capacidadeAtual + " pontos de 100");
        } else {
            System.out.println("A garrafa esta tampada, abra ela primeiro");
        }
    }

    //Funcao para esvaziar a garrafa

    public void EsvaziarGarrafa() {
        if(this.tamparGarrafa == true && this.capacidadeAtual > 0) {
            this.capacidadeAtual -= 10;
            System.out.println("Garrafa esvaziada em 10 pontos, agora ela esta com " + this.capacidadeAtual + " pontos de 100");
        } else if(this.tamparGarrafa == true && this.capacidadeAtual < 1) {
            System.out.println("A garrafa ja esta totalmente esvaziada, " + this.capacidadeAtual + " pontos de 100");
        } else {
            System.out.println("A garrafa esta tampada, abra ela primeiro");
        }
    }

    //Funcao para o usuario escolher a opcao

    public void EscolherFuncao(int opcao) {
        switch(opcao) {
            case 1:
            GarrafaInformacoes();
            break;

            case 2:
            AbrirGarrafa();
            break;

            case 3:
            FecharGarrafa();
            break;

            case 4:
            EncherGarrafa();
            break;

            case 5:
            EsvaziarGarrafa();
            break;

            case 6:
            System.out.println("Garrafa amassada e operacao finalizada com sucesso");
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
