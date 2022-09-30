TYPE=VIEW
query=select `bdclick3`.`bdcuadre`.`Id` AS `Id`,`bdclick3`.`bdcuadre`.`fecha` AS `fecha`,`bdclick3`.`bdcuadre`.`terminal` AS `terminal`,`bdclick3`.`bdcuadre`.`hora` AS `hora`,`bdclick3`.`bdcuadre`.`usuario` AS `usuario`,`bdclick3`.`bdusuario`.`nombre` AS `nombre`,`bdclick3`.`bdcuadre`.`base` AS `base` from (`bdclick3`.`bdcuadre` join `bdclick3`.`bdusuario` on((`bdclick3`.`bdcuadre`.`usuario` = `bdclick3`.`bdusuario`.`usuario`)))
md5=921efecc0463f52c77ed5b334ad0ef7b
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=select `bdcuadre`.`Id` AS `Id`,`bdcuadre`.`fecha` AS `fecha`,`bdcuadre`.`terminal` AS `terminal`,`bdcuadre`.`hora` AS `hora`,`bdcuadre`.`usuario` AS `usuario`,`bdusuario`.`nombre` AS `nombre`,`bdcuadre`.`base` AS `base` from (`bdcuadre` join `bdusuario` on((`bdcuadre`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdcuadre`.`Id` AS `Id`,`bdclick3`.`bdcuadre`.`fecha` AS `fecha`,`bdclick3`.`bdcuadre`.`terminal` AS `terminal`,`bdclick3`.`bdcuadre`.`hora` AS `hora`,`bdclick3`.`bdcuadre`.`usuario` AS `usuario`,`bdclick3`.`bdusuario`.`nombre` AS `nombre`,`bdclick3`.`bdcuadre`.`base` AS `base` from (`bdclick3`.`bdcuadre` join `bdclick3`.`bdusuario` on((`bdclick3`.`bdcuadre`.`usuario` = `bdclick3`.`bdusuario`.`usuario`)))
mariadb-version=100135
