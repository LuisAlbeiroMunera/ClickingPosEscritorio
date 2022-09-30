TYPE=VIEW
query=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick5`.`bdcongelada`.`cantidad`),\'0\',`bdclick5`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join `bdclick5`.`bdcongelada` on((`bdclick5`.`bdcongelada`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) where (`bdclick5`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick5`.`bdproductos`.`idSistema`
md5=9783ccc5dd430ec6952ca436d315ea69
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:52
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductos`.`idSistema`))) where (`bdcongelada`.`bodega` = \'123-22\') group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick5`.`bdcongelada`.`cantidad`),\'0\',`bdclick5`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join `bdclick5`.`bdcongelada` on((`bdclick5`.`bdcongelada`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) where (`bdclick5`.`bdcongelada`.`bodega` = \'123-22\') group by `bdclick5`.`bdproductos`.`idSistema`
mariadb-version=100135
