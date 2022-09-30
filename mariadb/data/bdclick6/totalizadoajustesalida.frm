TYPE=VIEW
query=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`ajustessalida` on((`bdclick6`.`bdproductos`.`idSistema` = `ajustessalida`.`producto`))) where ((`ajustessalida`.`bodega` = \'123-22\') or (`ajustessalida`.`bodega` = \'\')) group by `bdclick6`.`bdproductos`.`idSistema`
md5=e7318f11a6376957294689db85a8ca65
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:40
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `ajustessalida` on((`bdproductos`.`idSistema` = `ajustessalida`.`producto`))) where ((`ajustessalida`.`bodega` = \'123-22\') or (`ajustessalida`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`ajustessalida` on((`bdclick6`.`bdproductos`.`idSistema` = `ajustessalida`.`producto`))) where ((`ajustessalida`.`bodega` = \'123-22\') or (`ajustessalida`.`bodega` = \'\')) group by `bdclick6`.`bdproductos`.`idSistema`
mariadb-version=100135
