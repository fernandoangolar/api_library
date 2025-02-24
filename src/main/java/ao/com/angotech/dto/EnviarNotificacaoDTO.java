package ao.com.angotech.dto;

import jakarta.validation.constraints.NotBlank;

public record EnviarNotificacaoDTO(

        @NotBlank(message = "O id do usuario é obrigatório!!")
        Long usuarioId,

        @NotBlank(message = "A mensagem é obrigatório!!")
        String message
) {
}
