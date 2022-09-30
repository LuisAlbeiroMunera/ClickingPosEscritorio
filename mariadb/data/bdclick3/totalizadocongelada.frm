TYPE=VIEW
query=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick3`.`bdcongelada`.`cantidad`),\'0\',`bdclick3`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join `bdclick3`.`bdcongelada` on((`bdclick3`.`bdcongelada`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) where (`bdclick3`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick3`.`bdproductos`.`idSistema`
md5=45d7e21a1f7223250cabdf72b6905017
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:55
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductos`.`idSistema`))) where (`bdcongelada`.`bodega` = \'123-22\') group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick3`.`bdcongelada`.`cantidad`),\'0\',`bdclick3`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join `bdclick3`.`bdcongelada` on((`bdclick3`.`bdcongelada`.`producto` = `bdclick3`.`bdproductos`.`idSistema`))) where (`bdclick3`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick3`.`bdproductos`.`idSistema`
mariadb-version=100135
