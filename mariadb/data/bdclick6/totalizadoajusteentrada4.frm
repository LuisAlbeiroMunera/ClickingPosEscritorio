TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega4` left join `bdclick6`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick6`.`bdproductosbodega4`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-4\') group by `bdclick6`.`bdproductosbodega4`.`idSistema`
md5=6bb1a6c1bde23d9978267e3e4e9f8072
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:40
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `ajustesentrada` on((`ajustesentrada`.`producto` = `bdproductosbodega4`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega4` left join `bdclick6`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick6`.`bdproductosbodega4`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-4\') group by `bdclick6`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
