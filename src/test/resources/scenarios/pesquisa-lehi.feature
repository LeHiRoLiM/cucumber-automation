#language: pt
Funcionalidade: Login BUG

  @teste1 @reset
  Cenario: Login com sucesso
    Dado que o usuario esta no site BUG e tem uma conta cadastrada
    Quando escrever o Email: "root@local.dev"
    E senha: "root"
    Então mostra mensagem "Login com sucesso!"

  @teste2 @reset
  Cenario: Email nao cadastrado, senha valida
    Dado que o usuario esta no site BUG e tem uma conta cadastrada
    Quando escrever o Email: "rootinho@local.dev"
    E senha: "root"
    Então mostra mensagem "User not found"

  @teste3 @reset
  Cenario: Senha invalida, email valido
    Dado que o usuario esta no site BUG e tem uma conta cadastrada
    Quando escrever o Email: "root@local.dev"
    E senha: "rootinho"
    Entao mostra mensagem "Incorrect password"

  @teste4 @reset
  Cenario: Senha e Email não cadastrado
    Dado que o usuario esta no site BUG e tem uma conta cadastrada
    Quando escrever o Email: "rootinho@local.dev"
    E senha: "rootinho"
    Entao mostra mensagem "User not found"

  @teste5 @reset
  Cenario: Email inválido
    Dado que o usuario esta no site BUG e tem uma conta cadastrada
    Quando escrever o Email: "rootlocal.dev"
    E senha: "root"
    Entao mostra mensagem "Invalid email"

  @teste6 @reset
  Cenario: Email com 33 caracteres
    Dado que o usuario esta no site BUG e tem uma conta cadastrada
    Quando escrever o Email: "rootoooooooooooooooooo@local.dev"
    E senha: "root"
    Entao mostra mensagem "User not found"

  @teste7 @reset
  Cenario: Senha com 33 caracteres
    Dado que o usuario esta no site BUG e tem uma conta cadastrada
    Quando escrever o Email: "root@local.dev"
    E senha: "rootinho11111111111111111111111111111111111111111"
    Entao mostra mensagem "Incorrect password"

  @teste8 @reset
  Cenario: Email vazio
    Dado que o usuario esta no site BUG e tem uma conta cadastrada
    Quando escrever o Email: " "
    E senha: "root"
    Entao mostra mensagem "Fill in email"

  @teste9 @reset
  Cenario: Senha vazia
    Dado que o usuario esta no site BUG e tem uma conta cadastrada
    Quando escrever o Email: "root@local.dev"
    E senha: " "
    Entao mostra mensagem "Fill in password"

