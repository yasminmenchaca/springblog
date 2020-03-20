DROP DATABASE IF EXISTS posts_db;

# CREATE DATABASE posts_db;

# USE posts_db;

# create table users
# (
#     id       BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
#     username VARCHAR(100)           NOT NULL,
#     email    VARCHAR(100)           NOT NULL,
#     password VARCHAR(100)           NOT NULL
# );

# USE posts_db;

# CREATE TABLE posts
# (
#     id      BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
#     title   VARCHAR(1000),
#     body    TEXT                  NOT NULL,
#     user_id BIGINT,
#     FOREIGN KEY (user_id) REFERENCES users (id)
# );


# USE posts_db;

# insert into posts (title, body)
# values ('in imperdiet et commodo vulputate justo in blandit ultrices enim',
#         'Nulla tellus. In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat. Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit.');

USE posts_db;

insert into users (username, email, password)
values ('yasminismean', 'yasmin@email.com', 'password');

USE posts_db;
DROP USER IF EXISTS 'posts_user'@'localhost';
CREATE USER 'posts_user'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON posts_db.* TO 'posts_user'@'localhost';