TYPE=VIEW
query=select `bdclick4`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick4`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick4`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick4`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick4`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick4`.`bdrecogidaparcial` group by `bdclick4`.`bdrecogidaparcial`.`terminal`,`bdclick4`.`bdrecogidaparcial`.`usuario`,`bdclick4`.`bdrecogidaparcial`.`fecha`,`bdclick4`.`bdrecogidaparcial`.`activo` having (`bdclick4`.`bdrecogidaparcial`.`activo` = 1)
md5=bf07c6861180b6610d31810da70d3ef5
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:26
create-version=2
source=select `bdrecogidaparcial`.`terminal` AS `terminal`,`bdrecogidaparcial`.`usuario` AS `usuario`,`bdrecogidaparcial`.`fecha` AS `fecha`,`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdrecogidaparcial`.`total`) AS `suma` from `bdrecogidaparcial` group by `bdrecogidaparcial`.`terminal`,`bdrecogidaparcial`.`usuario`,`bdrecogidaparcial`.`fecha`,`bdrecogidaparcial`.`activo` having (`bdrecogidaparcial`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick4`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick4`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick4`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick4`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick4`.`bdrecogidaparcial` group by `bdclick4`.`bdrecogidaparcial`.`terminal`,`bdclick4`.`bdrecogidaparcial`.`usuario`,`bdclick4`.`bdrecogidaparcial`.`fecha`,`bdclick4`.`bdrecogidaparcial`.`activo` having (`bdclick4`.`bdrecogidaparcial`.`activo` = 1)
mariadb-version=100135
