TYPE=VIEW
query=select `bdclick5`.`bdcuadre`.`Id` AS `Id`,`bdclick5`.`bdcuadre`.`fecha` AS `fecha`,`bdclick5`.`bdcuadre`.`terminal` AS `terminal`,`bdclick5`.`bdcuadre`.`hora` AS `hora`,`bdclick5`.`bdcuadre`.`usuario` AS `usuario`,`bdclick5`.`bdusuario`.`nombre` AS `nombre`,`bdclick5`.`bdcuadre`.`base` AS `base` from (`bdclick5`.`bdcuadre` join `bdclick5`.`bdusuario` on((`bdclick5`.`bdcuadre`.`usuario` = `bdclick5`.`bdusuario`.`usuario`)))
md5=8fb9940ab3999e81e6b7b121d02a144a
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=select `bdcuadre`.`Id` AS `Id`,`bdcuadre`.`fecha` AS `fecha`,`bdcuadre`.`terminal` AS `terminal`,`bdcuadre`.`hora` AS `hora`,`bdcuadre`.`usuario` AS `usuario`,`bdusuario`.`nombre` AS `nombre`,`bdcuadre`.`base` AS `base` from (`bdcuadre` join `bdusuario` on((`bdcuadre`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcuadre`.`Id` AS `Id`,`bdclick5`.`bdcuadre`.`fecha` AS `fecha`,`bdclick5`.`bdcuadre`.`terminal` AS `terminal`,`bdclick5`.`bdcuadre`.`hora` AS `hora`,`bdclick5`.`bdcuadre`.`usuario` AS `usuario`,`bdclick5`.`bdusuario`.`nombre` AS `nombre`,`bdclick5`.`bdcuadre`.`base` AS `base` from (`bdclick5`.`bdcuadre` join `bdclick5`.`bdusuario` on((`bdclick5`.`bdcuadre`.`usuario` = `bdclick5`.`bdusuario`.`usuario`)))
mariadb-version=100135
