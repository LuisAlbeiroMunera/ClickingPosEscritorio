TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega3` left join `bdclick1`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick1`.`bdproductosbodega3`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-3\') group by `bdclick1`.`bdproductosbodega3`.`idSistema`
md5=fe369edd6d3dd0d108fbf07bbd559de5
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:38
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `ajustesentrada` on((`ajustesentrada`.`producto` = `bdproductosbodega3`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega3` left join `bdclick1`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick1`.`bdproductosbodega3`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-3\') group by `bdclick1`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
