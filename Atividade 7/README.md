# 🎸 Fábrica de Violões - Padrão Prototype

Este projeto é uma simulação de uma **fábrica de violões** que utiliza o **padrão de projeto Prototype** para criar cópias de modelos já existentes de forma eficiente, sem a necessidade de instanciá-los do zero a cada pedido.

---

## Padrão Utilizado

### Prototype
O padrão Prototype permite a criação de novos objetos clonando instâncias pré-existentes. Isso é útil em cenários onde a criação de objetos é custosa ou envolve muitas configurações.

---

## Estrutura do Projeto

```bash
├── docs/
│    └── diagrama_padrao_prototype.pdf
├── src/
│   ├── Main.java
│   ├── ViolaoPrototype.java # Interface Prototype
│   ├── FabricaViolaoPrototype.java # Armazena e fornece protótipos
│   ├── ViolaoClassico.java
│   ├── ViolaoFolk.java
│   ├── ViolaoFlet.java
│   ├── ViolaoJumbo.java
│   ├── ViolaoSeteCordas.java
│   ├── ViolaoDozeCordas.java
│   └── ViolaoParlor.java # Zero, Duplo Zero, Triplo Zero
├── README.md                         # Este arquivo
```

---

## 🎸 Tipos de Violões Disponíveis

- **Clássico**  
  Acústico, 6 cordas de nylon, leve e macio, ideal para iniciantes.

- **Folk**  
  Corpo maior, cordas de aço, ideal para pop e rock, som mais encorpado.

- **Flet**  
  Caixa acústica fina, cordas de nylon, timbre suave, geralmente elétrico.

- **Jumbo**  
  Corpo largo e base arredondada, som mais grave e encorpado.

- **7 Cordas**  
  Similar ao clássico, com uma corda grave adicional, ideal para samba e choro.

- **12 Cordas**  
  Cordas agrupadas em pares, som ressonante, exige mais técnica.

- **Zero (0), Duplo Zero (00), Triplo Zero (000)**  
  Violões tipo Parlor com tamanhos diferentes:
  - **0 (Zero)**: Menor, confortável para tocar.
  - **00 (Duplo Zero)**: Um pouco maior, ideal para fingerstyle.
  - **000 (Triplo Zero)**: Tamanho intermediário, timbre peculiar.

---

## 👨‍💻 Autor

Este projeto foi desenvolvido como exemplo didático.
Sinta-se livre para clonar, modificar e reutilizar com os devidos créditos!

---

## 📄 Diagrama UML
Para visualizar o diagrama UML do projeto, ![clique aqui]()