TYPE=VIEW
query=select `bdclick5`.`bdquirurgica`.`Id` AS `Id`,`bdclick5`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick5`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick5`.`bdconsulta`.`Id` AS `consulta`,`bdclick5`.`bdconsulta`.`historia` AS `historia`,`bdclick5`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick5`.`bdquirurgica` join `bdclick5`.`bdconsulta` on((`bdclick5`.`bdquirurgica`.`historia` = `bdclick5`.`bdconsulta`.`Id`)))
md5=6268dea929ce7df0539ddedd9d791878
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:49
create-version=2
source=select `bdquirurgica`.`Id` AS `Id`,`bdquirurgica`.`fecha` AS `fecha`,`bdquirurgica`.`usuario` AS `usuario`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdquirurgica`.`observacion` AS `observacion` from (`bdquirurgica` join `bdconsulta` on((`bdquirurgica`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdquirurgica`.`Id` AS `Id`,`bdclick5`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick5`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick5`.`bdconsulta`.`Id` AS `consulta`,`bdclick5`.`bdconsulta`.`historia` AS `historia`,`bdclick5`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick5`.`bdquirurgica` join `bdclick5`.`bdconsulta` on((`bdclick5`.`bdquirurgica`.`historia` = `bdclick5`.`bdconsulta`.`Id`)))
mariadb-version=100135
