# 🚀 Atividade 1: Interfaces e Classes Abstratas em Java

Este projeto é um exemplo didático que demonstra o uso de **interfaces**, **classes abstratas** 

---

## 🛠️ Funcionalidades Principais

O projeto contém as seguintes funcionalidades:

1. **Interface `Fornecedor`**:
   - Define métodos que devem ser implementados por classes que representam fornecedores.
   - Métodos:
     - `forneceProduto()`
     - `realizaPedido()`

2. **Interface `Departamento`**:
   - Define métodos para gerenciar departamentos e funcionários.
   - Métodos:
     - `criaDepartamento()`
     - `cadastraFuncionario()`

3. **Classes que implementam as interfaces**:
   - `Engenheiro`: Implementa apenas a interface `Fornecedor`.
   - `Diretor` e `Gerente`: Implementam as interfaces `Autenticavel`, `Fornecedor` e `Departamento`.

4. **Classe Abstrata `Pessoa`**:
   - Define atributos e métodos comuns para representar uma pessoa.
   - Atributos:
     - `nome`, `idade`, `cpf`, `endereco`, `telefone`.
   - Métodos:
     - Getters e setters para os atributos.
     - Métodos abstratos:
       - `exibirInformacoes()`
       - `validaDados()`

5. **Classe `Cliente`**:
   - Herda da classe `Pessoa` e implementa os métodos abstratos.
   - Métodos:
     - `exibirInformacoes()`: Exibe os dados do cliente.
     - `validaDados()`: Verifica se os dados do cliente são válidos.

---

## 🎯 Pontos Principais Utilizados

1. **Interfaces**:
   - As interfaces `Autenticavel`, `Fornecedor` e `Departamento` definem contratos que as classes devem seguir.
   - Uma classe pode implementar múltiplas interfaces (exemplo: `Diretor` e `Gerente`).

2. **Classes Abstratas**:
   - A classe `Pessoa` é abstrata e serve como base para outras classes (exemplo: `Cliente`).
   - Métodos abstratos (`exibirInformacoes()` e `validaDados()`) são implementados nas subclasses.

3. **Herança**:
   - A classe `Cliente` herda atributos e métodos da classe `Pessoa`, demonstrando reutilização de código.

4. **Encapsulamento**:
   - Os atributos da classe `Pessoa` são privados e acessados por meio de métodos públicos (getters e setters).

5. **Polimorfismo**:
   - As classes `Engenheiro`, `Diretor` e `Gerente` implementam os métodos da interface `Fornecedor` de maneiras diferentes.

---

## 🚀 Como Executar o Projeto

1. Clone o repositório ou copie o código para o seu ambiente de desenvolvimento Java.
2. Compile e execute o arquivo `Main.java` para ver o exemplo em funcionamento.
3. Saída esperada:

Engenheiro fornecendo materiais...
Engenheiro realizando pedido...
Diretor criando departamento...
Diretor cadastrando funcionários...
Nome: João Silva
Idade: 30
CPF: 123.456.789-00
Endereço: Rua ABC, 123
Telefone: (11) 99999-9999
Dados válidos!

---

## 📂 Estrutura do Projeto

Atividade 1/
│
├── src/                          # Pasta com o código-fonte
│   ├── Fornecedor.java
│   ├── Departamento.java
│   ├── Engenheiro.java
│   ├── Diretor.java
│   ├── Gerente.java
│   ├── Pessoa.java
│   ├── Cliente.java
│   └── Main.java
│
├── docs/                         # Pasta com a documentação
│   └── diagrama_uml.pdf          # Diagrama UML em PDF
│
└── README.md                     # Arquivo README principal

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java
- **Conceitos**: POO (Programação Orientada a Objetos), Interfaces, Classes Abstratas, Herança, Encapsulamento, Polimorfismo.

---

## 👨‍💻 Autor

Este projeto foi desenvolvido como exemplo didático. Para dúvidas ou sugestões, entre em contato!

---

## 📄 Diagrama UML
Para visualizar o diagrama UML do projeto, clique [aqui](./docs/diagrama_uml.pdf).