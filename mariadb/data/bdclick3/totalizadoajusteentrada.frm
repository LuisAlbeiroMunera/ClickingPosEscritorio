TYPE=VIEW
query=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join `bdclick3`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) where ((`ajustesentrada`.`bodega` = \'123-22\') or (`ajustesentrada`.`bodega` = \'\')) group by `bdclick3`.`bdproductos`.`idSistema`
md5=f852c9b95491f9e8aba9ef049318b733
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:54
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `ajustesentrada` on((`ajustesentrada`.`producto` = `bdproductos`.`idSistema`))) where ((`ajustesentrada`.`bodega` = \'123-22\') or (`ajustesentrada`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join `bdclick3`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) where ((`ajustesentrada`.`bodega` = \'123-22\') or (`ajustesentrada`.`bodega` = \'\')) group by `bdclick3`.`bdproductos`.`idSistema`
mariadb-version=100135
