
public class Veiculo {
    // Atributos privados: garantem que os dados não sejam acessados diretamente de fora
    private String modelo;
    private String marca;
    private int ano;

    // --- Métodos Assessores (Getters e Setters) ---

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        // O "this" referencia o atributo da classe para evitar confusão com o parâmetro
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Exibição dos dados Informados
    public void exibirInformacoes() {
        System.out.println("Veículo: " + this.marca + " " + this.modelo + " | Ano: " + this.ano);
    }
}