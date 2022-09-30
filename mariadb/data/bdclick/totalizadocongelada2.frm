TYPE=VIEW
query=select `bdclick`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdcongelada`.`cantidad`),\'0\',`bdclick`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega2` left join `bdclick`.`bdcongelada` on((`bdclick`.`bdcongelada`.`producto` = `bdclick`.`bdproductosbodega2`.`idSistema`))) where (`bdclick`.`bdcongelada`.`bodega` = \'BODEGA-2\') group by `bdclick`.`bdproductosbodega2`.`idSistema`
md5=5d731b3406716818837e643040ab2205
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductosbodega2`.`idSistema`))) where (`bdcongelada`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdcongelada`.`cantidad`),\'0\',`bdclick`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega2` left join `bdclick`.`bdcongelada` on((`bdclick`.`bdcongelada`.`producto` = `bdclick`.`bdproductosbodega2`.`idSistema`))) where (`bdclick`.`bdcongelada`.`bodega` = \'BODEGA-2\') group by `bdclick`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
