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
	`Nome_alimento` VARCHAR(45) NOT NULL,
    `Valor` Double NOT NULL,
    `Promocao` VARCHAR(45) NOT NULL,
    `Data` DATE NOT NULL
);

INSERT INTO Pessoa (Usuario, Senha, Cargo) VALUES ('Eric', 123, 'Gerente');

SELECT COUNT(*) FROM Pessoa;

SELECT * FROM Pessoa;
