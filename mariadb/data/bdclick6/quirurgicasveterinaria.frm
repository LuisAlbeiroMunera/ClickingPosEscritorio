TYPE=VIEW
query=select `bdclick6`.`bdquirurgica`.`Id` AS `Id`,`bdclick6`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick6`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick6`.`bdconsulta`.`Id` AS `consulta`,`bdclick6`.`bdconsulta`.`historia` AS `historia`,`bdclick6`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick6`.`bdquirurgica` join `bdclick6`.`bdconsulta` on((`bdclick6`.`bdquirurgica`.`historia` = `bdclick6`.`bdconsulta`.`Id`)))
md5=12ccb7cfcf986fd7ecdefb6e814d30f4
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:37
create-version=2
source=select `bdquirurgica`.`Id` AS `Id`,`bdquirurgica`.`fecha` AS `fecha`,`bdquirurgica`.`usuario` AS `usuario`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdquirurgica`.`observacion` AS `observacion` from (`bdquirurgica` join `bdconsulta` on((`bdquirurgica`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdquirurgica`.`Id` AS `Id`,`bdclick6`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick6`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick6`.`bdconsulta`.`Id` AS `consulta`,`bdclick6`.`bdconsulta`.`historia` AS `historia`,`bdclick6`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick6`.`bdquirurgica` join `bdclick6`.`bdconsulta` on((`bdclick6`.`bdquirurgica`.`historia` = `bdclick6`.`bdconsulta`.`Id`)))
mariadb-version=100135
