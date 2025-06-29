<h1 align="center">  Voll.Med </h1>

<div align="center">

Este projeto é uma API Rest desenvolvida em Java para uma aplicação de consultório médico. O sistema permite o cadastro, atualização, listagem e exclusão de médicos e pacientes, além do agendamento e cancelamento de consultas.

</div>

## :computer: Tecnologias Utilizadas
- Java 17+
- Maven
- Spring Boot
- Spring Data JPA
- Spring Security
- Flyway (migração de banco de dados)
- Banco de dados relacional (ex: PostgreSQL)
- Lombok
- Java JWT
- Spring Documentation (Swagger)

## :pushpin: Estrutura do Projeto
- `src/main/java/med/voll/api/`: Código-fonte principal da aplicação
- `src/main/resources/`: Arquivos de configuração e scripts de migração
- `src/test/java/med/voll/api/`: Testes automatizados

## :gear: Configuração
As configurações de ambiente estão nos arquivos `application.properties`, `application-prod.properties` e `application-test.properties`. Utilize variáveis de ambiente para definir as credenciais do banco de dados em produção.

## :arrow_forward: Como Executar Localmente

1. **Clone o repositório:**
   ```bash
   git clone git@github.com:gyselle-marques/VollMed.git
   cd api
   ```

2. **Configure o banco de dados:**
   - Crie um banco de dados local (ex: PostgreSQL)
   - Atualize o arquivo `src/main/resources/application.properties` com as credenciais do seu banco

3. **Execute as migrações:**
   As migrações são executadas automaticamente ao iniciar a aplicação.

4. **Compile e execute a aplicação:**
   ```bash
   ./mvnw spring-boot:run
   ```
   ou, para Windows:
   ```cmd
   mvnw.cmd spring-boot:run
   ```

5. **Acesse a API:**
   - A API estará disponível em: `http://localhost:8080`

## :arrow_forward: Executando os Testes
```bash
./mvnw test
```

## :pencil2: Documentação
A documentação da API pode ser acessada via Swagger em `/swagger-ui.html` (se configurado).

## :page_facing_up: Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE.txt` para mais detalhes.
