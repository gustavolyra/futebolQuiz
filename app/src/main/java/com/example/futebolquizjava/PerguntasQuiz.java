package com.example.futebolquizjava;

public class PerguntasQuiz {

    private int mQuestao;

    private boolean mQuestaoVerdadeira;

    public Pergunta(int questao, boolean questaoVerdadeira) {
        mQuestao = questao;
        mQuestaoVerdadeira = questaoVerdadeira;
    }

    public int getQuestao() {
        return mQuestao;
    }

    public void setQuestao(int questao) {
        mQuestao = questao;
    }

    public boolean isQuestaoVerdadeira() {
        return mQuestaoVerdadeira;
    }

    public void setQuestaoVerdadeira(boolean questaoVerdadeira) {
        mQuestaoVerdadeira = questaoVerdadeira;
    }
}
