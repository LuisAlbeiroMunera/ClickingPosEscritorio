TYPE=VIEW
query=select `bdclick1`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick1`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick1`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick1`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick1`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick1`.`bdrecogidaparcial` group by `bdclick1`.`bdrecogidaparcial`.`terminal`,`bdclick1`.`bdrecogidaparcial`.`usuario`,`bdclick1`.`bdrecogidaparcial`.`fecha`,`bdclick1`.`bdrecogidaparcial`.`activo` having (`bdclick1`.`bdrecogidaparcial`.`activo` = 1)
md5=72b044d7b6a8b44782a956cc14dcdf92
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:33
create-version=2
source=select `bdrecogidaparcial`.`terminal` AS `terminal`,`bdrecogidaparcial`.`usuario` AS `usuario`,`bdrecogidaparcial`.`fecha` AS `fecha`,`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdrecogidaparcial`.`total`) AS `suma` from `bdrecogidaparcial` group by `bdrecogidaparcial`.`terminal`,`bdrecogidaparcial`.`usuario`,`bdrecogidaparcial`.`fecha`,`bdrecogidaparcial`.`activo` having (`bdrecogidaparcial`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick1`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick1`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick1`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick1`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick1`.`bdrecogidaparcial` group by `bdclick1`.`bdrecogidaparcial`.`terminal`,`bdclick1`.`bdrecogidaparcial`.`usuario`,`bdclick1`.`bdrecogidaparcial`.`fecha`,`bdclick1`.`bdrecogidaparcial`.`activo` having (`bdclick1`.`bdrecogidaparcial`.`activo` = 1)
mariadb-version=100135
