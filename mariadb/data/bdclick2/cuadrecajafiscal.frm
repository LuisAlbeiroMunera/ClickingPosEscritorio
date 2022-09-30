TYPE=VIEW
query=select `bdclick2`.`bdcuadre`.`Id` AS `Id`,`bdclick2`.`bdcuadre`.`fecha` AS `fecha`,`bdclick2`.`bdcuadre`.`terminal` AS `terminal`,`bdclick2`.`bdcuadre`.`hora` AS `hora`,`bdclick2`.`bdcuadre`.`usuario` AS `usuario`,`bdclick2`.`bdusuario`.`nombre` AS `nombre`,`bdclick2`.`bdcuadre`.`base` AS `base` from (`bdclick2`.`bdcuadre` join `bdclick2`.`bdusuario` on((`bdclick2`.`bdcuadre`.`usuario` = `bdclick2`.`bdusuario`.`usuario`)))
md5=8fb4be7ec2d8bba4717c81a29f6d2792
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=select `bdcuadre`.`Id` AS `Id`,`bdcuadre`.`fecha` AS `fecha`,`bdcuadre`.`terminal` AS `terminal`,`bdcuadre`.`hora` AS `hora`,`bdcuadre`.`usuario` AS `usuario`,`bdusuario`.`nombre` AS `nombre`,`bdcuadre`.`base` AS `base` from (`bdcuadre` join `bdusuario` on((`bdcuadre`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdcuadre`.`Id` AS `Id`,`bdclick2`.`bdcuadre`.`fecha` AS `fecha`,`bdclick2`.`bdcuadre`.`terminal` AS `terminal`,`bdclick2`.`bdcuadre`.`hora` AS `hora`,`bdclick2`.`bdcuadre`.`usuario` AS `usuario`,`bdclick2`.`bdusuario`.`nombre` AS `nombre`,`bdclick2`.`bdcuadre`.`base` AS `base` from (`bdclick2`.`bdcuadre` join `bdclick2`.`bdusuario` on((`bdclick2`.`bdcuadre`.`usuario` = `bdclick2`.`bdusuario`.`usuario`)))
mariadb-version=100135
