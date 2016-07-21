create table locatario
(
	Nome TEXT not null,
	Cpf TEXT not null,
	Rg TEXT not null,
	Orgao TEXT not null,
	Sexo TEXT not null,
	DataNascimento TEXT not null,
	Telefone1 TEXT not null,
	Telefone2 TEXT,
	CodigoLocatario TEXT PRIMARY KEY not null
);