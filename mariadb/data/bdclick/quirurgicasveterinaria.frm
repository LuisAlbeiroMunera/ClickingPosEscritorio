TYPE=VIEW
query=select `bdclick`.`bdquirurgica`.`Id` AS `Id`,`bdclick`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick`.`bdconsulta`.`Id` AS `consulta`,`bdclick`.`bdconsulta`.`historia` AS `historia`,`bdclick`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick`.`bdquirurgica` join `bdclick`.`bdconsulta` on((`bdclick`.`bdquirurgica`.`historia` = `bdclick`.`bdconsulta`.`Id`)))
md5=29e0aee533754b19353f900bb1ecad5d
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:26
create-version=2
source=select `bdquirurgica`.`Id` AS `Id`,`bdquirurgica`.`fecha` AS `fecha`,`bdquirurgica`.`usuario` AS `usuario`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdquirurgica`.`observacion` AS `observacion` from (`bdquirurgica` join `bdconsulta` on((`bdquirurgica`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdquirurgica`.`Id` AS `Id`,`bdclick`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick`.`bdconsulta`.`Id` AS `consulta`,`bdclick`.`bdconsulta`.`historia` AS `historia`,`bdclick`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick`.`bdquirurgica` join `bdclick`.`bdconsulta` on((`bdclick`.`bdquirurgica`.`historia` = `bdclick`.`bdconsulta`.`Id`)))
mariadb-version=100135
