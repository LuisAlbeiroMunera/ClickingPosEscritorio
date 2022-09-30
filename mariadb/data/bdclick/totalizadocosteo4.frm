TYPE=VIEW
query=select `bdclick`.`bdproductosbodega4`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick`.`bdproductosbodega4` left join `bdclick`.`costeos` on((`bdclick`.`bdproductosbodega4`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-4\') group by `bdclick`.`bdproductosbodega4`.`idSistema`
md5=f96e988bf602be2a5d633dec668e337c
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdproductosbodega4` left join `costeos` on((`bdproductosbodega4`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega4`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick`.`bdproductosbodega4` left join `bdclick`.`costeos` on((`bdclick`.`bdproductosbodega4`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-4\') group by `bdclick`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
