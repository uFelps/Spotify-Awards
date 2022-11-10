INSERT INTO tb_user(email) VALUES ('maria@gmail.com');
INSERT INTO tb_user(email) VALUES ('joao@gmail.com');
INSERT INTO tb_user(email) VALUES ('ana@gmail.com');
INSERT INTO tb_user(email) VALUES ('lucia@gmail.com');
INSERT INTO tb_user(email) VALUES ('joaquim@gmail.com');

INSERT INTO tb_artist(name, listeners, average, count_votes) VALUES ('Red Hot Chili Peppers', "26.298.433", 4.5, 2);
INSERT INTO tb_artist(name, listeners, average, count_votes) VALUES ('Kendrick Lamar', "37.552.617", 3.3, 3);

INSERT INTO score_artist(score_value, id_user, id_artist) VALUES (5.0, 1, 1);
INSERT INTO score_artist(score_value, id_user, id_artist) VALUES (4.0, 2, 1);
INSERT INTO score_artist(score_value, id_user, id_artist) VALUES (5.0, 3, 2);
INSERT INTO score_artist(score_value, id_user, id_artist) VALUES (5.0, 4, 2);
INSERT INTO score_artist(score_value, id_user, id_artist) VALUES (5.0, 5, 2);