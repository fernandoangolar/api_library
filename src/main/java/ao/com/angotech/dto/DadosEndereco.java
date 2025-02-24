package ao.com.angotech.dto;

import jakarta.validation.constraints.NotBlank;


public record DadosEndereco(

        @NotBlank(message = "A Provincía é obrigatória")
        String provincia,
        @NotBlank(message = "O Município é obrigatória")
        String municipio,
        @NotBlank(message = "O Bairro é obrigatória")
        String bairro,
        @NotBlank(message = "A Rua é obrigatória")
        String rua
) {
}
