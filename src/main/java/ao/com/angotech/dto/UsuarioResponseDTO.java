package ao.com.angotech.dto;

public record UsuarioResponseDTO(

        Long id,
        String nome,
        String email,
        String telefone,
        DadosEndereco endereco
) {
}
