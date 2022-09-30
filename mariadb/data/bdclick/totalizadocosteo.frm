TYPE=VIEW
query=select `bdclick`.`bdproductos`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`costeos` on((`bdclick`.`bdproductos`.`idSistema` = `costeos`.`producto`))) where ((`costeos`.`bodega` = \'123-22\') or (`costeos`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
md5=2c6172d1429f340e0a4d84cc64afa011
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductos`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdproductos` left join `costeos` on((`bdproductos`.`idSistema` = `costeos`.`producto`))) where ((`costeos`.`bodega` = \'123-22\') or (`costeos`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductos`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`costeos` on((`bdclick`.`bdproductos`.`idSistema` = `costeos`.`producto`))) where ((`costeos`.`bodega` = \'123-22\') or (`costeos`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
mariadb-version=100135
