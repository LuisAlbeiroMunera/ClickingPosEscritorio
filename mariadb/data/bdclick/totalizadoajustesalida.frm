TYPE=VIEW
query=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`ajustessalida` on((`bdclick`.`bdproductos`.`idSistema` = `ajustessalida`.`producto`))) where ((`ajustessalida`.`bodega` = \'123-22\') or (`ajustessalida`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
md5=fa145699caade9be1aaa96b46347df4b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:28
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `ajustessalida` on((`bdproductos`.`idSistema` = `ajustessalida`.`producto`))) where ((`ajustessalida`.`bodega` = \'123-22\') or (`ajustessalida`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`ajustessalida` on((`bdclick`.`bdproductos`.`idSistema` = `ajustessalida`.`producto`))) where ((`ajustessalida`.`bodega` = \'123-22\') or (`ajustessalida`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
mariadb-version=100135
