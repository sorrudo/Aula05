import java.util.Scanner;

public class Exx10 {
    public static void main(String[] args) {
       /* EX 10 – Antes da pandemia, o rodízio na cidade de São Paulo foi motivo  de  confusão  em  uma  empresa:
        muitos  dos  150  colaboradores   estão   se   atrasando   e   alegando   que   o   problema  foi
        o  horário  do  rodízio.  Cansado  disso,  um  dos  diretores  da  empresa  solicitou  um  programa
         que  receba  o  NOME   de   cada   um   dos   funcionários,   o   SETOR   desses   profissionais e o
         meio de transporte usado (CARRO ou ÔNIBUS). Caso o profissional use um CARRO para ir até a empresa,
         deve ser solicitada a digitação do último dígito numérico da placa do carro e a mensagem exibida
         deve ser: “Seu dia de rodízio é “ seguida do dia de rodízio. Caso o profissional use um ÔNIBUS
          para ir até a empresa, deve ser exibida a mensagem “rodízio não se aplica”.
        */
        Scanner leitor = new Scanner(System.in);
        String funcionario;
        byte opcao;
        byte placa;


        for (int i=0; i<10; i++) {
            System.out.println("Digite o nome do funcionario:");
            funcionario = leitor.nextLine();
            System.out.println("Qual o setor que o " + funcionario + " trabalha:\n(1) funilaria \n(2) mecânica \n(3) limpeza");
            opcao = leitor.nextByte();
            if (opcao == 1) {
                System.out.println("Qual meio de transporte o " + funcionario + " ultiliza:\n (1) Carro\n (2) Ônibus\n (3) Motocicleta");
                opcao = leitor.nextByte();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o número final de sua placa :");
                        placa = leitor.nextByte();
                        if (placa ==1 || placa == 2) {
                            System.out.println("O dia de seu rodizio é SEGUNDA-FEIRA");
                        }else if (placa == 3 || placa == 4){
                            System.out.println("O dia de seu rodizio é TERÇA-FEIRA");
                        }else if(placa == 5 || placa == 6){
                            System.out.println("O dia de seu rodizio é QUARTA-FEIRA");
                        }else if (placa == 7 || placa == 8){
                            System.out.println("O dia de seu rodizio é QUINTA-FEIRA");
                        }else if (placa == 9 || placa == 10){
                            System.out.println("O dia de seu rodizio é SEXTA-FEIRA");
                        }
                        break;
                    case 2:
                        System.out.println("Rodizio não se aplica");
                        break;
                    case 3:
                        System.out.println("Rodizio não se aplica");
                        break;
                }
            }else if (opcao == 2) {
                System.out.println("Qual meio de transporte o " + funcionario + " ultiliza:\n (1) Carro\n (2) Ônibus\n (3) Motocicleta");
                opcao = leitor.nextByte();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o número final de sua placa :");
                        placa = leitor.nextByte();
                        if (placa ==1 || placa == 2) {
                            System.out.println("O dia de seu rodizio é SEGUNDA-FEIRA");
                        }else if (placa == 3 || placa == 4){
                            System.out.println("O dia de seu rodizio é TERÇA-FEIRA");
                        }else if(placa == 5 || placa == 6){
                            System.out.println("O dia de seu rodizio é QUARTA-FEIRA");
                        }else if (placa == 7 || placa == 8){
                            System.out.println("O dia de seu rodizio é QUINTA-FEIRA");
                        }else if (placa == 9 || placa == 10){
                            System.out.println("O dia de seu rodizio é SEXTA-FEIRA");
                        }
                        break;
                    case 2:
                        System.out.println("Rodizio não se aplica");
                        break;
                    case 3:
                        System.out.println("Rodizio não se aplica");
                        break;
                    default:
                        System.out.println("O valor digitado é inválido");
                        break;
                }

            }else if (opcao == 3) {
                System.out.println("Qual meio de transporte o " + funcionario + " ultiliza:\n (1) Carro\n (2) Ônibus\n (3) Motocicleta");
                opcao = leitor.nextByte();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o número final de sua placa :");
                        placa = leitor.nextByte();
                        if (placa == 1 || placa == 2) {
                            System.out.println("O dia de seu rodizio é SEGUNDA-FEIRA");
                        } else if (placa == 3 || placa == 4) {
                            System.out.println("O dia de seu rodizio é TERÇA-FEIRA");
                        } else if (placa == 5 || placa == 6) {
                            System.out.println("O dia de seu rodizio é QUARTA-FEIRA");
                        } else if (placa == 7 || placa == 8) {
                            System.out.println("O dia de seu rodizio é QUINTA-FEIRA");
                        } else if (placa == 9 || placa == 10) {
                            System.out.println("O dia de seu rodizio é SEXTA-FEIRA");
                        }
                        break;
                    case 2:
                        System.out.println("Rodizio não se aplica");
                        break;
                    case 3:
                        System.out.println("Rodizio não se aplica");
                        break;
                    default:
                        System.out.println("O valor digitado é inválido");
                        break;
                }
            }
        }
    }
}
