TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega4` left join `bdclick5`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick5`.`bdproductosbodega4`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-4\') group by `bdclick5`.`bdproductosbodega4`.`idSistema`
md5=97b3e00022a89b37b7888f72bb4a2306
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:51
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `ajustesentrada` on((`ajustesentrada`.`producto` = `bdproductosbodega4`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega4` left join `bdclick5`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick5`.`bdproductosbodega4`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-4\') group by `bdclick5`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
