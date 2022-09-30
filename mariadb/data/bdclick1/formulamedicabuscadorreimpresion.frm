TYPE=VIEW
query=select `bdclick1`.`bdformulamedica`.`Id` AS `Id`,`bdclick1`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick1`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick1`.`bdformulamedica`.`valor` AS `valor`,`bdclick1`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick1`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick1`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick1`.`bdformulamedica` join `bdclick1`.`bdconsultaclinica` on((`bdclick1`.`bdformulamedica`.`historia` = `bdclick1`.`bdconsultaclinica`.`Id`))) join `bdclick1`.`bdusuario` on((`bdclick1`.`bdformulamedica`.`usuario` = `bdclick1`.`bdusuario`.`usuario`)))
md5=24fd002044d5cd02d0e8af73bedbbbe6
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select `bdformulamedica`.`Id` AS `Id`,`bdformulamedica`.`fecha` AS `fecha`,`bdformulamedica`.`usuario` AS `usuario`,`bdformulamedica`.`valor` AS `valor`,`bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdformulamedica` join `bdconsultaclinica` on((`bdformulamedica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdformulamedica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdformulamedica`.`Id` AS `Id`,`bdclick1`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick1`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick1`.`bdformulamedica`.`valor` AS `valor`,`bdclick1`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick1`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick1`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick1`.`bdformulamedica` join `bdclick1`.`bdconsultaclinica` on((`bdclick1`.`bdformulamedica`.`historia` = `bdclick1`.`bdconsultaclinica`.`Id`))) join `bdclick1`.`bdusuario` on((`bdclick1`.`bdformulamedica`.`usuario` = `bdclick1`.`bdusuario`.`usuario`)))
mariadb-version=100135
