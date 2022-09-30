TYPE=VIEW
query=select `bdclick1`.`bdquirurgica`.`Id` AS `Id`,`bdclick1`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick1`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick1`.`bdconsulta`.`Id` AS `consulta`,`bdclick1`.`bdconsulta`.`historia` AS `historia`,`bdclick1`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick1`.`bdquirurgica` join `bdclick1`.`bdconsulta` on((`bdclick1`.`bdquirurgica`.`historia` = `bdclick1`.`bdconsulta`.`Id`)))
md5=349075958311cc05296da8689d03e5c5
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:36
create-version=2
source=select `bdquirurgica`.`Id` AS `Id`,`bdquirurgica`.`fecha` AS `fecha`,`bdquirurgica`.`usuario` AS `usuario`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdquirurgica`.`observacion` AS `observacion` from (`bdquirurgica` join `bdconsulta` on((`bdquirurgica`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdquirurgica`.`Id` AS `Id`,`bdclick1`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick1`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick1`.`bdconsulta`.`Id` AS `consulta`,`bdclick1`.`bdconsulta`.`historia` AS `historia`,`bdclick1`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick1`.`bdquirurgica` join `bdclick1`.`bdconsulta` on((`bdclick1`.`bdquirurgica`.`historia` = `bdclick1`.`bdconsulta`.`Id`)))
mariadb-version=100135
