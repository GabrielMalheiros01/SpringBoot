INSERT INTO tb_aluno(matricula,email,name) VALUES (1,'gabriel@gmail.com','Gabriel');
INSERT INTO tb_aluno(matricula,email,name) VALUES (2,'fabricio@gmail.com','Fabricio');
INSERT INTO tb_livro(autor,nome) VALUES ('clarice','O mundo de alice');
INSERT INTO tb_livro(autor,nome) VALUES ('josefina','O pequeno principe');


INSERT INTO tb_emprestimo(data_emprestimo, status, aluno_matricula, livro_id) VALUES (2023-05-05,True,1,1);
INSERT INTO tb_emprestimo(data_emprestimo, status, aluno_matricula, livro_id) VALUES (2023-06-06,False,1,2);
INSERT INTO tb_emprestimo(data_emprestimo, status, aluno_matricula, livro_id) VALUES (2023-07-07,False,1,1);
INSERT INTO tb_emprestimo(data_emprestimo, status, aluno_matricula, livro_id) VALUES (2023-08-08,True,1,2);