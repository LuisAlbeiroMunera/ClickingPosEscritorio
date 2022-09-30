TYPE=VIEW
query=select `bdclick`.`bdproductosbodega2`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick`.`bdproductosbodega2` left join `bdclick`.`costeos` on((`bdclick`.`bdproductosbodega2`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-2\') group by `bdclick`.`bdproductosbodega2`.`idSistema`
md5=a166af04ef594509b8e92cb10bc50167
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdproductosbodega2` left join `costeos` on((`bdproductosbodega2`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega2`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick`.`bdproductosbodega2` left join `bdclick`.`costeos` on((`bdclick`.`bdproductosbodega2`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-2\') group by `bdclick`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
