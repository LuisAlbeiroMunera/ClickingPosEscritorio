TYPE=VIEW
query=(select cast(substr(`bdclick2`.`bdnc`.`Id`,4,100) as signed) AS `ordenId`,`bdclick2`.`bdnc`.`Id` AS `id`,`bdclick2`.`bdnc`.`cuadre` AS `cuadre`,cast(substr(`bdclick2`.`bdnc`.`cuadre`,8,100) as signed) AS `ordenIdCuadre` from `bdclick2`.`bdnc` where ((`bdclick2`.`bdnc`.`cuadre` <> \'\') or (`bdclick2`.`bdnc`.`cuadre` is not null)) order by cast(substr(`bdclick2`.`bdnc`.`Id`,4,100) as signed))
md5=59bbd024be3861273765bb260257e1d3
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:42
create-version=2
source=(select cast(substr(`bdnc`.`Id`,4,100) as signed) AS `ordenId`,`bdnc`.`Id` AS `id`,`bdnc`.`cuadre` AS `cuadre`,cast(substr(`bdnc`.`cuadre`,8,100) as signed) AS `ordenIdCuadre` from `bdnc` where ((`bdnc`.`cuadre` <> \'\') or (`bdnc`.`cuadre` is not null)) order by cast(substr(`bdnc`.`Id`,4,100) as signed))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select cast(substr(`bdclick2`.`bdnc`.`Id`,4,100) as signed) AS `ordenId`,`bdclick2`.`bdnc`.`Id` AS `id`,`bdclick2`.`bdnc`.`cuadre` AS `cuadre`,cast(substr(`bdclick2`.`bdnc`.`cuadre`,8,100) as signed) AS `ordenIdCuadre` from `bdclick2`.`bdnc` where ((`bdclick2`.`bdnc`.`cuadre` <> \'\') or (`bdclick2`.`bdnc`.`cuadre` is not null)) order by cast(substr(`bdclick2`.`bdnc`.`Id`,4,100) as signed))
mariadb-version=100135
