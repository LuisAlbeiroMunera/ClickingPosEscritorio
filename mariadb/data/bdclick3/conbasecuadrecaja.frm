TYPE=VIEW
query=select `bdclick3`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick3`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick3`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick3`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick3`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick3`.`bdbasecuadrecaja` group by `bdclick3`.`bdbasecuadrecaja`.`terminal`,`bdclick3`.`bdbasecuadrecaja`.`usuario`,`bdclick3`.`bdbasecuadrecaja`.`fecha`,`bdclick3`.`bdbasecuadrecaja`.`activo` having (`bdclick3`.`bdbasecuadrecaja`.`activo` = 1)
md5=14ff74a558410b152957774e41eaac06
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:48
create-version=2
source=select `bdbasecuadrecaja`.`terminal` AS `terminal`,`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdbasecuadrecaja`.`total`) AS `suma` from `bdbasecuadrecaja` group by `bdbasecuadrecaja`.`terminal`,`bdbasecuadrecaja`.`usuario`,`bdbasecuadrecaja`.`fecha`,`bdbasecuadrecaja`.`activo` having (`bdbasecuadrecaja`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick3`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick3`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick3`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick3`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick3`.`bdbasecuadrecaja` group by `bdclick3`.`bdbasecuadrecaja`.`terminal`,`bdclick3`.`bdbasecuadrecaja`.`usuario`,`bdclick3`.`bdbasecuadrecaja`.`fecha`,`bdclick3`.`bdbasecuadrecaja`.`activo` having (`bdclick3`.`bdbasecuadrecaja`.`activo` = 1)
mariadb-version=100135
