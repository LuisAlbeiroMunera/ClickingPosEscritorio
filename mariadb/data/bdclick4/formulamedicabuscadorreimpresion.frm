TYPE=VIEW
query=select `bdclick4`.`bdformulamedica`.`Id` AS `Id`,`bdclick4`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick4`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick4`.`bdformulamedica`.`valor` AS `valor`,`bdclick4`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick4`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick4`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick4`.`bdformulamedica` join `bdclick4`.`bdconsultaclinica` on((`bdclick4`.`bdformulamedica`.`historia` = `bdclick4`.`bdconsultaclinica`.`Id`))) join `bdclick4`.`bdusuario` on((`bdclick4`.`bdformulamedica`.`usuario` = `bdclick4`.`bdusuario`.`usuario`)))
md5=acb51526b1525aa8f5aeff42b8191623
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select `bdformulamedica`.`Id` AS `Id`,`bdformulamedica`.`fecha` AS `fecha`,`bdformulamedica`.`usuario` AS `usuario`,`bdformulamedica`.`valor` AS `valor`,`bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdformulamedica` join `bdconsultaclinica` on((`bdformulamedica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdformulamedica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdformulamedica`.`Id` AS `Id`,`bdclick4`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick4`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick4`.`bdformulamedica`.`valor` AS `valor`,`bdclick4`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick4`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick4`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick4`.`bdformulamedica` join `bdclick4`.`bdconsultaclinica` on((`bdclick4`.`bdformulamedica`.`historia` = `bdclick4`.`bdconsultaclinica`.`Id`))) join `bdclick4`.`bdusuario` on((`bdclick4`.`bdformulamedica`.`usuario` = `bdclick4`.`bdusuario`.`usuario`)))
mariadb-version=100135
