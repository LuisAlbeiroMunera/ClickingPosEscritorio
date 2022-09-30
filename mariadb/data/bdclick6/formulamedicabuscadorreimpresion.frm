TYPE=VIEW
query=select `bdclick6`.`bdformulamedica`.`Id` AS `Id`,`bdclick6`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick6`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick6`.`bdformulamedica`.`valor` AS `valor`,`bdclick6`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick6`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick6`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick6`.`bdformulamedica` join `bdclick6`.`bdconsultaclinica` on((`bdclick6`.`bdformulamedica`.`historia` = `bdclick6`.`bdconsultaclinica`.`Id`))) join `bdclick6`.`bdusuario` on((`bdclick6`.`bdformulamedica`.`usuario` = `bdclick6`.`bdusuario`.`usuario`)))
md5=dc965e7af61cc00de76aa7e7d2ed635e
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=select `bdformulamedica`.`Id` AS `Id`,`bdformulamedica`.`fecha` AS `fecha`,`bdformulamedica`.`usuario` AS `usuario`,`bdformulamedica`.`valor` AS `valor`,`bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdformulamedica` join `bdconsultaclinica` on((`bdformulamedica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdformulamedica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdformulamedica`.`Id` AS `Id`,`bdclick6`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick6`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick6`.`bdformulamedica`.`valor` AS `valor`,`bdclick6`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick6`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick6`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick6`.`bdformulamedica` join `bdclick6`.`bdconsultaclinica` on((`bdclick6`.`bdformulamedica`.`historia` = `bdclick6`.`bdconsultaclinica`.`Id`))) join `bdclick6`.`bdusuario` on((`bdclick6`.`bdformulamedica`.`usuario` = `bdclick6`.`bdusuario`.`usuario`)))
mariadb-version=100135
