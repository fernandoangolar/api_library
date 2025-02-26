package ao.com.angotech.dto;

import ao.com.angotech.enuns.Role;

public record CadastroDTO(String email, String senha, Role role) {
}
