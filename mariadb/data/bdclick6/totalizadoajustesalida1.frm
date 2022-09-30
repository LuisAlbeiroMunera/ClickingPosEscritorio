TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega1` left join `bdclick6`.`ajustessalida` on((`bdclick6`.`bdproductosbodega1`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-1\') group by `bdclick6`.`bdproductosbodega1`.`idSistema`
md5=7b0d0b4c050fe5a9c7c2ab48fe30f20e
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:40
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `ajustessalida` on((`bdproductosbodega1`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega1` left join `bdclick6`.`ajustessalida` on((`bdclick6`.`bdproductosbodega1`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-1\') group by `bdclick6`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
