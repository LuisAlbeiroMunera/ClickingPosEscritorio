TYPE=VIEW
query=select `bdclick4`.`bdcuadre`.`Id` AS `Id`,`bdclick4`.`bdcuadre`.`fecha` AS `fecha`,`bdclick4`.`bdcuadre`.`terminal` AS `terminal`,`bdclick4`.`bdcuadre`.`hora` AS `hora`,`bdclick4`.`bdcuadre`.`usuario` AS `usuario`,`bdclick4`.`bdusuario`.`nombre` AS `nombre`,`bdclick4`.`bdcuadre`.`base` AS `base` from (`bdclick4`.`bdcuadre` join `bdclick4`.`bdusuario` on((`bdclick4`.`bdcuadre`.`usuario` = `bdclick4`.`bdusuario`.`usuario`)))
md5=e17d6887f24201d17b1311d786bc104a
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select `bdcuadre`.`Id` AS `Id`,`bdcuadre`.`fecha` AS `fecha`,`bdcuadre`.`terminal` AS `terminal`,`bdcuadre`.`hora` AS `hora`,`bdcuadre`.`usuario` AS `usuario`,`bdusuario`.`nombre` AS `nombre`,`bdcuadre`.`base` AS `base` from (`bdcuadre` join `bdusuario` on((`bdcuadre`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdcuadre`.`Id` AS `Id`,`bdclick4`.`bdcuadre`.`fecha` AS `fecha`,`bdclick4`.`bdcuadre`.`terminal` AS `terminal`,`bdclick4`.`bdcuadre`.`hora` AS `hora`,`bdclick4`.`bdcuadre`.`usuario` AS `usuario`,`bdclick4`.`bdusuario`.`nombre` AS `nombre`,`bdclick4`.`bdcuadre`.`base` AS `base` from (`bdclick4`.`bdcuadre` join `bdclick4`.`bdusuario` on((`bdclick4`.`bdcuadre`.`usuario` = `bdclick4`.`bdusuario`.`usuario`)))
mariadb-version=100135
