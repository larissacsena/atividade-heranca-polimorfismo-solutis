# Projeto de Programação em Java

Este projeto consiste em uma série de exercícios desenvolvidos em Java que abordam conceitos de herança, polimorfismo, e manipulação de dados. Abaixo estão descritos os exercícios e suas respectivas tarefas.

## Exercícios

### Exercício 01

Crie uma hierarquia de classes com os seguintes atributos e comportamentos:

- **Classe `Animal`**: Deve conter todos os atributos e comportamentos comuns a todos os animais.
- **Classes Derivadas**: Implemente as classes específicas derivadas de `Animal`, contendo características próprias.

### Exercício 02

Implemente um programa para criar os 3 tipos de animais definidos no exercício anterior e invoque o método que emite o som de cada um de forma polimórfica.

### Exercício 03

Crie uma classe `Veterinario` com um método `examinar(Animal animal)`. Quando um animal é examinado, ele deve emitir um som. Passe os 3 tipos de animais como parâmetros.

### Exercício 04

Crie uma classe `Zoologico` com um array de 10 jaulas. Coloque um animal diferente em cada jaula, percorra o array e emita o som de cada animal. Se o tipo de animal possuir o comportamento de correr, faça-o correr.

### Exercício 05

Desenvolva um modelo para registrar a vida acadêmica dos funcionários:

1. Funcionário sem escolaridade: apenas nome e código funcional.
2. Funcionário com ensino básico: nome, código funcional e escola.
3. Funcionário com ensino médio: nome, código funcional, escola do ensino básico e escola do ensino médio.
4. Funcionário com graduação: nome, código funcional, escolas do ensino básico e médio, e universidade.

### Exercício 06

Estenda o modelo do exercício anterior para incluir a renda básica de R$ 1000,00 e ajuste a renda conforme a escolaridade:

- Ensino básico: Renda básica + 10%
- Ensino médio: Renda do ensino básico + 50%
- Graduação: Renda do ensino médio + 100%

### Exercício 07

Simule uma empresa com 10 funcionários, distribuídos conforme a escolaridade:

- 40% ensino básico
- 40% ensino médio
- 20% graduação

Calcule os custos totais e por nível de escolaridade, utilizando a classe desenvolvida no exercício anterior.

### Exercício 08

Crie uma hierarquia de comissões:

- **Gerente**: Adicional de R$1500,00
- **Supervisor**: Adicional de R$600,00
- **Vendedor**: Adicional de R$250,00

### Exercício 09

Adicione um atributo de comissão à classe `Funcionario` e ajuste o método de cálculo da renda total para incluir o adicional da comissão.

### Exercício 10

Refaça o exercício 7 considerando a distribuição dos cargos:

- 10% Gerentes
- 20% Supervisores
- 70% Vendedores

### Exercício 11

Sobreescreva o método `toString` da classe `Funcionario` para imprimir o nome, a comissão e o salário total. Imprima todos os funcionários da empresa criada no exercício 7.

## Instruções de Uso

1. **Compilação e Execução**:
   Compile e execute cada classe Java conforme necessário para testar as implementações dos exercícios.

2. **Estrutura do Projeto**:
   O projeto deve estar organizado em pacotes conforme as hierarquias de classes e suas funcionalidades.

3. **Testes**:
   Teste cada funcionalidade utilizando métodos apropriados e verifique a saída para garantir que o comportamento está correto.


