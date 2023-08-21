package br.com.algaworks.mypilasbackend.plano;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

import java.time.LocalDate;

public record NovoPlanoRequest(
        @NotBlank String razaoSocial,
        @NotBlank @CNPJ String cnpj,
         LocalDate dataFundacao,
        @NotBlank String responsavel,
        @NotBlank @Email String email,
        @NotBlank String estado,
        @NotBlank  String cidade,
        @NotBlank  String senha) {

    public Plano toModel() {
        return new Plano(razaoSocial,cnpj,dataFundacao,responsavel,email,estado,cidade,senha);
    }
}
