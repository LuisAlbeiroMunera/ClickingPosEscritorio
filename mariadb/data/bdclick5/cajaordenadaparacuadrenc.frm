TYPE=VIEW
query=(select cast(substr(`bdclick5`.`bdnc`.`Id`,4,100) as signed) AS `ordenId`,`bdclick5`.`bdnc`.`Id` AS `id`,`bdclick5`.`bdnc`.`cuadre` AS `cuadre`,cast(substr(`bdclick5`.`bdnc`.`cuadre`,8,100) as signed) AS `ordenIdCuadre` from `bdclick5`.`bdnc` where ((`bdclick5`.`bdnc`.`cuadre` <> \'\') or (`bdclick5`.`bdnc`.`cuadre` is not null)) order by cast(substr(`bdclick5`.`bdnc`.`Id`,4,100) as signed))
md5=6ce200c2c96e643a43f674aedcde8a7f
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=(select cast(substr(`bdnc`.`Id`,4,100) as signed) AS `ordenId`,`bdnc`.`Id` AS `id`,`bdnc`.`cuadre` AS `cuadre`,cast(substr(`bdnc`.`cuadre`,8,100) as signed) AS `ordenIdCuadre` from `bdnc` where ((`bdnc`.`cuadre` <> \'\') or (`bdnc`.`cuadre` is not null)) order by cast(substr(`bdnc`.`Id`,4,100) as signed))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select cast(substr(`bdclick5`.`bdnc`.`Id`,4,100) as signed) AS `ordenId`,`bdclick5`.`bdnc`.`Id` AS `id`,`bdclick5`.`bdnc`.`cuadre` AS `cuadre`,cast(substr(`bdclick5`.`bdnc`.`cuadre`,8,100) as signed) AS `ordenIdCuadre` from `bdclick5`.`bdnc` where ((`bdclick5`.`bdnc`.`cuadre` <> \'\') or (`bdclick5`.`bdnc`.`cuadre` is not null)) order by cast(substr(`bdclick5`.`bdnc`.`Id`,4,100) as signed))
mariadb-version=100135
