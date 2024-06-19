# Desafio: Criando um Bootcamp usando POO
Projeto desenvolvido para o desafio [Abstraindo um Bootcamp Usando Orientação a Objetos em Java](https://github.com/cami-la/desafio-poo-dio) da DIO, que tem como objetivo 
a abstração de um domínio bootcamp criando a modelagem de seus atributos e métodos.

## Funcionalidades do bootcamp
### Atributos:
* `nome`
* `descricao`
* `dataInicial` - Data da criação do bootcamp.
* `dataFinal` - 45 dias a partir da data inicial.
* `conteudos` - Um `Set` da classe abstrata `Conteudo`, que podem ser `Curso` ou `Mentoria`.
* `devsInscritos` - Um `Set` com os devs inscritos no bootcamp.
* `forum` - O bootcamp possui um `Forum`, onde os devs inscritos podem criar um post e comentar em posts já existentes.
### Métodos
* `imprimirRanking` - Imprime o ranking, mostrando a posição, nome e total de XP de cada dev inscrito.
  * O dev pode ganhar Xp concluindo conteúdos no bootcamp e criando postagens no fórum.

