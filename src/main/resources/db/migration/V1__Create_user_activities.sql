CREATE TABLE user_activities
(
    activity_id  INT AUTO_INCREMENT PRIMARY KEY,
    user_id      VARCHAR(255) NOT NULL,
    act          VARCHAR(255),-- 실제 어떤 데이터가 들어가는지
    channel      VARCHAR(255),
    channel_type VARCHAR(255),
    date         DATE,
    photo        VARCHAR(255),
    title        VARCHAR(255),
    video_id     VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES users_data (uid)
);