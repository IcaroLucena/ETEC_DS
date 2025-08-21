Exercício 1 - Sistema de Veiculos

Com o conceito de Classe, Objeto e Instâncias em Java, crie uma classe chamada Carro, que representa um carro. Esta classe terá os seguintes atributos para ilustrar o funcionamento de objetos e instâncias em Java:

- Modelo: Uma variável do tipo String que armazena o modelo do carro.

- Cor: Uma variável do tipo String que armazena a cor do carro.

- Velocidade: Uma variável do tipo int que armazena a velocidade atual do caro.


Exercicio 2 Sistema em Java com Homens e Mulheres

Com a linguagem de programação Java, crie uma classe chamada Pessoa, que representa uma pessoa. Essa classe terá os seguintes atributos e métodos:

Atributos:

- nome: Uma String que armazena o nome da pessoa.

- sexo: Um caractere ('M' para masculino ou 'F' para feminino) que armazena o sexo da pessoa.

Métodos:

- sexoDescricao(): Um método que retorna uma descrição do sexo, por exemplo, "Masculino" para 'M' e "Feminino" para 'F'.

- imprimirinformacoes(): Um método que imprime as informações da pessoa (nome e sexo) de maneira completa.

Exercício 3

Crie um sistema em Java para modelar diferentes tipos de veículos utilizando herança para representar as características específicas de cada tipo. O sistema deve:

Classe Base Veiculo:

Primeiramente, criamos uma classe base chamada Veiculo que representa as características comuns de todos os tipos de veículos. Essa classe deve conter os seguintes atributos e métodos:

Atributos:

- modelo: Uma String que armazena o modelo do veículo.

- cor: Uma String que armazena a cor do veículo.

- velocidade: Um inteiro que armazena a velocidade atual do veículo.

Métodos:

- acelerar(int incremento): Um método que aumenta a velocidade do veiculo em um determinado valor.

- frear(int decremento): Um método que diminui a velocidade do veículo em um determinado valor.

- exibirInformacoes(): Um método que imprime as informações do veículo, como modelo, cor e velocidade.

- Subclasse Carro (Herda de Veiculo):

- A subclasse Carro herda as características gerais da classe Veiculo e pode ter funcionalidades adicionais ou sobrescritas conforme necessário.

Atributos:

- numeroPortas: Um inteiro que armazena o número de portas do carro (atributo específico do tipo).

Métodos:

- exibirInformacoes(): Sobrescreve o método da classe base para adicionar informações específicas do carro, como o número de portas.