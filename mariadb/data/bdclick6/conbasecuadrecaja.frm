TYPE=VIEW
query=select `bdclick6`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick6`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick6`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick6`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick6`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick6`.`bdbasecuadrecaja` group by `bdclick6`.`bdbasecuadrecaja`.`terminal`,`bdclick6`.`bdbasecuadrecaja`.`usuario`,`bdclick6`.`bdbasecuadrecaja`.`fecha`,`bdclick6`.`bdbasecuadrecaja`.`activo` having (`bdclick6`.`bdbasecuadrecaja`.`activo` = 1)
md5=ec653e4ac630a46ef2246d4d1b12e0f9
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:33
create-version=2
source=select `bdbasecuadrecaja`.`terminal` AS `terminal`,`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdbasecuadrecaja`.`total`) AS `suma` from `bdbasecuadrecaja` group by `bdbasecuadrecaja`.`terminal`,`bdbasecuadrecaja`.`usuario`,`bdbasecuadrecaja`.`fecha`,`bdbasecuadrecaja`.`activo` having (`bdbasecuadrecaja`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick6`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick6`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick6`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick6`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick6`.`bdbasecuadrecaja` group by `bdclick6`.`bdbasecuadrecaja`.`terminal`,`bdclick6`.`bdbasecuadrecaja`.`usuario`,`bdclick6`.`bdbasecuadrecaja`.`fecha`,`bdclick6`.`bdbasecuadrecaja`.`activo` having (`bdclick6`.`bdbasecuadrecaja`.`activo` = 1)
mariadb-version=100135
