TYPE=VIEW
query=select `bdclick6`.`bdcuadre`.`Id` AS `Id`,`bdclick6`.`bdcuadre`.`fecha` AS `fecha`,`bdclick6`.`bdcuadre`.`terminal` AS `terminal`,`bdclick6`.`bdcuadre`.`hora` AS `hora`,`bdclick6`.`bdcuadre`.`usuario` AS `usuario`,`bdclick6`.`bdusuario`.`nombre` AS `nombre`,`bdclick6`.`bdcuadre`.`base` AS `base` from (`bdclick6`.`bdcuadre` join `bdclick6`.`bdusuario` on((`bdclick6`.`bdcuadre`.`usuario` = `bdclick6`.`bdusuario`.`usuario`)))
md5=67367351213eda78ef85ac1f41b6849b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=select `bdcuadre`.`Id` AS `Id`,`bdcuadre`.`fecha` AS `fecha`,`bdcuadre`.`terminal` AS `terminal`,`bdcuadre`.`hora` AS `hora`,`bdcuadre`.`usuario` AS `usuario`,`bdusuario`.`nombre` AS `nombre`,`bdcuadre`.`base` AS `base` from (`bdcuadre` join `bdusuario` on((`bdcuadre`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdcuadre`.`Id` AS `Id`,`bdclick6`.`bdcuadre`.`fecha` AS `fecha`,`bdclick6`.`bdcuadre`.`terminal` AS `terminal`,`bdclick6`.`bdcuadre`.`hora` AS `hora`,`bdclick6`.`bdcuadre`.`usuario` AS `usuario`,`bdclick6`.`bdusuario`.`nombre` AS `nombre`,`bdclick6`.`bdcuadre`.`base` AS `base` from (`bdclick6`.`bdcuadre` join `bdclick6`.`bdusuario` on((`bdclick6`.`bdcuadre`.`usuario` = `bdclick6`.`bdusuario`.`usuario`)))
mariadb-version=100135
