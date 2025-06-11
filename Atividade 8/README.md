![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

# Sistema de Gerenciamento de Veículos - Padrão Adapter

O objetivo deste projeto é simular a **integração de duas bibliotecas incompatíveis** em um sistema de gerenciamento de dados de veículos, utilizando o padrão de projeto **Adapter**. A aplicação permite que uma **biblioteca legada** seja usada com a nova **interface moderna**, adaptando os dados automaticamente.

---

<p align="center">
  <img src="https://media.giphy.com/media/XreQmk7ETCak0/giphy.gif" width="400" alt="Adapter Pattern GIF">
</p>

---

## Funcionalidades Principais

- Representação de veículos com classe `Veiculo`
- Interface moderna de armazenamento `IArmazenamentoVeiculo`
- Biblioteca legada com `ArmazenamentoVeiculoAntigo`
- Implementação de um **Adapter** para integração entre as bibliotecas
- Demonstração prática no método `main`

---

## Estrutura do Projeto

```bash
├── docs/
│   └── relatorio.pdf               # Relatório do Projeto 1 a 2 Páginas
├── src/
│   ├── Vehicle.java                # Classe que representa um veículo
│   ├── IVehicleStorage.java        # Interface da nova biblioteca
│   ├── OldVehicleStorage.java      # Biblioteca legada
│   ├── VehicleStorageAdapter.java  # Classe Adapter
│   ├── Main.java                   # Classe de teste com método main
├── README.md                       # Este arquivo

```

---

## 👨‍💻 Autor

Este projeto foi desenvolvido como exemplo didático.
Sinta-se livre para clonar, modificar e reutilizar com os devidos créditos!

---

## 📄 Diagrama UML
Para visualizar o diagrama UML do projeto, [clique aqui]()