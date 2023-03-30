package cadastrodeveiculo;
import java.util.Scanner;
import java.util.ArrayList;
public class Principal{
    static ArrayList<Veiculo> list = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static Veiculo veiculo = new Veiculo();
    public static void main(String[] args){

    int op = -1;

    while(op != 0){
        op = menu();
        if(op == 1){
            cadastrar();
        }else if(op == 2){
            Scanner s = new Scanner(System.in);
            System.out.println("Digite a placa que deseja REMOVER");
            System.out.print("Opcao: ");
            String placa = s.nextLine();
            remover(placa);
        }else if(op == 3){

        }else if(op == 4){
            imprimirTodos();
        }else if(op == 5){
            Scanner s = new Scanner(System.in);
            System.out.println("Digite a placa que deseja PROCURAR");
            System.out.print("Opcao: ");
            String placa = s.nextLine();
            buscarPorPlaca(placa);
        }else{
            System.out.println("||= Obrigado por utilizar meu sistema =||");
            System.out.println("||= Programa encerrado! =||");
        }
    }

    }//main
    //menu de interacao
    public static int menu(){
        System.out.println("||===========================||");
        System.out.println("||=   CADASTRO DE VEICULO   =||");
        System.out.println("||===========================||");
        System.out.println("||= [1] CADASTRAR VEÍCULO   =||");
        System.out.println("||= [2] REMOVER VEÍCULO     =||");
        System.out.println("||= [3] ALTERAR VEÍCULO     =||");
        System.out.println("||= [4] MOSTRAR CADASTROS   =||");
        System.out.println("||= [5] BUSCAR PLACA        =||");
        System.out.println("||===========================||");
        System.out.println("||= [0] SAIR                =||");
        System.out.println("||===========================||");
        System.out.print("Opçao: ");
        return scan.nextInt();
    }
    //metodo cadastrar
    public static void cadastrar(){
        Scanner scann = new Scanner(System.in);
        System.out.println("||=========================||");
        System.out.println("||=       CADASTRAR       =||");
        System.out.println("||=========================||");
        System.out.println("Digite o nome do PROPRIETARIO");
        System.out.print("Opcao: ");
        veiculo.setNome(scann.nextLine());
        System.out.println("||=========================||");
        System.out.println("Digite a EMPRESA");
        System.out.print("Opcao: ");
        veiculo.setEmpresa(scann.nextLine());
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
    }
//metodo de impressao individual
public static ArrayList<Veiculo> imprimir(Veiculo veic){
    System.out.println("||======================||");
    System.out.println("||= MOSTRANDO CADASTRO =||");
    System.out.println("||======================||");
    System.out.println("||= Nome do Proprietario: " + veic.getNome());
    System.out.println("||= Empresa Cadastrada:" + veic.getEmpresa());
    System.out.println("||= Modelo do Veiculo: " + veic.getModelo());
    System.out.println("||= Marca do Veiculo: " + veic.getMarca());
    System.out.println("||= Ano do Veiculo: " + veic.getAno());
    System.out.println("||= Cor do Veiculo: " + veic.getCor());
    System.out.println("||= Placa do Veiculo:" + veic.getPlaca());
    System.out.println("||======================||");
return list;
} 
//metodo para imprimir todos
public static void imprimirTodos(){
    Veiculo veiculo = null;
        for(int i = 0;i < list.size();i++){
            veiculo = list.get(i);
            imprimir(list.get(i));
    }
}
//metodo para buscar por placa
public static ArrayList<Veiculo> buscarPorPlaca(String placa){
    for(int i = 0;i < list.size();i++){
    if(list.get(i).getPlaca().equals(placa)){
        imprimir(list.get(i));
    }
}
    return list;
} 
//metodo para remover
public static ArrayList<Veiculo> remover(String placaRemove){
    for(int i = 0;i < list.size();i++){
    list.remove(i);
    System.out.println(placaRemove + " removido com sucesso!");
    }
    return list;
}
}//global