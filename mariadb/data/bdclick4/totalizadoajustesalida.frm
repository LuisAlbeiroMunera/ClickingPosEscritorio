TYPE=VIEW
query=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`ajustessalida` on((`bdclick4`.`bdproductos`.`idSistema` = `ajustessalida`.`producto`))) where ((`ajustessalida`.`bodega` = \'123-22\') or (`ajustessalida`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
md5=9f95ca8671ca96cf7692d294632dc018
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:31
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `ajustessalida` on((`bdproductos`.`idSistema` = `ajustessalida`.`producto`))) where ((`ajustessalida`.`bodega` = \'123-22\') or (`ajustessalida`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`ajustessalida` on((`bdclick4`.`bdproductos`.`idSistema` = `ajustessalida`.`producto`))) where ((`ajustessalida`.`bodega` = \'123-22\') or (`ajustessalida`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
mariadb-version=100135
