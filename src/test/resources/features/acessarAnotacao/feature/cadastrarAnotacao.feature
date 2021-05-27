#language:pt
#encoding UTF-8

@geral
Funcionalidade: Acessar o localhost Anotacoes

  Cenario: Acessar Anotacoes
    Dado que eu acesse Telas 
    E eu clicar no icone do Adicionar Nova Anotacao
    E a pagina anotacoes deve aparecer
    E quando eu inserir os dados da anotacao
    Quando eu clicar em salvar
    Entao a anotacao dever ser salva com sucesso. 