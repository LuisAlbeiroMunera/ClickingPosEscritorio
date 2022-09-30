TYPE=VIEW
query=select `bdclick`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdcongelada`.`cantidad`),\'0\',`bdclick`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega1` left join `bdclick`.`bdcongelada` on((`bdclick`.`bdcongelada`.`producto` = `bdclick`.`bdproductosbodega1`.`idSistema`))) where (`bdclick`.`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdclick`.`bdproductosbodega1`.`idSistema`
md5=e827fd5e9b9c5abc8db7ea0d78abde51
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductosbodega1`.`idSistema`))) where (`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdcongelada`.`cantidad`),\'0\',`bdclick`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega1` left join `bdclick`.`bdcongelada` on((`bdclick`.`bdcongelada`.`producto` = `bdclick`.`bdproductosbodega1`.`idSistema`))) where (`bdclick`.`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdclick`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
