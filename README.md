# 8 Puzzle - Alex Freitag e Augusto Watzko

## Greedy Search

Um algoritmo ganancioso é um algoritmo simples e intuitivo usado em problemas de otimização. O algoritmo faz a escolha ideal em cada etapa, enquanto tenta encontrar a maneira ideal geral de resolver todo o problema. Algoritmos gananciosos são bem-sucedidos em alguns problemas, como a codificação Huffman, usada para compactar dados, ou o algoritmo de Dijkstra, usado para encontrar o caminho mais curto através de um gráfico.

No entanto, em muitos problemas, uma estratégia gananciosa não produz uma solução ideal. Por exemplo, na animação abaixo, o algoritmo ganancioso procura encontrar o caminho com a maior soma. Para isso, selecione o maior número disponível em cada etapa. O algoritmo ganancioso falha em encontrar a maior soma, no entanto, porque toma decisões com base apenas nas informações que possui em uma única etapa, sem levar em consideração o problema geral.

Com o objetivo de atingir a maior soma, em cada etapa, o algoritmo ganancioso escolherá o que parece ser a melhor opção imediata; portanto, escolherá 12 em vez de 3 na segunda etapa e não alcançará a melhor solução, que contém 99.

## A* Search

Chegar a um destino pela rota mais curta é uma atividade diária que todos fazemos. A estrela (também chamada de A *) é um dos algoritmos de pesquisa mais bem-sucedidos para encontrar o caminho mais curto entre nós ou gráficos. É um algoritmo de pesquisa informado, pois usa informações sobre o custo do caminho e também usa heurísticas para encontrar a solução.
A * alcança otimalidade e completude, duas propriedades valiosas dos algoritmos de busca.
Quando um algoritmo de pesquisa tem a propriedade de otimalidade, isso significa que é garantido para encontrar a melhor solução possível. Quando um algoritmo de pesquisa tem a propriedade de perfeição, significa que, se uma solução para um determinado problema existe, o algoritmo é garantido para encontrar isso.

Agora, para entender como o A * funciona, primeiro precisamos entender algumas terminologias:
* Nó (também chamado de Estado) - Todas as posições ou paradas em potencial com uma identificação única
Transição - O ato de mover-se entre estados ou nós.
* Nó inicial - para onde começar a pesquisar
* Nó da meta - o alvo para interromper a pesquisa.
* Search Space - Uma coleção de nós, como todas as posições de um jogo de tabuleiro
* Custo - valor numérico (por exemplo, distância, tempo ou despesa financeira) do caminho de um nó para outro.
* g (n) - representa o custo exato do caminho desde o nó inicial até qualquer nó n
* h (n) - representa o custo estimado heurístico do nó n ao nó da meta.
* f (n) - menor custo no nó vizinho n

Cada vez que A * entra em um nó, ele calcula o custo, f (n) (n sendo o nó vizinho), para viajar para todos os nós vizinhos e, em seguida, entra no nó com o valor mais baixo de f (n).

Para esse problema, existem quatro movimentos (esquerdo, direito, para cima e para baixo) a partir de uma posição de labirinto, desde que uma etapa válida esteja disponível. Nas posições do quadrado vermelho, nenhum movimento é permitido (como na posição inicial, apenas o movimento para baixo está disponível, pois os movimentos para cima e para a esquerda são bloqueados pela parede, enquanto que para a direita é uma posição do quadrado vermelho, portanto, nenhum movimento é permitido).

## Graph Search

Lançada pelo Facebook no início de 2013, a busca social reúne e exibe dados sobre pessoas, lugares, e interesses que já foram compartilhados na rede social pelos próprios usuários. A nova função ainda não é uma realidade para todos os membros e se encontra em fase de testes para os que utilizam o site no idioma inglês americano. Para conhecê-la é preciso se inscrever e aguardar a liberação dos serviços para o seu perfil.

Um ponto importante é que nas buscas os resultados são únicos, por exemplo, “mulheres que gostam de patinação”, “amigos homens que jogam futebol”, “restaurantes que ‘fulano’ visitou”, entre outros. Ao digitar palavras chave, sugestões de busca podem ser selecionadas com a tecla “tab”, por meio de um auto completar, com sentenças simples em inglês como “movies my friends like” ou mais complexas como “my friend’s photos of dogs taken in Rio de Janeiro”.
Isso faz com que cada resultado dessas pesquisas seja único, já que todo membro da rede social tem uma seleta rede de amigos e interesses que resulta em um mapa de conexões sempre diferente.

