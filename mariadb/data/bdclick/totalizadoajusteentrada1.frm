TYPE=VIEW
query=select `bdclick`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega1` left join `bdclick`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick`.`bdproductosbodega1`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-1\') group by `bdclick`.`bdproductosbodega1`.`idSistema`
md5=e2a2fc9eecf356499bef17ec8a791ba2
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:28
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `ajustesentrada` on((`ajustesentrada`.`producto` = `bdproductosbodega1`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`ajustesentrada`.`cantidad`),\'0\',`ajustesentrada`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega1` left join `bdclick`.`ajustesentrada` on((`ajustesentrada`.`producto` = `bdclick`.`bdproductosbodega1`.`idSistema`))) where (`ajustesentrada`.`bodega` = \'BODEGA-1\') group by `bdclick`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
