package med.voll.api.domain.usuario;

public record DadosAutenticacao(String login, String senha) {
    // Este record é usado para encapsular os dados de autenticação do usuário
    // Contém os campos 'login' e 'senha' que serão utilizados no processo de autenticação
}
