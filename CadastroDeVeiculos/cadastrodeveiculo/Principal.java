package cadastrodeveiculo;
import java.util.Scanner;
import java.util.ArrayList;
public class Principal{
    static ArrayList<Veiculo> list = new ArrayList<>();
    static ArrayList<Proprietario> listP = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static Veiculo veiculo = new Veiculo();
    static Veiculo veiculo2 = new Veiculo();
    static Veiculo veiculo3 = new Veiculo();
    static Proprietario proprietario = new Proprietario();
    static Proprietario proprietario2 = new Proprietario();
    static Proprietario proprietario3 = new Proprietario();
    public static void main(String[] args){
//Cadastro 1
    proprietario.setNome("Igor");
    proprietario.setEmpresa("Ficiticia SA");
    veiculo.setMarca("Peugeot");
    veiculo.setModelo("207");
    veiculo.setAno(2013);
    veiculo.setCor("Banco");
    veiculo.setPlaca("aaa1234");
    list.add(veiculo);
    listP.add(proprietario);
//Cadastro 2
    proprietario2.setNome("fagundes");
    proprietario2.setEmpresa("Ficiticia SB");
    veiculo2.setMarca("Wolksvagen");
    veiculo2.setModelo("Fusca");
    veiculo2.setAno(1976);
    veiculo2.setCor("Azul");
    veiculo2.setPlaca("bbb1234");
    list.add(veiculo2);
    listP.add(proprietario2);
//Cadastro 3
    proprietario3.setNome("Pontes");
    proprietario3.setEmpresa("Ficiticia SC");
    veiculo3.setMarca("Fiat");
    veiculo3.setModelo("Uno");
    veiculo3.setAno(2009);
    veiculo3.setCor("Prata");
    veiculo3.setPlaca("ccc1234");
    list.add(veiculo3);
    listP.add(proprietario3);
    //imprimir(veiculo, proprietario);
    imprimirTodos();
    /*int op = -1;

    while(op != 0){
        op = menu();
        if(op == 1){
   
        }else if(op == 2){

        }else if(op == 3){

        }else if(op == 4){
            imprimirTodos();
        }else{
            System.out.println("||= Obrigado por utilizar meu sistema =||");
            System.out.println("||= Programa encerrado! =||");
        }
    }*/

    }//main
    //menu de interacao
    /*public static int menu(){
        System.out.println("||==========================||");
        System.out.println("||=  CADASTRO DE VEICULO   =||");
        System.out.println("||==========================||");
        System.out.println("||= [1] CADASTRAR VEÍCULO  =||");
        System.out.println("||= [2] REMOVER VEÍCULO    =||");
        System.out.println("||= [3] ALTERAR VEÍCULO    =||");
        System.out.println("||= [4] PROCURAR VEÍCULO   =||");
        System.out.println("||==========================||");
        System.out.println("||= [0] SAIR               =||");
        System.out.println("||==========================||");
        System.out.print("Opçao: ");
        return scan.nextInt();
    }*/
    //metodo cadastrar
    /*public static void cadastrar(){
        Scanner scann = new Scanner(System.in);
        System.out.println("||=========================||");
        System.out.println("||=       CADASTRAR       =||");
        System.out.println("||=========================||");
        System.out.println("Digite o nome do PROPRIETARIO");
        System.out.print("Opcao: ");
        proprietario.setNome(scann.nextLine());
        System.out.println("||=========================||");
        System.out.println("Digite a EMPRESA");
        System.out.print("Opcao: ");
        proprietario.setEmpresa(scann.nextLine());
        System.out.println("||=========================||");
        System.out.println(" Digite o MARCA do veículo");
        System.out.print("Opçao: ");
        veiculo.setMarca(scann.nextLine());
        System.out.println("||=========================||");
        System.out.println(" Digite o MODELO do veículo");
        System.out.print("Opçao: ");
        veiculo.setModelo(scann.nextLine());
        System.out.println("||=========================||");
        System.out.println(" Digite o ANO do veículo");
        System.out.print("Opçao: ");
        veiculo.setAno(scann.nextInt());
        scann.nextLine();
        System.out.println("||=========================||");
        System.out.println(" Digite o COR do veículo");
        System.out.print("Opçao: ");
        veiculo.setCor(scann.nextLine());
        System.out.println("||=========================||");
        System.out.println(" Digite o PLACA do veículo");
        System.out.print("Opçao: ");
        veiculo.setPlaca(scann.nextLine());
        System.out.println("||=========================||");
        System.out.println("O Veiculo em cadastro esta apto para trafegar nas dependencias da empresa? [S-Sim/N-Nao]");
        System.out.print("Opçao: ");
        String escolha = scann.nextLine();
        if(escolha.equals("s")){
            veiculo.apto(true);
        }else{
            veiculo.apto(false);
        }
        list.add(veiculo);
        listP.add(proprietario);

    }*/
//metodo de impressao individual
public static ArrayList<Veiculo> imprimir(Veiculo veic, Proprietario prop){
    System.out.println("Nome do Proprietario: " + proprietario.getNome());
    System.out.println("Empresa Cadastrada:" + proprietario.getEmpresa());
    System.out.println("Modelo do Veiculo: " + veiculo.getModelo());
    System.out.println("Marca do Veiculo: " + veiculo.getMarca());
    System.out.println("Ano do Veiculo: " + veiculo.getAno());
    System.out.println("Cor prevalente do Veiculo: " + veiculo.getCor());
    System.out.println("Placa do Veiculo:" + veiculo.getPlaca());
    return list;
    
} 
//metodo para imprimir todos
public static void imprimirTodos(){
    Veiculo veiculo = null;
    Proprietario proprietario = null;
        for(int i = 0;i < list.size();i++){
            for(int j = 0;j < listP.size();j++){
            veiculo = list.get(i);
            proprietario = listP.get(j);
            imprimir(veiculo, proprietario);
            }
    }
} 
}//global