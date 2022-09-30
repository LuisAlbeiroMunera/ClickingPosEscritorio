TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega2` left join `bdclick1`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick1`.`bdproductosbodega2`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-2\') group by `bdclick1`.`bdproductosbodega2`.`idSistema`
md5=a0fce286f4599c0d860571d88ea81569
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:38
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join `ajustesentrada` on((`ajustesentrada`.`producto` = `bdproductosbodega2`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega2` left join `bdclick1`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick1`.`bdproductosbodega2`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-2\') group by `bdclick1`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
