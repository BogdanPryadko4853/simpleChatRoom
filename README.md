# Simple Chat Room

Проект **Simple Chat Room** — это простое веб-приложение для обмена сообщениями в реальном времени с использованием Spring Boot и WebSocket. Приложение позволяет пользователям подключаться к чату, отправлять сообщения и видеть сообщения других пользователей.

## Технологии
- **Spring Boot**: Основной фреймворк для создания приложения.
- **WebSocket**: Обеспечивает двустороннюю связь между клиентом и сервером в реальном времени.
- **SockJS**: Библиотека для обеспечения совместимости WebSocket с браузерами, которые не поддерживают WebSocket.
- **STOMP**: Протокол для обмена сообщениями поверх WebSocket.
- **HTML/CSS/JavaScript**: Фронтенд часть приложения.

## Структура проекта
### Основные файлы:
- **WebSocketConfig.java**: Конфигурация WebSocket.
- **ChatController.java**: Контроллер для обработки сообщений чата.
- **WebSocketEventListener.java**: Слушатель событий WebSocket (подключение и отключение пользователей).
- **ChatMessage.java**: Модель сообщения чата.
- **ChatRoomApplication.java**: Основной класс приложения.

### Фронтенд:
- **index.html**: Главная страница чата.
- **main.css**: Стили для страницы чата.
- **main.js**: Логика для работы с WebSocket и отправки сообщений.

## Как запустить проект
1. **Клонирование репозитория**
   
bash
   git clone https://github.com/yourusername/simple-chat-room.git
   cd simple-chat-room
   
   
2. **Запуск приложения**
   Убедитесь, что у вас установлен Java (минимум версия 8) и Maven.

   Соберите и запустите проект:
   
bash
   mvn clean install
   mvn spring-boot:run
   
   Приложение будет доступно по адресу: [http://localhost:8080](http://localhost:8080).

## Как использовать
1. Откройте приложение в браузере.
2. Введите имя пользователя и нажмите **Start Chatting**.
3. Отправляйте сообщения в чат. Все подключенные пользователи будут видеть ваши сообщения в реальном времени.

## Основные функции
- **Подключение к чату**: Пользователи могут подключиться к чату, введя свое имя.
- **Отправка сообщений**: Пользователи могут отправлять сообщения, которые видны всем участникам чата.
- **Уведомления о подключении/отключении**: При подключении или отключении пользователя в чате появляются соответствующие уведомления.


## Автор
[Bogdan]  
[Bogdanpryadko1@gmail.com]  
