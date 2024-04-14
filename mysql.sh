docker pull mysql:8.0.32
docker run --name mysql-local -e MYSQL_ROOT_PASSWORD=mysql -d -p 3306:3306 mysql:8.0.32