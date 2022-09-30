TYPE=VIEW
query=select `bdclick3`.`bdformulamedica`.`Id` AS `Id`,`bdclick3`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick3`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick3`.`bdformulamedica`.`valor` AS `valor`,`bdclick3`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick3`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick3`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick3`.`bdformulamedica` join `bdclick3`.`bdconsultaclinica` on((`bdclick3`.`bdformulamedica`.`historia` = `bdclick3`.`bdconsultaclinica`.`Id`))) join `bdclick3`.`bdusuario` on((`bdclick3`.`bdformulamedica`.`usuario` = `bdclick3`.`bdusuario`.`usuario`)))
md5=c41b2c885844e0c871490a2b60229795
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:50
create-version=2
source=select `bdformulamedica`.`Id` AS `Id`,`bdformulamedica`.`fecha` AS `fecha`,`bdformulamedica`.`usuario` AS `usuario`,`bdformulamedica`.`valor` AS `valor`,`bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdformulamedica` join `bdconsultaclinica` on((`bdformulamedica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdformulamedica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdformulamedica`.`Id` AS `Id`,`bdclick3`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick3`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick3`.`bdformulamedica`.`valor` AS `valor`,`bdclick3`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick3`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick3`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick3`.`bdformulamedica` join `bdclick3`.`bdconsultaclinica` on((`bdclick3`.`bdformulamedica`.`historia` = `bdclick3`.`bdconsultaclinica`.`Id`))) join `bdclick3`.`bdusuario` on((`bdclick3`.`bdformulamedica`.`usuario` = `bdclick3`.`bdusuario`.`usuario`)))
mariadb-version=100135
