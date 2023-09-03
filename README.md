# my-notes-rest-manual-auth
EN: Notes Application Based on the Spring Boot and REST API with Authentication (server and client are implemented in the same application).

The project implements the REST API, which is developed manually in the form of a Rest controller and provides endpoints for the Note entity. At the same time:
1) REST endpoints provide a complete list of data operations (CRUD);
2) a logical deletion operation is implemented, accessible by the "Status" link in the list of notes, which changes the value of the IsDeleted field of the note object;
3) physical deletion, as one of the CRUD operations, is only available for note objects with the true value of the IsDeleted field;
4) in the list of notes, the functions of page-by-page viewing of records and filtering of data are implemented, which work consistently;
5) the function of uploading a list of notes in the form of a report to a PDF file is also implemented (this function uploads data to the report only about those notes that are available in accordance with the filtering and pagination criteria at the time of uploading the report).
NOTE: In this part, this project is similar to the project from the repository "my-notes-test-manual".

In addition, the application has developed authentication and configured security based on Spring Security, which supports:
1) user authentication in the client part of the application;
2) Http Basic user authentication in the server part of the application by transmitting user authentication data in the "Authorization" header in client requests;
3) CSRF protection of the server part of the application by using a CSRF token, which the client requests from the server and is then transmitted in the header "X-CSRF-TOKEN" in client requests.

P.S.: This version of the application implements both server and client functions.
/---------------------------------------------------------------------------------------------------------------------------------------/

RU: Приложение для учета заметок, основанное на Spring Boot и REST API с аутентификацией (сервер и клиент реализованы в одном приложении).

Проект реализует REST API, который разработан вручную в виде Rest контроллера и предоставляет конечные точки для сущности Note (Заметка). При этом:
1) конечные точки REST предоставляют полный перечень операций с данными (CRUD); 
2) реализована операция логического удаления, доступная по ссылке "Статус" в списке заметок, которая изменяет значение поля isDeleted объекта заметки; 
3) физическое удаление, как одна из операций CRUD, доступна только для объектов заметок с истинным значением поля isDeleted; 
4) в списке заметок реализованы функции пострачниного просмотра записей и фильтрации данных, которые работают согласованно; 
5) также реализована функция выгрузки списка заметок в виде отчета во веншний файл формата PDF (данная функция выгружает в отчет данные только о тех заметках, которые доступны в соответствии с критериями фильтрации и постраничного просмотра на момент выгрузки отчета). 
ПРИМЕЧАНИЕ: В этой части данный проект аналогичен проекту из репозитория "my-notes-rest-manual".

Кроме того, в приложении разработана аутентификация и настроена безопасность на основе Spring Security, которая поддерживает: 
1) аутентификацию пользователя в клиентской части приложения; 
2) Http Basic аутентификацию пользователя в серверной части приложения путем передачи аутентификационных данных пользователя в заголовке "Authorization" в запросах клииента; 
3) CSRF защиту серверной части приложения путем использования CSRF токена, который клиент запрашивает с сервера и далее передается в заголовке "X-CSRF-TOKEN" в запросах клиента. 

P.S.: Данная версия приложения реализует одновременно функции сервера и клиента.
