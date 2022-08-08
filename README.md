# CrudSpringSQL
A spring boot Application that performs a CRUD operatin(SpringDataJPA) a SQL database
STEPS:
Step 1: Crate a Database table;
Step 2: G to spring initializer and add the neccessary dependencies and generate the project and open in your favourite ide
Step 3: Got to src-->main-->java  and create a class name similiar that of table and create private variables similair that of table columns and create getters and setters
Step 4: Create a controller class to do crud opertion uing postman
Step 5: Create a tableRepository class that extends CRUDRepository to do jpa methods
Step 6: Create a tableService class that have all the methods that define that operation needs to do
Step 7: In application.properties define host url,user,password
Step 8: And finally run it and send requests from postman to confirm it's working
