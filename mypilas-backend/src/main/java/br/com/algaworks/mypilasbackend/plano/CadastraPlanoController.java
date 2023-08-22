package br.com.algaworks.mypilasbackend.plano;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastraPlanoController {

    private final PlanoRepository planoRepository;

    public CadastraPlanoController(PlanoRepository planoRepository) {
        this.planoRepository = planoRepository;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
    @PostMapping("api/v1/plano")
    public void cadastra(@RequestBody @Valid NovoPlanoRequest request){

        var novoPlano = request.toModel();

       planoRepository.save(novoPlano);
    }
}
