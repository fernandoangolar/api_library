

CREATE TABLE usuarios (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL,
    telefone varchar(15),
    endereco varchar(200),
    role VARCHAR(20) CHECK (role IN ('ADMIN', 'BIBLIOTECARIO', 'LEITOR') ) NOT NULL
);

CREATE TABLE livros (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(200) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    isbn VARCHAR(20) UNIQUE NOT NULL,
    editora VARCHAR(100) not null,
    genero varchar(50) not null,
    ano_publicacao INT CHECK (ano_publicacao >= 1500 AND ano_publicacao <= EXTRACT(YEAR FROM CURRENT_DATE) ),
    quantidade_disponivel INT CHECK (quantidade_disponivel >= 0) NOT NULL
);

CREATE TABLE emprestimos (
    id SERIAL PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    livro_id BIGINT NOT NULL,
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE,
    devolvido BOOLEAN DEFAULT FALSE,
    status varchar(20) not null check (status in ('ATIVO', 'DEVOLVIDO', 'ATRASADO') ),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE CASCADE,
    FOREIGN KEY (livro_id) REFERENCES livros(id) ON DELETE CASCADE,
    CONSTRAINT chk_data_devolucao CHECK (data_devolucao IS NULL OR data_devolucao >= data_emprestimo)
);

CREATE TABLE reservas (
    id SERIAL PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    livro_id BIGINT NOT NULL,
    data_reserva DATE NOT NULL DEFAULT CURRENT_DATE,
    ativa BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE CASCADE,
    FOREIGN KEY (livro_id) REFERENCES livros(id) ON DELETE CASCADE
);

CREATE TABLE notificacoes (
    id SERIAL PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    mensagem TEXT NOT NULL,
    lida BOOLEAN DEFAULT FALSE,
    data_envio TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE CASCADE
);

CREATE TABLE relatorios (
    id SERIAL PRIMARY KEY,
    tipo VARCHAR(100) NOT NULL check ( tipo in ('LIVROS_MAIS_EMPRESTADOS', 'USUARIOS_MAIS_EMPRESTADOS') ),
    data_geracao DATE NOT NULL DEFAULT CURRENT_DATE,
    dados JSON NOT NULL
);

CREATE TABLE multas (
    id SERIAL PRIMARY KEY,
    emprestimo_id BIGINT not null,
    valor DECIMAL(10, 2) not null check (valor >= 0),
    paga BOOLEAN not null DEFAULT FALSE,
    FOREIGN KEY (emprestimo_id) REFERENCES emprestimos(id)
);