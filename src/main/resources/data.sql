
--mot de passe = Root --
INSERT INTO app_user ( email, password, pseudo, admin) VALUES
    ( 'a@a.com', '$2a$10$snvDOPIPLlteMkz/sIT4fuB7GEIpUyWf/tEuSMKoNHcKCvc9mNQ76', 'utilisateur A', true),
    ( 'b@b.com', '$2a$10$snvDOPIPLlteMkz/sIT4fuB7GEIpUyWf/tEuSMKoNHcKCvc9mNQ76', 'utilisateur B', false),
    ( 'c@c.com', '$2a$10$snvDOPIPLlteMkz/sIT4fuB7GEIpUyWf/tEuSMKoNHcKCvc9mNQ76', 'utilisateur C', false);

INSERT INTO recipe (name, description, creator_id) VALUES
    ('Pâtes carbonara', 'Des pâtes al dente mélangées à une sauce onctueuse à base d’œufs, de fromage pecorino, de pancetta et de poivre noir.', 2),
    ('Tarte aux pommes', 'Une pâte brisée croustillante garnie de fines tranches de pommes caramélisées et d’une touche de cannelle.', 2),
    ('Salade César', 'Une salade fraîche avec des croûtons grillés, du poulet, de la sauce César et du parmesan râpé.', 3);

INSERT INTO products (name, description, price, stock) VALUES
('Clavier mécanique', 'Clavier RGB avec switches bleus', 79.99, 10),
('Souris sans fil', 'Souris ergonomique rechargeable', 29.99, 25),
('Écran 24 pouces', 'Moniteur Full HD 24 pouces', 149.99, 8);

INSERT INTO products (name, description, price, stock)
VALUES
('Ordinateur portable', 'PC portable pour usage bureautique et développement.', 899.99, 12),
('Clavier mécanique', 'Clavier mécanique rétroéclairé.', 79.99, 30),
('Souris sans fil', 'Souris ergonomique sans fil.', 29.99, 45),
('Écran 27 pouces', 'Écran Full HD 27 pouces.', 199.99, 18),
('Casque audio', 'Casque avec microphone intégré.', 59.99, 25);