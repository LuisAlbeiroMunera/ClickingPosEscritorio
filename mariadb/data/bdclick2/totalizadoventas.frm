TYPE=VIEW
query=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick2`.`bdfactura`.`cantidad`),\'0\',`bdclick2`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`bdfactura` on((`bdclick2`.`bdfactura`.`producto` = `bdclick2`.`bdproductos`.`idSistema`))) where ((`bdclick2`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick2`.`bdfactura`.`bodega` = \'\')) group by `bdclick2`.`bdproductos`.`idSistema`
md5=88e89012af50839b6f21212db3229f1f
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) where ((`bdfactura`.`bodega` = \'123-22\') or (`bdfactura`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick2`.`bdfactura`.`cantidad`),\'0\',`bdclick2`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`bdfactura` on((`bdclick2`.`bdfactura`.`producto` = `bdclick2`.`bdproductos`.`idSistema`))) where ((`bdclick2`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick2`.`bdfactura`.`bodega` = \'\')) group by `bdclick2`.`bdproductos`.`idSistema`
mariadb-version=100135
