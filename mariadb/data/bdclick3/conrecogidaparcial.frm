TYPE=VIEW
query=select `bdclick3`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick3`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick3`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick3`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick3`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick3`.`bdrecogidaparcial` group by `bdclick3`.`bdrecogidaparcial`.`terminal`,`bdclick3`.`bdrecogidaparcial`.`usuario`,`bdclick3`.`bdrecogidaparcial`.`fecha`,`bdclick3`.`bdrecogidaparcial`.`activo` having (`bdclick3`.`bdrecogidaparcial`.`activo` = 1)
md5=9c62041f3c6e1e1c36137c58290ea1e4
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=select `bdrecogidaparcial`.`terminal` AS `terminal`,`bdrecogidaparcial`.`usuario` AS `usuario`,`bdrecogidaparcial`.`fecha` AS `fecha`,`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdrecogidaparcial`.`total`) AS `suma` from `bdrecogidaparcial` group by `bdrecogidaparcial`.`terminal`,`bdrecogidaparcial`.`usuario`,`bdrecogidaparcial`.`fecha`,`bdrecogidaparcial`.`activo` having (`bdrecogidaparcial`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick3`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick3`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick3`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick3`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick3`.`bdrecogidaparcial` group by `bdclick3`.`bdrecogidaparcial`.`terminal`,`bdclick3`.`bdrecogidaparcial`.`usuario`,`bdclick3`.`bdrecogidaparcial`.`fecha`,`bdclick3`.`bdrecogidaparcial`.`activo` having (`bdclick3`.`bdrecogidaparcial`.`activo` = 1)
mariadb-version=100135
