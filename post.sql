DROP DATABASE IF EXISTS posts_db;

CREATE DATABASE posts_db;

USE posts_db;

CREATE TABLE posts
(
    user_id int unsigned NOT NULL AUTO_INCREMENT,
    title   VARCHAR(100),
    body    TEXT         NOT NULL
);

USE posts_db;

insert into posts (title, body) values ('primis in faucibus orci', 'consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum');
insert into posts (title, body) values ('curabitur at ipsum', 'aenean fermentum donec ut mauris eget massa tempor convallis nulla neque libero convallis eget eleifend');
insert into posts (title, body) values ('consequat morbi a ipsum', 'nam congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede');
insert into posts (title, body) values ('ultrices phasellus id sapien', 'nisi venenatis tristique fusce congue diam id ornare imperdiet sapien');
insert into posts (title, body) values ('etiam justo etiam', 'hac habitasse platea dictumst etiam faucibus cursus urna ut tellus nulla ut');
insert into posts (title, body) values ('vitae ipsum aliquam non', 'eu magna vulputate luctus cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus vivamus');
insert into posts (title, body) values ('libero ut massa volutpat', 'pede ac diam cras pellentesque volutpat dui maecenas tristique est et tempus semper est quam pharetra');
insert into posts (title, body) values ('magna bibendum imperdiet nullam', 'aliquet ultrices erat tortor sollicitudin mi sit amet lobortis sapien sapien non mi integer ac neque duis bibendum morbi');
insert into posts (title, body) values ('in purus eu magna', 'vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero nullam sit amet');
insert into posts (title, body) values ('proin at turpis a', 'libero ut massa volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est');

DROP USER IF EXISTS 'posts_user'@'localhost';

CREATE USER 'posts_user'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON posts_db.* TO 'posts_user'@'localhost';