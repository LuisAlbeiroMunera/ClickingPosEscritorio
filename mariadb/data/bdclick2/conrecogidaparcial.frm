TYPE=VIEW
query=select `bdclick2`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick2`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick2`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick2`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick2`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick2`.`bdrecogidaparcial` group by `bdclick2`.`bdrecogidaparcial`.`terminal`,`bdclick2`.`bdrecogidaparcial`.`usuario`,`bdclick2`.`bdrecogidaparcial`.`fecha`,`bdclick2`.`bdrecogidaparcial`.`activo` having (`bdclick2`.`bdrecogidaparcial`.`activo` = 1)
md5=7822c99ad9e3c39785e6fa5018c2892b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=select `bdrecogidaparcial`.`terminal` AS `terminal`,`bdrecogidaparcial`.`usuario` AS `usuario`,`bdrecogidaparcial`.`fecha` AS `fecha`,`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdrecogidaparcial`.`total`) AS `suma` from `bdrecogidaparcial` group by `bdrecogidaparcial`.`terminal`,`bdrecogidaparcial`.`usuario`,`bdrecogidaparcial`.`fecha`,`bdrecogidaparcial`.`activo` having (`bdrecogidaparcial`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick2`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick2`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick2`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick2`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick2`.`bdrecogidaparcial` group by `bdclick2`.`bdrecogidaparcial`.`terminal`,`bdclick2`.`bdrecogidaparcial`.`usuario`,`bdclick2`.`bdrecogidaparcial`.`fecha`,`bdclick2`.`bdrecogidaparcial`.`activo` having (`bdclick2`.`bdrecogidaparcial`.`activo` = 1)
mariadb-version=100135
