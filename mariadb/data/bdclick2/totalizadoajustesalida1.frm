TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega1` left join `bdclick2`.`ajustessalida` on((`bdclick2`.`bdproductosbodega1`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-1\') group by `bdclick2`.`bdproductosbodega1`.`idSistema`
md5=484b68e0308bea03b769f3c07b897b90
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:49
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `ajustessalida` on((`bdproductosbodega1`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega1` left join `bdclick2`.`ajustessalida` on((`bdclick2`.`bdproductosbodega1`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-1\') group by `bdclick2`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
