TYPE=VIEW
query=select `bdclick`.`bdcuadre`.`Id` AS `Id`,`bdclick`.`bdcuadre`.`fecha` AS `fecha`,`bdclick`.`bdcuadre`.`terminal` AS `terminal`,`bdclick`.`bdcuadre`.`hora` AS `hora`,`bdclick`.`bdcuadre`.`usuario` AS `usuario`,`bdclick`.`bdusuario`.`nombre` AS `nombre`,`bdclick`.`bdcuadre`.`base` AS `base` from (`bdclick`.`bdcuadre` join `bdclick`.`bdusuario` on((`bdclick`.`bdcuadre`.`usuario` = `bdclick`.`bdusuario`.`usuario`)))
md5=59ebd09c37c2648e4271d3176f1bd5e3
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=select `bdcuadre`.`Id` AS `Id`,`bdcuadre`.`fecha` AS `fecha`,`bdcuadre`.`terminal` AS `terminal`,`bdcuadre`.`hora` AS `hora`,`bdcuadre`.`usuario` AS `usuario`,`bdusuario`.`nombre` AS `nombre`,`bdcuadre`.`base` AS `base` from (`bdcuadre` join `bdusuario` on((`bdcuadre`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcuadre`.`Id` AS `Id`,`bdclick`.`bdcuadre`.`fecha` AS `fecha`,`bdclick`.`bdcuadre`.`terminal` AS `terminal`,`bdclick`.`bdcuadre`.`hora` AS `hora`,`bdclick`.`bdcuadre`.`usuario` AS `usuario`,`bdclick`.`bdusuario`.`nombre` AS `nombre`,`bdclick`.`bdcuadre`.`base` AS `base` from (`bdclick`.`bdcuadre` join `bdclick`.`bdusuario` on((`bdclick`.`bdcuadre`.`usuario` = `bdclick`.`bdusuario`.`usuario`)))
mariadb-version=100135
