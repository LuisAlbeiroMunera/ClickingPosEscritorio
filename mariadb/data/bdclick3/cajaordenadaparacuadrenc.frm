TYPE=VIEW
query=(select cast(substr(`bdclick3`.`bdnc`.`Id`,4,100) as signed) AS `ordenId`,`bdclick3`.`bdnc`.`Id` AS `id`,`bdclick3`.`bdnc`.`cuadre` AS `cuadre`,cast(substr(`bdclick3`.`bdnc`.`cuadre`,8,100) as signed) AS `ordenIdCuadre` from `bdclick3`.`bdnc` where ((`bdclick3`.`bdnc`.`cuadre` <> \'\') or (`bdclick3`.`bdnc`.`cuadre` is not null)) order by cast(substr(`bdclick3`.`bdnc`.`Id`,4,100) as signed))
md5=9ff240488093973a1db5435990e38ba7
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:48
create-version=2
source=(select cast(substr(`bdnc`.`Id`,4,100) as signed) AS `ordenId`,`bdnc`.`Id` AS `id`,`bdnc`.`cuadre` AS `cuadre`,cast(substr(`bdnc`.`cuadre`,8,100) as signed) AS `ordenIdCuadre` from `bdnc` where ((`bdnc`.`cuadre` <> \'\') or (`bdnc`.`cuadre` is not null)) order by cast(substr(`bdnc`.`Id`,4,100) as signed))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select cast(substr(`bdclick3`.`bdnc`.`Id`,4,100) as signed) AS `ordenId`,`bdclick3`.`bdnc`.`Id` AS `id`,`bdclick3`.`bdnc`.`cuadre` AS `cuadre`,cast(substr(`bdclick3`.`bdnc`.`cuadre`,8,100) as signed) AS `ordenIdCuadre` from `bdclick3`.`bdnc` where ((`bdclick3`.`bdnc`.`cuadre` <> \'\') or (`bdclick3`.`bdnc`.`cuadre` is not null)) order by cast(substr(`bdclick3`.`bdnc`.`Id`,4,100) as signed))
mariadb-version=100135