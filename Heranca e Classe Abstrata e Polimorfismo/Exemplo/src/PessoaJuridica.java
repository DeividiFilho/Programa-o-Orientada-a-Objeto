public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    public PessoaJuridica(String endereco, String telefone, String email, String cnpj, String razaoSocial, String nomeFantasia) {
        super(endereco, telefone, email);
        this.setCnpj(cnpj);
        this.setRazaoSocial(razaoSocial);
        this.setNomeFantasia(nomeFantasia);
    }
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public boolean validarCNPJ(){
        //código para validar cnpj
        return validarCNPJ();
    }
}
