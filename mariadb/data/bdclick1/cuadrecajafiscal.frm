TYPE=VIEW
query=select `bdclick1`.`bdcuadre`.`Id` AS `Id`,`bdclick1`.`bdcuadre`.`fecha` AS `fecha`,`bdclick1`.`bdcuadre`.`terminal` AS `terminal`,`bdclick1`.`bdcuadre`.`hora` AS `hora`,`bdclick1`.`bdcuadre`.`usuario` AS `usuario`,`bdclick1`.`bdusuario`.`nombre` AS `nombre`,`bdclick1`.`bdcuadre`.`base` AS `base` from (`bdclick1`.`bdcuadre` join `bdclick1`.`bdusuario` on((`bdclick1`.`bdcuadre`.`usuario` = `bdclick1`.`bdusuario`.`usuario`)))
md5=6c44f62e35813ca39a1717dc47499331
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select `bdcuadre`.`Id` AS `Id`,`bdcuadre`.`fecha` AS `fecha`,`bdcuadre`.`terminal` AS `terminal`,`bdcuadre`.`hora` AS `hora`,`bdcuadre`.`usuario` AS `usuario`,`bdusuario`.`nombre` AS `nombre`,`bdcuadre`.`base` AS `base` from (`bdcuadre` join `bdusuario` on((`bdcuadre`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdcuadre`.`Id` AS `Id`,`bdclick1`.`bdcuadre`.`fecha` AS `fecha`,`bdclick1`.`bdcuadre`.`terminal` AS `terminal`,`bdclick1`.`bdcuadre`.`hora` AS `hora`,`bdclick1`.`bdcuadre`.`usuario` AS `usuario`,`bdclick1`.`bdusuario`.`nombre` AS `nombre`,`bdclick1`.`bdcuadre`.`base` AS `base` from (`bdclick1`.`bdcuadre` join `bdclick1`.`bdusuario` on((`bdclick1`.`bdcuadre`.`usuario` = `bdclick1`.`bdusuario`.`usuario`)))
mariadb-version=100135
