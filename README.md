# Olá, tudo bem? Me chamo Gabriel e seja bem vindo! 👋

# Challenge - Back End - BlueTechnology

CRUD feito com `java` utilizando o framework `spring boot` para a vaga de estágio na empresa BlueTechnology.

## Documentação da API

#### Retorna todos os usuários

```http
  GET /user
``` 
#### Retorna um usuário

```http
  GET /user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long` | **Obrigatório**. O ID do usuário que você quer |

#### Cadastrar um usuário


```http
  POST /user
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `name`      | `String` | **Obrigatório**. O nome do usuário |
| `email`      | `String` | **Obrigatório**. O email do usuário |
| `phone`      | `String` | **Obrigatório**. O telefone do usuário |
| `cpf`      | `String` | **Obrigatório**. O cpf do usuário |

#### Atualizar um usuário

```http
  PUT /user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long` | **Obrigatório**. O ID do usuário que você quer |
| `name`      | `String` | **Obrigatório**. O nome do usuário |
| `email`      | `String` | **Obrigatório**. O email do usuário |
| `phone`      | `String` | **Obrigatório**. O telefone do usuário |
| `cpf`      | `String` | **Obrigatório**. O cpf do usuário |


#### Excluir um usuário

```http
  DELETE /user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long` | **Obrigatório**. O ID do usuário que você quer |

## Funcionalidades

- Validações nos campos
- Testes unitários
- Criar usuário
- Buscar um usuário
- Buscar todos os usuário
- Atualizar um usuário
- Excluir um usuário


## 📥 download

Antes de começar, você precisará ter as seguintes ferramentas instaladas em sua máquina:
[Git](https://git-scm.com), [Node.js](https://nodejs.org/en/),  e [Java](https://www.java.com/pt-BR/).
Além disso, é bom ter um editor para trabalhar com código como [VSCode](https://code.visualstudio.com/) e [Intellij](https://www.jetbrains.com/pt-br/idea/download/).

### 💻 setup

```php
# clonar este repositório
$ git clone https://github.com/Gabrielmirandaxl/challenge-Bluetechnology

# acesse a pasta do projeto no intellij

# inicie a aplicação

```

### ▶ starting
```php

# aplicação rodando em:
  - Local:   http://localhost:3000/ 
```


<br>

## 🌐 aplicação
<img width="900" heigth="900"  src="https://github.com/Gabrielmirandaxl/gif/blob/main/2023-01-14%2021-46-26.gif">

<br>

## 🛠 tecnologias

As seguintes ferramentas/tecnologias foram usadas na construção e teste do projeto.
<br>

| logo               | Framework                  | Version      |
| :----------------- | :------------------------- | :----------: |
| <img align="center" alt="vue" height="30" width="40" src="https://github.com/tandpfun/skill-icons/blob/main/icons/Java-Dark.svg">| Java  |  `18.0.0`       |
| <img align="center" alt="vue" height="30" width="40" src="https://github.com/tandpfun/skill-icons/blob/main/icons/Spring-Dark.svg">| Spring boot  |  `3.0.1`       |
| <img align="center" alt="js" height="30" width="40" src="https://github.com/devicons/devicon/blob/master/icons/mysql/mysql-original-wordmark.svg"> | Mysql |  `8.0.29`      |
| <img align="center" alt="node" height="30" width="40" src="https://github.com/tandpfun/skill-icons/blob/main/icons/Docker.svg"> | Docker      |  `16.14.2`       |


              
## ✍🏼 autor


<div align=left>

- <table>
 <p>  Developed by:</p>
  <tr align=center>
    <th><strong> Gabriel Miranda </strong></th>
  </tr>
   <td>
      <a href="https://github.com/Gabrielmirandaxl">
        <img width="168" height="140" src="https://user-images.githubusercontent.com/82064724/179410818-bc9e953b-83b1-4f23-9d05-ad702abf0f29.png" > <p align="left">
</p></a>
    </td>

</table>
</div>

<div align=left>

<br>

	
 [<Back](#olá-tudo-bem-me-chamo-gabriel-e-seja-bem-vindo-)


