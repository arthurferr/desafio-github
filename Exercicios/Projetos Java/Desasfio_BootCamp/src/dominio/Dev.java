package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;                        /*Usamos a LInkedHashSet, pois não poderá haver repetição de valores*/
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoFinalziado = new LinkedHashSet<>();

    public void inscreverBootCamp(BootCamp bootCamp){
        this.conteudoInscrito.addAll(bootCamp.getConteudos());
        bootCamp.getDevsInscritos().add(this);
    }

    public void progresso(){
        Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudoFinalziado.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());
        }else {
            System.err.println("Voce não tem Curso Matriculado!");
        }

    }

    public double calcularXPTotal(){
       return this.conteudoFinalziado.
                stream().
                mapToDouble(Conteudo::calcularXP).
                sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getConteudoFinalziado() {
        return conteudoFinalziado;
    }

    public void setConteudoFinalziado(Set<Conteudo> conteudoFinalziado) {
        this.conteudoFinalziado = conteudoFinalziado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscrito, dev.conteudoInscrito) && Objects.equals(conteudoFinalziado, dev.conteudoFinalziado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscrito, conteudoFinalziado);
    }
}
