package ao.com.angotech.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public record UsuarioCreateDTO(

        @NotBlank(message = "O nome é obrigatório")
        @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres")
        String nome,

        @NotBlank(message = "O e-mail é obrigatório")
        @Email(message = "O e-mail deve ser válido")
        @Size(max = 150, message = "O e-mail deve ter no máximo 150 caracteres")
        String email,

        @NotBlank(message = "A senha é obrigatória")
        @Size(min = 6, max = 255, message = "A senha deve ter entre 6 e 255 caracteres")
        String senha,

        @Size(max = 15, message = "O telefone deve ter no máximo 15 caracteres")
        String telefone,

        @NotBlank(message = "A role é obrigatória")
        @Pattern(regexp = "ADMIN|BIBLIOTECARIO|LEITOR", message = "A role deve ser ADMIN, BIBLIOTECARIO ou LEITOR")
        String role,

        @NotBlank
        @Valid
        DadosEndereco endereco
) {
}
