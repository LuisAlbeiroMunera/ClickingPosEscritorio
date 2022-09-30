TYPE=VIEW
query=select `bdclick4`.`bdquirurgica`.`Id` AS `Id`,`bdclick4`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick4`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick4`.`bdconsulta`.`Id` AS `consulta`,`bdclick4`.`bdconsulta`.`historia` AS `historia`,`bdclick4`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick4`.`bdquirurgica` join `bdclick4`.`bdconsulta` on((`bdclick4`.`bdquirurgica`.`historia` = `bdclick4`.`bdconsulta`.`Id`)))
md5=da41885f19022fcedef4dbac60cf7a3e
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=select `bdquirurgica`.`Id` AS `Id`,`bdquirurgica`.`fecha` AS `fecha`,`bdquirurgica`.`usuario` AS `usuario`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdquirurgica`.`observacion` AS `observacion` from (`bdquirurgica` join `bdconsulta` on((`bdquirurgica`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdquirurgica`.`Id` AS `Id`,`bdclick4`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick4`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick4`.`bdconsulta`.`Id` AS `consulta`,`bdclick4`.`bdconsulta`.`historia` AS `historia`,`bdclick4`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick4`.`bdquirurgica` join `bdclick4`.`bdconsulta` on((`bdclick4`.`bdquirurgica`.`historia` = `bdclick4`.`bdconsulta`.`Id`)))
mariadb-version=100135
