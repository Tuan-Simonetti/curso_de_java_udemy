package uml.judiciario.forum;

import uml.judiciario.NivelEnum;
import uml.judiciario.Processo;
import uml.judiciario.forum.vara.Gabinete;
import uml.judiciario.tribunal.GabineteDesembargador;
import uml.judiciario.tribunal.rh.Juiz;

public class Forum {

    Gabinete gabinete;
    Processo processo;
    Juiz juiz;

    private NivelEnum diretor;
    private NivelEnum vicediretor;
    private NivelEnum varaCivel;
    private NivelEnum varaCriminal;



    String ditribuicao(Processo processo) {
        return null;
    }

    String vara(Juiz juiz) {
        return null;
    }

    Object encaminharTribunal(Processo processo) {
        return null;
    }
}
