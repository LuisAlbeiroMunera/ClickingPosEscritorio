TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega2` left join `bdclick2`.`ajustessalida` on((`bdclick2`.`bdproductosbodega2`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-2\') group by `bdclick2`.`bdproductosbodega2`.`idSistema`
md5=9e954e914d162b6ef9a9d45f5cbac522
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:49
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join `ajustessalida` on((`bdproductosbodega2`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega2` left join `bdclick2`.`ajustessalida` on((`bdclick2`.`bdproductosbodega2`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-2\') group by `bdclick2`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
