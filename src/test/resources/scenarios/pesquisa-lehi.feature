#language: pt
Funcionalidade: google

  @teste1 @reset
  Cenario: Login com sucesso
    Dado que o usuario esta no site BUG e tem uma conta cadastrada
    Quando escrever o Email: "root@local.dev"
    E senha: "root"
    Então mostra mensagem Login com sucesso!

  @teste2 @reset
  Cenario: Email nao cadastrado, senha valida
    Dado que o usuario esta no site BUG e tem uma conta cadastrada
    Quando escrever o Email: "rootinho@local.dev"
    E senha: "root"
    Então mostra mensagem

  @teste3 @reset
  Cenario: Senha invalida, email valido
    Dado que o usuario esta no site BUG e tem uma conta cadastrada
    Quando escrever o Email: "root@local.dev"
    E senha: "rootinho"
    Entao mostra mensagem "Incorrect password"




