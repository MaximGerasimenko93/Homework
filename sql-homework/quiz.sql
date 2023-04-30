CREATE DATABASE quiz;

CREATE TABLE questions
( 
  question_id  SERIAL  PRIMARY KEY,
  txt  VARCHAR(100)  NOT NULL UNIQUE
);

INSERT INTO questions(txt)
VALUES
('Какой английский мыслитель написал книгу "Левиафан"?'),
('Кто ввел прямоугольную систему координат?'),
('Кто является автором романа "Норма"?'),
('Какой кот проживает на озере Балхаш?');

CREATE TABLE answers
(
    answer_id SERIAL PRIMARY KEY,
    question_id INTEGER REFERENCES questions(question_id),
    var_text VARCHAR(100) NOT NULL,
    is_correct BOOLEAN NOT NULL
);

INSERT INTO answers(question_id, var_text, is_correct)
VALUES
(1, 'Стив Джобс', FALSE),
(1, 'Фрэнсис Бэкон', FALSE),
(1, 'Томас Гоббс', TRUE),
(1, 'Оливер Кромвель', FALSE),
(2, 'Рене Магритт', FALSE),
(2, 'Аристотель', FALSE),
(2, 'Готфрид Лейбниц', FALSE),
(2, 'Рене Декарт', TRUE),
(3, 'Джейн Остин', FALSE),
(3, 'Владимир Набоков', FALSE),
(3, 'Виктор Пелевин', FALSE),
(3, 'Владимир Сорокин', TRUE),
(4, 'Сиамский', FALSE),
(4, 'Камышовый', TRUE),
(4, 'Бенгальский', FALSE),
(4, 'Персидский', FALSE);

SELECT q.question_id, q.txt, a.var_text, a.is_correct
FROM questions q
JOIN answers a ON q.question_id = a.question_id;



