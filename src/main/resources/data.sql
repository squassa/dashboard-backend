DELETE FROM produto_menos_vendido;
DELETE FROM grupo_mais_vendido;
DELETE FROM cmv;

ALTER TABLE produto_menos_vendido AUTO_INCREMENT = 1;
ALTER TABLE grupo_mais_vendido AUTO_INCREMENT = 1;
ALTER TABLE cmv AUTO_INCREMENT = 1;

INSERT INTO cmv (mes, valor) VALUES ('Jan', 20000);
INSERT INTO cmv (mes, valor) VALUES ('Fev', 18000);
INSERT INTO cmv (mes, valor) VALUES ('Mar', 22000);
INSERT INTO cmv (mes, valor) VALUES ('Abr', 30000);

INSERT INTO grupo_mais_vendido (grupo, quantidade) VALUES ('Alimentos', 140);
INSERT INTO grupo_mais_vendido (grupo, quantidade) VALUES ('Bebidas', 120);
INSERT INTO grupo_mais_vendido (grupo, quantidade) VALUES ('Limpeza', 95);
INSERT INTO grupo_mais_vendido (grupo, quantidade) VALUES ('Higiene', 80);

INSERT INTO produto_menos_vendido (produto, quantidade) VALUES ('Sabão em barra', 1);
INSERT INTO produto_menos_vendido (produto, quantidade) VALUES ('Água com gás', 2);
INSERT INTO produto_menos_vendido (produto, quantidade) VALUES ('Detergente Neutro', 3);
INSERT INTO produto_menos_vendido (produto, quantidade) VALUES ('Biscoito Integral', 4);