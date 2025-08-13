package com.example.quizz_server.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Questao extends BaseModel{
    @NotBlank(message = "O texto da questão não pode estar vazio")
    @Column(nullable = false)
    private String textoQuestao;
    @NotNull
    @Enumerated
    @JoinColumn(nullable=false)
    private TipoQuestao tipoQuestao;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_quiz", nullable = false)
    private Quiz quiz;
    @OneToMany
    @JoinColumn(nullable = false)
    private List<Questao> opcao;

    public String getTextoQuestao() {return textoQuestao;}
    public void setTextoQuestao(String textoQuestao) {this.textoQuestao = textoQuestao;}
    public TipoQuestao getTipoQuestao() {return tipoQuestao;}
    public void setTipoQuestao(TipoQuestao tipoQuestao) {this.tipoQuestao = tipoQuestao;}
    public Quiz getQuiz() {return quiz;}
    public void setQuiz(Quiz quiz) {this.quiz = quiz;}
    public List<Questao> getOpcao() {return opcao;}
    public void setOpcao(List<Questao> opcao) {this.opcao = opcao;}
}
