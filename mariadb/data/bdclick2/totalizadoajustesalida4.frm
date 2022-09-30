TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega4` left join `bdclick2`.`ajustessalida` on((`bdclick2`.`bdproductosbodega4`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-4\') group by `bdclick2`.`bdproductosbodega4`.`idSistema`
md5=6fb1c6c2d0c2694f02a5171293d1c200
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:49
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `ajustessalida` on((`bdproductosbodega4`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega4` left join `bdclick2`.`ajustessalida` on((`bdclick2`.`bdproductosbodega4`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-4\') group by `bdclick2`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
