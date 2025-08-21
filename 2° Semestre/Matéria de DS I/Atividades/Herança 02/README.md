Instruções:

Objetivo: Implementar uma hierarquia de classes para pessoas, demonstrando o uso de herança e construtores.

Descrição do Exercício:

O exercício tem como objetivo a criação de uma hierarquia de classes que modela diferentes tipos de pessoas em um contexto de escola ou instituição, com ênfase no uso de construtores para fornecer comportamentos diferentes entre as classes.

Classe Base: Pessoa

Propriedades:
nome: Representa o nome da pessoa.
CPF : Representa o registro da pessoa
Data de Nascimento: Representa a data de nascimento da pessoa.
Construtor: O construtor da classe base será responsável por inicializar as propriedades nome, cpf  e data de nascimento .
Classe Derivada: Aluno

Herda de: Pessoa
Propriedades Adicionais:
RA: Representa o número de matrícula do aluno.
curso: Representa o curso que o aluno está matriculado.
Construtor: O construtor da classe Aluno irá chamar o construtor da classe base (Pessoa) para inicializar as propriedades comuns (nome, CPF, data de nascimento) e também inicializar as propriedades RA e curso. Isso permitirá que cada instância de Aluno tenha esses dados definidos.
Classe Derivada: Professor

Herda de: Pessoa
Propriedades Adicionais:
Disciplina: Representa as disciplinas ministradas pelo professor (ex: Matemática, Física, História).
RF: Representa o registro funcional do docente
Construtor: O construtor da classe Professor chamará o construtor da classe Pessoa para inicializar as propriedades nome, CPF, data de nascimento. Além disso, ele inicializa as propriedades disciplina e RF, específicas para professores.
Classe Derivada: Funcionário

Herda de: Pessoa
Propriedades Adicionais:
cargo: Representa o cargo ou função do funcionário (ex: secretária, vigilante, administrativo).
RGM : Representa  registro geral do funcionário .
Construtor: O construtor da classe Funcionário chamará o construtor da classe Pessoa para inicializar as propriedades nome, CPF, data de nascimento. Ele também inicializa as propriedades cargo e RGM, específicas para os funcionários.
Classe Principal: Main Nesta classe, você deverá:

Instanciar objetos das classes Pessoa, Aluno, Professor e Funcionário.
Ao instanciar os objetos, passe as informações necessárias para cada construtor, observando como o comportamento e as propriedades de cada pessoa são configurados com base nas classes.
Exibir as características das pessoas, como nome, CPF, data de nascimento, RA, curso (para alunos), RF, disciplinas (para professores), cargo, e RGM(para funcionários), mostrando como a hierarquia de classes influencia os dados.
Exemplo de fluxo:

Instanciando uma Pessoa: Um objeto Pessoa será instanciado com nome, CPF e data de nascimento
Instanciando um Aluno: Um objeto Aluno será instanciado com as propriedades da pessoa e, além disso, uma RA e curso.
Instanciando um Professor: Um objeto Professor será instanciado com as propriedades da pessoa, além de uma RF e disciplinas.
Instanciando um Funcionário: Um objeto Funcionário será instanciado com as propriedades da pessoa e, adicionalmente, cargo e RGM específicos. 
Representação do diagrama de classe do exercício descrito acima em anexo.

Observação: Por favor, anexe apenas o link do repositório no GitHub, sem incluir outros arquivos ou informações adicionais.