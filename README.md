### Documentando APIs com Swagger(OpenApi Specification)

O que é o Swagger?
O Swagger é um framework com um conjunto de ferramentas para auxiliar desenvolvedores não só a documentar suas aplicações mas também para fazer a parte de modelagem ou gerar código para desenvolvimento de APIs, aqui nesse passo a passo será descrito apenas a parte da documentação e como pode ser feita.

#### Porque usar? 
- Descreve uma API REST de forma padronizada
- Legível por máquinas e pessoas
- Melhoria na produtividade

#### Informações que podem ser descritas por meio desse tipo de documentação:
- Recursos da Api(propriedades e tipos de dados)
- Endpoints
- Parâmetros
- Terminais
- Se é necessário alguma Autenticação ou Autorização
- Parâmetros da Api e o que retorna

#### Passo a passo da Documentação:

1º passo:
Adicionar dependência no arquivo pom.xml projeto 

```
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>

```

