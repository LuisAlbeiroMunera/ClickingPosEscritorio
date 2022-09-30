TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega3`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega3` left join `bdclick2`.`costeos` on((`bdclick2`.`bdproductosbodega3`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-3\') group by `bdclick2`.`bdproductosbodega3`.`idSistema`
md5=57ea7db53bee09475697fbb7c429527c
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdproductosbodega3` left join `costeos` on((`bdproductosbodega3`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega3`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega3` left join `bdclick2`.`costeos` on((`bdclick2`.`bdproductosbodega3`.`idSistema` = `costeos`.`producto`))) where (`costeos`.`bodega` = \'BODEGA-3\') group by `bdclick2`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
