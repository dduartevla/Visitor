import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CulturaVisitorTest {

    @Test
    void deveVisitarFeijao(){
        Feijao feijao = new Feijao("23/03/2023",10000.00f,"");
        feijao.setEmTratamento(true);
        feijao.setIntervencaoSugerida("Aplicar adubo x");

        CulturaVisitor cvis = new CulturaVisitor();

        String str =
                "FEIJÃO\n" +
                "Data Plantio: " + "23/03/2023" + "\n" +
                "Área Cultivada: " + 10000.00f + "\n" +
                "Em tratamento: " + true + "\n" +
                "Intervenção Sugerida: " + "Aplicar adubo x";

        assertEquals(str, cvis.exibir(feijao));
    }

    @Test
    void deveVisitarMilho(){
        Milho milho = new Milho("23/03/2023",10000.00f,"");
        milho.setIntervencaoSugerida("Limpeza");

        CulturaVisitor cvis = new CulturaVisitor();

        String str =
                "MILHO\n" +
                "Data Plantio: " + "23/03/2023" + "\n" +
                "Área Cultivada: " + 10000.00f + "\n" +
                "Em tratamento: " +  false + "\n" +
                "Intervenção Sugerida: " + "Limpeza";

        assertEquals(str, cvis.exibir(milho));
    }

    @Test
    void deveVisitarFolhosas(){
        Folhosas folhosa = new Folhosas("Alface","23/03/2023",300.00f,"");
        folhosa.setIntervencaoSugerida("Aplicar Cálcio e Boro");

        CulturaVisitor cvis = new CulturaVisitor();

        String str =
                "Nome: " + "Alface" + "\n" +
                "Data Plantio: " + "23/03/2023" + "\n" +
                "Área Cultivada: " + 300.00f + "\n" +
                "Em tratamento: " +  false + "\n" +
                "Intervenção Sugerida: " + "Aplicar Cálcio e Boro";

        assertEquals(str, cvis.exibir(folhosa));
    }

}