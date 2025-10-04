# CRUD de Veículos em Java

Sistema CRUD desenvolvido em **Java** para gerenciamento de veículos terrestres e aquáticos.
O projeto explora princípios de **Programação Orientada a Objetos (POO)** como herança, abstração e polimorfismo, mantendo uma estrutura modular e extensível.

## ⚙️ Arquitetura

* **Camada de modelos**: classes que representam entidades (`Veiculo`, `Carro`, `Moto`, `Lancha`, `Jetski`).
* **Abstrações**: `VeiculoTerrestre` e `VeiculoAquatico` fornecem especializações.
* **Main**: ponto de entrada (`main.java`), responsável pelo fluxo de execução do CRUD.

## 📂 Estrutura

```
src/
 ├── Veiculo.java              # Classe base abstrata
 ├── VeiculoTerrestre.java     # Subclasse abstrata
 ├── VeiculoAquatico.java      # Subclasse abstrata
 ├── Carro.java                # Implementação concreta
 ├── Moto.java                 # Implementação concreta
 ├── Lancha.java               # Implementação concreta
 ├── Jetski.java               # Implementação concreta
 └── main.java                 # Entry point
```

## 🛠 Tecnologias

* **Java 8+**
* IDE recomendada: **Eclipse**

## ▶️ Execução

Clone o repositório e compile:

```bash
git clone https://github.com/dss-alec/crud-java-eclipse.git
cd crud-java-eclipse/src
javac *.java
java main
```

## 🚀 Próximos passos

* Separação em camadas (DAO/Service) para maior desacoplamento.
* Persistência em banco de dados (atualmente em memória).
* Implementação de testes unitários (JUnit).

## 📄 Licença

Este projeto está sob a licença MIT.
