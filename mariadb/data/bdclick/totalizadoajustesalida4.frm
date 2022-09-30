TYPE=VIEW
query=select `bdclick`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega4` left join `bdclick`.`ajustessalida` on((`bdclick`.`bdproductosbodega4`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-4\') group by `bdclick`.`bdproductosbodega4`.`idSistema`
md5=7399f9be9de16f3d01bbef98b193225b
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:28
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `ajustessalida` on((`bdproductosbodega4`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega4` left join `bdclick`.`ajustessalida` on((`bdclick`.`bdproductosbodega4`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-4\') group by `bdclick`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
