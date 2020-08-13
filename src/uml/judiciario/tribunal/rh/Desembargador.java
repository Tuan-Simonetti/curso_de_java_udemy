package uml.judiciario.tribunal.rh;

import uml.judiciario.Processo;
import uml.judiciario.tribunaisSuperiores.rhSuperior.AssessorSuperior;
import uml.judiciario.tribunal.GabineteDesembargador;

import java.util.Date;

public class Desembargador {

    String nome;
    String matricula;
    Date nascimento;
    Date admissao;
    String competencia;
    Double vencimento;
    AssessorDesembargador assessorDesembargador;

    String julgar(Processo processo){
        return null;
    }

    String administrarGabinete(GabineteDesembargador gabinete) {
        return null;
    }

}
