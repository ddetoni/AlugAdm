create table locatario
(
nome TEXT NULL,
cpf TEXT NULL,
identidade TEXT NULL,
orgao TEXT NULL,
sexo TEXT NULL,
dataNascimento TEXT NULL,
tipoPessoa TEXT NULL,
email TEXT NULL,
telefone TEXT NULL,
tipoRecebimento TEXT NULL,
dataCadastro TEXT NULL,
id TEXT NULL
);

create table imovel
(
id INTEGER NULL,
data_cadastro DATE NULL,
categoria TEXT NULL,
tipo_imovel TEXT NULL,
status TEXT NULL,
logradouro TEXT NULL,
complemento TEXT NULL,
cidade TEXT NULL,
estado TEXT NULL,
num_quartos TEXT NULL,
garagem TEXT NULL,
valor_aluguel TEXT NULL,
cep TEXT NULL
);

insert into locatario values ('Renan Ofugi', '283719873298', '230984', 'SSP', 'Masculino', '08/08/2008', 'Fisica', 'renan@ofugi.com', '1892371823', 'Dinheiro', '11/11/2011', '123');
