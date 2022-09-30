TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega4`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega4` left join `bdclick1`.`costeos` on((`bdclick1`.`bdproductosbodega4`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-4\') group by `bdclick1`.`bdproductosbodega4`.`idSistema`
md5=bcf742bc6c1d393a35e7a7f57a34339b
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:39
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdproductosbodega4` left join `costeos` on((`bdproductosbodega4`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega4`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega4` left join `bdclick1`.`costeos` on((`bdclick1`.`bdproductosbodega4`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-4\') group by `bdclick1`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
