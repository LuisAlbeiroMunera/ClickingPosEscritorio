TYPE=VIEW
query=select `bdclick6`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick6`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick6`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick6`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick6`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick6`.`bdrecogidaparcial` group by `bdclick6`.`bdrecogidaparcial`.`terminal`,`bdclick6`.`bdrecogidaparcial`.`usuario`,`bdclick6`.`bdrecogidaparcial`.`fecha`,`bdclick6`.`bdrecogidaparcial`.`activo` having (`bdclick6`.`bdrecogidaparcial`.`activo` = 1)
md5=9d74e61ede212bb5ad6c3a17c1d36ec2
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=select `bdrecogidaparcial`.`terminal` AS `terminal`,`bdrecogidaparcial`.`usuario` AS `usuario`,`bdrecogidaparcial`.`fecha` AS `fecha`,`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdrecogidaparcial`.`total`) AS `suma` from `bdrecogidaparcial` group by `bdrecogidaparcial`.`terminal`,`bdrecogidaparcial`.`usuario`,`bdrecogidaparcial`.`fecha`,`bdrecogidaparcial`.`activo` having (`bdrecogidaparcial`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick6`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick6`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick6`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick6`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick6`.`bdrecogidaparcial` group by `bdclick6`.`bdrecogidaparcial`.`terminal`,`bdclick6`.`bdrecogidaparcial`.`usuario`,`bdclick6`.`bdrecogidaparcial`.`fecha`,`bdclick6`.`bdrecogidaparcial`.`activo` having (`bdclick6`.`bdrecogidaparcial`.`activo` = 1)
mariadb-version=100135
