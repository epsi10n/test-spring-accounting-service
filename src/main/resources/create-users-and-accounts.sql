-- user itself
insert into accounting.user(id, name, date_of_birth, password, initial_balance)
VALUES (1, 'user1', to_date('11.03.1990', 'DD.MM.YYYY'), 'user1_pass', 10.0);
insert into accounting.user(id, name, date_of_birth, password, initial_balance)
VALUES (2, 'user2', to_date('01.01.1997', 'DD.MM.YYYY'), 'user2_pass', 0.0);
insert into accounting.user(id, name, date_of_birth, password, initial_balance)
VALUES (3, 'user3', to_date('15.05.2000', 'DD.MM.YYYY'), 'user3_pass', 25.0);
-- related accounts
insert into accounting.account (id, user_id, balance) VALUES (1, 1, 10.0);
insert into accounting.account (id, user_id, balance) VALUES (2, 2, 0.0);
insert into accounting.account (id, user_id, balance) VALUES (3, 3, 25.0);