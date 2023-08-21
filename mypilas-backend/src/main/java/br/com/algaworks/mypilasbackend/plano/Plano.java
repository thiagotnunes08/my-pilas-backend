package br.com.algaworks.mypilasbackend.plano;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Plano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String razaoSocial;
    private String cnpj;
    private LocalDate dataFundacao;
    private String responsavel;
    private String email;
    private String estado;
    private String cidade;
    private String senha;

    public Plano(String razaoSocial, String cnpj, LocalDate dataFundacao, String responsavel, String email, String estado, String cidade, String senha) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataFundacao = dataFundacao;
        this.responsavel = responsavel;
        this.email = email;
        this.estado = estado;
        this.cidade = cidade;
        this.senha = senha;
    }

    /**
     * @deprecated uso exclusivo do hibernate
     */
    @Deprecated
    public Plano() {
    }

    @Override
    public String toString() {
        return "Plano{" +
                "id=" + id +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", dataFundacao=" + dataFundacao +
                ", responsavel='" + responsavel + '\'' +
                ", email='" + email + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}