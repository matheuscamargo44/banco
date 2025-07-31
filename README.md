# Banco

Este projeto é um sistema bancário simples desenvolvido em Java. Ele permite a criação e gerenciamento de contas bancárias, incluindo operações básicas como depósito, saque e consulta de saldo.

## Estrutura do Projeto
- **src/**: Código-fonte principal
  - **Main.java**: Classe principal para execução do programa
  - **Menu.java**: Gerencia o menu de opções do sistema
  - **Banco.java**: Lógica central do banco
  - **controller/**: Controladores das operações
  - **model/**: Modelos das entidades (Conta, ContaBancaria)
  - **view/**: Interface de visualização (se aplicável)

## Como Executar
1. Certifique-se de ter o Java instalado (JDK 8 ou superior).
2. Compile os arquivos:
   ```sh
   javac src/*.java src/model/*.java src/controller/*.java
   ```
3. Execute o programa principal:
   ```sh
   java -cp src Main
   ```

## Funcionalidades
- Criar conta bancária
- Realizar depósito
- Realizar saque
- Consultar saldo
- Listar contas

## Autor
- Matheus Cavalheiro de Camargo

## Licença
Este projeto é livre para uso educacional.

