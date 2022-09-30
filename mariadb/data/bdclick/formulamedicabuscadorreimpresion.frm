TYPE=VIEW
query=select `bdclick`.`bdformulamedica`.`Id` AS `Id`,`bdclick`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick`.`bdformulamedica`.`valor` AS `valor`,`bdclick`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick`.`bdformulamedica` join `bdclick`.`bdconsultaclinica` on((`bdclick`.`bdformulamedica`.`historia` = `bdclick`.`bdconsultaclinica`.`Id`))) join `bdclick`.`bdusuario` on((`bdclick`.`bdformulamedica`.`usuario` = `bdclick`.`bdusuario`.`usuario`)))
md5=992d316e63f596abbe0aea34b536d4a3
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=select `bdformulamedica`.`Id` AS `Id`,`bdformulamedica`.`fecha` AS `fecha`,`bdformulamedica`.`usuario` AS `usuario`,`bdformulamedica`.`valor` AS `valor`,`bdconsultaclinica`.`Id` AS `consulta`,`bdconsultaclinica`.`historia` AS `historia`,`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdformulamedica` join `bdconsultaclinica` on((`bdformulamedica`.`historia` = `bdconsultaclinica`.`Id`))) join `bdusuario` on((`bdformulamedica`.`usuario` = `bdusuario`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdformulamedica`.`Id` AS `Id`,`bdclick`.`bdformulamedica`.`fecha` AS `fecha`,`bdclick`.`bdformulamedica`.`usuario` AS `usuario`,`bdclick`.`bdformulamedica`.`valor` AS `valor`,`bdclick`.`bdconsultaclinica`.`Id` AS `consulta`,`bdclick`.`bdconsultaclinica`.`historia` AS `historia`,`bdclick`.`bdusuario`.`nombre` AS `usuarioNombre` from ((`bdclick`.`bdformulamedica` join `bdclick`.`bdconsultaclinica` on((`bdclick`.`bdformulamedica`.`historia` = `bdclick`.`bdconsultaclinica`.`Id`))) join `bdclick`.`bdusuario` on((`bdclick`.`bdformulamedica`.`usuario` = `bdclick`.`bdusuario`.`usuario`)))
mariadb-version=100135
