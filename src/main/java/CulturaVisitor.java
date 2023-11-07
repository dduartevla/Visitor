public class CulturaVisitor implements Visitor{

    public String exibir(Cultura cultura) {
        return cultura.aceitar(this);
    }
    @Override
    public String visitarFeijao(Feijao feijao) {
        String str =
                "FEIJÃO\n" +
                "Data Plantio: " + feijao.getDataPlantio() + "\n" +
                "Área Cultivada: " + feijao.getAreaCultivada() + "\n" +
                "Em tratamento: " + feijao.isEmTratamento() + "\n" +
                "Intervenção Sugerida: " + feijao.getIntervencaoSugerida();
        return str;
    }

    @Override
    public String visitarMilho(Milho milho) {
        String str =
                "MILHO\n" +
                "Data Plantio: " + milho.getDataPlantio() + "\n" +
                "Área Cultivada: " + milho.getAreaCultivada() + "\n" +
                "Em tratamento: " + milho.isEmTratamento() + "\n" +
                "Intervenção Sugerida: " + milho.getIntervencaoSugerida();
        return str;
    }

    @Override
    public String visitarFolhosas(Folhosas folhosas) {
        String str =
                "MILHO\n" +
                "Nome: " + folhosas.getNome() + "\n" +
                "Data Plantio: " + folhosas.getDataPlantio() + "\n" +
                "Área Cultivada: " + folhosas.getAreaCultivada() + "\n" +
                "Em tratamento: " + folhosas.isEmTratamento() + "\n" +
                "Intervenção Sugerida: " + folhosas.getIntervencaoSugerida();
        return str;
    }
}
