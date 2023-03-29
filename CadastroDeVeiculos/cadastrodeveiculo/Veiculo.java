package cadastrodeveiculo;
public class Veiculo {
//atributos
   public String nome;
   public String empresa;
   public String marca;
   public String modelo;
   public int ano;
   public String cor;
   public String placa;

//getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public boolean apto(boolean apto){
        if(apto){
            System.out.println("Veiculo apto para trafegar nas dependencias da empresa!");
        }else{
            System.out.println("Veiculo não atende as normas internas!");
        }
        return apto;
    }
}
