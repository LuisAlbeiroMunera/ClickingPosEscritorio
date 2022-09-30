TYPE=VIEW
query=select `bdclick2`.`bdformulamedica`.`Id` AS `Id`,`bdclick2`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick2`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick2`.`bdformulamedica`.`valor` AS `valor`,`bdclick2`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick2`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick2`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick2`.`bdformulamedica` join `bdclick2`.`bdconsultaclinica` on((`bdclick2`.`bdformulamedica`.`historia` = `bdclick2`.`bdconsultaclinica`.`Id`))) join `bdclick2`.`bdusuario` on((`bdclick2`.`bdformulamedica`.`usuario` = `bdclick2`.`bdusuario`.`usuario`)))
md5=57e3e03eda9bfac4fc31c85303428f14
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=select `bdformulamedica`.`Id` AS `Id`,`bdformulamedica`.`fecha` AS `fecha`,`bdformulamedica`.`usuario` AS `usuario`,`bdformulamedica`.`valor` AS `valor`,`bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdformulamedica` join `bdconsultaclinica` on((`bdformulamedica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdformulamedica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdformulamedica`.`Id` AS `Id`,`bdclick2`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick2`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick2`.`bdformulamedica`.`valor` AS `valor`,`bdclick2`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick2`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick2`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick2`.`bdformulamedica` join `bdclick2`.`bdconsultaclinica` on((`bdclick2`.`bdformulamedica`.`historia` = `bdclick2`.`bdconsultaclinica`.`Id`))) join `bdclick2`.`bdusuario` on((`bdclick2`.`bdformulamedica`.`usuario` = `bdclick2`.`bdusuario`.`usuario`)))
mariadb-version=100135
