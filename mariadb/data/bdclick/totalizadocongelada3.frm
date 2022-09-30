TYPE=VIEW
query=select `bdclick`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdcongelada`.`cantidad`),\'0\',`bdclick`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega3` left join `bdclick`.`bdcongelada` on((`bdclick`.`bdcongelada`.`producto` = `bdclick`.`bdproductosbodega3`.`idSistema`))) where (`bdclick`.`bdcongelada`.`bodega` = \'BODEGA-3\') group by `bdclick`.`bdproductosbodega3`.`idSistema`
md5=971c825e770d2fd4f352ff00226ea11b
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductosbodega3`.`idSistema`))) where (`bdcongelada`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdcongelada`.`cantidad`),\'0\',`bdclick`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega3` left join `bdclick`.`bdcongelada` on((`bdclick`.`bdcongelada`.`producto` = `bdclick`.`bdproductosbodega3`.`idSistema`))) where (`bdclick`.`bdcongelada`.`bodega` = \'BODEGA-3\') group by `bdclick`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
