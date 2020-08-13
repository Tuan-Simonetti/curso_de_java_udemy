package uml.judiciario.tribunal;

import uml.judiciario.Processo;
import uml.judiciario.tribunal.rh.AssessorDesembargador;
import uml.judiciario.tribunal.rh.ChefeDeGabinete;
import uml.judiciario.tribunal.rh.Desembargador;
import uml.judiciario.tribunal.rh.Estagiario;
import uml.judiciario.tribunal.rh.Juiz;

public class GabineteDesembargador {

    Desembargador desembargador;
    AssessorDesembargador assessor;
    ChefeDeGabinete chefeDeGabinete;
    Estagiario estagiario;
    Processo processo;

    Object receberProcesso(Processo processo) {
        return null;
    }

    Object encaminharCamara(Processo processo) {
        return null;
    }

}
