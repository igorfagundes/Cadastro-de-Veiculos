package cadastrodeveiculo;
public class Proprietario {
//atributos
    public String nome;
    private String cargo;
    public String empresa;
//costrutor
    public Proprietario(String nome, String cargo, String empresa) {
        this.nome = nome;
        this.cargo = cargo;
        this.empresa = empresa;
    }
//getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
