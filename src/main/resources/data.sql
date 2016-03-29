INSERT INTO `user` (`username`, `password_hash`, `display_name`) VALUES ('demo', 'demoHash', 'DEMO ACCOUNT');

SELECT (@uid:=id) FROM `user` WHERE `username` = 'demo';

INSERT INTO `post` (`title`, `markdown`, `html`, `status`, `category`, `user_id`)
VALUES ('Hello world!', '# This is the body', '<h1>This is the body</h1>', 'PUBLISHED', 'TECH', @uid);

INSERT INTO `post` (`title`, `markdown`, `html`, `status`, `category`, `user_id`)
VALUES ('Hello world again!', '# This is the body2', '<h1>This is the body2</h1>', 'PUBLISHED', 'LIFE', @uid);