-- V2: Migration para adicionar a coluna de RANK na tabela de cadastro de ninjas

ALTER TABLE tb_cadastro_ninjas
ADD COLUMN rank VARCHAR(255);