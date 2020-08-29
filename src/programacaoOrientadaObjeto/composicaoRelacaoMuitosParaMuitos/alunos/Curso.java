package programacaoOrientadaObjeto.composicaoRelacaoMuitosParaMuitos.alunos;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String nome;
    final List<Curso> alunos = new ArrayList<>();

    Curso(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno) {

        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
