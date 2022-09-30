TYPE=VIEW
query=select `bdclick3`.`bdquirurgica`.`Id` AS `Id`,`bdclick3`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick3`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick3`.`bdconsulta`.`Id` AS `consulta`,`bdclick3`.`bdconsulta`.`historia` AS `historia`,`bdclick3`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick3`.`bdquirurgica` join `bdclick3`.`bdconsulta` on((`bdclick3`.`bdquirurgica`.`historia` = `bdclick3`.`bdconsulta`.`Id`)))
md5=a65eeeb63e97b48ee7911add8bc28137
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:52
create-version=2
source=select `bdquirurgica`.`Id` AS `Id`,`bdquirurgica`.`fecha` AS `fecha`,`bdquirurgica`.`usuario` AS `usuario`,`bdconsulta`.`Id` AS `consulta`,`bdconsulta`.`historia` AS `historia`,`bdquirurgica`.`observacion` AS `observacion` from (`bdquirurgica` join `bdconsulta` on((`bdquirurgica`.`historia` = `bdconsulta`.`Id`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdquirurgica`.`Id` AS `Id`,`bdclick3`.`bdquirurgica`.`fecha` AS `fecha`,`bdclick3`.`bdquirurgica`.`usuario` AS `usuario`,`bdclick3`.`bdconsulta`.`Id` AS `consulta`,`bdclick3`.`bdconsulta`.`historia` AS `historia`,`bdclick3`.`bdquirurgica`.`observacion` AS `observacion` from (`bdclick3`.`bdquirurgica` join `bdclick3`.`bdconsulta` on((`bdclick3`.`bdquirurgica`.`historia` = `bdclick3`.`bdconsulta`.`Id`)))
mariadb-version=100135
