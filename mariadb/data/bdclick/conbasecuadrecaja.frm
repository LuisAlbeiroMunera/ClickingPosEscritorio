TYPE=VIEW
query=select `bdclick`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick`.`bdbasecuadrecaja` group by `bdclick`.`bdbasecuadrecaja`.`terminal`,`bdclick`.`bdbasecuadrecaja`.`usuario`,`bdclick`.`bdbasecuadrecaja`.`fecha`,`bdclick`.`bdbasecuadrecaja`.`activo` having (`bdclick`.`bdbasecuadrecaja`.`activo` = 1)
md5=9e6d43316e4f83845305d087268fa6ed
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=select `bdbasecuadrecaja`.`terminal` AS `terminal`,`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdbasecuadrecaja`.`total`) AS `suma` from `bdbasecuadrecaja` group by `bdbasecuadrecaja`.`terminal`,`bdbasecuadrecaja`.`usuario`,`bdbasecuadrecaja`.`fecha`,`bdbasecuadrecaja`.`activo` having (`bdbasecuadrecaja`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick`.`bdbasecuadrecaja` group by `bdclick`.`bdbasecuadrecaja`.`terminal`,`bdclick`.`bdbasecuadrecaja`.`usuario`,`bdclick`.`bdbasecuadrecaja`.`fecha`,`bdclick`.`bdbasecuadrecaja`.`activo` having (`bdclick`.`bdbasecuadrecaja`.`activo` = 1)
mariadb-version=100135
