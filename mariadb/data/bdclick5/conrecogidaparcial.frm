TYPE=VIEW
query=select `bdclick5`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick5`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick5`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick5`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick5`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick5`.`bdrecogidaparcial` group by `bdclick5`.`bdrecogidaparcial`.`terminal`,`bdclick5`.`bdrecogidaparcial`.`usuario`,`bdclick5`.`bdrecogidaparcial`.`fecha`,`bdclick5`.`bdrecogidaparcial`.`activo` having (`bdclick5`.`bdrecogidaparcial`.`activo` = 1)
md5=4fd065d05cb7644b9207a792de29069e
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=select `bdrecogidaparcial`.`terminal` AS `terminal`,`bdrecogidaparcial`.`usuario` AS `usuario`,`bdrecogidaparcial`.`fecha` AS `fecha`,`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdrecogidaparcial`.`total`) AS `suma` from `bdrecogidaparcial` group by `bdrecogidaparcial`.`terminal`,`bdrecogidaparcial`.`usuario`,`bdrecogidaparcial`.`fecha`,`bdrecogidaparcial`.`activo` having (`bdrecogidaparcial`.`activo` = 1)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdrecogidaparcial`.`terminal` AS `terminal`,`bdclick5`.`bdrecogidaparcial`.`usuario` AS `usuario`,`bdclick5`.`bdrecogidaparcial`.`fecha` AS `fecha`,`bdclick5`.`bdrecogidaparcial`.`activo` AS `activo`,sum(`bdclick5`.`bdrecogidaparcial`.`total`) AS `suma` from `bdclick5`.`bdrecogidaparcial` group by `bdclick5`.`bdrecogidaparcial`.`terminal`,`bdclick5`.`bdrecogidaparcial`.`usuario`,`bdclick5`.`bdrecogidaparcial`.`fecha`,`bdclick5`.`bdrecogidaparcial`.`activo` having (`bdclick5`.`bdrecogidaparcial`.`activo` = 1)
mariadb-version=100135
