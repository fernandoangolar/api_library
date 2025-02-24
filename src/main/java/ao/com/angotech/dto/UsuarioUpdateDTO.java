package ao.com.angotech.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UsuarioUpdateDTO(

        @NotBlank(message = "O nome é obrigatório")
        @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres")
        String nome,

        @Size(max = 15, message = "O telefone deve ter no máximo 15 caracteres")
        String telefone,

        @Valid
        DadosEndereco endereco
) {
}
