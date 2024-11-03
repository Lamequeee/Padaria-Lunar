-- Se Existir fará uma exclusão ( drop )
DROP DATABASE IF EXISTS Padaria;

-- Cria o banco se não existir
CREATE DATABASE IF NOT EXISTS Padaria;

-- Usa o banco
USE Padaria;

-- <--- Criando tabela -->> 
CREATE TABLE IF NOT EXISTS `Pessoa`(
	`id_pessoa` BIGINT NOT NULL auto_increment,
	`Usuario` VARCHAR(10) NOT NULL,
    `Senha` VARCHAR(8) NOT NULL,
    `Cargo` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id_pessoa`)
);

CREATE TABLE IF NOT EXISTS `Alimentos`(
	`id_alimento` BIGINT NOT NULL auto_increment,
	`Nome_alimento` VARCHAR(45) NOT NULL,
    `Valor` Double NOT NULL,
    `Promocao` VARCHAR(45) NOT NULL,
    `Quantidade` INTEGER NOT NULL,
    PRIMARY KEY (`id_alimento`)
);

INSERT INTO Pessoa (Usuario, Senha, Cargo) VALUES ('Eric', 123, 'Gerente');
INSERT INTO Alimentos (Nome_alimento, Valor, promocao, Quantidade) VALUES ('Abacaxi', 23, '15%', 2);

SELECT COUNT(*) FROM Pessoa;
SELECT COUNT(*) FROM Alimentos;

SELECT * FROM Pessoa;
SELECT * FROM Alimentos;