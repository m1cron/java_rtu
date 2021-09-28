CREATE TABLE users (
                       username varchar(15),
                       password varchar(100),
                       enabled tinyint(1),
                       PRIMARY KEY (username)
);

CREATE TABLE authorities (
                             username varchar(15),
                             authority varchar(25),
                             FOREIGN KEY (username) references users(username)
);

INSERT INTO users (username, password, enabled)
VALUES
('maxim', '{bcrypt}$2a$10$fD5T.n4d.dC0hK7Coonw2uaYSvzoiLFKdipKS0sX60zKtiFA/hy2O', 1),
('micron', '{bcrypt}$2a$10$ydjhGVD08jNLpHnVcf6pRuBCi4jtTBLVcxmgJZ6Qs1qFhZd.eYJ/G', 1),
('admin', '{bcrypt}$2a$10$mvbpr0YJoukw03Zq//CUreSqeDHyUFkfng92KkR.MCdHsVxOLYJXS', 1);

INSERT INTO authorities (username, authority)
VALUES
('maxim', 'ROLE_EMPLOYEE'),
('micron', 'ROLE_HR'),
('admin', 'ROLE_HR'),
('admin', 'ROLE_MANAGER');