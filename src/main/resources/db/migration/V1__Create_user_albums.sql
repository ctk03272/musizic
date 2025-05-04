CREATE TABLE user_albums
(
    album_id    INT AUTO_INCREMENT PRIMARY KEY,
    user_id     VARCHAR(255) NOT NULL,
    artist      JSON,
    cover       VARCHAR(255),
    description TEXT,
    title       VARCHAR(255),
    year        VARCHAR(10),
    FOREIGN KEY (user_id) REFERENCES users_data (uid)
);