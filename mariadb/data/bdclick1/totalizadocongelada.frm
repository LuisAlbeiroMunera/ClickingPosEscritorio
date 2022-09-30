TYPE=VIEW
query=select `bdclick1`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`bdcongelada`.`cantidad`),\'0\',`bdclick1`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductos` left join `bdclick1`.`bdcongelada` on((`bdclick1`.`bdcongelada`.`producto` = `bdclick1`.`bdproductos`.`idSistema`))) where (`bdclick1`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick1`.`bdproductos`.`idSistema`
md5=96e125fb3352d843be5c14172f0cb4aa
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:39
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductos`.`idSistema`))) where (`bdcongelada`.`bodega` = \'123-22\') group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`bdcongelada`.`cantidad`),\'0\',`bdclick1`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductos` left join `bdclick1`.`bdcongelada` on((`bdclick1`.`bdcongelada`.`producto` = `bdclick1`.`bdproductos`.`idSistema`))) where (`bdclick1`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick1`.`bdproductos`.`idSistema`
mariadb-version=100135
