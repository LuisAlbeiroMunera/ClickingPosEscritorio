TYPE=VIEW
query=select `bdclick2`.`bdquirurgica`.`Id` AS `Id`,`bdclick2`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick2`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick2`.`bdconsulta`.`Id` AS `consulta`,`bdclick2`.`bdconsulta`.`historia` AS `historia`,`bdclick2`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick2`.`bdquirurgica` join `bdclick2`.`bdconsulta` on((`bdclick2`.`bdquirurgica`.`historia` = `bdclick2`.`bdconsulta`.`Id`)))
md5=ab8bf6e2288bcbe2a7dc9e47302f4ca6
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:47
create-version=2
source=select `bdquirurgica`.`Id` AS `Id`,`bdquirurgica`.`fecha` AS `fecha`,`bdquirurgica`.`usuario` AS `usuario`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdquirurgica`.`observacion` AS `observacion` from (`bdquirurgica` join `bdconsulta` on((`bdquirurgica`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdquirurgica`.`Id` AS `Id`,`bdclick2`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick2`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick2`.`bdconsulta`.`Id` AS `consulta`,`bdclick2`.`bdconsulta`.`historia` AS `historia`,`bdclick2`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick2`.`bdquirurgica` join `bdclick2`.`bdconsulta` on((`bdclick2`.`bdquirurgica`.`historia` = `bdclick2`.`bdconsulta`.`Id`)))
mariadb-version=100135
