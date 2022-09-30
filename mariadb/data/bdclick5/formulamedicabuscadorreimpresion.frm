TYPE=VIEW
query=select `bdclick5`.`bdformulamedica`.`Id` AS `Id`,`bdclick5`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick5`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick5`.`bdformulamedica`.`valor` AS `valor`,`bdclick5`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick5`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick5`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick5`.`bdformulamedica` join `bdclick5`.`bdconsultaclinica` on((`bdclick5`.`bdformulamedica`.`historia` = `bdclick5`.`bdconsultaclinica`.`Id`))) join `bdclick5`.`bdusuario` on((`bdclick5`.`bdformulamedica`.`usuario` = `bdclick5`.`bdusuario`.`usuario`)))
md5=6c733a348a5c0e7820edfebae13ac346
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=select `bdformulamedica`.`Id` AS `Id`,`bdformulamedica`.`fecha` AS `fecha`,`bdformulamedica`.`usuario` AS `usuario`,`bdformulamedica`.`valor` AS `valor`,`bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdformulamedica` join `bdconsultaclinica` on((`bdformulamedica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdformulamedica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdformulamedica`.`Id` AS `Id`,`bdclick5`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick5`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick5`.`bdformulamedica`.`valor` AS `valor`,`bdclick5`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick5`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick5`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick5`.`bdformulamedica` join `bdclick5`.`bdconsultaclinica` on((`bdclick5`.`bdformulamedica`.`historia` = `bdclick5`.`bdconsultaclinica`.`Id`))) join `bdclick5`.`bdusuario` on((`bdclick5`.`bdformulamedica`.`usuario` = `bdclick5`.`bdusuario`.`usuario`)))
mariadb-version=100135
