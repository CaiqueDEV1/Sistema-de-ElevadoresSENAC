<h1>Foguete não dá ré!</h1>

<h3> Você foi contratado para desenvolver um sistema que simule o funcionamento de um elevador em um prédio. Para isso, você precisa criar uma classe chamada Elevador que armazene as informações relevantes e disponibilize métodos para controlar seu funcionamento. </h3>
A classe Elevador deve possuir os seguintes atributos:

andarAtual: representa o andar em que o elevador está no momento (o térreo é representado pelo valor 0).
totalAndares: indica o número total de andares atendidos pelo elevador.
andaresAtendidos: contém os andares em que o elevador pode parar.
capacidadeMaxima: a capacidade máxima de pessoas que o elevador pode suportar.
pessoasPresentes: o número de pessoas atualmente presentes no elevador.
A classe Elevador deve disponibilizar os seguintes métodos:

entra(): adiciona uma pessoa ao elevador, desde que haja espaço disponível.
sai(): remove uma pessoa do elevador, desde que haja alguém dentro dele.
sobe(): faz o elevador subir andares, caso não esteja no último andar atendido.
desce(): faz o elevador descer andares, caso não esteja no térreo ou subsolo.
Além disso, você deve realizar as seguintes tarefas:

Crie três instâncias da classe Elevador e as nomeie como "Elevador da Entrada", "Elevador do Átrio" e "Elevador da Biblioteca".
Defina os andares atendidos por cada elevador, levando em consideração o exemplo do prédio do Senac Lapa Tito. Certifique-se de incluir o subsolo e o quinto andar, conforme a configuração "real".
Defina a capacidade máxima de cada elevador de acordo com as especificações do prédio.
Realize uma sequência de operações em cada elevador para simular seu funcionamento. Por exemplo, faça algumas pessoas entrarem e saírem do elevador, suba e desça alguns andares, exiba o andar atual e o número de pessoas presentes em cada operação.
Utilize mensagens amigáveis para orientar o usuário durante a simulação, utilizando o método System.out.println().
Para garantir a qualidade do código, considere as seguintes boas práticas:

Utilize nomes significativos para as classes, atributos e métodos.
Siga as convenções de nomenclatura do Java (por exemplo, utilize camelCase para nomes de variáveis e métodos).
Faça uso de modificadores de acesso apropriados para os atributos e métodos (por exemplo, private, public).
Evite repetição de código, procurando reutilizar métodos e classes existentes.
