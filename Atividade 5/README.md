![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)  
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

# 📋 Atividade: Padrão Factory Method - Fábricas Esportivas

O objetivo deste projeto é demonstrar de forma prática a aplicação do padrão de projeto **Factory Method** em Java, por meio de uma simulação de fábricas esportivas (Nike, Adidas, Puma, Umbro e Kappa), que produzem **camisas de futebol de diferentes times brasileiros**.

---

<p align="center">
   <img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExcDQ5Yms5d3B4ZHdpMHFhNHA2ZDRuMTZzNTBpYjlzd253aWpoZWNxMiZlcD12MV9naWZzX3NlYXJjaCZjdD1n/bGgsc5mWoryfgKBx1u/giphy.gif" width="180px" alt="Factory method gif" />  
</p>

---

## 🎯 Funcionalidades Principais

Neste sistema, o usuário pode:
- Selecionar um time de futebol brasileiro
- Visualizar qual é a fábrica esportiva responsável por produzir a camisa desse time
- Obter as informações do time e da marca associada de forma encapsulada usando o padrão **Factory Method**

---

## 🧱 Estrutura do Projeto

```bash
FactoryMethodCamisas/
├── docs/
│   └── diagrama_factory_method.pdf    # Diagrama UML do projeto
├── src/
│   ├── CamisaEsportiva.java           # Interface do produto
│   ├── CamisaBrasil.java              # Produto concreto - Nike
│   ├── CamisaFlamengo.java           # Produto concreto - Adidas
│   ├── CamisaBotafogo.java           # Produto concreto - Puma
│   ├── CamisaFluminense.java         # Produto concreto - Umbro
│   ├── CamisaVasco.java              # Produto concreto - Kappa
│   ├── FabricaEsportiva.java         # Classe abstrata (criador)
│   ├── FabricaNike.java              # Fábrica concreta
│   ├── FabricaAdidas.java            # Fábrica concreta
│   ├── FabricaPuma.java              # Fábrica concreta
│   ├── FabricaUmbro.java             # Fábrica concreta
│   ├── FabricaKappa.java             # Fábrica concreta
│   └── Main.java                     # Classe principal para execução
├── README.md                         # Este arquivo
```

---

## 👨‍💻 Autor

Este projeto foi desenvolvido como exemplo didático.
Sinta-se livre para clonar, modificar e reutilizar com os devidos créditos!

---

## 📄 Diagrama UML
Para visualizar o diagrama UML do projeto, [clique aqui](https://github.com/MyckaelAndrade/design-patterns/blob/MyckaelAndrade-atividade-5/Atividade%205/docs/diagrama_factory_method.pdf)
