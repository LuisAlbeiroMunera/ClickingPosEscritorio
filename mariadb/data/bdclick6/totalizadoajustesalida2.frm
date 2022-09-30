TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega2` left join `bdclick6`.`ajustessalida` on((`bdclick6`.`bdproductosbodega2`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-2\') group by `bdclick6`.`bdproductosbodega2`.`idSistema`
md5=f2d1fcd0659165abaf5b277e8974284a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:40
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join `ajustessalida` on((`bdproductosbodega2`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega2` left join `bdclick6`.`ajustessalida` on((`bdclick6`.`bdproductosbodega2`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-2\') group by `bdclick6`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
