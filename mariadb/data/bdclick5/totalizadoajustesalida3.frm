TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega3` left join `bdclick5`.`ajustessalida` on((`bdclick5`.`bdproductosbodega3`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-3\') group by `bdclick5`.`bdproductosbodega3`.`idSistema`
md5=c9c57f50a8567caa7a9df13413525299
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:51
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `ajustessalida` on((`bdproductosbodega3`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega3` left join `bdclick5`.`ajustessalida` on((`bdclick5`.`bdproductosbodega3`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-3\') group by `bdclick5`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
