Instruções:

Objetivo: Implementar uma hierarquia de classes para veículos, demonstrando o uso de herança e construtores.

Descrição do Exercício:

Este exercício tem como objetivo a criação de uma hierarquia de classes que modela diferentes tipos de veículos, com ênfase no uso de construtores para fornecer comportamentos diferentes entre as classes.

Classe Base: Veículo

Propriedades:
marca: Representa a marca do veículo.
modelo: Representa o modelo do veículo.
ano: Representa o ano de fabricação do veículo.
Construtor: O construtor da classe base será responsável por inicializar as propriedades marca, modelo e ano do veículo.
Classe Derivada: Carro

Herda de: Veiculo
Propriedades Adicionais:
tipoDeCombustivel: Especifica o tipo de combustível utilizado pelo carro (ex: gasolina, álcool, diesel).
Construtor: O construtor da classe Carro irá chamar o construtor da classe base (Veiculo) para inicializar as propriedades comuns (marca, modelo, ano) e também inicializar a propriedade tipoDeCombustivel. Isso permitirá que cada instância de Carro tenha um tipo de combustível definido.
Classe Derivada: CarroEletrico

Herda de: Carro
Propriedades Adicionais:
capacidadeBateria: Representa a capacidade da bateria do carro elétrico, em kWh.
Construtor: O construtor da classe CarroEletrico chamará o construtor da classe Carro para inicializar as propriedades marca, modelo, ano e tipoDeCombustivel. Além disso, ele inicializa a propriedade capacidadeBateria, específica para carros elétricos.
Classe Principal: Main

Nesta classe, você deverá:

Instanciar objetos das classes Veiculo, Carro e CarroEletrico.
Ao instanciar os objetos, passar as informações necessárias para cada construtor, observando como o comportamento e as propriedades de cada veículo são configurados com base nas classes.
Exibir as características dos veículos, como marca, modelo, ano, tipo de combustível (para carros) e capacidade da bateria (para carros elétricos), mostrando como a hierarquia de classes influencia os dados.
Exemplo de fluxo:

Instanciando um Veículo: Um objeto Veículo será instanciado com marca, modelo e ano.
Instanciando um Carro: Um objeto Carro será instanciado com as propriedades do veículo e, além disso, um tipo de combustível específico.
Instanciando um CarroElétrico: Um objeto CarroEletrico será instanciado com todas as propriedades dos outros veículos, mas com a adição da capacidade da bateria.
Observação: Por favor, anexe apenas o link do repositório no GitHub, sem incluir outros arquivos ou informações adicionais.