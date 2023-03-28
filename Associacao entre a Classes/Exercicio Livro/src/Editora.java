public class Editora {
    private String razaoSocial;
    private String cnpj;

    public Editora(String razaoSocial, String cnpj) {
        this.setRazaoSocial(razaoSocial);
        this.setCnpj(cnpj);
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
