TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega3` left join `bdclick6`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick6`.`bdproductosbodega3`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-3\') group by `bdclick6`.`bdproductosbodega3`.`idSistema`
md5=ca7ede0a566343ece71512d0ca88b343
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:40
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `ajustesentrada` on((`ajustesentrada`.`producto` = `bdproductosbodega3`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega3` left join `bdclick6`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick6`.`bdproductosbodega3`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-3\') group by `bdclick6`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
