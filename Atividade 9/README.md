![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)  
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

# 📦 Loja de Quadrinhos - Itens Aleatórios

Este projeto simula uma loja de quadrinhos que oferece caixas de assinatura com itens variados para seus clientes, de acordo com o nível de assinatura (Bronze, Prata, Ouro, Platina). Cada caixa é montada aleatoriamente com itens do catálogo, respeitando o limite de itens do nível do cliente.

---

<p align="center">
  <img src="https://media2.giphy.com/media/v1.Y2lkPTc5MGI3NjExM2l1cDU5emJxNHVlN3pvOHB2eWtpcXNwcm9wbjRmd3JiMHFoNnIxMyZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/GY6Zmupsc3ilQbsjbL/giphy.gif" width="400" alt="Comics GIF">
</p>

## 🎯 Funcionalidades Principais

- Define níveis de clientes com quantidade específica de itens na caixa:
  - Bronze: 3 itens
  - Prata: 5 itens
  - Ouro: 7 itens
  - Platina: 10 itens
- Catálogo fixo de itens com seus respectivos preços:
  - Quadrinhos (R$15,00), Chaveiros (R$5,00), Bustos (R$10,00), Adesivos (R$1,00), Posters (R$25,00), Camisetas (R$25,00), Canetas (R$3,00), Miniaturas (R$20,00)
- Montagem aleatória da caixa respeitando a capacidade do nível
- Apresenta a lista de itens da caixa e calcula o valor total

---

## Estrutura do Projeto

```bash
LojaQuadrinhos/
├── src/
│   ├── Item.java               # Classe que representa um item
│   ├── Caixa.java              # Classe para montar a caixa com itens aleatórios
│   └── LojaCaixaQuadrinhos.java # Classe principal que gerencia os níveis e interage com o usuário
└── README.md                   # Este arquivo
```

---

## 👨‍💻 Autor

Este projeto foi desenvolvido como exemplo didático.
Sinta-se livre para clonar, modificar e reutilizar com os devidos créditos!

---

## 📄 Diagrama UML
Para visualizar o diagrama UML do projeto, [clique aqui](https://github.com/MyckaelAndrade/design-patterns/blob/MyckaelAndrade-atividade-9/Atividade%209/docs/diagrama_uml.pdf)
