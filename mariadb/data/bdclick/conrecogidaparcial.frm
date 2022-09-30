TYPE=VIEW
query=select `bdclick`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick`.`bdrecogidaparcial` group by `bdclick`.`bdrecogidaparcial`.`terminal`,`bdclick`.`bdrecogidaparcial`.`usuario`,`bdclick`.`bdrecogidaparcial`.`fecha`,`bdclick`.`bdrecogidaparcial`.`activo` having (`bdclick`.`bdrecogidaparcial`.`activo` = 1)
md5=333e93c1fc16aa67a954ea4001ae49d6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=select `bdrecogidaparcial`.`terminal` AS `terminal`,`bdrecogidaparcial`.`usuario` AS `usuario`,`bdrecogidaparcial`.`fecha` AS `fecha`,`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdrecogidaparcial`.`total`) AS `suma` from `bdrecogidaparcial` group by `bdrecogidaparcial`.`terminal`,`bdrecogidaparcial`.`usuario`,`bdrecogidaparcial`.`fecha`,`bdrecogidaparcial`.`activo` having (`bdrecogidaparcial`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick`.`bdrecogidaparcial` group by `bdclick`.`bdrecogidaparcial`.`terminal`,`bdclick`.`bdrecogidaparcial`.`usuario`,`bdclick`.`bdrecogidaparcial`.`fecha`,`bdclick`.`bdrecogidaparcial`.`activo` having (`bdclick`.`bdrecogidaparcial`.`activo` = 1)
mariadb-version=100135
