# StudyHub 📚

O **StudyHub** é uma aplicação desenvolvida em Java para organizar e gerenciar materiais de estudo por meio de uma interface de terminal.

O projeto foi criado com o objetivo de colocar em prática os fundamentos da linguagem Java, Programação Orientada a Objetos, manipulação de coleções e separação de responsabilidades em camadas.

## Funcionalidades

- Cadastrar materiais de estudo com nome, descrição, link, tópico e tags.
- Listar todos os materiais cadastrados.
- Buscar materiais pelo identificador (ID).
- Filtrar materiais por tópico.
- Filtrar materiais por tag.
- Excluir materiais utilizando o ID.
- Navegar pelas funcionalidades através de um menu interativo.

## Tecnologias e conceitos

- Java
- Programação Orientada a Objetos (POO)
- Java Collections (`List` e `ArrayList`)
- Encapsulamento e construtores
- Injeção de dependência por construtor
- Organização em camadas
- Git e GitHub para versionamento

## Estrutura do projeto

```text
Prototipo Study/
├── src/
│   ├── model/
│   │   └── Material.java
│   ├── repository/
│   │   └── MaterialRepository.java
│   ├── service/
│   │   └── MaterialService.java
│   ├── view/
│   │   └── View.java
│   └── Main.java
└── README.md
```

A aplicação está organizada em quatro camadas principais:

- **Model:** representa os dados de cada material.
- **Repository:** armazena os materiais em memória e executa as operações de consulta e exclusão.
- **Service:** intermedeia as operações entre a View e o Repository.
- **View:** recebe as entradas do usuário e apresenta os resultados no terminal.

A classe `Main` inicializa e conecta os componentes da aplicação.

## Como executar

**Pré-requisito:** possuir um JDK compatível com o código do projeto. O desenvolvimento e os testes foram realizados utilizando o OpenJDK 26.

1. Clone o repositório:

```bash
git clone https://github.com/AdrianLimaaa/StudyHub.git
```

2. Abra a pasta do projeto no IntelliJ IDEA.
3. Configure o JDK do projeto.
4. Execute a classe `Main.java`.

O menu interativo será apresentado no terminal.

## Exemplo de utilização

```text
========= STUDYHUB =========
1 - Cadastrar material
2 - Listar todos os materiais
3 - Buscar material por ID
4 - Buscar material por Tópico
5 - Buscar material por Tag
6 - Excluir material
0 - Sair
```

Exemplo de material cadastrado:

```text
ID: 1
Nome: Java
Descrição: Estudo de POO
Link: https://exemplo.com/java
Tópico: Java
Tags: [Backend, Java]
```

## Limitações da versão atual

Esta é uma versão inicial, desenvolvida para fins de estudo e consolidação dos fundamentos de Java.

- Os dados são armazenados em memória, utilizando `ArrayList`, e são perdidos ao encerrar a aplicação.
- Ainda não existe integração com banco de dados.
- As validações de entrada e o tratamento de exceções são limitados.
- As buscas por tópico e tag consideram diferenças entre letras maiúsculas e minúsculas.
- Não existe autenticação ou gerenciamento de usuários.

## Próximas melhorias

Para as próximas versões, estão planejadas:

- Validação dos dados cadastrados.
- Melhorias no encapsulamento.
- Tratamento de exceções.
- Refatoração para reduzir código repetido.
- Atualização de materiais existentes.
- Melhorias nos filtros de pesquisa.
- Implementação de testes automatizados com JUnit.

Futuramente, o projeto poderá evoluir para uma API REST utilizando **Spring Boot e PostgreSQL**.

## Status

**Versão:** v0.1.0 — MVP em Java puro.

As funcionalidades básicas foram implementadas e verificadas por meio de testes manuais.

O projeto continuará recebendo melhorias conforme o avanço dos estudos.