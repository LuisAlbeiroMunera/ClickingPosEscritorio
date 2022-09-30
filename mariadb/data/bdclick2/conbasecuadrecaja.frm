TYPE=VIEW
query=select `bdclick2`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick2`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick2`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick2`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick2`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick2`.`bdbasecuadrecaja` group by `bdclick2`.`bdbasecuadrecaja`.`terminal`,`bdclick2`.`bdbasecuadrecaja`.`usuario`,`bdclick2`.`bdbasecuadrecaja`.`fecha`,`bdclick2`.`bdbasecuadrecaja`.`activo` having (`bdclick2`.`bdbasecuadrecaja`.`activo` = 1)
md5=a36e948bd3f0b654634d49a8c18d143b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:43
create-version=2
source=select `bdbasecuadrecaja`.`terminal` AS `terminal`,`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdbasecuadrecaja`.`total`) AS `suma` from `bdbasecuadrecaja` group by `bdbasecuadrecaja`.`terminal`,`bdbasecuadrecaja`.`usuario`,`bdbasecuadrecaja`.`fecha`,`bdbasecuadrecaja`.`activo` having (`bdbasecuadrecaja`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick2`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick2`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick2`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick2`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick2`.`bdbasecuadrecaja` group by `bdclick2`.`bdbasecuadrecaja`.`terminal`,`bdclick2`.`bdbasecuadrecaja`.`usuario`,`bdclick2`.`bdbasecuadrecaja`.`fecha`,`bdclick2`.`bdbasecuadrecaja`.`activo` having (`bdclick2`.`bdbasecuadrecaja`.`activo` = 1)
mariadb-version=100135
