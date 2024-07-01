<p align="center" width="100%">
    <img width="30%" src="https://avatars3.githubusercontent.com/u/30732658?v=4&s=200.jpg"> 
</p>


<h3 align="center">
  Desafio Backend: Senha Segura
</h3>

<p align="center">

  <img alt="License: MIT" src="https://img.shields.io/badge/license-MIT-%2304D361">
  <img alt="Language: Java" src="https://img.shields.io/badge/language-java-green">
  <img alt="Version: 1.0" src="https://img.shields.io/badge/version-1.0-yellowgreen">

</p>

Resolução do desafio proposto pelo repositório Backend Brasil, confira detalhes [neste link](https://github.com/backend-br/desafios/blob/master/secure-password/PROBLEM.md).


# Sumário

+ [Tecnologias utilizadas](#tecnologias-utilizadas)
+ [Entenda o desafio](#entenda-o-desafio)
+ [Como interagir com a API?](#como-interagir-com-a-api)
+ [Desenvolvimento](#desenvolvimento)
+ [Construção](#construção)
+ [Contribuições](#contribuições)
+ [Links](#links)
+ [Exemplos de Uso](#exemplos)


## Tecnologias utilizadas

* Java 21
* Spring Boot
* OpenAPI

## Entenda o desafio

Leio o [readme](PROBLEM.md) do problema.

## Como interagir com a API?
- Utilizamos o [Postman](https://www.postman.com/) - para realizar as requisições.
- O projeto tem a dependência da OpenAPI Swagger, subindo o projeto você pode fazer as requisões pela url: http://localhost:8080/swagger-ui/index.html

## Desenvolvimento

Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub num diretório de sua preferência:

```shell
cd "diretorio de sua preferencia"
git clone https://github.com/erichiroshi/desafio-backend-secure-password.git
```

## Construção

Para construir o projeto com o Maven, executar os comando abaixo:

```shell
mvn clean install
ou
.\mvnw clean install 
```

O comando irá baixar todas as dependências do projeto e criar um diretório *target* com os artefatos construídos, que incluem o arquivo jar do projeto. Além disso, serão executados os testes unitários, e se algum falhar, o Maven exibirá essa informação no console.

## Contribuições

Contribuições são sempre bem-vindas! Para contribuir lembre-se sempre de adicionar testes unitários para as novas classes com a devida documentação.

## Links
[Link do desafio](https://github.com/backend-br/desafios/blob/master/secure-password/PROBLEM.md).

## Exemplos
### 📨 Requisições

| Método | Url | Descrição | Corpo da requisição |
| --- | --- | --- | --- |
| POST | / | Verifica senha. | [JSON](#senha) |
---
### 📄 Corpo da requisição

##### <a id="senha"></a>

```json
{
  "password": "vYQIYxO&p$yfI^r"
}
```

## Developed by Eric Hiroshi
