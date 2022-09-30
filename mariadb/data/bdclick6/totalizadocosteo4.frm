TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega4`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega4` left join `bdclick6`.`costeos` on((`bdclick6`.`bdproductosbodega4`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-4\') group by `bdclick6`.`bdproductosbodega4`.`idSistema`
md5=52e8ee8eb11abdee233f19ab313e4140
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:41
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdproductosbodega4` left join `costeos` on((`bdproductosbodega4`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega4`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega4` left join `bdclick6`.`costeos` on((`bdclick6`.`bdproductosbodega4`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-4\') group by `bdclick6`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
