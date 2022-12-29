package domain;

public enum Chocolate {
    CHOCOLATE_TIPO_A("Chocolate Tipo A",80),
    CHOCOLATE_TIPO_B("Chocolate Tipo B",85),
    CHOCOLATE_TIPO_C("Chocolate Tipo C",90);

    private String descricao;
    private int porcentagemCacau;

    Chocolate(String descricao, int cacau) {
        this.descricao = descricao;
        this.porcentagemCacau = cacau;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPorcentagemCacau() {
        return porcentagemCacau;
    }

    public void setPorcentagemCacau(int porcentagemCacau) {
        this.porcentagemCacau = porcentagemCacau;
    }

    public static String showPorcentagemChocolate(Chocolate chocolate){
        StringBuilder resposta = new StringBuilder();
        resposta.append(chocolate.getDescricao())
                .append(": ")
                .append(chocolate.getPorcentagemCacau())
                .append("% de cacau");

        return resposta.toString();
    }
}
