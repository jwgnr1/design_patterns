    # Padrões de Projeto em Java

Repositório com implementações de **padrões de projeto (GoF)** em Java, desenvolvidas a partir de atividades práticas. Cada padrão resolve um cenário próprio, descrito neste documento.

## Sumário

| Categoria | Padrão | Cenário | Código                                                        |
|---|---|---|---------------------------------------------------------------|
| Criacional | [Singleton](#singleton) | Controle de volume do dispositivo | [`singleton`](src/creational_patterns/singleton)              |
| Criacional | [Factory Method](#factory-method) | Emissão de documentos (PDF, Word, Planilha) | [`factory`](src/creational_patterns/factory)                  |
| Criacional | [Abstract Factory](#abstract-factory) | Fornecedores de serviços de um e-commerce | [`abstract_factory`](src/creational_patterns/abstractFactory) |
| Criacional | [Builder](#builder) | Pedido de lanche / pizza | [`builder`](src/creational_patterns/builder)                  |
| Criacional | [Prototype](#prototype) | Templates de prova | [`prototype`](src/creational_patterns/prototype)              |
| Estrutural | [Adapter](#adapter) | Controle remoto universal | [`adapter`](src/structural_patterns/adapter)                  |
| Estrutural | [Decorator](#decorator) | Cafeteria com adicionais | [`decorator`](src/structural_patterns/decorator)              |
| Estrutural | [Facade](#facade) | Agência de viagens | [`facade`](src/structural_patterns/facade)                    |
| Estrutural | [Proxy](#proxy) | Plataforma de streaming | [`proxy`](src/structural_patterns/proxy)                      |
| Estrutural | [Composite](#composite) | Produtos e kits em uma loja virtual | [`composite`](src/structural_patterns/composite)              |
| Estrutural | [Flyweight](#flyweight) | Mundo de blocos estilo Minecraft | [`flyweight`](src/structural_patterns/flyweight)              |
| Estrutural | [Bridge](#bridge) | Relatórios e formatos de exportação | [`bridge`](src/structural_patterns/bridge)                    |
| Comportamental | [Strategy](#strategy) | Formas de pagamento no checkout | [`strategy`](src/behavioral_patterns/factory)                 |
| Comportamental | [Observer](#observer) | Status de pedidos em um e-commerce | [`observer`](src/behavioral_patterns/observer)                |
| Comportamental | [Chain of Responsibility](#chain-of-responsibility) | Processamento de requisição HTTP | [`chain`](src/behavioral_patterns/chain)                      |
| Comportamental | [Command](#command) | Gerenciador de tarefas | [`command`](src/behavioral_patterns/command)                  |
| Comportamental | [State](#state) | Chamados técnicos | [`state`](src/behavioral_patterns/state)                      |
| Comportamental | [Template Method](#template-method) | Processamento de arquivos | [`template`](src/behavioral_patterns/template)                |
| Comportamental | [Iterator](#iterator) | Fila de atendimento | [`iterator`](src/behavioral_patterns/iterator)                |
| Comportamental | [Memento](#memento) | Editor de documentos com versões | [`memento`](src/behavioral_patterns/memento)                  |
| Comportamental | [Mediator](#mediator) | Atendimento em uma clínica | [`mediator`](src/behavioral_patterns/mediator)                |
| Comportamental | [Visitor](#visitor) | Inspeções em setores de uma empresa | [`visitor`](src/behavioral_patterns/visitor)                  |

---

# Padrões Criacionais

## Singleton

**Cenário:** controle de volume do dispositivo.

No celular ou no PC existem vários lugares que mudam o volume:

- botão físico (+ / −)
- player de música (Spotify/YouTube)
- chamada/alarme
- configurações do sistema

Mas o volume do dispositivo é **um só**. Se cada parte criasse seu "próprio volume", seria um bug total.

**Solução:** criar um `ControleVolume` como Singleton:

- existe **uma instância única**
- qualquer parte do sistema altera e lê o **mesmo volume**

## Factory Method

**Cenário:** emissão de documentos (PDF / Word / Planilha).

**Objetivo:** implementar um sistema que gera documentos de tipos diferentes, de forma que:

- o sistema "principal" não precise conhecer as classes concretas (PDF, Word, Planilha);
- para adicionar um novo tipo de documento no futuro, o código fique fácil de estender.

**Contexto:** uma empresa precisa emitir documentos para diferentes finalidades:

- **PDF** para envio ao cliente e arquivamento
- **Word** para edição interna (ajustes manuais)
- **Planilha** para relatórios e controles (financeiro, estoque etc.)

O sistema deve permitir escolher o tipo de documento de forma organizada, evitando `if/else` gigantes e `new` espalhado.

**Requisito obrigatório:** interface `Documento` com o método `void gerar();`. Todo documento consegue "gerar" (simulando a geração no console).

## Abstract Factory

**Cenário:** núcleo de um sistema de loja virtual (e-commerce).

A loja vende para vários perfis de empresa e, por isso, precisa funcionar com diferentes fornecedores de serviços externos. Em um e-commerce real, ao escolher um fornecedor (parceiro), não se troca só uma coisa, e sim um pacote:

- Pagamento (gateway)
- Frete/Envio (transportadora/serviço de cálculo de frete)
- Emissão de Nota Fiscal (serviço fiscal/ERP)

**Problema:** cada fornecedor tem regras e formatos diferentes, e o sistema deve permitir trocar o parceiro sem reescrever a lógica principal.

**Solução:** aplicar Abstract Factory para criar **famílias de serviços compatíveis**.

## Builder

**Cenário:** pedido de lanche / pizza.

Uma hamburgueria/pizzaria permite montar pedidos muito personalizados. Um pedido pode ter:

- tamanho (P/M/G)
- tipo (HAMBURGUER ou PIZZA)
- massa (se for pizza)
- pão (se for hambúrguer)
- adicionais (queijo extra, bacon, borda recheada...)
- observações (ex.: "sem cebola", "bem passado")
- forma de pagamento (PIX, CARTÃO, DINHEIRO)
- cupom de desconto (opcional)
- entrega (retirada ou delivery)
- endereço (obrigatório se for delivery)
- troco (só se o pagamento for dinheiro)

**Objetivo:** o sistema deve evitar pedidos inválidos e permitir uma criação legível e fácil. Implementar um Builder para criar o objeto `Pedido`, com **validações no `build()`**.

## Prototype

**Cenário:** templates de prova.

Um professor monta uma prova modelo (template) e, a partir dela, precisa gerar rapidamente versões para turmas diferentes, mudando apenas alguns detalhes (turma, data, versão e 1 questão).

**Solução:** para evitar retrabalho e erro, usar Prototype: criar novas provas **clonando o template** e depois personalizando o clone.

---

# Padrões Estruturais

## Adapter

**Cenário:** controle remoto universal (Mi Remote).

Um controle remoto universal precisa controlar vários tipos de dispositivos, como **TVs** e **Ar-Condicionados**. Cada dispositivo tem uma API diferente, o que dificulta a integração:

- **TV Samsung:** `powerOn()`, `powerOff()`, `volumeUp()`, `volumeDown()`
- **TV LG:** `ligarTv()`, `desligarTv()`, `aumentarSom()`, `reduzirSom()`
- **Ar-Condicionado:** `powerOn()`, `powerOff()`, mas com parâmetros adicionais como `temperatura()`

**Solução:** criar um **Adapter** para "traduzir" essas interfaces diferentes para uma interface comum, permitindo que o sistema funcione de forma padronizada, sem saber a implementação interna de cada dispositivo.

## Decorator

**Cenário:** cafeteria com adicionais.

Uma cafeteria vende bebidas simples:

- Café
- Capuccino
- Chocolate quente

Os clientes podem personalizar as bebidas com adicionais:

- Leite extra
- Chantilly
- Canela
- Calda de chocolate

Cada adicional modifica a descrição da bebida e também aumenta o preço final.

**Problema:** o sistema precisa permitir essas combinações de forma flexível, sem criar várias subclasses como `CafeComLeite`, `CafeComLeiteECanela`, `CapuccinoComChantilly` e `ChocolateComCaldaECanela`.

**Solução:** utilizar o padrão Decorator.

## Facade

**Cenário:** agência de viagens.

Para que um cliente consiga realizar uma viagem, o sistema precisa executar várias etapas:

- reservar voo
- reservar hotel
- reservar transporte (ex.: transfer/aeroporto)
- gerar comprovante da viagem
- enviar confirmação ao cliente

**Problema:** essas operações estão distribuídas em várias classes diferentes.

**Objetivo:** criar uma **fachada (Facade)** que permita ao sistema executar tudo isso com apenas uma chamada:

```java
viagemFacade.reservarViagem(cliente, destino);
```

## Proxy

**Cenário:** plataforma de streaming.

Existem conteúdos que só podem ser acessados por usuários do plano **PREMIUM**. Usuários do plano **BÁSICO** não podem assistir a esses conteúdos.

**Objetivo:** implementar essa restrição de acesso usando o padrão Proxy.

## Composite

**Cenário:** produtos e kits em uma loja virtual.

Existem dois tipos de itens que podem ser vendidos:

- **produto individual**
- **kit de produtos**

Um kit é um agrupamento de vários itens, podendo conter produtos individuais e outros kits.

**Objetivo:** permitir calcular o preço total de qualquer item, independentemente de ele ser um produto simples ou um kit com vários produtos, usando o padrão Composite.

## Flyweight

**Cenário:** mundo em estilo Minecraft.

Nesse mundo existem muitos blocos, como Pedra, Grama, Madeira e Areia. Cada bloco possui:

- nome
- textura
- se é sólido ou não

Além disso, cada bloco ocupa uma posição no mundo (`x`, `y`, `z`).

**Problema:** em um mapa grande, podem existir milhares de blocos repetidos do mesmo tipo. Se o sistema criar um objeto completo para cada bloco, o consumo de memória cresce muito.

**Solução:** aplicar o padrão Flyweight, separando:

- **estado compartilhado (intrínseco):** nome, textura, solidez
- **estado externo (extrínseco):** posição (`x`, `y`, `z`)

## Bridge

**Cenário:** geração de relatórios em um sistema corporativo.

O sistema precisa lidar com **duas dimensões que variam independentemente**:

- **Tipos de relatório:** Financeiro, Vendas
- **Formatos de exportação:** PDF, Excel

Além disso, os relatórios podem ter **níveis de detalhamento diferentes**: Simples e Detalhado.

**Problema:** sem uma boa modelagem, o sistema acabaria criando classes como `RelatorioFinanceiroPDFSimples`, `RelatorioFinanceiroPDFDetalhado`, `RelatorioFinanceiroExcelSimples` e `RelatorioVendasPDFDetalhado`. Isso geraria explosão de classes, código difícil de manter e baixa flexibilidade.

**Objetivo:** utilizar o padrão Bridge para:

- separar **tipo de relatório** do **formato de exportação**
- permitir que ambos variem independentemente
- suportar diferentes níveis de detalhamento sem criar classes combinadas

---

# Padrões Comportamentais

## Strategy

**Cenário:** checkout de uma loja virtual.

O sistema deve permitir diferentes formas de pagamento:

- Cartão de crédito
- Pix
- Boleto

Cada forma de pagamento possui **regras próprias**, como taxas, descontos e validações.

**Objetivo:** o sistema deve ser flexível para adicionar novos métodos de pagamento e alterar regras sem modificar a classe principal.

## Observer

**Cenário:** status de pedidos em um e-commerce.

Cada pedido possui um **status**, que pode mudar ao longo do fluxo de negócio:

`CRIADO` → `PAGO` → `EM_SEPARACAO` → `ENVIADO` → `ENTREGUE` (ou `CANCELADO`)

Sempre que o status de um pedido mudar, diversos subsistemas devem reagir automaticamente:

| Subsistema | Reação |
|---|---|
| `EmailService` | envia e-mail ao cliente |
| `LogService` | registra o evento em log |
| `DashboardService` | atualiza o painel em tempo real |
| `EstoqueService` | atualiza a disponibilidade |
| `FaturamentoService` | gera ação financeira quando aplicável |

**Objetivo:** modelar com Observer, de forma que o pedido **não conheça diretamente** a implementação concreta desses serviços.

## Chain of Responsibility

**Cenário:** processamento de uma requisição HTTP em um backend.

A requisição deve passar por uma cadeia de etapas:

1. Autenticação
2. Autorização
3. Validação de dados
4. Log da requisição
5. Processamento final

## Command

**Cenário:** sistema simples de gerenciamento de tarefas.

O sistema deve permitir ações como:

- adicionar tarefa
- remover última tarefa
- marcar tarefa como concluída

Além disso, deve oferecer:

- **histórico de comandos executados**
- **operação de desfazer**
- **fila de comandos para execução posterior**

**Objetivo:** aplicar o padrão Command de forma que a lógica das ações fique desacoplada da classe que dispara essas operações.

## State

**Cenário:** sistema de atendimento de chamados técnicos.

Um chamado pode passar por diferentes estados durante seu ciclo de vida:

- Aberto
- Em Atendimento
- Aguardando Cliente
- Resolvido
- Cancelado

O comportamento do chamado muda conforme o estado atual:

- um chamado **aberto** pode iniciar atendimento;
- um chamado **em atendimento** pode ser marcado como aguardando cliente ou resolvido;
- um chamado **aguardando cliente** pode voltar para atendimento ou ser cancelado;
- um chamado **resolvido** não deve aceitar novas alterações;
- um chamado **cancelado** não pode ser atendido.

**Objetivo:** evitar que a classe `Chamado` fique cheia de `if/else` verificando o status atual. O padrão State resolve isso colocando o comportamento de cada estado em uma classe separada.

## Template Method

**Cenário:** processamento de arquivos enviados a uma empresa.

O sistema pode lidar com diferentes tipos de arquivos:

- arquivo de clientes
- arquivo de produtos
- arquivo de vendas

Cada tipo possui informações próprias e regras específicas, mas todos devem seguir uma mesma sequência geral de processamento.

**Objetivo:** evitar repetição de código e garantir que todos os arquivos sejam processados em uma ordem padronizada.

## Iterator

**Cenário:** fila de atendimento em uma instituição.

O sistema pode representar situações como atendimento em uma clínica, setor administrativo, banco, secretaria acadêmica ou suporte técnico. Cada pessoa recebe uma senha e aguarda sua vez para ser chamada.

O sistema deve permitir percorrer as senhas cadastradas uma por uma, respeitando a ordem de atendimento.

**Ideia principal:** o código que utiliza a fila **não deve acessar diretamente** a estrutura interna onde as senhas estão armazenadas.

## Memento

**Cenário:** sistema simples de edição de documentos.

O conteúdo de um documento pode ser alterado ao longo do tempo. Antes de algumas alterações importantes, o usuário poderá salvar uma versão do documento. Caso se arrependa de alguma mudança, poderá restaurar uma versão anterior.

Esse funcionamento é semelhante a sistemas com histórico de versões, pontos de restauração ou recurso de desfazer alterações.

## Mediator

**Cenário:** sistema de atendimento de uma clínica.

Vários setores precisam interagir:

- recepção
- médico
- enfermagem
- laboratório
- paciente

**Problema:** se cada setor se comunicasse diretamente com todos os outros, o sistema ficaria muito acoplado e difícil de manter.

**Solução:** criar um **mediador** que organize essa comunicação, funcionando como uma central de coordenação.

## Visitor

**Cenário:** inspeções em setores de uma empresa.

A empresa possui setores como:

- armazém
- administrativo
- frota
- produção

Cada setor possui características próprias, mas a empresa precisa executar diferentes operações sobre eles:

- inspeção de segurança
- avaliação de limpeza
- levantamento de pendências

**Objetivo:** evitar colocar todas essas operações diretamente dentro das classes dos setores.

---

# Como executar

O projeto possui uma classe `Main` ([`src/Main.java`](src/Main.java)) com um menu interativo no console. Ela permite:

- escolher uma categoria (Criacionais, Estruturais ou Comportamentais);
- executar um padrão específico, todos de uma categoria ou todos os padrões de uma vez.

Basta abrir o projeto em uma IDE (ex.: IntelliJ IDEA) e executar a classe `Main`.

## Estrutura

```
src/
├── Main.java
├── interfaces/PadraoExecutor.java
├── creational_patterns/    (singleton, factory, builder, prototype, abstract factory)
├── structural_patterns/    (adapter, bridge, composite, decorator, facade, flyweight, proxy)
└── behavioral_patterns/    (chain, command, iterator, mediator, memento,
                             observer, state, strategy, template, visitor)
```