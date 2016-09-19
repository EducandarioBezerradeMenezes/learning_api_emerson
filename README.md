# learning_api_emerson
Estudando API Restful usando Java + Spring com bando de dados Postgres 9.5

Contem uma API que recebe uma palavra e retorna se ela é um palindromo ou não.
Mantem alguns dados em banco do request recebido, como navegador, dispositivo, linguagem, IP e etc...

ApiPalindromoController: Cuida do mapeamento para requests.
RequestDao: Controla as ações de persistencia no banco de dados, atualmente só esta implementado o metodo salvar().
LogAcesso: Responsavel por guardar os dados da request a API ate o momento de persistir no banco.
Palindromo: Contem o metodo para validação da palavra, checar se é uma palindromo ou não.
