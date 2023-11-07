public class Tomate {

    private String dataPlantio;
    private double areaCultivada;
    private String intervencaoSugerida;
    private boolean emTratamento;

    public Tomate(String dataPlantio, double areaCultivada, String intervencaoSugerida){
        this.dataPlantio = dataPlantio;
        this.areaCultivada = areaCultivada;
        this.intervencaoSugerida = intervencaoSugerida;
        this.emTratamento = false;
    }

    public String getDataPlantio() {
        return dataPlantio;
    }

    public void setDataPlantio(String dataPlantio) {
        this.dataPlantio = dataPlantio;
    }

    public double getAreaCultivada() {
        return areaCultivada;
    }

    public void setAreaCultivada(double areaCultivada) {
        this.areaCultivada = areaCultivada;
    }

    public String getIntervencaoSugerida() {
        return intervencaoSugerida;
    }

    public void setIntervencaoSugerida(String intervencaoSugerida) {
        this.intervencaoSugerida = intervencaoSugerida;
    }

    public boolean isEmTratamento() {
        return emTratamento;
    }

    public void setEmTratamento(boolean emTratamento) {
        this.emTratamento = emTratamento;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirTomate(this);
    }
}
