TYPE=VIEW
query=select `bdclick4`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick4`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick4`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick4`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick4`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick4`.`bdbasecuadrecaja` group by `bdclick4`.`bdbasecuadrecaja`.`terminal`,`bdclick4`.`bdbasecuadrecaja`.`usuario`,`bdclick4`.`bdbasecuadrecaja`.`fecha`,`bdclick4`.`bdbasecuadrecaja`.`activo` having (`bdclick4`.`bdbasecuadrecaja`.`activo` = 1)
md5=3752cdd21a2f32fc4d37e46ef05de5ed
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:25
create-version=2
source=select `bdbasecuadrecaja`.`terminal` AS `terminal`,`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdbasecuadrecaja`.`total`) AS `suma` from `bdbasecuadrecaja` group by `bdbasecuadrecaja`.`terminal`,`bdbasecuadrecaja`.`usuario`,`bdbasecuadrecaja`.`fecha`,`bdbasecuadrecaja`.`activo` having (`bdbasecuadrecaja`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdbasecuadrecaja`.`terminal` AS `terminal`,`bdclick4`.`bdbasecuadrecaja`.`usuario` AS `usuario`,`bdclick4`.`bdbasecuadrecaja`.`fecha` AS `fecha`,`bdclick4`.`bdbasecuadrecaja`.`activo` AS `activo`,sum(`bdclick4`.`bdbasecuadrecaja`.`total`) AS `suma` from `bdclick4`.`bdbasecuadrecaja` group by `bdclick4`.`bdbasecuadrecaja`.`terminal`,`bdclick4`.`bdbasecuadrecaja`.`usuario`,`bdclick4`.`bdbasecuadrecaja`.`fecha`,`bdclick4`.`bdbasecuadrecaja`.`activo` having (`bdclick4`.`bdbasecuadrecaja`.`activo` = 1)
mariadb-version=100135
