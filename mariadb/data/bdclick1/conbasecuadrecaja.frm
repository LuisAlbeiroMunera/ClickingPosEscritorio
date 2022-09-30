TYPE=VIEW
query=select `bdclick1`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick1`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick1`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick1`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick1`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick1`.`bdbasecuadrecaja` group by `bdclick1`.`bdbasecuadrecaja`.`terminal`,`bdclick1`.`bdbasecuadrecaja`.`usuario`,`bdclick1`.`bdbasecuadrecaja`.`fecha`,`bdclick1`.`bdbasecuadrecaja`.`activo` having (`bdclick1`.`bdbasecuadrecaja`.`activo` = 1)
md5=ffc6b26825a6a49747d6a7ff55e4a632
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:32
create-version=2
source=select `bdbasecuadrecaja`.`terminal` AS `terminal`,`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdbasecuadrecaja`.`total`) AS `suma` from `bdbasecuadrecaja` group by `bdbasecuadrecaja`.`terminal`,`bdbasecuadrecaja`.`usuario`,`bdbasecuadrecaja`.`fecha`,`bdbasecuadrecaja`.`activo` having (`bdbasecuadrecaja`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick1`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick1`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick1`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick1`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick1`.`bdbasecuadrecaja` group by `bdclick1`.`bdbasecuadrecaja`.`terminal`,`bdclick1`.`bdbasecuadrecaja`.`usuario`,`bdclick1`.`bdbasecuadrecaja`.`fecha`,`bdclick1`.`bdbasecuadrecaja`.`activo` having (`bdclick1`.`bdbasecuadrecaja`.`activo` = 1)
mariadb-version=100135
